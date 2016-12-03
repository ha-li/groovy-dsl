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
    // define an operator '/' requires method called div()
    // DistanceCategory.getKm() returns a Distance() object
    // so we have to define div(Duration) method in Distance object
    // 5.km/h is the same as 5.getKm().div(h)
    move right, by: 3.m, at: 5.km/h
    move left, by: 10.km
    // named arguments are down as Maps, the named arguments
    // are stored into a map and passed as the 1st argument,
    // followed by all others in the order they appear
    move forward, by: 3.m, at: 30.m/s

    // since named arguments can go in any order,
    // we can do these
    move at: 10.km/min, backward, by: 10.m
    move by: 25.km, at: 10.m/s, forward


}
