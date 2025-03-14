package Entrega1.Ejerb.e5;
//Clase Account y zona de atributos
public class Account {
    private int id;
    private Customer customer;
    private double balance = 0.0;
    //Zona metodos
    //Constructor
    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }
    //Zona de getter's y setter's
    public int getId() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    @Override
    public String toString() {
        return customer.toString() + "balance=$" + String.format("%.2f",balance);
    }
    public String getCustomerName() {
        return customer.getName();
    }
    public Account deposit(double amount) {
        this.balance += amount;
        return this;
    }
    public Account withdraw(double amount) {
        if (balance >= amount) {
            this.balance -= amount;
            return this;
        } else {
            System.out.println("amount withdrawn exceeds the current balance!");
        }
        return this;
    }
}
