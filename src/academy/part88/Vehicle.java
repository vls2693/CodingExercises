package academy.part88;

public class Vehicle {
    private String steering;
    private String changingGears;
    private int speed;

    public Vehicle() {
        this(100);
    }

    public Vehicle(int speed) {
        this("default", "automatic", speed);
    }

    public Vehicle(String steering, String changingGears, int speed) {
        this.steering = steering;
        this.changingGears = changingGears;
        this.speed = speed;
    }

    public String getSteering() {
        System.out.println("It's steering from vehicle");
        return steering;
    }

    public String getChangingGears() {
        System.out.println("It's gears from vehicle");
        return changingGears;
    }

    public int getSpeed() {
        System.out.println("It's speed from vehicle");
        return speed;
    }

    public void increaseSpeed(int increasing) {
        speed += increasing;
        System.out.println("Speed has been increased by " + increasing);
        System.out.println("Current speed is " + speed);
    }

    public void decreaseSpeed(int decreasing) {
        if (decreasing > speed) {
            System.out.println("Decreasing is too large, choose another speed");
        }
        else {
            speed += decreasing;
            System.out.println("Speed has been decreased by " + decreasing);
            System.out.println("Current speed is " + speed);
        }
    }
}
