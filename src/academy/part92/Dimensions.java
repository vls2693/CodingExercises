package academy.part92;

public class Dimensions {
    private double x;
    private double y;
    private double z;

    private double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void coordinateX() {
        System.out.println("The X is " + getX());
    }

    public Dimensions(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
