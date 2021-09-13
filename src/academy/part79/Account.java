package academy.part79;

public class Account {
    private int number;
    private int balance;
    private String name;
    private String email;
    private String phone;

//    setters
    public void setNumber(int number) {
        this.number = number;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

//    getters
    public int getNumber() {
        return number;
    }
    public int getBalance() {
        return balance;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }

//    additional methods
    public void addDeposit(int deposit) {
        if (deposit <= 0) {
            System.out.println("Number can't be less than 0");
        }
        else {
            this.balance += deposit;
            System.out.println(deposit + "$ added to balance, current balance is " + this.balance);
        }
    }
    public void withdraw(int deposit) {
        if (deposit <= 0) {
            System.out.println("Number can't be less than 0");
        }
        else if (this.balance < deposit) {
            System.out.println("Number is bigger than current balance");
        }
        else {
            this.balance -= deposit;
        }
        System.out.println(deposit + "$ subtracted from balance, current balance is " + this.balance);
    }
}
