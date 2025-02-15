package Entrega1.Ejerb.e9;

import Entrega1.Ejerb.e6.MyPoint;

// Programa principal para probar MyTriangle
public class TestMain {
    public static void main(String[] args) {
        // Test MyTriangle
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(4, 0);
        MyPoint p3 = new MyPoint(2, 3);

        MyTriangle triangle = new MyTriangle(p1, p2, p3);
        System.out.println("Triangle: " + triangle);
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Type: " + triangle.getType());
    }
}