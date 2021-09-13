package academy.exercise29;

public class Main {
    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();

        calc.setFirstNumber(10.0);
        calc.setSecondNumber(2.0);

        System.out.println("The first number is " + calc.getFirstNumber());
        System.out.println("The second number is " + calc.getSecondNumber());

        System.out.println("The sum is " + calc.getAdditionResult());
        System.out.println("The subtraction is " + calc.getSubtractionResult());
        System.out.println("The multiplication is " + calc.getMultiplicationResult());
        System.out.println("The division is " + calc.getDivisionResult());


    }
}
