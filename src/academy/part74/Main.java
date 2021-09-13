package academy.part74;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean hasNextInt = scanner.hasNextInt();
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter number #" + i);
            if (hasNextInt) {
                int number = scanner.nextInt();
                scanner.nextLine();
                sum = sum + number;
            }
            else {
                System.out.println("Invalid Number");
            }
        }
        System.out.println("The sum of the entered numbers = " + sum);

        scanner.close();
    }
}
