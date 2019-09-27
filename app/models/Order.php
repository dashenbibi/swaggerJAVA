<?php

namespace PetstoreIO;

/**
 * @SWG\Definition(type="object", @SWG\Xml(name="Order"))
 */
class Order
{

    /**
     * id
     * @SWG\Property(format="int64")
     * @var int
     */
    public $id;

    /**
     * @SWG\Property(format="int64",description="petID")
     * @var int
     */
    public $petId;

    /**
     * @SWG\Property(default=false)
     * @var bool
     */
    public $complete;

    /**
     * @SWG\Property(format="int32")
     * @var int
     */
    public $quantity;

    /**
     * @var \DateTime
     * @SWG\Property()
     */
    public $shipDate;

    /**
     * Order Status
     * @var string
     * @SWG\Property(enum={"placed", "approved", "delivered"})
     */
    public $status;
}
