package academy.exercise40;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "White");
    }

    public void addHealthyAddition1(String name, double price) {
        healthyExtra1Name = name;
        healthyExtra1Price = price;
        System.out.println("Added " + healthyExtra1Name + " an extra " + healthyExtra1Price);
    }
    public void addHealthyAddition2(String name, double price) {
        healthyExtra2Name = name;
        healthyExtra2Price = price;
        System.out.println("Added " + healthyExtra2Name + " an extra " + healthyExtra2Price);
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger();
        if (healthyExtra1Price != 0.0) {
            totalPrice = totalPrice + healthyExtra1Price;
        }
        if (healthyExtra2Price != 0.0) {
            totalPrice = totalPrice + healthyExtra2Price;
        }

        return totalPrice;
    }
}