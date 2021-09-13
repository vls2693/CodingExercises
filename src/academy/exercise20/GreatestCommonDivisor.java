package academy.exercise20;

import java.util.ArrayList;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int greatestDivisor = 0;

        ArrayList<Integer> firstArray = new ArrayList<>();
        ArrayList<Integer> secondArray = new ArrayList<>();

        int lesserNumber = 0;
        int greaterNumber = 0;

        if (first <= second) {
            lesserNumber = first;
            greaterNumber = second;
        }
        else {
            lesserNumber = second;
            greaterNumber = first;
        }

        int i = lesserNumber;
        while (i > 0) {
            if (first % i == 0) {
                firstArray.add(i);
            }
            i--;
        }

        int y = greaterNumber;
        while (y > 0) {
            if (second % y == 0) {
                secondArray.add(y);
            }
            y--;
        }

        for (int a : firstArray) {
            for (int b : secondArray) {
                if (a == b) {
                    greatestDivisor = b;
                    return greatestDivisor;
                }
            }
        }
        return greatestDivisor;
    }
}
