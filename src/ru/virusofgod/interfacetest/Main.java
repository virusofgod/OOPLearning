package ru.virusofgod.interfacetest;

public class Main {
    public static void main(String[] args) {
Book book = new Book("Меч Шаннары", "Терри Брукс");
book.print();
book.read("This is run upon the Book");


Journal journal = new Journal("XXL");
journal.print();
journal.read("This is run upon the Journal");



Printable.reader();

Printable printableJournal = journal;
printableJournal.print();
printableJournal.read("This is run upon the Printable");


    }
}
