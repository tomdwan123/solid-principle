package com.phucdevs.solid;

import java.util.List;

/**
 * @author Phuc.Le
 */
public class ShapesPrinterSolid {

    private final AreaCalculatorSolid areaCalculatorSolid;

    public ShapesPrinterSolid(AreaCalculatorSolid areaCalculatorSolid) {

        this.areaCalculatorSolid = areaCalculatorSolid;
    }

    public String json(List<Shape> shapes) {

        return String.format("{shapesSum: %s}",
                areaCalculatorSolid.sum(shapes));
    }

    public String csv(List<Shape> shapes) {

        return String.format("shapes_sum, %s",
                areaCalculatorSolid.sum(shapes));
    }
}
