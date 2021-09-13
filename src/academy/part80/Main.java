package academy.part80;

public class Main {
    public static void main(String[] args) {
        VipCustomer firstCustomer = new VipCustomer();
        System.out.println("First customer's name is " + firstCustomer.getName());

        VipCustomer secondCustomer = new VipCustomer("email@customer.com");
        System.out.println("Second customer's name is " + secondCustomer.getName());
        System.out.println("Second customer's email is " + secondCustomer.getEmailAddress());

        VipCustomer thirdCustomer = new VipCustomer("Jerry", "777", "jerry@email.com");
        System.out.println("Third customer's name is " + thirdCustomer.getName());
        System.out.println("Third customer's credit limit is " + thirdCustomer.getCreditLimit());
        System.out.println("Second customer's email is " + thirdCustomer.getEmailAddress());
    }
}
