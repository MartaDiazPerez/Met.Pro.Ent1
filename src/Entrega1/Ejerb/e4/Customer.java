package Entrega1.Ejerb.e4;
//Clase Customer y zona de atributos
public class Customer {
    private int id;
    private String name;
    private int discount;
    //Zona de metodos
    //Constructor
    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }
    //Zona de getter's y setter's
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDiscount() {
        return discount;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }
    @Override
    public String toString() {
        return name + "(" + id + ")(" + discount + "%)";
    }
}
