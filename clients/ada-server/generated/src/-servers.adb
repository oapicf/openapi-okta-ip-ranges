--  OpenAPI Okta IP Ranges
--  OpenAPI specification and a set of generated API clients for Okta IP Ranges
--  ------------ EDIT NOTE ------------
--  This file was generated with openapi-generator.  You can modify it to implement
--  the server.  After you modify this file, you should add the following line
--  to the .openapi-generator-ignore file:
--
--  src/-servers.adb
--
--  Then, you can drop this edit note comment.
--  ------------ EDIT NOTE ------------
package body .Servers is


   --  Retrieve Okta IP ranges
   --  Returns IP ranges organized by regional cell names.
   overriding
   procedure Ip_Ranges_Json_Get
      (Server : in out Server_Type
       ;
       Result  : out ;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Ip_Ranges_Json_Get;

end .Servers;
