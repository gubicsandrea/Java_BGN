package bank;

public class Bank {

    public static void main(String[] args) {
        BankAccount johnAccount = new BankAccount("11111111-22222222-44444444", "John Doe", 300000);
        BankAccount janeAccount = new BankAccount("12345678-12345678-00000000", "Jane Doe", 230000);

        System.out.println(johnAccount.getInfo());
        System.out.println(janeAccount.getInfo());

        johnAccount.deposit(20000);
        System.out.println(johnAccount.getInfo());

        johnAccount.withdraw(30000);
        System.out.println(johnAccount.getInfo());

        johnAccount.transfer(janeAccount, 45000);
        System.out.println(johnAccount);
        System.out.println(janeAccount);
    }
}
