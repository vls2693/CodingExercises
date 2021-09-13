package academy.exercise33;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

//    constructors
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

//    methods
    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}
