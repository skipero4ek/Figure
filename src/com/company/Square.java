package com.company;

import java.util.HashMap;
import java.util.Random;

public class Square extends Figure{

    Random r=new Random();
    private double side=r.nextDouble()+10;



    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square() {

    }

    public Square(double side) {

        this.side = side;
    }


    private double getPerimeter(){
        return side*4;
    }
    private double getDiagonal(){
        return Math.sqrt(2)*side;
    }
    @Override
    double getArea() {
        return side*side;
    }
    @Override
    public String toString() {
        return super.toString()+" , периметр "+getPerimeter()+ ", диагональ  " +getDiagonal();
    }


}
