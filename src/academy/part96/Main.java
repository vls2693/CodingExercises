package academy.part96;

class Car {
    public String name;
    public boolean isEngineStarted;
    public int cylinders;
    public int wheels;

    public Car() {
        this.name = "default car";
        this.isEngineStarted = false;
        this.cylinders = 4;
        this.wheels = 4;
    }

    public Car(String name, int cylinders) {
        this(name, cylinders, false, 4);
    }

    public Car(String name, int cylinders,  boolean isEngineStarted, int wheels) {
        this.name = name;
        this.isEngineStarted = isEngineStarted;
        this.cylinders = cylinders;
        this.wheels = wheels;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void startEngine() {
        this.isEngineStarted = true;
        System.out.println("The engine of" + getName() + " is started");
    }

    public void accelerate() {
        System.out.println(getName() + " is moving faster");
    }

    public void brake() {
        System.out.println(getName() + "stopped");
    }

    public void carNumber() {
        System.out.println("The number is 0");
    }
}

class Chevy extends Car {
    public Chevy() {
        super("Chevrolet Camaro", 8);
    }

    public Chevy(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
    }

    @Override
    public void carNumber() {
        System.out.println("The number is 1");
    }
}

class Ford extends Car {
    public Ford() {
        super("Ford Mustang", 16);
    }

    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void carNumber() {
        System.out.println("The number is 2");
    }
}


public class Main {
    public static void main(String[] args) {
        Car chevy = new Chevy();
        chevy.carNumber();

        Ford ford = new Ford();
        ford.carNumber();


    }
}
