package com.phucdevs.solid;

/**
 * @author Phuc.Le
 */
public class NoShape implements  Shape {

    @Override
    public double area() {
        throw new IllegalStateException("Cannot calculate area");
    }
}
