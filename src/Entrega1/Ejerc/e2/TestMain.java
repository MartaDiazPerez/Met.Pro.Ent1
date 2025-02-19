package Entrega1.Ejerc.e2;

public class TestMain {
    public static void main(String[] args) {
        Person person = new Person("John Doe", "123 Main St");
        Student student = new Student("Alice", "456 College Rd", "Computer Science", 2, 5000.0);
        Staff staff = new Staff("Bob", "789 High School St", "High School", 3000.0);

        System.out.println(person);
        System.out.println(student);
        System.out.println(staff);
    }
}