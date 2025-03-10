package Entrega1.Ejerd.e6;

public class TestMain {
    public static void main(String[] args) {
        Cat cat = new Cat("Whiskers");
        Dog dog = new Dog("Rex");
        BigDog bigDog1 = new BigDog("Max");
        BigDog bigDog2 = new BigDog("Bruno");

        cat.greets();       // Meow
        dog.greets();       // Woof
        bigDog1.greets();   // Wooow
        dog.greets(dog);    // Woooof
        bigDog1.greets(dog);  // Wooooow
        bigDog1.greets(bigDog2); // Woooooooow
    }
}
