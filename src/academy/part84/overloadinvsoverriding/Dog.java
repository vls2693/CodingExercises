package academy.part84.overloadinvsoverriding;

// It's an example of method overloading
public class Dog {

    public void bark() {
        System.out.println("woof");
    }

    public void bark(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("woof");
        }
    }
}
