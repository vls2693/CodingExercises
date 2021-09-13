package academy.part104;

public class Reverse {
    public static int[] reverseArray (int[] array) {
        int[] reversed = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            reversed[array.length - 1 - i] = array[i];
        }
        return reversed;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.println("Element #" + i + " = " + array[i]);
        }
    }
}
