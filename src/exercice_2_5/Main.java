package exercice_2_5;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Amin");

        Account account = new Account(101, customer, 500.00);

        System.out.println(account);

        account.deposit(200.00);
        System.out.println(account);

        account.withdraw(300.00);
        System.out.println(account);

        account.withdraw(500.00);

        System.out.println("Customer Name: " + account.getCustomerName());
    }
}
