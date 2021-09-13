package academy.part97;

public class DeluxeBurger extends Hamburger{
    private String name = "Deluxe Burger";
    private boolean drink;
    private boolean chips;

    public DeluxeBurger() {
        this(true, true);
    }

    public DeluxeBurger(boolean drinks, boolean chips) {
        this.drink = drinks;
        this.chips = chips;
    }

    public DeluxeBurger(String meat, boolean lettuce, boolean cheese, boolean tomato, boolean onion, boolean drinks, boolean chips) {
        super(meat, lettuce, cheese, tomato, onion);
        this.drink = drinks;
        this.chips = chips;
    }

    public int getDrinkPrice() {
        if (drink) {
            return 30;
        }
        else {
            return 0;
        }
    }

    public int getChipsPrice() {
        if (chips) {
            return 30;
        }
        else {
            return 0;
        }
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice() + getDrinkPrice() + getChipsPrice();
    }
}
