package Entrega1.Ejerc.e4;

// Clase principal con el metodo main
public class TestMain {
    public static void main(String[] args) {
        Point point = new Point(1.0f, 2.0f);
        MovablePoint movablePoint = new MovablePoint(3.0f, 4.0f, 1.0f, 1.5f);

        System.out.println(point);
        System.out.println(movablePoint);

        movablePoint.move();
        System.out.println("After moving: " + movablePoint);
    }
}
