package academy.exercise7;

public class TeenNumberChecker {
    public static boolean hasTeen(int firstNum, int secondNum, int thirdNum) {
        int counter = 0;
        if (firstNum >= 13 && firstNum <= 19) {
            counter++;
        }
        if (secondNum >= 13 && secondNum <= 19) {
            counter++;
        }
        if (thirdNum >= 13 && thirdNum <= 19) {
            counter++;
        }
        return counter > 0;
    }

    public static boolean isTeen(int firstNum) {
        if (firstNum < 13 || firstNum > 19) {
            return false;
        }
        return true;
    }
}
