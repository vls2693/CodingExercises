package academy.exercise47;

public class Main {
    public static void main(String[] args) {
        Player vls = new Player("Vls", 10, 15);
        System.out.println(vls.toString());
        saveObject(vls);
    }




    public static void saveObject(ISaveable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {

    }
}
