package Entrega1.Ejerb.e2;

// Clase Author, zona de atributos
public class Author{
    private String name;
    private String email;
    private char gender;

    // Zona de metodos
    //Constructor
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    //Getter's y setter's
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    //Otros
    @Override
    public String toString() {
        return "Authors[name=" + name + ",email=" + email + ",gender=" + gender + "]";
    }
}
