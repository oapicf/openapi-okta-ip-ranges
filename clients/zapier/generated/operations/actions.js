const DefaultApi = require('../apis/DefaultApi');
const { searchMiddleware, hasSearchRequisites, isSearchAction } = require('../utils/utils');

const actions = {
    [DefaultApi.ipRangesJsonGet.key]: DefaultApi.ipRangesJsonGet,
}

module.exports = {
    searchActions: () => Object.entries(actions).reduce((actions, [key, value]) => isSearchAction(key) && hasSearchRequisites(value) ? {...actions, [key]: searchMiddleware(value)} : actions, {}),
    createActions: () => Object.entries(actions).reduce((actions, [key, value]) => !isSearchAction(key) ? {...actions, [key]: value} : actions, {}),
}