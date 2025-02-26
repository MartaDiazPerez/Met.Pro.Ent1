package Entrega1.Ejerc.e2;
//Zona de atributos
public class Student extends Person {
    private String program;
    private int year;
    private double fee;
    //Zona de metodos
    //Constructor
    public Student(String name, String addres, String program, int year, double fee) {
        super(name, addres);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }
    public String getProgram() {
        return program;
    }
    public void setProgram(String program) {
        this.program = program;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getFee() {
        return fee;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }
    @Override
    public String toString() {
        return "Student{" + super.toString() + "program=" + program + ", year=" + year + ", fee=" + fee + '}';
    }
}
