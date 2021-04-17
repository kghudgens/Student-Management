import java.util.Scanner;

public class Users {

    // Get general information
    String fullName;
    String email;
    int phoneNumber;

    public Users() {
        // Create scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user for information regarding who they are
        System.out.println("What is your full name?");
        fullName = input.nextLine();

        System.out.println("What is your email?");
        email = input.nextLine();

        System.out.println("What is your phone number?");
        phoneNumber = input.nextInt();

        // close the scanner
        input.close();

    }

}
