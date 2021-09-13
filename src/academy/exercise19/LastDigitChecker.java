package academy.exercise19;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        if (!isValid(firstNumber)) {
            return false;
        }
        if (!isValid(secondNumber)) {
            return false;
        }
        if (!isValid(thirdNumber)) {
            return false;
        }

        String firstOriginal = Integer.toString(firstNumber);
        char[] firstArray = firstOriginal.toCharArray();

        String secondOriginal = Integer.toString(secondNumber);
        char[] secondArray = secondOriginal.toCharArray();

        String thirdOriginal = Integer.toString(thirdNumber);
        char[] thirdArray = thirdOriginal.toCharArray();

        int firstLastDigit = Character.getNumericValue(firstArray[firstArray.length - 1]);
        int secondLastDigit = Character.getNumericValue(secondArray[secondArray.length - 1]);
        int thirdLastDigit = Character.getNumericValue(thirdArray[thirdArray.length - 1]);

        return firstLastDigit == secondLastDigit || firstLastDigit == thirdLastDigit || secondLastDigit == thirdLastDigit;
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
}
