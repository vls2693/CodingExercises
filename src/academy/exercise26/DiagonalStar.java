package academy.exercise26;

public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        }
        else {
            for (int i = 0; i < number; i++) {
                if (i == 0) {
                    for (int k = 0; k < number; k++) {
                        if (k == number - 1) {
                            System.out.println("*");
                        }
                        else {
                            System.out.print("*");
                        }
                    }
                }
                else if (i == number - 1) {
                    for (int k = 0; k < number; k++) {
                        System.out.print("*");
                    }
                }
                else {
                    for (int y = 0; y < number; y++) {
                        if (y == 0) {
                            System.out.print("*");
                        }
                        else if (y == number - 1) {
                            System.out.println("*");
                        }
                        else if (y == i) {
                            System.out.print("*");
                        }
                        else if (number - i == y + 1) {
                            System.out.print("*");
                        }
                        else {
                            System.out.print(" ");
                        }
                    }
                }
            }
        }
    }
}
