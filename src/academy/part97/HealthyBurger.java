package academy.part97;

public class HealthyBurger extends Hamburger {
    private String name = "Healthy Burger";
    private boolean meatOnVapor;
    private boolean sourCream;

    public HealthyBurger() {
        this(true,true);
    }

    public HealthyBurger(boolean meatOnVapor, boolean sourCream) {
        this.meatOnVapor = meatOnVapor;
        this.sourCream = sourCream;
    }

    public int getMeatOnVaporPrice() {
        if (meatOnVapor) {
            return 15;
        }
        else {
            return 0;
        }
    }

    public int getSourCreamPrice() {
        if (sourCream) {
            return 15;
        }
        else {
            return 0;
        }
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice() + getMeatOnVaporPrice() + getSourCreamPrice();
    }
}
