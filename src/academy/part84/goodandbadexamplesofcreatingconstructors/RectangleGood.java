package academy.part84.goodandbadexamplesofcreatingconstructors;
// It's an example of good constructor with less of code duplication

public class RectangleGood {
    private int x;
    private  int y;
    private int width;
    private int height;

    // 1st constructor
    public RectangleGood() {
        this(0, 0); // calls 2nd constructor
    }

    // 2st constructor
    public RectangleGood(int width, int height) {
        this(0 ,0, width, height); // calls 3nd constructor
    }

    // 3st constructor
    public RectangleGood(int x, int y, int width, int height) {
        // initialize variables
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
