package ru.virusofgod.reloadedconstructors;

public class Main {
    public static void main(String[] args) {
Person oleg = new Person("Konin");
        System.out.println(oleg);

Employee olga = new Employee("Svetova", "Olga", 'm' ,"buhgaler");
         olga.tellMeWhoAreYou();
        System.out.println(olga);

        Person olga2=olga;
        ((Employee) olga2).tellMeWhoAreYou();

        //Employee oleg2=oleg; нельзя вложить родителя в наследника
        System.out.println(olga2);


    }
}
