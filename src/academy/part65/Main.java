package academy.part65;

public class Main {
    public static void main(String[] args) {
//        for(int i = 2; i < 9; i++) {
//            System.out.println("10 000 at + " + i + "% interest = " + calculateInterest(10000.0, i));
//        }
//
//        for(int i = 8; i > 1; i--) {
//            System.out.println("10 000 at + " + i + "% interest = " + calculateInterest(10000.0, i));
//        }

        int counter = 0;
        for (int i = 5; i < 100; i++) {
            if (isPrime(i)) {
                counter++;
                System.out.println("Number " + i + " is a prime number");
            }
            if (counter == 3) {
                break;
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
