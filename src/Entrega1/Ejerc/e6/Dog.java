package Entrega1.Ejerc.e6;
//Subclase Dog y zona de atributos
class Dog extends Mammal {
    //Zona de metodos y constructores
    public Dog(String name) {
        super();
    }

    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woooof");
    }
    @Override
    public String toString() {
        return "Dog" + super.toString();
    }
}