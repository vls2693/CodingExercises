package academy.part68;

public class Main {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int count = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            count++;
            if (count == 5) {
                System.out.println("Count of even numbers = " + count);
                break;
            }
        }
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
