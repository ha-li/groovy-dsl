package dsl

import groovy.transform.TupleConstructor;

/**
 * Created by hlieu on 12/2/16.
 */
@TupleConstructor
class Speed {
    Number scalar
    DistanceUnit unit
    Duration duration

    String toString() { return "$scalar $unit/$duration"; }
}
