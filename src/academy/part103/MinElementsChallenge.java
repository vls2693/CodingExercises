package academy.part103;

import java.util.Scanner;

public class MinElementsChallenge {
    public static Scanner scanner = new Scanner(System.in);

    public static int[] readIntegers (int number) {
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin (int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
