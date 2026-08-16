using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Retrieve Okta IP ranges
/// </summary>

public class IpRangesJsonGetEndpoint : FastEndpoints.EndpointWithoutRequest<Dictionary<string, IpRangesJsonGet200ResponseValue>>
{
    public override void Configure()
    {
        Get("/okta-ip-ranges/ip_ranges.json");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("default");
        });

        Summary(s => {
            s.Summary = "Retrieve Okta IP ranges";
            s.Responses[200] = "A JSON object of regional cells with IP ranges.";
        });
    }

    public override async Task HandleAsync(CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

