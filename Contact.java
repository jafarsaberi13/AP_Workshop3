public class Contact {
    private String group;
    private String email;
    private String firstName;
    private String lastName;
    private PhoneNumber phoneNumber;
    private Address address;

    public Contact(String group, String email, String firstName, String lastName, PhoneNumber phoneNumber, Address address) {
        this.group = group;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "Name: " + getFullName() +
                "\nEmail: " + (email != null ? email : "N/A") +
                "\nGroup: " + (group != null ? group : "N/A") +
                "\nPhone: " + (phoneNumber != null ? phoneNumber.toString() : "N/A") +
                "\nAddress: " + (address != null ? address.toString() : "N/A");
    }
}
