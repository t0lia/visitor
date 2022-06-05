package org.example.visitor;

import org.example.Visitor;
import org.example.shape.Circle;
import org.example.shape.Dot;
import org.example.shape.Rectangle;

public class PerimeterVisitor implements Visitor {
    private double perimeter;

    public void visit(Circle circle) {
        perimeter = Math.PI * 2 * circle.getRadius();
    }

    public void visit(Dot dot) {
        perimeter = 0.0;
    }

    public void visit(Rectangle rectangle) {
        perimeter = 2.0 * rectangle.getHeight() + 2.0 * rectangle.getWidth();
    }

    public double getPerimeter() {
        return perimeter;
    }
}

