package Entrega1.Ejerd.e2;

public class TestMain {
    public static void main(String[] args) {
        // Declaración de variables de tipo GeometricObject
        GeometricObject circle = new Circle(5.0);
        GeometricObject rectangle = new Rectangle(3.0, 4.0);

        // Prueba de métodos en Circle
        System.out.println(circle);
        System.out.println("Área del círculo: " + circle.getArea());
        System.out.println("Perímetro del círculo: " + circle.getPerimeter());

        // Prueba de métodos en Rectangle
        System.out.println(rectangle);
        System.out.println("Área del rectángulo: " + rectangle.getArea());
        System.out.println("Perímetro del rectángulo: " + rectangle.getPerimeter());
    }
}
