package academy.exercise30;

public class Main {
    public static void main(String[] args) {
        Person character = new Person();

        character.setFirstName("Alex");
        character.setLastName("Law");
        character.setAge(33);

        System.out.println(character.getFirstName());
        System.out.println(character.getLastName());
        System.out.println(character.getFullName());
        System.out.println(character.getAge());
        System.out.println(character.isTeen());
    }
}
