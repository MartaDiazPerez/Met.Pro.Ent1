package Entrega1.Ejerd.e6;

import static org.junit.jupiter.api.Assertions.*;

import Entrega1.Ejerd.e6.Cat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

//Clase de prueba para la clase Cat.
class CatTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void testCatGreets() {
        Cat cat = new Cat("Whiskers");
        cat.greets();
        assertEquals("Meow\n", outContent.toString());
    }
}