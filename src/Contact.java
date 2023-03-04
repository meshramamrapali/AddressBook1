public class Contact {
  String firstName;
     String lastName;
     String address;
     String state;
     String city;
     int zip;
    String email;
     int phone_number;

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public String getState() {

        return state;
    }

    public void setState(String state) {

        this.state = state;
    }

    public String getCity() {

        return city;
    }

    public void setCity(String city) {

        this.city = city;
    }

    public int getZip() {

        return zip;
    }

    public void setZip(int zip) {

        this.zip = zip;
    }

    public int getPhone_number() {

        return phone_number;
    }

    public void setPhone_number(int phone_number) {

        this.phone_number = phone_number;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" + "firstName='" + firstName +
                '\'' + ", lastName='" + lastName +
                '\'' + ", address='" + address +
                '\'' + ", state='" + state +
                '\'' + ", city='" + city +
                '\'' + ", zip='" + zip +
                '\'' + ", phone_number='" + phone_number +
                '\'' + ", email='" + email + '}';
    }
}


