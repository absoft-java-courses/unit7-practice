package com.absoft.unit7.beans;

import com.absoft.unit7.annotations.MyAnnotation;

@MyAnnotation
public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
