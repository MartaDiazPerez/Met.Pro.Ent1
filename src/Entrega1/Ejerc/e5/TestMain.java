package Entrega1.Ejerc.e5;

// Clase principal con el metodo main
public class TestMain {
    public static void main(String[] args) {
        Shape circle = new Circle(1.0);
        Shape rectangle = new Rectangle(3.0, 4.0, "green", true);
        Shape square = new Square(2.0, "yellow", false);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}
