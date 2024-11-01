import java.util.ArrayList;

public class PhoneBook {
    private ArrayList<Contact> contacts;

    public PhoneBook() {
        contacts = new ArrayList<>();
    }

    public boolean addContact(Contact contact) {
        for (Contact c : contacts) {
            if (c.getFullName().equals(contact.getFullName())) {
                return false; // Contact already exists
            }
        }
        contacts.add(contact);
        return true;
    }

    public boolean deleteContact(String firstName, String lastName) {
        return contacts.removeIf(contact -> contact.getFullName().equals(firstName + " " + lastName));
    }

    public Contact findContact(String firstName, String lastName) {
        for (Contact contact : contacts) {
            if (contact.getFullName().equals(firstName + " " + lastName)) {
                return contact;
            }
        }
        return null;
    }

    public Contact[] findContacts(String group) {
        return contacts.stream().filter(contact -> group.equals(contact.group)).toArray(Contact[]::new);
    }

    public void printContacts() {
        contacts.forEach(contact -> System.out.println(contact + "\n"));
    }
}
