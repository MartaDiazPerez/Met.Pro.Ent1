package Entrega1.Ejerb.e7;

import Entrega1.Ejerb.e6.MyPoint;
//Clase MyLine y zona de atributos
public class MyLine {
    private MyPoint begin;
    private MyPoint end;
    //Zona de metodos
    //Constructores
    public MyLine(int x1, int y1, int x2, int y2) {
        begin = new MyPoint(x1, y1);
        end = new MyPoint(x2, y2);
    }
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }
    //Zona de stters y getters
    public MyPoint getBegin() {
        return begin;
    }
    public MyPoint getEnd() {
        return end;
    }
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }
    public void setEnd(MyPoint end) {
        this.end = end;
    }
    public int getBeginX() {
        return begin.getX();
    }
    public int getBeginY() {
        return begin.getY();
    }
    public int getEndX() {
        return end.getX();
    }
    public int getEndY() {
        return end.getY();
    }
    public void setBeginX(int x) {
        begin.setX(x);
    }
    public void setBeginY(int y) {
        begin.setY(y);
    }
    public void setEndX(int x) {
        end.setX(x);
    }
    public void setEndY(int y) {
        end.setY(y);
    }
    public int[] getBeginXY(){
        return new int[]{begin.getX(), begin.getY()};
    }
    public int[] getEndXY(){
        return new int[]{end.getX(), end.getY()};
    }
    public void setBeginXY(int x, int y) {
        begin.setX(x);
    }
    public void setEndXY(int x, int y) {
        end.setX(x);
    }
    public double getLength() {
        return begin.distance(end);
    }
    @Override
    public String toString() {
        return "MyLine [begin=" + begin + ", end=" + end + "]";
    }
}
