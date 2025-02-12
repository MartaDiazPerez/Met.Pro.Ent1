package Entrega1.Ejera.e1;

//Zona de atributos
public class Circle {
    private double  radius;
    //Zona de metodos
    public Circle() {
        radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius +"]";// Aquí queremos que nos lo retorne de esra forma
    }
}
