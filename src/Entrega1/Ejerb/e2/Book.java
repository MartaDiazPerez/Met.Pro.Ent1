package Entrega1.Ejerb.e2;

import Entrega1.Ejerb.e1.Author;

import java.util.Arrays;

// Clase Book, zona de atributos
public class Book {
    private String name;
    private Entrega1.Ejerb.e1.Author[] authors;
    private double price;
    private int qty;
    //Zona de metodos
    //Constructores
    public Book(String name, Entrega1.Ejerb.e1.Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
    public Book(String name, Entrega1.Ejerb.e1.Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    //Zona de getters y setters
    public String getName() {
        return name;
    }

    public Entrega1.Ejerb.e1.Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorNames() {
        return Arrays.stream(authors).map(Author::getName).reduce((a, b) -> a + ", " + b).orElse("");
    }

    @Override
    public String toString() {
        return "Book[name=" + name + ", authors=" + Arrays.toString(authors) + ", price=" + price + ", qty=" + qty + "]";
    }

}
