package org.example.shape;

import org.example.Shape;
import org.example.Visitor;

public class Rectangle implements Shape {

    private int x;
    private int y;
    private int height;
    private int width;

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public Rectangle(int x, int y, int height, int width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
