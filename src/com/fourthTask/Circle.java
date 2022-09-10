package com.fourthTask;

public class Circle extends Shape {

    protected double radius;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double gerPerimeter() {
        return super.gerPerimeter();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
