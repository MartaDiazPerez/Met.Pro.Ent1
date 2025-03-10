package Entrega1.Ejerd.e1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestMainTest {

    @Test
    void testCircle() {
        Shape s1 = new Circle(5.5, "red", false);
        assertEquals(5.5, ((Circle) s1).getRadius());
        assertEquals("red", s1.getColor());
        assertFalse(s1.isFilled());
        assertEquals(Math.PI * 5.5 * 5.5, s1.getArea(), 0.01);
        assertEquals(2 * Math.PI * 5.5, s1.getPerimeter(), 0.01);

        Circle c1 = (Circle) s1;
        assertEquals(5.5, c1.getRadius());
        assertEquals("red", c1.getColor());
        assertFalse(c1.isFilled());
    }

    @Test
    void testRectangle() {
        Shape s3 = new Rectangle(1.0, 2.0, "red", false);
        assertEquals(2.0, ((Rectangle) s3).getLength());
        assertEquals(1.0, ((Rectangle) s3).getWidth());
        assertEquals("red", s3.getColor());
        assertEquals(2.0, s3.getArea(), 0.01);
        assertEquals(6.0, s3.getPerimeter(), 0.01);

        Rectangle r1 = (Rectangle) s3;
        assertEquals(2.0, r1.getLength());
        assertEquals(1.0, r1.getWidth());
        assertEquals("red", r1.getColor());
    }

    @Test
    void testSquare() {
        Shape s4 = new Square(6.6);
        assertEquals(6.6, ((Square) s4).getSide());
        assertEquals(6.6 * 6.6, s4.getArea(), 0.01);
        assertEquals(4 * 6.6, s4.getPerimeter(), 0.01);

        Rectangle r2 = (Rectangle) s4;
        assertEquals(6.6, r2.getLength());
        assertEquals(6.6 * 6.6, r2.getArea(), 0.01);
        assertEquals(4 * 6.6, r2.getPerimeter(), 0.01);

        Square sq1 = (Square) r2;
        assertEquals(6.6, sq1.getSide());
        assertEquals(6.6 * 6.6, sq1.getArea(), 0.01);
        assertEquals(4 * 6.6, sq1.getPerimeter(), 0.01);
    }
}