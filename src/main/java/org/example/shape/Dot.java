package org.example.shape;

import org.example.Shape;
import org.example.Visitor;

public class Dot implements Shape {
    private int x;
    private int y;

    @Override
    public String toString() {
        return "Dot{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
