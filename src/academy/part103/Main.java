package academy.part103;

public class Main {
    public static void main(String[] args) {
        int[] array = MinElementsChallenge.readIntegers(5);
        System.out.println("The minimal element of the array is " + MinElementsChallenge.findMin(array));
    }
}
