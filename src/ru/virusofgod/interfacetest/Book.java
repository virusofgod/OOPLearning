package ru.virusofgod.interfacetest;

public class Book implements Printable {
String name;
String autor;

    public Book(String name, String autor) {
        this.name = name;
        this.autor = autor;
    }

    @Override
    public void print() {
        System.out.printf("%s (%s)", name, autor);
        System.out.println();
    }

}
