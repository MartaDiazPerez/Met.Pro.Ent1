package Entrega1.Ejerd.e2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba para la ejecución del programa principal con GeometricObject.
 */
class TestMainTest {

    /**
     * Prueba el comportamiento del programa creando instancias de GeometricObject
     * con Circle y Rectangle.
     */
    @Test
    void main() {
        // Crear un objeto GeometricObject como Circle
        GeometricObject shape1 = new Circle(3.0);
        assertEquals(Math.PI * 9, shape1.getArea(), 0.01);
        assertEquals(2 * Math.PI * 3.0, shape1.getPerimeter(), 0.01);

        // Crear un objeto GeometricObject como Rectangle
        GeometricObject shape2 = new Rectangle(4.0, 5.0);
        assertEquals(20.0, shape2.getArea());
        assertEquals(40.0, shape2.getPerimeter());

        // Verificar las representaciones en cadena
        assertTrue(shape1.toString().contains("radius=3.0"));
        assertTrue(shape2.toString().contains("width=4.0"));
    }
}