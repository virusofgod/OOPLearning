package ru.virusofgod.constructorstest;



public class Person {

    public static final double XAMARIN = 1000; /*константа не меняет своего значения имя
   пишется только заглавными буквами доступна отовсюду */
   private int id;
    private static String name;
    private int age;
    private static int counter = 1;


   /* Статичный код срабатывает один раз при вызове конструктора
    при создаии первого обьекта данного класса!!!! */
    /*

    static{
        System.out.println(counter);
    }
      */


    public Person(String name, int age) {
        id = counter ++; // модифицированный конструктор у каждого объекта даного класса свой id
        this.name = name;
        this.age = age;
        }

      public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age >0 && age<=150){
        this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }
}
