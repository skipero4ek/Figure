package com.company;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    getFigures();
    }

    public static void getFigures() {

        List<Figure> list = new ArrayList<>();

        Random r = new Random();
        int cout = r.nextInt(10) + 1;
        for (int i = 0; i < cout; i++) {
            switch (r.nextInt(4)) {
                case 0:
                    Figure circle = new Circle(r.nextDouble()+1);
                    list.add(circle);
                    break;
                case 1:
                    Figure square = new Square(r.nextDouble()+10);
                    list.add(square);
                    break;
                case 2:
                    Figure triangle = new Triangle(r.nextDouble()+100,r.nextDouble()+100);
                    list.add(triangle);
                    break;
                case 3:
                    Figure trapeze = new Trapeze(6,4,5);
                    list.add(trapeze);
                    break;
            }
        }
        for (Figure f:list) {
            System.out.println(f.toString());
        }
    }
}

