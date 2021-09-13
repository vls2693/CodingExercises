package academy.exercise28;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double area = width * height;
        area = area - (areaPerBucket * extraBuckets);
        int count = 0;

        while (area >= 0) {
            area -= areaPerBucket;
            count++;
        }
        return count;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double area = width * height;
        int count = 0;

        while (area >= 0) {
            area -= areaPerBucket;
            count++;
        }
        return count;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        int count = 0;

        while (area >= 0) {
            area -= areaPerBucket;
            count++;
        }
        return count;
    }
}
