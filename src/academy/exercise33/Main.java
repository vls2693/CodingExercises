package academy.exercise33;

public class Main {
    public static void main(String[] args) {
        Floor floor = new Floor(5.0, 5.5);
        Carpet carpet = new Carpet(2.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("The total cost is " + calculator.getTotalCost());
    }
}
