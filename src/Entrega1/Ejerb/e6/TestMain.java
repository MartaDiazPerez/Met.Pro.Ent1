package Entrega1.Ejerb.e6;

public class TestMain {
    public static void main(String[] args) {
        // Test para probar los contrsuctores y los metodos
        MyPoint p1 = new MyPoint();
        System.out.println(p1); // Test toString()
        p1.setX(8);
        p1.setY(6);
        System.out.println("x is: " + p1.getX());
        System.out.println("y is: " + p1.getY());
        p1.setXY(3, 0);
        System.out.println(p1.getXY()[0]);
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);

        MyPoint p2 = new MyPoint(0, 4);
        System.out.println(p2);

        // Test de versiones del metodo sobrecargado y cuales se utilizan en cada caso
        System.out.println("p1.distance(p2): " + p1.distance(p2)); // version distance(MyPoint another)
        System.out.println("p2.distance(p1): " + p2.distance(p1)); // version distance(MyPoint another)
        System.out.println("p1.distance(5,6): " + p1.distance(5, 6)); // version distance(int x, int y)
        System.out.println("p1.distance(): " + p1.distance()); // version distance()

        // Programa que instancia el array pedido de 10 puntos.
        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < 10; i++) {
            points[i] = new MyPoint(i + 1, i + 1);
        }

        // Print distance matrix
        System.out.println("Distance matrix:");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                System.out.printf("%.2f ", points[i].distance(points[j]));
            }
            System.out.println();
        }
    }
}
