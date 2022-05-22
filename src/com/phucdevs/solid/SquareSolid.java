package com.phucdevs.solid;

/**
 * @author Phuc.Le
 */
public class SquareSolid implements Shape {

    private final int length;

    public SquareSolid(int length) { this.length = length; }

    public int getLength() { return length; }

    @Override
    public double area() {
        return Math.pow(length, 2);
    }
}
