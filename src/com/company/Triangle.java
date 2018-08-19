package com.company;

import java.util.HashMap;
import java.util.Random;

public class Triangle extends Figure {
    Random r=new Random();
    private double firstSide=r.nextDouble()+100;
    private double secondSide=r.nextDouble()+100;



    public Triangle() {
    }

    public Triangle(double firstSide, double secondSide) {

        this.firstSide = firstSide;
        this.secondSide = secondSide;

    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }


    public double getHypotenuse(){
        return Math.sqrt(Math.pow(firstSide,2)+Math.pow(secondSide,2));
    }
    public double getHeight(){
        return (firstSide*secondSide)/getHypotenuse();
    }
    public double getPerimeter(){
        return firstSide+secondSide+getHypotenuse();
    }

    @Override
    public String toString() {
        return  super.toString()+" периметр "+getPerimeter()+ ", высота "+getHeight()+" ,гипотенуза"+getHypotenuse() ;
    }

    @Override
    double getArea() {
        return (firstSide+secondSide)/2;
    }


}
