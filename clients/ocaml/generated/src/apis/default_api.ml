(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 *)

let ip_ranges_json_get () =
    let open Lwt.Infix in
    let uri = Request.build_uri "/ip_ranges.json" in
    let headers = Request.default_headers in
    Cohttp_lwt_unix.Client.call `GET uri ~headers >>= fun (resp, body) ->
    Request.read_json_body_as_map_of (JsonSupport.unwrap Model__ip_ranges_json_get_200_response_value.of_yojson) resp body

