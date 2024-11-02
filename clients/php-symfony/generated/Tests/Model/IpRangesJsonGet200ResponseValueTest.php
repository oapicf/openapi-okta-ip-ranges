<?php
/**
 * IpRangesJsonGet200ResponseValueTest
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\Tests\Model
 * @author   openapi-generator contributors
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * OpenAPI Okta IP Ranges
 *
 * OpenAPI specification and a set of generated API clients for Okta IP Ranges
 *
 * The version of the OpenAPI document: 0.10.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Please update the test case below to test the model.
 */

namespace OpenAPI\Server\Tests\Model;

use OpenAPI\Server\Model\IpRangesJsonGet200ResponseValue;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * IpRangesJsonGet200ResponseValueTest Class Doc Comment
 *
 * @category    Class
 * @description Object containing IP ranges for a specific regional cell
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\IpRangesJsonGet200ResponseValue
 */
class IpRangesJsonGet200ResponseValueTest extends TestCase
{
    protected IpRangesJsonGet200ResponseValue|MockObject $object;

    /**
     * Setup before running any test case
     */
    public static function setUpBeforeClass(): void
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp(): void
    {
        $this->object = $this->getMockBuilder(IpRangesJsonGet200ResponseValue::class)->getMockForAbstractClass();
    }

    /**
     * Clean up after running each test case
     */
    public function tearDown(): void
    {
    }

    /**
     * Clean up after running all test cases
     */
    public static function tearDownAfterClass(): void
    {
    }

    /**
     * @group integration
     * @small
     */
    public function testTestClassExists(): void
    {
        $this->assertTrue(class_exists(IpRangesJsonGet200ResponseValue::class));
        $this->assertInstanceOf(IpRangesJsonGet200ResponseValue::class, $this->object);
    }

    /**
     * Test attribute "ipRanges"
     *
     * @group unit
     * @small
     */
    public function testPropertyIpRanges(): void
    {
        $this->markTestSkipped('Test for property ipRanges not implemented');
    }
}
