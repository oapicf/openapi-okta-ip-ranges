<?php
/**
 * IpRangesJsonGet200ResponseValue
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\Model
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * OpenAPI Okta IP Ranges
 *
 * OpenAPI specification and a set of generated API clients for Okta IP Ranges
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\Accessor;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the IpRangesJsonGet200ResponseValue model.
 *
 * Object containing IP ranges for a specific regional cell
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class IpRangesJsonGet200ResponseValue 
{
        /**
     * @var string[]|null
     * @SerializedName("ip_ranges")
     * @Assert\All({
     *   @Assert\Type("string")
     * })
     * @Type("array<string>")
     */
    protected ?array $ipRanges = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->ipRanges = array_key_exists('ipRanges', $data) ? $data['ipRanges'] : $this->ipRanges;
        }
    }

    /**
     * Gets ipRanges.
     *
     * @return string[]|null
     */
    public function getIpRanges(): ?array
    {
        return $this->ipRanges;
    }



    /**
     * Sets ipRanges.
     *
     * @param string[]|null $ipRanges
     *
     * @return $this
     */
    public function setIpRanges(?array $ipRanges = null): self
    {
        $this->ipRanges = $ipRanges;

        return $this;
    }
}

