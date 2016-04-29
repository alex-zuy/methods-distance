package org.pirat9600q.dot;

public enum Shape {

    POLYGON,

    RECTANGLE,

    TRAPEZIUM,

    TRIANGLE,

    INVTRIANGLE,

    ELLIPSE;

    public final String asString() {
        return toString().toLowerCase();
    }
}
