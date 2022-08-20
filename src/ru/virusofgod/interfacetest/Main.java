package ru.virusofgod.interfacetest;

public class Main {
    public static void main(String[] args) {
Book book = new Book("Меч Шаннары", "Терри Брукс");


book.print();
book.read("This is run upon the book");
Journal journal = new Journal("XXL");
journal.print();
System.out.println(journal.getName());
Printable printableJournal = journal;
printableJournal.print();



    }
}
