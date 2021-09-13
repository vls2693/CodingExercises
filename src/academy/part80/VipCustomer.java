package academy.part80;

public class VipCustomer {
    private String name;
    private String creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Default name", "Default credit limit", "Default email");
    }

    public VipCustomer(String emailAddress) {
        this("Tom", "1 000 000", emailAddress);
    }

    public VipCustomer(String name, String creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
