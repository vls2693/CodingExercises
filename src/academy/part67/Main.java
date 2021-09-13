package academy.part67;

public class Main {
    public static void main(String[] args) {
        int counter = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                counter++;
                sum += i;
                System.out.println("i = " + i);
                if (counter == 5) {
                    break;
                }
            }
        }
        System.out.println("sum = " + sum);
    }
}
