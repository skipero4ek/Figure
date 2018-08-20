package com.company;



public class Trapeze extends Figure {

    private double bBase;
    private double tBase;
    private double side ;

    public double getbBase() {
        return bBase;
    }

    public void setbBase(double bBase) {
        this.bBase = bBase;
    }

    public double gettBase() {
        return tBase;
    }

    public void settBase(double tBase) {
        this.tBase = tBase;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Trapeze() {

    }

    public Trapeze(double bBase, double tBase, double side) {

        this.bBase = bBase;
        this.tBase = tBase;
        this.side = side;
    }

    public double getHeight(){
        return 0.5*Math.sqrt(4*Math.pow(side,2)-Math.pow(bBase-tBase,2));
    }
    public double getDiagonale(){
        return Math.sqrt(Math.pow(side,2)+(bBase*tBase));
    }
    public double getMiddleLine(){
        return (tBase+bBase)/2;
    }
    public double getPerimeter(){
        return tBase+bBase +2*side;
    }

    @Override
    public String toString() {
        return super.toString()+" , периметр "+getPerimeter()+", высота "+getHeight()+ " , средняя линия"+
                getMiddleLine()+" , диагональ" +getDiagonale();
    }

    @Override
    double getArea() {
        return ((tBase+bBase)/2)*getHeight();
    }

}
