package academy.exercise27;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double  avg = 0;
        double count = 0;

        while (true) {
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                count++;

                sum += number;

                avg = sum / count;
            }
            else {
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("SUM = " + (long) (sum) + " AVG = " + Math.round(avg));
    }
}
