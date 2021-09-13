package academy.part97;

public class Hamburger {
    private String name;
    private String roll;
    private String meat;
    private boolean lettuce;
    private boolean cheese;
    private boolean tomato;
    private boolean onion;

    public Hamburger() {
        this.name = "Hamburger";
        this.roll = "white bread";
        this.meat = "chicken";
        this.lettuce = true;
        this.cheese = true;
        this.tomato = true;
        this.onion = true;
    }

    public Hamburger(String meat, boolean lettuce, boolean cheese, boolean tomato, boolean onion) {
        if (!meat.equals("beef") || !meat.equals("pork")) {
            meat = "chicken";
        }
        this.meat = meat;
        this.lettuce = lettuce;
        this.cheese =cheese;
        this.tomato = tomato;
        this.onion = onion;
    }

    public String getName() {
        return name;
    }

    public int getBasicPrice() {
        return 50;
    }

    public int getLettucePrice() {
        if (lettuce) {
            return 10;
        }
        else {
            return 0;
        }
    }

    public int getCheesePrice() {
        if (cheese) {
            return 10;
        }
        else {
            return 0;
        }
    }

    public int getTomatoPrice() {
        if (tomato) {
            return 10;
        }
        else {
            return 0;
        }
    }

    public int getOnionPrice() {
        if (onion) {
            return 10;
        }
        else {
            return 0;
        }
    }

    public int getTotalPrice() {
        return getBasicPrice() + getLettucePrice() + getCheesePrice() + getTomatoPrice() + getOnionPrice();
    }
}
