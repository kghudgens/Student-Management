import java.util.Scanner;

public class Actors {
    // Users and their permissions

    class Users {
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

    class Administrator extends Users {
        // Extends the user class
        // Possess the ability for CRUD against student database
    }

    class Teacher {
        // Extends the user class
        // Possess the ability for RU against student database
    }

    class Student {
        // Extends the user class
        // Possess the ability to R against student database
    }
}
