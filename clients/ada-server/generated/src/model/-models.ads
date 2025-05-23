--  OpenAPI Okta IP Ranges
--  OpenAPI specification and a set of generated API clients for Okta IP Ranges
--
--  The version of the OpenAPI document: 1.0.1_pre.0
--  Contact: blah+oapicf@cliffano.com
--
--  NOTE: This package is auto generated by OpenAPI-Generator 7.12.0.
--  https://openapi-generator.tech
--  Do not edit the class manually.

with Swagger.Streams;
with Ada.Containers.Vectors;
package .Models is
   pragma Style_Checks ("-bmrIu");



   type IpRangesJsonGet200ResponseValue_Type is
     record
       Ip_Ranges : Swagger.UString_Vectors.Vector;
     end record;


   package IpRangesJsonGet200ResponseValue_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => .Models.IpRangesJsonGet200ResponseValue_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.IpRangesJsonGet200ResponseValue_Type);
   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in IpRangesJsonGet200ResponseValue_Type_Vectors.Vector);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.IpRangesJsonGet200ResponseValue_Type);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out IpRangesJsonGet200ResponseValue_Type_Vectors.Vector);


end .Models;
