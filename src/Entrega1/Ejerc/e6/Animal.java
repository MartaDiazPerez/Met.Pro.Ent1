package Entrega1.Ejerc.e6;
//Zona de atributos y super clase animal
public class Animal {
    private String name;
    //Zona de metodos
    //Constructores
    public Animal(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Animal[name=" + name + "]";
    }
}
