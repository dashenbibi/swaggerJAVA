<?php

namespace PetstoreIO;

/**
 * @SWG\Definition(
 *   type="object",
 *   @SWG\Xml(name="Tag")
 * )
 */
class Tag
{

    /**
     * id
     * @SWG\Property(format="int64")
     * @var int
     */
    public $id;

    /**
     * @SWG\Property(description="name")
     * @var string
     */
    public $name;
}
