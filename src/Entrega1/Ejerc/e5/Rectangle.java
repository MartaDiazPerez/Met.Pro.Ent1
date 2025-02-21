package Entrega1.Ejerc.e5;
//Zona de atributos y clase Rectangle
public class Rectangle extends Shape {
    private double width = 1.0;
    private double lenght = 1.0;
    //Zona de metodos
    //Constructores
    public Rectangle(){
        super();
    }
    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }
    public Rectangle(double width, double lenght, String color, boolean filled ) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }
    //Zona getters y setters
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLenth() {
        return lenght;
    }
    public void setLenth(double lenght) {
        this.lenght = lenght;
    }
    public double getArea() {
        return width * lenght;
    }
    public double getPerimeter() {
        return width + lenght * 2;
    }
    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + "width=" + width + ", lenght=" + lenght + "]";
    }


}
