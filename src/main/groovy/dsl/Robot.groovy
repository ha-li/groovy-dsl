package dsl

/**
 * Created by hlieu on 11/28/16.
 */
class Robot {
    void move (Direction dir) {
        println "robot moved $dir"
    }

    void move (Direction dir, Distance d) {
        println "robot moved $dir by $d";
    }

    void move (Map m, Direction dir) {
        //introducing Groovy's Elvis operator ?:
        println "robot moved $dir by $m.by at ${m.at ?: '1 km/h'}";
    }
}
