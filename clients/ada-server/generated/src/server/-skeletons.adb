--  OpenAPI Okta IP Ranges
--  OpenAPI specification and a set of generated API clients for Okta IP Ranges
--
--  The version of the OpenAPI document: 0.9.0_pre.0
--  Contact: blah+oapicf@cliffano.com
--
--  NOTE: This package is auto generated by OpenAPI-Generator 7.9.0.
--  https://openapi-generator.tech
--  Do not edit the class manually.

pragma Warnings (Off, "*is not referenced");
with Swagger.Streams;
with Swagger.Servers.Operation;
package body .Skeletons is
   pragma Style_Checks ("-bmrIu");
   pragma Warnings (Off, "*use clause for package*");

   use Swagger.Streams;

   Media_List_1 : aliased constant Swagger.Mime_List := (
     1 => Swagger.Mime_Json);

   package body Skeleton is


      package API_Ip_Ranges_Json_Get is
         new Swagger.Servers.Operation
            (Handler => Ip_Ranges_Json_Get,
             Method  => Swagger.Servers.GET,
             URI     => URI_Prefix & "/ip_ranges.json",
             Mimes   => Media_List_1'Access);

      --  Retrieve Okta IP ranges
      procedure Ip_Ranges_Json_Get
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Result : Swagger..Models.IpRangesJsonGet200ResponseValue_Type_Map;
      begin
         
         
         Impl.Ip_Ranges_Json_Get (Result, Context);
         if Context.Get_Status = 200 then
            Context.Set_Description ("A JSON object of regional cells with IP ranges.");

            Stream.Start_Document;
            Serialize (Stream, "", Result);
            Stream.End_Document;
            return;
         end if;

      end Ip_Ranges_Json_Get;

      procedure Register (Server : in out Swagger.Servers.Application_Type'Class) is
      begin
         Swagger.Servers.Register (Server, API_Ip_Ranges_Json_Get.Definition);
      end Register;

   end Skeleton;

   package body Shared_Instance is


      --  Retrieve Okta IP ranges
      procedure Ip_Ranges_Json_Get
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Result : Swagger..Models.IpRangesJsonGet200ResponseValue_Type_Map;
      begin

         
         Server.Ip_Ranges_Json_Get (Result, Context);
         if Context.Get_Status = 200 then
            Context.Set_Description ("A JSON object of regional cells with IP ranges.");

            Stream.Start_Document;
            Serialize (Stream, "", Result);
            Stream.End_Document;
            return;
         end if;

      end Ip_Ranges_Json_Get;

      package API_Ip_Ranges_Json_Get is
         new Swagger.Servers.Operation
            (Handler => Ip_Ranges_Json_Get,
             Method  => Swagger.Servers.GET,
             URI     => URI_Prefix & "/ip_ranges.json",
             Mimes   => Media_List_1'Access);


      procedure Register (Server : in out Swagger.Servers.Application_Type'Class) is
      begin
         Swagger.Servers.Register (Server, API_Ip_Ranges_Json_Get.Definition);
      end Register;

      protected body Server is
         --  Retrieve Okta IP ranges
         procedure Ip_Ranges_Json_Get (Result : out ;
         Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Ip_Ranges_Json_Get (Result, Context);
         end Ip_Ranges_Json_Get;

      end Server;

   end Shared_Instance;

end .Skeletons;
