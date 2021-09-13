package academy.exercise43;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        reverse(array);
    }

    private static void reverse (int[] array) {
        int[] reversed = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            reversed[array.length - 1 - i] = array[i];
        }
        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("Reversed array = " + Arrays.toString(reversed));
    }
}
