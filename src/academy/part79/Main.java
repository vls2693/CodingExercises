package academy.part79;

public class Main {
    public static void main(String[] args) {
        Account user = new Account();

        user.setBalance(100);
        user.addDeposit(50);
        user.withdraw(20);
    }
}
