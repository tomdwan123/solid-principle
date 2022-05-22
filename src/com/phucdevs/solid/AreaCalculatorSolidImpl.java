package com.phucdevs.solid;

import java.util.List;

/**
 * @author Phuc.Le
 */
public class AreaCalculatorSolidImpl implements AreaCalculatorSolid {

    @Override
    public int sum(List<Shape> shapes) {
        return shapes.stream()
                .mapToInt(s -> (int) Math.round(s.area()))
                .sum();
    }
}
