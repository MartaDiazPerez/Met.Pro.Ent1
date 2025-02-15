package Entrega1.Ejerb.e8;

import Entrega1.Ejerb.e6.MyPoint;

//Clase MyCircle y zona de atributos
public class MyCircle {
    private MyPoint center;
    private int radius = 1;
    //Zona de metodos
    //Constructores
    public MyCircle() {
        this.center = new MyPoint(0,0);
        this.radius = 1;
    }
    public MyCircle(MyPoint center, int radius) {
        this.center = new MyPoint(center.getX(), center.getY());
        this.radius = radius;
    }
    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }
    //Zona de getters y setters
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public MyPoint getCenter() {
        return center;
    }
    public void setCenter(MyPoint center) {
        this.center = center;
    }
    public int getCenterX() {
        return center.getX();
    }
    public int getCenterY() {
        return center.getY();
    }
    public void setCenterX(int x) {
        this.center.setX(x);
    }
    public void setCenterY(int y) {
        this.center.setY(y);
    }
    public int[] getCenterXY(){
        return new int[]{getCenterX(), getCenterY()};
    }
    public void setCenterXY(int x, int y){
        this.center.setX(x);
        this.center.setY(y);
    }
    @Override
    public String toString() {
        return String.format("MyCircle{center=%s, radius=%d}", center, radius);
    }
    //Calculos matematicos
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    public double distance(MyCircle another) {
        return this.center.distance(another.getCenter());
    }



}
