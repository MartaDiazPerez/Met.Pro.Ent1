package Entrega1.Ejerc.e1;


import Entrega1.Ejera.e1.Circle;

// Clase Cylinder que hereda de Circle, zona de atributos
class Cylinder extends Circle {
    private double height;
//Zona de metodos
    //Constructores
    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
//Zona de setters y getters
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}