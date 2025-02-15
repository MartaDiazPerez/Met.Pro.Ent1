package Entrega1.Ejerb.e8;
import Entrega1.Ejerb.e6.MyPoint;
// Programa principal para probar MyPoint y MyCircle
public class TestMain {
    public static void main(String[] args) {
        // Test MyPoint
        MyPoint p1 = new MyPoint(3, 4);
        System.out.println("p1: " + p1);
        System.out.println("Distance to origin: " + p1.distance());

        // Test MyCircle
        MyCircle c1 = new MyCircle(p1, 5);
        MyCircle c2 = new MyCircle(10, 10, 3);
        System.out.println("Circle c1: " + c1);
        System.out.println("Circle c2: " + c2);
        System.out.println("Distance between c1 and c2: " + c1.distance(c2));
        System.out.println("Circle c1 area: " + c1.getArea());
        System.out.println("Circle c1 circumference: " + c1.getCircumference());
    }
}