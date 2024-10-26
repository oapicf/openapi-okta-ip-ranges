use async_trait::async_trait;
use axum::extract::*;
use axum_extra::extract::{CookieJar, Multipart};
use bytes::Bytes;
use http::Method;
use serde::{Deserialize, Serialize};

use crate::{models, types::*};

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum IpRangesJsonGetResponse {
    /// A JSON object of regional cells with IP ranges.
    Status200_AJSONObjectOfRegionalCellsWithIPRanges
    (std::collections::HashMap<String, models::IpRangesJsonGet200ResponseValue>)
}


/// Default
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Default {
    /// Retrieve Okta IP ranges.
    ///
    /// IpRangesJsonGet - GET /okta-ip-ranges/ip_ranges.json
    async fn ip_ranges_json_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
    ) -> Result<IpRangesJsonGetResponse, String>;
}
