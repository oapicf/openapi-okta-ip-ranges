import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for DefaultApi
void main() {
  final instance = Openapi().getDefaultApi();

  group(DefaultApi, () {
    // Retrieve Okta IP ranges
    //
    // Returns IP ranges organized by regional cell names.
    //
    //Future<BuiltMap<String, IpRangesJsonGet200ResponseValue>> ipRangesJsonGet() async
    test('test ipRangesJsonGet', () async {
      // TODO
    });

  });
}
