package academy.part60;

public class Main {
    public static void main(String[] args) {
        String result = getDurationString(62, 88);
        System.out.println(result);
        String result2 = getDurationString(3735);
        System.out.println(result2);
    }
    public static final String INVALID_PARAMETER_MESSAGE = "Wrong incoming parameters";
    public static String  getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_PARAMETER_MESSAGE;
        }

        int hours = minutes / 60;
        minutes = minutes % 60;

        return (hours + " h " + minutes + " m " + seconds + " s ");
    }

    public static String  getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_PARAMETER_MESSAGE;
        }
        int minutes = seconds / 60;
        seconds = seconds % 60;
        return getDurationString(minutes, seconds);
    }
}
