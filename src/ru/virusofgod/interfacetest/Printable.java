package ru.virusofgod.interfacetest;

public interface Printable {

    void print();
   default void read(String appendString){
        System.out.println("Read Printable" + " /////////appended string//////// --> " + appendString);
    };


}
