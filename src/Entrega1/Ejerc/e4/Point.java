package Entrega1.Ejerc.e4;
//Zona de atributos
public class Point {
    private float x = 0.0f;
    private float y = 0.0f;
    //Zona de metodos
    //Costructor
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point(){
    }
    //Zona de getters y setters
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        return new float[]{this.x, this.y};
    }
    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
