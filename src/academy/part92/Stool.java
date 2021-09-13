package academy.part92;

public class Stool {
    private int count;
    private boolean hasChairBack;

    public Stool(int count, boolean hasChairBack) {
        this.count = count;
        this.hasChairBack = hasChairBack;
    }

    public int getCount() {
        return count;
    }

    public boolean isHasChairBack() {
        return hasChairBack;
    }

    public void sitOnTheStool() {
        System.out.println("Stool is busy");
    }
}
