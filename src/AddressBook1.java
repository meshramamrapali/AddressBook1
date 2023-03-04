import java.util.Scanner;

public class AddressBook1 {
    static Scanner scanner = new Scanner(System.in);
    static Contact[] contactsArray = new Contact[1];

    public static void addContact() {
        for (int i = 0; i < contactsArray.length; i++) {
            Contact contact = new Contact();
            System.out.println("Enter Firstname");
            contact.firstName = scanner.next();
            System.out.println("Enter Last Name :");
            contact.lastName = scanner.next();
            System.out.println("Enter Address");
            contact.address = scanner.next();
            System.out.println("Enter State");
            contact.state = scanner.next();
            System.out.println("Enter City");
            contact.city = scanner.next();
            System.out.println("Enter Zip");
            contact.zip = scanner.nextInt();
            System.out.println("Enter Phone_number");
            contact.phone_number = scanner.nextInt();
            System.out.println("Enter Email");
            contact.email = scanner.next();
            contactsArray[i] = contact;
            contactsArray[i] = contact;
        }
    }

    public static void main(String[] args) {
        AddressBook1.addContact();
    }
}