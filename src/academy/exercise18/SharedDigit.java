package academy.exercise18;

public class SharedDigit {
    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
            return false;
        }

        String firstOriginal = Integer.toString(firstNumber);
        char[] firstArray = firstOriginal.toCharArray();

        String secondOriginal = Integer.toString(secondNumber);
        char[] secondArray = secondOriginal.toCharArray();

        for (char a : firstArray) {
            for (char b : secondArray) {
                if (a == b) {
                    return true;
                }
            }
        }
        return false;
    }
}
