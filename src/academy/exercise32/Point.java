package academy.exercise32;

public class Point {
    private int x;
    private int y;

//    constructors
    public Point() {

    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

//    getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

//    methods
    public double distance() {
        return Math.sqrt((double) ((x * x) + (y * y)));
    }
    public double distance(int x, int y) {
        return Math.sqrt(Math.abs((double) (((this.x - x) * (x - this.x)) + ((this.y - y) * (y - this.y)))));
    }
    public double distance(Point anotherPoint) {
        return Math.sqrt(Math.abs((double) (((this.x - anotherPoint.getX()) * (anotherPoint.getX() - this.x)) + ((this.y - anotherPoint.getY()) * (anotherPoint.getY() - this.y)))));
    }
}
