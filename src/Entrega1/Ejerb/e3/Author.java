package Entrega1.Ejerb.e3;
//Clase Author, zona de atributos
public class Author {
    private String name;
    private String email;
    //Zona de metodos
    //Constructor
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }
    //Zona de getter's, setter's
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "Author{" + "name=" + name + ", email=" + email + '}';
    }
}
