package academy.part104;

import java.util.Arrays;

import static academy.part104.Reverse.printArray;
import static academy.part104.Reverse.reverseArray;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(reverseArray(array)));

        printArray(reverseArray(array));
    }
}
