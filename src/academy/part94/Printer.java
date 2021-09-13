package academy.part94;

public class Printer {
    private int level = 100;
    private int printedPages = 0;
    private boolean isDuplex = true;

    public double getLevel() {
        return level;
    }

    public int getPrintedPages() {
        return printedPages;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public void fillUp(int ink) {
        if (this.level + ink <= 100 && this.level + ink >= 0) {
            this.level = this.level + ink;
            System.out.println("Filling up is successful. The current level of toner is " + getLevel());
        }
        else {
            System.out.println("Wrong amount of ink. You have to add no more than " + (100 - getLevel()) + " of ink");
        }
    }

    public void printPage(int pages) {
        if(isDuplex) {
            pages = pages * 2;
        }
        if (pages <= getLevel()) {
            this.printedPages = this.printedPages + pages;
            System.out.println("The number of printed pages is " + getPrintedPages());
        }
        else {
            System.out.println("Too much pages to print. Fill up the printer or reduce number of pages to 100");
        }
    }
}
