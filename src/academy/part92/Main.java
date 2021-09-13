package academy.part92;

public class Main {
    public static void main(String[] args) {
        Door door = new Door("brown",new Dimensions(6.5, 5.4, 7.8));
        Stool stool = new Stool(4, false);
        Furniture furniture = new Furniture(true,false, true, stool);

        Room room = new Room(door, furniture);

        room.getDoor().openTheDoor();
        room.getFurniture().getStool().sitOnTheStool();
    }
}
