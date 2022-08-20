package ru.virusofgod.interfacetest;

public interface Printable {

    void print();
   default void read(String appendString){
        System.out.println("Read Printable" + " /////////appended string//////// --> " + appendString);
    }

   static void reader(){
       System.out.println("it's a static interface method!!!!!!!!!!!!");
   }
}
