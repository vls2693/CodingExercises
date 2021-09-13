package academy.exercise2;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
        else {
            int wholeMegaBytes = kiloBytes / 1024;
            int megaBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + wholeMegaBytes + " MB and " + megaBytes + " KB");
        }
    }
}
