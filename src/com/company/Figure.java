package com.company;


import java.util.HashMap;
import java.util.Random;

public abstract class Figure {
    public Figure() {
    }

    abstract double getArea();
    String getColor() {
        Random r=new Random();
        HashMap<Integer,String> colors=new HashMap<>();
        colors.put(0,"Black");
        colors.put(1,"Pink");
        colors.put(2,"Blue");
        colors.put(3,"Cyan");
        colors.put(4,"Gray");
        colors.put(5,"Green");
        colors.put(6,"LightGray");
        colors.put(7,"Magenta");
        colors.put(8,"Pink");
        colors.put(9,"Red");
        colors.put(10,"White");
        colors.put(11,"Yellow");
        return colors.get(r.nextInt(colors.size()));
    }

    @Override
    public String toString() {
        return "Фигура " +this.getClass().getSimpleName() + " площадь "+getArea()+" цвет " +getColor();
    }
}
