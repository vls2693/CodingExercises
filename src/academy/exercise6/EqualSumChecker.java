package academy.exercise6;

public class EqualSumChecker {
    public static boolean hasEqualSum(int firstNum, int secondNum, int thirdNum) {
        if (firstNum + secondNum == thirdNum) {
            return true;
        }
        else {
            return false;
        }
    }
}
