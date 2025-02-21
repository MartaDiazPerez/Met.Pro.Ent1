package Entrega1.Ejerc.e5;
//Zona de atributos y clase Square
public class Square extends Rectangle {
    //Zona de metodos
    //Constructores
    public Square(){
        super();
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    //Zona de getters y setters
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLenth(side);
    }
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLenth(side);
    }
    public void setLength(double side) {
        super.setWidth(side);
        super.setLenth(side);
    }
    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }

}
