package com.phucdevs.solid;

import java.util.List;

/**
 * @author Phuc.Le
 */
public class AreaCalculatorSolid {

    public int sum(List<Object> shapes) {

        int sum = 0;
        for (int i = 0; i < shapes.size(); i++) {
            Object shape = shapes.get(i);
            if (shape instanceof SquareSolid) {
                sum += Math.pow(((SquareSolid) shape).getLength(), 2);
                continue;
            }

            if (shape instanceof CircleSolid) {
                sum += Math.PI * Math.pow(((CircleSolid) shape).getRadius(), 2);
                continue;
            }
        }

        return sum;
    }
}
