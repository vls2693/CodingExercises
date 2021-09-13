package academy.exercise31;

public class Wall {
    private double width;
    private double height;

//    constructors
    public Wall() {

    }
    public Wall(double width, double height) {
        if (width < 0) {
            this.width = 0.0;
        }
        else {
            this.width = width;
        }
        if (height < 0) {
            this.height = 0.0;
        }
        else {
            this.height = height;
        }
    }

//    getters
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return  height;
    }

//    setters
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0.0;
        }
        else {
            this.width = width;
        }
    }
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        }
        else {
            this.height = height;
        }
    }

//    additional methods
    public double getArea() {
        return width * height;
    }
}
