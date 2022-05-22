package com.phucdevs.solid;

/**
 * @author Phuc.Le
 */
public class CubeSolid implements Shape, ThreeDimensionalShape {

    @Override
    public double area() {
        return 100;
    }

    @Override
    public double volume() {
        return 0;
    }
}
