package academy.exercise25;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }

        boolean hasDivisor = false;
        int i = number - 1;
        while (i > 1) {
            System.out.println("*****START OF THE CIRLE*****");
            System.out.println("i at the start of cycle = " + i);
            if (number % i == 0) {
                System.out.println("i after if = " + i);
                if (i == 2) {
                    hasDivisor = false;
                    return i;
                }
                for (int y = i - 1; y > 0; y--) {
                    hasDivisor = false;
                    System.out.println("i inside second cycle = " + i);
                    System.out.println("y inside second cycle = " + y);
                    System.out.println("*****END OF THE CIRCLE*****");
                    System.out.println("");
                    if (i % y == 0) {
                        hasDivisor = true;
                        System.out.println(i + " has divisor");
                        break;
                    }
                }
                if (!hasDivisor) {
                    System.out.println(i +" is the biggest divisor");
                    return i;
                }
            }
            i--;
        }
        int secondNumber = number;
        int digitsSum = 0;
        while (secondNumber > 0) {
            digitsSum += secondNumber % 10;
            secondNumber = (secondNumber - (secondNumber % 10)) / 10;
        }
        if (digitsSum % 3 != 0) {
            return number;
        }
        return -1;
    }
}
