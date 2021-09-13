package academy.exercise28;

public class Main {
    public static void main(String[] args) {
        System.out.println("THE FIRST METHOD");
        System.out.println("We need " + PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2) + " extra buckets of paint");
        System.out.println("We need " + PaintJob.getBucketCount(3.4, 2.1, 1.5, 2) + " extra buckets of paint");
        System.out.println("We need " + PaintJob.getBucketCount(2.75, 3.25, 2.5, 1) + " extra buckets of paint");
        System.out.println("");

        System.out.println("THE SECOND METHOD");
        System.out.println("We need " + PaintJob.getBucketCount(-3.4, 2.1, 1.5) + " extra buckets of paint");
        System.out.println("We need " + PaintJob.getBucketCount(3.4, 2.1, 1.5) + " extra buckets of paint");
        System.out.println("We need " + PaintJob.getBucketCount(7.25, 4.3, 2.35) + " extra buckets of paint");
        System.out.println("");

        System.out.println("THE THIRD METHOD");
        System.out.println("We need " + PaintJob.getBucketCount(3.4, 1.5) + " extra buckets of paint");
        System.out.println("We need " + PaintJob.getBucketCount(6.26, 2.2) + " extra buckets of paint");
        System.out.println("We need " + PaintJob.getBucketCount(3.26, 0.75) + " extra buckets of paint");

    }
}
