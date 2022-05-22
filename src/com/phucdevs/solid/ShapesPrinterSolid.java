package com.phucdevs.solid;

/**
 * @author Phuc.Le
 */
public class ShapesPrinterSolid {

    public String json(int sum) {
        return String.format("{shapesSum: %s}", sum);
    }

    public String csv(int sum) {
        return String.format("shapes_sum, %s", sum);
    }
}
