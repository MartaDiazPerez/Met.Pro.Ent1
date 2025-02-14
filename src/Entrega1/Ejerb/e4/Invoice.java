package Entrega1.Ejerb.e4;
//Clase Invoice y zona de atributos
public class Invoice {
    private int id;
    private Customer customer;
    private double amount;
    //Zona de metodos
    //Constructor
    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }
    //
    public int getId() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getCustomerId() {
        return customer.getId();
    }
    public String getCustomerName() {
        return customer.getName();
    }
    public int getCustomerDiscount() {
        return customer.getDiscount();
    }
    public double getAmountAfterDiscount() {
        return amount - (amount * customer.getDiscount()/100.0);
    }
    @Override
    public String toString() {
        return "Invoice [id=" + id + ", customer=" + customer + ", amount=" + amount + "]";
    }


}
