import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook1 {
     Scanner scanner = new Scanner(System.in);
     Contact[] contactsArray = new Contact[1];

    public  void addContact() {
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

        }
    }

    public  void editContact() {
        for (Contact contact : contactsArray) {
            System.out.println("Enter how you want to edit detail:" +
                    "\n1)edit firstname" +
                    "\n2)edit lastname" +
                    "\n3)edit address" +
                    "\n4)edit stats" +
                    "\n5)edit city" +
                    "\n6)edit zip" +
                    "\n7)edit phone_number" +
                    "\n8)edit email");
            int Choice = scanner.nextInt();
            switch (Choice) {
                case 1:
                    System.out.println("enter the first name to edit");
                    String firstName = scanner.next();
                    if (firstName.equals(contact.getFirstName()))
                        System.out.println("edit the details of person");
                    System.out.println("enter first name");
                    contact.setFirstName(scanner.next());
                    break;
                case 2:
                    System.out.println("enter the Last name to edit");
                    String lastName = scanner.next();
                    if (lastName.equals(contact.getLastName()))
                        System.out.println("edit the details of person");
                    System.out.println("enter the last name");
                    contact.setLastName(scanner.next());
                    break;
                case 3:
                    System.out.println("enter the Address to edit");
                    String address = scanner.next();
                    if (address.equals(contact.getAddress()))
                        System.out.println("edit the details of person");
                    System.out.println("enter address");
                    contact.setAddress(scanner.next());
                    break;
                case 4:
                    System.out.println("enter the state to edit");
                    String state = scanner.next();
                    if (state.equals(contact.getState()))
                        System.out.println("edit the details of person");
                    System.out.println("enter state");
                    contact.setState(scanner.next());
                    break;
                case 5:
                    System.out.println("enter the City to edit");
                    String city = scanner.next();
                    if (city.equals(contact.getCity()))
                        System.out.println("edit the details of person");
                    System.out.println("enter city");
                    contact.setCity(scanner.next());
                    break;
                case 6:
                    System.out.println("enter the zip to edit");
                    String zip = scanner.next();
                    if (zip.equals(contact.getZip()))
                        System.out.println("edit the details of person");
                    System.out.println("enter zip");
                    contact.setZip(scanner.nextInt());
                    break;
                case 7:
                    System.out.println("enter the phone_number to edit");
                    String phone_number = scanner.next();
                    if (phone_number.equals(contact.getPhone_number()))
                        System.out.println("edit the details of person");
                    System.out.println("enter phone_number");
                    contact.setPhone_number(scanner.nextInt());
                    break;
                case 8:
                    System.out.println("enter the email to edit");
                    String email = scanner.next();
                    if (email.equals(contact.getEmail()))
                        System.out.println("edit the details of person");
                    System.out.println("enter email");
                    contact.setEmail(scanner.next());
                    break;
                default:
                    System.out.println("wrong input");
            }
        }
    }

    public static void main(String[] args) {
        AddressBook1.addContact();
        AddressBook1.editContact();
    }
}