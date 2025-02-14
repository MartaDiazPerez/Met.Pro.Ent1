package Entrega1.Ejerb.e6;
//Clase MyPoint y zona de atributos
public class MyPoint {
    private int x = 0;
    private int y = 0;
    //Zona de metodos
    //Constructor
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //Zona de getters y setters
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
        return new int[]{this.x, this.y};
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    //Zona de metodos de calculo de distancias
    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }
    public double distance(MyPoint another) {
        return distance(another.getX(), another.getY());
    }
    public double distance() {
        return distance(0,0);
    }
}
