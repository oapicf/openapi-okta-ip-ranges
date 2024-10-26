package main

import (
	"github.com/oapicf/openapi-okta-ip-ranges/handlers"
	"github.com/labstack/echo/v4"
	"github.com/labstack/echo/v4/middleware"
)

func main() {
	e := echo.New()

	//todo: handle the error!
	c, _ := handlers.NewContainer()

	// Middleware
	e.Use(middleware.Logger())
	e.Use(middleware.Recover())


	// IpRangesJsonGet - Retrieve Okta IP ranges
	e.GET("/okta-ip-ranges/ip_ranges.json", c.IpRangesJsonGet)


	// Start server
	e.Logger.Fatal(e.Start(":8080"))
}
