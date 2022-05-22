package com.phucdevs.solid;

import java.util.List;

/**
 * @author Phuc.Le
 */
public class MainSolid {

    public static void main(String[] args) {
        AreaCalculatorSolid areaCalculatorSolid = new AreaCalculatorSolidImpl();
        CircleSolid circleSolid = new CircleSolid(10);
        SquareSolid squareSolid = new SquareSolid(10);
        CubeSolid cubeSolid = new CubeSolid();
        RectangleSolid rectangleSolid = new RectangleSolid();
        NoShape noShape = new NoShape();
        ShapesPrinterSolid printer = new ShapesPrinterSolid(areaCalculatorSolid);
        List<Shape> shapes = List.of(
                circleSolid,
                squareSolid,
                cubeSolid,
                rectangleSolid);
        //int sum = areaCalculatorSolid.sum(shapes);
        System.out.println(printer.json(shapes));
        System.out.println(printer.csv(shapes));
    }
}
