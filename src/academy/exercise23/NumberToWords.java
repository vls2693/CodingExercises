package academy.exercise23;

public class NumberToWords {
    public static void numberToWords(int number) {
        int count = getDigitCount(number);
        number = reverse(number);
        int printedCount = 0;
        String[] numberNames = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        else {
            while (number > 0) {
                System.out.println(numberNames[number % 10]);
                printedCount++;
                number = (number - (number % 10)) / 10;

            }
            for (int i = 0; i < (count - printedCount); i++) {
                System.out.println(numberNames[0]);
            }
        }
    }

    public static int reverse(int number) {
        int positiveNumber = Math.abs(number);
        String original = Integer.toString(positiveNumber);
        char[] array = original.toCharArray();
        String reverted = "";
        for (int i = array.length - 1; i >= 0; i--) {
            reverted += array[i];
        }
        String revertedString = reverted;

        int revertedNumber = Integer.parseInt(revertedString);
        if (number < 0) {
            revertedNumber = -revertedNumber;
        }
        return revertedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        String converted = Integer.toString(number);
        return converted.length();
    }
}
