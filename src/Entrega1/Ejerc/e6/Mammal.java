package Entrega1.Ejerc.e6;
//Subclase Mammal y zona de atributos
public class Mammal extends Animal {
//Constructor y zona de metodos
    public Mammal() {
        super("Mammal");
    }
    @Override
    public String toString() {
        return "Mammal[" + super.toString() + "]";
    }

}
