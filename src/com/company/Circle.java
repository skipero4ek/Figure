package com.company;


public class Circle extends Figure {

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return radius * 2;
    }
    public double getCircuit(){
        return Math.PI*getDiameter();
    }
    @Override
    public String toString() {
        return super.toString()+" , диаметр "+getDiameter()+", длина окружности "+getCircuit();
    }

    @Override
    double getArea() {
        return Math.PI  * Math.pow(radius, 2);
    }


}
