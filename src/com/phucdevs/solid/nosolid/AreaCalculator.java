package com.phucdevs.solid.nosolid;

import java.util.List;

/**
 * @author Phuc.Le
 */
public class AreaCalculator {

    public int sum(List<Object> shapes) {

        int sum = 0;
        for (int i = 0; i < shapes.size(); i++) {
            Object shape = shapes.get(i);
            if (shape instanceof Square) {
                sum += Math.pow(((Square) shape).getLength(), 2);
                continue;
            }

            if (shape instanceof Circle) {
                sum += Math.PI * Math.pow(((Circle) shape).getRadius(), 2);
                continue;
            }
        }

        return sum;
    }
}
