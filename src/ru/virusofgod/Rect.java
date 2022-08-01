package ru.virusofgod;

public class Rect {
  private  double width = 15;
  private double height = 20;
  private Rect rect;

  private String nameOfRect;


    public Rect() {
    }

    ;

    public Rect(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rect getRect() {
        return rect;
    }

    public void setRect(Rect rect) {
        this.rect = rect;
    }

    public String getNameOfRect() {
        return nameOfRect;
    }

    public void setNameOfRect(String nameOfRect) {
        this.nameOfRect = nameOfRect;
    }

    @Override
    public String toString() {
        return "Rect{" +
                "width=" + width +
                ", height=" + height +
                ", rect=" + rect +
                ", nameOfRect='" + nameOfRect + '\'' +
                '}';
    }

    double getArea(){
        return width * height;
    }

    void maignify(double koeff){
    width *=koeff;
    height*=koeff;
    }
}
