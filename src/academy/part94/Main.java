package academy.part94;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();

        System.out.println(printer.getLevel());

        printer.printPage(120);
        printer.printPage(40);
    }
}
