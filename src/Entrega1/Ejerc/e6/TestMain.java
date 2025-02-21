package Entrega1.Ejerc.e6;

public class TestMain{
    public static void main(String[] args) {
        Animal cat = new Cat("Kitty");
        Animal dog = new Dog("Buddy");

        ((Cat) cat).greets();
        ((Dog) dog).greets();

        Dog anotherDog = new Dog("Rocky");
    }
}
