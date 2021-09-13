package academy.part97;

public class Main {
    public static void main(String[] args) {
        Hamburger basic = new Hamburger();
        System.out.println("Price of the + " + basic.getName() + " is " + basic.getTotalPrice());

        HealthyBurger healthy = new HealthyBurger();
        System.out.println("Price of the + " + healthy.getName() + " is " + healthy.getTotalPrice());

        DeluxeBurger deluxe = new DeluxeBurger();
        System.out.println("Price of the + " + deluxe.getName() + " is " + deluxe.getTotalPrice());
    }
}
