package academy.part58;

public class Main {
    public static void main(String[] args) {
        double firstResult = calcFeetAndInchesToCentimeters(10, 5);
        System.out.println(firstResult);
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }
        double inchesToFeet = calcFeetAndInchesToCentimeters(inches);
        return 2.54 * ((feet + inchesToFeet) * 12);
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches < 0 || inches > 12) {
            return -1;
        }
        return (double) inches / 12;
    }
}
