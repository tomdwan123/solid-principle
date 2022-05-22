package com.phucdevs.solid;

import java.util.List;

/**
 * @author Phuc.Le
 */
public class MainSolid {

    public static void main(String[] args) {
        AreaCalculatorSolid areaCalculatorSolid = new AreaCalculatorSolid();
        CircleSolid circleSolid = new CircleSolid(10);
        SquareSolid squareSolid = new SquareSolid(10);
        ShapesPrinterSolid printer = new ShapesPrinterSolid();
        List<Object> shapes = List.of(circleSolid, squareSolid);
        int sum = areaCalculatorSolid.sum(shapes);
        System.out.println(printer.json(sum));
        System.out.println(printer.csv(sum));
    }
}
