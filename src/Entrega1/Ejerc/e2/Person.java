package Entrega1.Ejerc.e2;
//Zona de atributos y lase Person
public class Person {
    private String name;
    private String address;
    //Zona de metodos
    //Constructor
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    //Zona de getters y setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    @Override
    public String toString() {
        return "Person[name=" + name + ", address=" + address + "]";
    }

}
