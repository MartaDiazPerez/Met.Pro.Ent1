package Entrega1.Ejera.e3;

// Zona de atributos
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    // Zona de metodos
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getName() {
        return firstName + " " + lastName;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary() {
        return salary * 12;
    }
    public int raiseSalary(int percentage) {
        int newSalary = salary + percentage*salary/100;
        this.salary = newSalary;
        return newSalary;
    }
    @Override
    public String toString() {
        return "Employee[id=" + id + ",name=" + firstName + " " + lastName + ",salary=" + salary +"]";
    }
}
