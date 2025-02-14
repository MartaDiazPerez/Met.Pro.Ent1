package Entrega1.Ejerb.e6;

// Programa principal para probar MyPoint
public class TestMain {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3, 4);
        System.out.println("Punto p1: " + p1);
        System.out.println("Distancia al origen: " + p1.distance());
        System.out.println("Distancia a (5,6): " + p1.distance(5, 6));

        MyPoint p2 = new MyPoint(5, 6);
        System.out.println("Distancia entre p1 y p2: " + p1.distance(p2));
    }
}
