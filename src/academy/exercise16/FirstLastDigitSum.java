package academy.exercise16;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        int positiveNumber = Math.abs(number);
        String original = Integer.toString(positiveNumber);
        char[] array = original.toCharArray();

        int firstDigit = Character.getNumericValue(array[0]);
        int lastDigit = Character.getNumericValue(array[array.length - 1]);
        if (number < 0) {
            firstDigit = -firstDigit;
            if (array.length == 1) {
                lastDigit = -lastDigit;
            }
        }


        return firstDigit + lastDigit;
    }
}
