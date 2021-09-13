package academy.part92;

public class Furniture {
    private boolean coach;
    private boolean cupboard;
    private boolean table;
    private Stool stool;

    public Furniture(boolean coach, boolean cupboard, boolean table, Stool stool) {
        this.coach = coach;
        this.cupboard = cupboard;
        this.table = table;
        this.stool = stool;
    }

    public boolean isCoach() {
        return coach;
    }

    public boolean isCupboard() {
        return cupboard;
    }

    public boolean isTable() {
        return table;
    }

    public Stool getStool() {
        return stool;
    }
}
