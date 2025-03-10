package Entrega1.Ejerd.e1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//Pruebas unitarias para la clase Shape.
class ShapeTest {

    //Clase concreta para probar la implementación de Shape.
    static class TestShape extends Shape {
        public TestShape() {
            super();
        }

        public TestShape(String color, boolean filled) {
            super(color, filled);
        }

        @Override
        public double getArea() {
            return 42.0; // Valor arbitrario solo para prueba
        }

        @Override
        public double getPerimeter() {
            return 24.0; // Valor arbitrario solo para prueba
        }
    }

    //Prueba del constructor por defecto.
    @Test
    void testDefaultConstructor() {
        TestShape shape = new TestShape();
        assertEquals("red", shape.getColor());
        assertTrue(shape.isFilled());
    }

    //Prueba del metodo getColor().
    @Test
    void getColor() {
        TestShape shape = new TestShape("blue", true);
        assertEquals("blue", shape.getColor());
    }

    //Prueba del método setColor().
    @Test
    void setColor() {
        TestShape shape = new TestShape();
        shape.setColor("green");
        assertEquals("green", shape.getColor());
    }

    //Prueba del metodo isFilled().
    @Test
    void isFilled() {
        TestShape shape = new TestShape("yellow", false);
        assertFalse(shape.isFilled());
    }

    //Prueba del metodo setFilled().
    @Test
    void setFilled() {
        TestShape shape = new TestShape();
        shape.setFilled(false);
        assertFalse(shape.isFilled());
    }

    //Prueba del método getArea().
    @Test
    void getArea() {
        TestShape shape = new TestShape();
        assertEquals(42.0, shape.getArea(), 0.001);
    }

    //Prueba del metodo getPerimeter().
    @Test
    void getPerimeter() {
        TestShape shape = new TestShape();
        assertEquals(24.0, shape.getPerimeter(), 0.001);
    }

    //Prueba del método toString().
    @Test
    void testToString() {
        TestShape shape = new TestShape("purple", true);
        assertEquals("Shape[color=purple, filled=true]", shape.toString());
    }
}