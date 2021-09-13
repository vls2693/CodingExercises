package academy.exercise5;


import java.util.ArrayList;
import java.util.List;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {

        String full = Double.toString(Math.abs(firstNumber));
        List<String> firstArray = new ArrayList<>();
        for (int i = 0; i < full.length(); i++) {
            if (full.substring(i, i + 1).equals(".")) {
                firstArray.add(full.substring(i + 1, i + 2));
                firstArray.add(full.substring(i + 2, i + 3));
                firstArray.add(full.substring(i + 3, i + 4));
                break;
            }
        }

        String full2 = Double.toString(Math.abs(secondNumber));
        List<String> secondArray = new ArrayList<>();
        for (int i = 0; i < full2.length(); i++) {
            if (full2.substring(i, i + 1).equals(".")) {
                secondArray.add(full2.substring(i + 1, i + 2));
                secondArray.add(full2.substring(i + 2, i + 3));
                secondArray.add(full2.substring(i + 3, i + 4));
                break;
            }
        }

        for (int i = 0; i < firstArray.size(); i++) {
            if (!firstArray.get(i).equals(secondArray.get(i))) {
                return false;
            }
        }
        return true;
    }
}
