package academy.exercise14;

public class SumOddRange {
    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start > end || start < 0 || end < 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isOdd(int is) {
        if (is < 0) {
            return false;
        }
        if (is % 2 != 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
