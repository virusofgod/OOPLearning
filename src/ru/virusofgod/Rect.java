package ru.virusofgod;

class Rect {
    double width = 15;
    double height = 20;

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

    @Override
    public String toString() {
        return "Rect{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

}
