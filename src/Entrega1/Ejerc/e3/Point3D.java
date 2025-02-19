package Entrega1.Ejerc.e3;
//Zona de atributos
public class Point3D extends Point2D {
    private float z;
    //Zona de metodos
    //Constructor
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public Point3D() {
        super();
    }
    //Zona de setters y getters
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }
    public float[] getXYZ() {
        return new float[]{getX(), getY(), getZ()};
    }
    @Override
    public String toString() {
        return "Point3D[x=" + super.toString() + ", z=" + z + "]";
    }
}
