package com.phucdevs.solid;

/**
 * @author Phuc.Le
 */
public class CircleSolid implements Shape {

    private final int radius;

    public CircleSolid(int radius) { this.radius = radius; }

    public int getRadius() { return radius; }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
