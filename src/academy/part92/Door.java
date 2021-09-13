package academy.part92;


public class Door {
    private String color;
    private Dimensions dimensions;

    private String getColor() {
        System.out.println("Color is " + color);
        return color;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public Door(String color, Dimensions dimensions) {
        this.color = color;
        this.dimensions = dimensions;
    }

    public void openTheDoor() {
        System.out.println("Trying open the door");
        dimensions.coordinateX();
        System.out.println("The door is opened");
    }
}
