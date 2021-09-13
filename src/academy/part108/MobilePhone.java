package academy.part108;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    ArrayList<Contact> contactList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void phoneMenu() {
        System.out.println("Select one of the options below:");
        System.out.println("1 - Add number");
        System.out.println("2 - Delete number by name");
        System.out.println("3 - Find contact by name");
        System.out.println("4 - Print the whole contact list");
        System.out.println("5 - Modify contact");
        System.out.println("0 - Exit");
        int number = scanner.nextInt();
        do {
            switch (number) {
                case 1:
                    addContact();
                    break;
                case 2:
                    deleteContactByName();
                    break;
                case 3:
                    findContactByName();
                    break;
                case 4:
                    printContactList();
                    break;
                case 5:
                    modifyContact();
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Wrong number. Choose from 0 to 5");
                    break;
            }
            System.out.println("Select one of the options below:");
            System.out.println("1 - Add number");
            System.out.println("2 - Delete number by name");
            System.out.println("3 - Find contact by name");
            System.out.println("4 - Print the whole contact list");
            System.out.println("5 - Modify contact");
            System.out.println("0 - Exit");
            number = scanner.nextInt();
        } while (number != 0);
    }

    private void addContact() {
        scanner.nextLine();
        Contact contact = new Contact();
        System.out.println("Enter the name: ");
        contact.setName(scanner.nextLine());
        System.out.println("Enter the number: ");
        contact.setNumber(scanner.nextInt());
        contactList.add(contact);
        System.out.println("The added name is: " + contact.getName());
        System.out.println("The added number is: " + contact.getNumber());
    }

    private void printContactList() {
        for (int i = 0; i < contactList.size(); i++) {
            printContact(i);
        }
    }

    private void findContactByName() {
        scanner.nextLine();
        System.out.println("Enter the name to find");
        printContact(findContactIndex(scanner.nextLine()));
    }

    private void modifyContact() {
        scanner.nextLine();
        System.out.println("Enter the number of contact to modify:");
        int number = scanner.nextInt();
        number--;
        scanner.nextLine();
        System.out.println("Enter the name: ");
        contactList.get(number).setName(scanner.nextLine());
        System.out.println("Enter the number: ");
        contactList.get(number).setNumber(scanner.nextInt());
        System.out.println("The modified name is: " + contactList.get(number).getName());
        System.out.println("The modified number is: " + contactList.get(number).getNumber());
    }

    private void deleteContactByName() {
        scanner.nextLine();
        System.out.println("print name to delete");
        deleteContact(findContactIndex(scanner.nextLine()));
    }

    private void deleteContact(int number) {
        contactList.remove(number);
    }

    private int findContactIndex(String name) {
        for (int i = 0; i < contactList.size(); i++) {
            if (name.equals(contactList.get(i).getName())) {
                return i;
            }
        }
        return -1;
    }

    private void printContact(int number) {
        System.out.println("The name " + (number + 1) + ": " + contactList.get(number).getName());
        System.out.println("The number " + (number + 1) + ": " + contactList.get(number).getNumber());
    }
}
