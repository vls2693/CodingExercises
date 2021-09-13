package academy.exercise24;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if ((bigCount * 5) + smallCount < goal) {
            return false;
        }
        else if ((bigCount * 5) + smallCount == goal) {
            return true;
        }
        else {
            if (smallCount >= goal) {
                return true;
            }
            else {
                int kilos = 0;
                for (int i = 0; i < bigCount; i++) {
                    kilos += 5;
                    if (kilos == goal) {
                        return true;
                    }
                    int kilos2 = kilos;
                    for (int y = 0; y < smallCount; y++) {
                        kilos2++;
                        if (kilos2 == goal) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
