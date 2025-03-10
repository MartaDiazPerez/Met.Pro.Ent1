package Entrega1.Ejerd.e6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
//Clase de prueba para la clase Dog.
class DogTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void testDogGreets() {
        Dog dog = new Dog("Rex");
        dog.greets();
        assertEquals("Woof\n", outContent.toString());
    }

    @Test
    void testDogGreetsAnotherDog() {
        Dog dog1 = new Dog("Rex");
        Dog dog2 = new Dog("Buddy");
        dog1.greets(dog2);
        assertEquals("Woooof\n", outContent.toString());
    }
}