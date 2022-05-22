package com.phucdevs.solid;

import java.util.List;

/**
 * @author Phuc.Le
 */
public class AreaCalculatorSolid {

    public int sum(List<Shape> shapes) {
        return shapes.stream()
                .mapToInt(s -> (int) Math.round(s.area()))
                .sum();
    }
}
