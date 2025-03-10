package Entrega1.Ejerd.e6;

//Clase que representa un perro y sobrescribe el metodo de saludo.
 public class Dog extends Animal {
    /**ZONA DE METODOS**/
    //Creo un constructor por defecto
    public Dog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woooof");
    }
}
