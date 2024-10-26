<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Object containing IP ranges for a specific regional cell
 */
class IpRangesJsonGet200ResponseValue
{
    /**
     * @DTA\Data(field="ip_ranges", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection::class})
     */
    public ?\App\DTO\Collection $ip_ranges = null;

}
