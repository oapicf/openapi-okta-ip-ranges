<?php
declare(strict_types=1);

namespace App;

use Articus\DataTransfer as DT;
use OpenAPIGenerator\APIClient as OAGAC;
use Psr\Http\Client\ClientExceptionInterface;
use Psr\Http\Message\ResponseInterface;

/**
 * OpenAPI Okta IP Ranges
 * OpenAPI specification and a set of generated API clients for Okta IP Ranges
 * The version of the OpenAPI document: 1.0.1-pre.0
 */
class ApiClient extends OAGAC\AbstractApiClient
{
    //region ipRangesJsonGet
    /**
     * Retrieve Okta IP ranges
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function ipRangesJsonGetRaw(
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ip_ranges.json', [], []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Okta IP ranges
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function ipRangesJsonGet(
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->ipRangesJsonGetRaw($responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* A JSON object of regional cells with IP ranges. */
                $responseContent = new \App\DTO\Collection1();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Okta IP ranges
     * @param string $responseMediaType
     * @return \App\DTO\Collection1
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function ipRangesJsonGetResult(
        string $responseMediaType = 'application/json'
    ): \App\DTO\Collection1
    {
        return $this->getSuccessfulContent(...$this->ipRangesJsonGet($responseMediaType));
    }
    //endregion
}

