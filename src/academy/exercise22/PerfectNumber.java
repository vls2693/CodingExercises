package academy.exercise22;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int i = 1;
        int divisors = 0;
        while (i < number) {
            if (number % i == 0) {
                divisors += i;
                System.out.println(i);
            }
            i++;
        }
        return divisors == number;
    }
}
