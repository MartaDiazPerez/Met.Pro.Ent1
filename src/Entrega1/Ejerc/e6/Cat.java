package Entrega1.Ejerc.e6;
//Zona de atributos y subclase cat
class Cat extends Mammal {
    public Cat(String name) {
        super();
    }

    public void greets() {
        System.out.println("Meow");
    }
    @Override
    public String toString() {
        return "Cat" + super.toString();
    }
}
