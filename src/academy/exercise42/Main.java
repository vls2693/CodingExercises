package academy.exercise42;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = MinimumElement.readInteger();
        int[] array = MinimumElement.readElements(number);
        System.out.println("The minimal element is " + MinimumElement.findMin(array));
    }

    public static class MinimumElement {
        private static int readInteger() {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        }

        public static int[] readElements (int number) {
            Scanner scanner = new Scanner(System.in);
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
}
