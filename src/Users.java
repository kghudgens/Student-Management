import java.util.Scanner;

public class Users {

    // Get general information
    public String fullName;
    public String email;
    public int phoneNumber;

    public Users() {
        // Create scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user for information regarding who they are
        System.out.println("What is your full name?");
        this.fullName = input.nextLine();

        System.out.println("What is your email?");
        this.email = input.nextLine();

        System.out.println("What is your phone number?");
        this.phoneNumber = input.nextInt();

        // close the scanner
        input.close();

    }

    // define purpose

    public void userPurpose() {
        // Find out if user is administrator, teacher, or student
    }

}
