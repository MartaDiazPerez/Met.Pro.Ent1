package Entrega1.Ejerb.e5;
//Clase Customer y zona de atributos
public class Customer {
    private int id;
    private String name;
    private char gender;
    private int discount;
    //Zona de metodos
    //Constructor
    public Customer(int id, String name, int discount, int i) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public char getGender() {
        return gender;
    }
    @Override
    public String toString() {
        return name + "(" + id + ")";
    }

}
