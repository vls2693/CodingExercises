package academy.part88;

public class Car extends Vehicle {
    private String color;
    private String type;

    public Car() {
        this("default color", "truck", "default", "automatic", 100);
    }

    public Car(String color, String type, String steering, String changingGears, int speed) {
        super(steering, changingGears, speed);
        this.color = color;
        this.type = type;
    }

    @Override
    public String getSteering() {
        System.out.println("It's steering from car");
        return super.getSteering();
    }

    @Override
    public String getChangingGears() {
        System.out.println("It's gears from car");
        return super.getChangingGears();
    }

    @Override
    public int getSpeed() {
        System.out.println("It's speed from car");
        return super.getSpeed();
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }
}
