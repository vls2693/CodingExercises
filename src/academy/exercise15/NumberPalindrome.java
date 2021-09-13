package academy.exercise15;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int positiveNumber = Math.abs(number);
        String original = Integer.toString(positiveNumber);
        char[] array = original.toCharArray();
        String reverted = "";
        for (int i = array.length - 1; i >= 0; i--) {
            reverted += array[i];
        }
        return original.equals(reverted);
    }
}
