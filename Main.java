import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String command = scanner.nextLine();

            if (command.equals("exit")) {
                break;
            } else if (command.startsWith("contacts -a")) {
                // Parse command and add contact
            } else if (command.startsWith("contacts -r")) {
                // Parse command and remove contact
            } else if (command.startsWith("show -g")) {
                // Parse command and show contacts in a group
            } else if (command.startsWith("show -c")) {
                // Parse command and show specific contact
            } else if (command.equals("show")) {
                phoneBook.printContacts();
            } else {
                System.out.println("Invalid command.");
            }
        }

        scanner.close();
    }
}
