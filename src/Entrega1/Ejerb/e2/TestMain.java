package Entrega1.Ejerb.e2;

import Entrega1.Ejerb.e1.Author;
import Entrega1.Ejerb.e1.Book;

public class TestMain {
    public static void main(String[] args) {
// Test Getters and Setters
        // Declare and allocate an array of Authors
        Entrega1.Ejerb.e1.Author[] authors = new Entrega1.Ejerb.e1.Author[2];
        authors[0] = new Entrega1.Ejerb.e1.Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
// Declare and allocate a Book instance
        Entrega1.Ejerb.e1.Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy); // toString()
    }
}