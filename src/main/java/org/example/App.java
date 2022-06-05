package org.example;

import org.example.shape.Circle;
import org.example.shape.Dot;
import org.example.shape.Rectangle;
import org.example.visitor.AreaVisitor;
import org.example.visitor.DrawVisitor;
import org.example.visitor.PerimeterVisitor;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        List<Shape> shapes = Arrays.asList(
                new Dot(3, 3),
                new Rectangle(2, 4, 4, 4),
                new Circle(1, 5, 2)
        );

        AreaVisitor areaVisitor = new AreaVisitor();
        PerimeterVisitor perimeterVisitor = new PerimeterVisitor();
        DrawVisitor drawVisitor = new DrawVisitor();
        shapes.forEach(shape -> {
            System.out.println("============= SHAPE =============");
            shape.accept(areaVisitor);
            System.out.println("shape area: " + areaVisitor.getArea());
            shape.accept(perimeterVisitor);
            System.out.println("shape perimeter: " + perimeterVisitor.getPerimeter());
            shape.accept(drawVisitor);
        });
    }
}
