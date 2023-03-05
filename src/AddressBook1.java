

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook1 {
    ArrayList<Contact> arrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Contact[] contactsArray = new Contact[1];

    public static void main(String[] args) {
        System.out.println("Welcome To Address Book");
        AddressBook1 addressBook1 = new AddressBook1();
        addressBook1.addContact();
        addressBook1.editContact();
        addressBook1.deleteContact();
    }

    public void addContact() {
        for (int i = 0; i < contactsArray.length; i++) {
            Contact contact = new Contact();
            System.out.println("Enter FirstName :");
            contact.firstname = scanner.next();
            System.out.println("Enter Last Name :");
            contact.lastname = scanner.next();
            System.out.println("Enter Address :");
            contact.address = scanner.next();
            System.out.println("Enter State :");
            contact.state = scanner.next();
            System.out.println("Enter City :");
            contact.city = scanner.next();
            System.out.println("Enter Zip :");
            contact.zip = scanner.nextInt();
            System.out.println("Enter Phone_number :");
            contact.phone_number = scanner.nextInt();
            System.out.println("Enter Email :");
            contact.email = scanner.next();
            contactsArray[i] = contact;

        }
    }

    public void editContact() {
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
                    System.out.println("Enter the First Name to edit :");
                    String firstName = scanner.next();
                    if (firstName.equals(contact.getFirstname()))
                        System.out.println("Edit the details of person :");
                    System.out.println("Enter First Name");
                    contact.setFirstname(scanner.next());
                    break;
                case 2:
                    System.out.println("Enter the Last name to edit :");
                    String lastName = scanner.next();
                    if (lastName.equals(contact.getLastname()))
                        System.out.println("Edit the details of person :");
                    System.out.println("Enter the Last Name :");
                    contact.setLastname(scanner.next());
                    break;
                case 3:
                    System.out.println("Enter the Address to edit :");
                    String address = scanner.next();
                    if (address.equals(contact.getAddress()))
                        System.out.println("Edit the details of person :");
                    System.out.println("Enter Address :");
                    contact.setAddress(scanner.next());
                    break;
                case 4:
                    System.out.println("Enter the state to edit :");
                    String state = scanner.next();
                    if (state.equals(contact.getState()))
                        System.out.println("Edit the details of person :");
                    System.out.println("enter state");
                    contact.setState(scanner.next());
                    break;
                case 5:
                    System.out.println("Enter the City to edit :");
                    String city = scanner.next();
                    if (city.equals(contact.getCity()))
                        System.out.println("Edit the details of person:");
                    System.out.println("enter city");
                    contact.setCity(scanner.next());
                    break;
                case 6:
                    System.out.println("Enter the zip to edit :");
                    String zip = scanner.next();
                    if (zip.equals(contact.getZip()))
                        System.out.println("Edit the details of person :");
                    System.out.println("Enter zip :");
                    contact.setZip(scanner.nextInt());
                    break;
                case 7:
                    System.out.println("Enter the phone_number to edit :");
                    String phone_number = scanner.next();
                    if (phone_number.equals(contact.getPhone_number()))
                        System.out.println("Edit the details of person : ");
                    System.out.println("Enter phone_number :");
                    contact.setPhone_number(scanner.nextInt());
                    break;
                case 8:
                    System.out.println("Enter the email to edit :");
                    String email = scanner.next();
                    if (email.equals(contact.getEmail()))
                        System.out.println("Edit the details of person :");
                    System.out.println("Enter email :");
                    contact.setEmail(scanner.next());
                    break;
                default:
                    System.out.println("Wrong Input");
            }
        }
    }

    public void deleteContact() {
        for (Contact con : contactsArray) {
            System.out.println("Enter First Name of Person to Delete : ");
            String firstName = scanner.next();
            if (firstName.equals(con.getFirstname())) {
                con.setFirstname(null);
                // con = null;
                System.out.println("Delete Successfully :");

            } else {

                System.out.println("No Contact Found :");
            }
        }
    }
}