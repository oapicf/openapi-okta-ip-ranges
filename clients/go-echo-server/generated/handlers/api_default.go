package handlers
import (
	"github.com/oapicf/openapi-okta-ip-ranges/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// IpRangesJsonGet - Retrieve Okta IP ranges
func (c *Container) IpRangesJsonGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

