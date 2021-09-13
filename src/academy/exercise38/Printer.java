package academy.exercise38;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (tonerLevel + tonerAmount <= 100) {
                tonerLevel = tonerLevel + tonerAmount;
                return tonerLevel;
            }
            else {
                return -1;
            }
        }
        else {
            return -1;
        }
    }

    public int printPages(int pagesToPrint) {
        if (duplex) {
            if (pagesToPrint % 2 == 0) {
                pagesToPrint = pagesToPrint / 2;
            }
            else {
                pagesToPrint = ((pagesToPrint - 1) / 2) + 1;
            }
        }
        pagesPrinted = pagesPrinted + pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
