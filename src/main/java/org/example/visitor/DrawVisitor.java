package org.example.visitor;

import org.example.Visitor;
import org.example.shape.Circle;
import org.example.shape.Dot;
import org.example.shape.Rectangle;

public class DrawVisitor implements Visitor {
    public void visit(Circle circle) {
        System.out.println("draw a circle " + circle.toString());
    }

    public void visit(Dot dot) {
        System.out.println("draw a dot " + dot.toString());
    }

    public void visit(Rectangle rectangle) {
        System.out.println("draw a rectangle " + rectangle.toString());
    }
}
