package academy.part84.supercallexample;

public class Rectangle extends Shape {
    private int width;
    private int height;

    // 1st constructor
    public Rectangle(int x, int y) {
        this(x ,y, 0, 0); // calls 2nd constructor
    }

    // 2st constructor
    public Rectangle(int x, int y, int width, int height) {
        super(x, y); // calls constructor from parent (Shape)
        this.width = width;
        this.height = height;
    }
}
