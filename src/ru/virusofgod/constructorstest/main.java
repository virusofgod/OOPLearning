package ru.virusofgod.constructorstest;

public class main {

      public static void main(String[] args) {
          Person person = new Person("Сергей", 28);
          System.out.println( person.getName() + " id " + person.getId() ); //Реализация присвоения id каждому объекту
          Person person2 = new Person("Михаил", 10);      //данного класса.
          System.out.println( person2.getName() + " id " + person2.getId() );
          Person person3 = new Person("Пётр", 8);
          System.out.println( person3.getName() + " id " + person3.getId() );
          Person person4 = new Person("Олег", 3);
          System.out.println( person4.getName() + " id " + person4.getId() );
          System.out.println( Person.getCounter() - 1);



      }



}
