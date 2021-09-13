package academy.exercise31;

public class Main {
    public static void main(String[] args) {
        Wall firstWall = new Wall(2.5, 4.0);
        System.out.println("Width is " + firstWall.getWidth());
        System.out.println("Height is " + firstWall.getHeight());
        System.out.println("Area is " + firstWall.getArea());
    }
}
