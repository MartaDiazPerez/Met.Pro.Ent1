package Entrega1.Ejerb.e7;
import Entrega1.Ejerb.e6.MyPoint;

// Programa principal para probar MyPoint y MyLine
public class TestMain {
    public static void main(String[] args) {
        // Test MyPoint
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("Distance between p1 and p2: " + p1.distance(p2));

        // Test MyLine
        MyLine line = new MyLine(p1, p2);
        System.out.println("Line: " + line);
        System.out.println("Line length: " + line.getLength());
    }
}