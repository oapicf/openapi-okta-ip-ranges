--  OpenAPI Okta IP Ranges
--  OpenAPI specification and a set of generated API clients for Okta IP Ranges
--
--  The version of the OpenAPI document: 0.10.1_pre.0
--  Contact: blah+oapicf@cliffano.com
--
--  NOTE: This package is auto generated by OpenAPI-Generator 7.9.0.
--  https://openapi-generator.tech
--  Do not edit the class manually.

package body .Models is
   pragma Style_Checks ("-bmrIu");

   pragma Warnings (Off, "*use clause for package*");

   use Swagger.Streams;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.IpRangesJsonGet200ResponseValue_Type) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "ip_ranges", Value.Ip_Ranges);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in IpRangesJsonGet200ResponseValue_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.IpRangesJsonGet200ResponseValue_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "ip_ranges", Value.Ip_Ranges);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out IpRangesJsonGet200ResponseValue_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : .Models.IpRangesJsonGet200ResponseValue_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;


end .Models;
