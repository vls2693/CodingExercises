package academy.exercise40;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;

    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.println(name + " hamburger on a " + breadRollType + " roll, with " + meat + ", price is " + price);
    }
    public Hamburger() {
        name = "Basic";
        meat = "Sausage";
        price = 3.56;
        breadRollType = "White";
        System.out.println(name + " on a " + breadRollType + " roll, with " + meat + ", price is " + price);
    }

    public void addHamburgerAddition1 (String name, double price){
        addition1Name = name;
        addition1Price = price;
        System.out.println("Added " + addition1Name + " an extra " + addition1Price);
    }
    public void addHamburgerAddition2 (String name, double price){
        addition2Name = name;
        addition2Price = price;
        System.out.println("Added " + addition2Name + " an extra " + addition2Price);
    }
    public void addHamburgerAddition3 (String name, double price){
        addition3Name = name;
        addition3Price = price;
        System.out.println("Added " + addition3Name + " an extra " + addition3Price);
    }
    public void addHamburgerAddition4 (String name, double price){
        addition4Name = name;
        addition4Price = price;
        System.out.println("Added " + addition4Name + " an extra " + addition4Price);
    }
    public double itemizeHamburger() {
        double totalPrice = price;
        if (addition1Price != 0.0) {
            totalPrice = totalPrice + addition1Price;
        }
        if (addition2Price != 0.0) {
            totalPrice = totalPrice + addition2Price;
        }
        if (addition3Price != 0.0) {
            totalPrice = totalPrice + addition3Price;
        }
        if (addition4Price != 0.0) {
            totalPrice = totalPrice + addition4Price;
        }
        return totalPrice;
    }
}