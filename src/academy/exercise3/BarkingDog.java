package academy.exercise3;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (!barking) {
            return false;
        }
        else {
            if (hourOfDay < 0 || hourOfDay > 23) {
                return false;
            }
            else if (hourOfDay < 8) {
                return true;
            }
            else if (hourOfDay < 23) {
                return false;
            }
            else {
                return true;
            }
        }
    }
}
