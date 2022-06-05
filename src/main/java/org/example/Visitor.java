package org.example;

import org.example.shape.Circle;
import org.example.shape.Dot;
import org.example.shape.Rectangle;

public interface Visitor {
    void visit(Dot dot);

    void visit(Rectangle rectangle);

    void visit(Circle circle);
}
