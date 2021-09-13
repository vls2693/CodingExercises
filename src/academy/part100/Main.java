package academy.part100;

import java.util.Scanner;

public class Main {
    public  static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = getIntegers(5);
        array = sortIntegers(array);
        printArray(array);
    }

    public static int[] getIntegers (int number) {
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] sortIntegers (int[] array) {
        int temp;
        int[] a = array;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static void printArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
