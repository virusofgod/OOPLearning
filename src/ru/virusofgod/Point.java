package ru.virusofgod;

import java.util.Locale;
import java.util.Scanner;

public class Point {

    double x, y;

    void move(double dx, double dy){
    x+=dx;
    y+=dy;
    }

void input(){
    Scanner in = new Scanner(System.in);
    in.useLocale(Locale.US);
    System.out.print("Enter x: ");
    double x = in.nextDouble();
    System.out.print("Enter y: ");
    double y = in.nextDouble();
    move(x, y);

    }

    double getDistance(Point a){
    return  Math.sqrt(Math.pow(x-a.x, 2) + Math.pow(y-a.y, 2));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
