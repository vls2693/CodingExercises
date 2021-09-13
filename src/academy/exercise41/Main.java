package academy.exercise41;

public class Main {
    public static void main(String[] args) {
        int[] array = SortedArray.getIntegers(6);
        int[] sortedArray = SortedArray.sortIntegers(array);
        SortedArray.printArray(sortedArray);
    }
}
