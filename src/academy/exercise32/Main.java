package academy.exercise32;

public class Main {
    public static void main(String[] args) {
        Point first = new Point(2, 2);
        Point second = new Point(5, 2);
        System.out.println("The distance between first point and point (0, 0) is " + first.distance());
        System.out.println("The distance between first point and point (4, 2) is " + first.distance(4, 2));
        System.out.println("The distance between first point and point (5, 2) is " + first.distance(second));
    }
}
