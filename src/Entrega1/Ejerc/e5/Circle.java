package Entrega1.Ejerc.e5;
//Zona de atributos
public class Circle extends Shape {
    private double radius = 1.0;
    //Zona de metodos
    //Constructores
    public Circle() {
        super();
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.setColor(color);
        this.setFilled(filled);
        return radius;
    }
    //Zona de setters y getters
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString() {
        return "Circle[" + super.toString() + radius + '}';
    }
}
