package org.example.visitor;

import org.example.Visitor;
import org.example.shape.Circle;
import org.example.shape.Dot;
import org.example.shape.Rectangle;

public class AreaVisitor implements Visitor {

    private Double area;

    public void visit(Circle circle) {
        area = Math.PI * circle.getRadius() * circle.getRadius();
    }

    public void visit(Dot dot) {
        area = 0.0;
    }

    public void visit(Rectangle rectangle) {
        area = 1.0 * rectangle.getHeight() * rectangle.getWidth();
    }

    public Double getArea() {
        return area;
    }
}
