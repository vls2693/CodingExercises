package academy.exercise17;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        String original = Integer.toString(number);
        char[] array = original.toCharArray();

        int evenDigitSum = 0;

        for (char c : array) {
            if (Character.getNumericValue(c) % 2 == 0) {
                evenDigitSum = evenDigitSum + Character.getNumericValue(c);
            }
        }

        return evenDigitSum;
    }
}
