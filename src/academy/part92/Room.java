package academy.part92;

public class Room {
    private Door door;
    private Furniture furniture;

    public Room(Door door, Furniture furniture) {
        this.door = door;
        this.furniture = furniture;
    }

    public Door getDoor() {
        return door;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public void enterTheRoom() {
        door.openTheDoor();
    }
}
