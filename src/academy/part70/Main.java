package academy.part70;

public class Main {
    public static void main(String[] args) {
        int sum = sumDigits(125);
        System.out.println("Digits sum = " + sum);
    }

    public static int sumDigits(int number) {
        int sum = 0;
        if (number < 10) {
            return -1;
        }
        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }
}
