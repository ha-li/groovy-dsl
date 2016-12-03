package dsl

/**
 * Created by hlieu on 11/28/16.
 *
 * this is actually what goes into the DSL script the engineer would implement
 */

use (DistanceCategory) {

    // here we are operating with the DistanceCategory,
    // so we have the additional methods defined in DistanceCategory,
    // such as getM (or it's direct access Number.m)
    // or getMeters (or 3.meters)

    move left
    move right, new Distance(3, meter);
    move left, Distance.of(4, kilometer);
    move right, 3.meters
    move left, 10.km
    move left, 3.m
    move right, by: 3.m, at: 5.km/h
    move left, by: 10.km
    move forward, by: 3.m, at: 30.m/s

}
