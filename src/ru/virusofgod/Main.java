package ru.virusofgod;
//псевдокод

/*
class ИмяКласса{
    типПоля1 имяПоля1;
    типПоля1 имяПоля1;

    типеРезультата1 имяМетода1(параметрыМетода){
    <тело метода>
    }
}
*/
public class Main {

    public static void main(String[] args) {



        Rect rect = new Rect(75, 40);
        rect.setHeight(1000);
        rect.setWidth(15);
        rect.setNameOfRect("I am rect");
        System.out.println();
        System.out.println();
        System.out.println("Площадь Rect: " + rect.getArea()  + " использую метод изнутри класса getArea()");
        rect.maignify(1.5);
        System.out.println("Площадь Rect: " + rect.getArea()  + " после изменения площади");
        System.out.println(rect);
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        System.out.println();



        Rect rect1 = new Rect(75, 50);
        rect1.setHeight(5);
        rect1.setWidth(25);
        rect1.setNameOfRect("I am rect1");
        System.out.println("Площадь Rect1: " + rect1.getArea() + " использую метод изнутри класса getArea()");
        rect1.maignify(2.33);
        System.out.println("Площадь Rect1: " + rect1.getArea()  + " после изменения площади");
        System.out.println("метод toString rect1 до операции rect1=rect; " + rect1 );
        System.out.println("Сравнение до операции rect1=rect; " + (rect == rect1) );
        rect1=rect;
        System.out.println("Сравнение после операции rect1=rect; " + (rect == rect1) );
        System.out.println("метод toString Rect1: после операции rect1=rect; " + rect1);
        System.out.println( "rect1 теперь указывает на тот объект на который ссылается rect ");

        System.out.println("----------------------------------------------------------------------------------------------------------------------");


        System.out.println();
        Rect rect3 = new Rect(75, 50);
        rect3.setHeight(1);
        rect3.setWidth(2);
        rect3.setNameOfRect("I am rect3");
        System.out.println("площадь Rect 3: " + rect3.getArea()  + " использую метод изнутри класса getArea()");
        rect3.maignify(0.3);
        System.out.println("Площадь Rect3: " + rect3.getArea()  + " после изменения площади");
        System.out.println(rect3);
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println();
        rect.setRect(new Rect());
        System.out.println(rect);
        System.out.println("Проинициализировал ссылку rect через метод,  находящуюся в классе Rect: rect.setRect(new Rect());");
        System.out.println("Все поля приватны соблюдён принцип инкапсуляции.");

    }
}