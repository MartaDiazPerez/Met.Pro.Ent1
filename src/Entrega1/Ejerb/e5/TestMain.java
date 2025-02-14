package Entrega1.Ejerb.e5;
// Programa principal para probar Account y Customer
public class TestMain {
    public static void main(String[] args) {
        // Crear cliente
        Customer customer = new Customer(1, "Alice", 'f', 10);
        System.out.println("Cliente creado: " + customer);

        // Modificar descuento
        customer.setDiscount(15);
        System.out.println("Descuento actualizado: " + customer.getDiscount() + "%");

        // Crear cuenta asociada al cliente
        Account account = new Account(1001, customer, 500.0);
        System.out.println("Cuenta creada: " + account);

        // Realizar depósito
        account.deposit(200.0);
        System.out.println("Saldo después del depósito: " + account.getBalance());

        // Realizar retiro
        account.withdraw(100.0);
        System.out.println("Saldo después del retiro: " + account.getBalance());

        // Intentar retiro que excede el saldo
        try {
            account.withdraw(700.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al retirar: " + e.getMessage());
        }
    }
}