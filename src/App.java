import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("\nHello, welcome to the Management System for the School of Options");

        // Explain to new users the programs goal
        System.out.println(
                "This program connects to the School Management System's Database and gives the user access to data of the students and Staff.\n");

        // Call function that connects to database
        Driver driver = new Driver();

        // Create scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user for administrator or teacher to decide the permissions for
        // the user
        System.out.println(" How will you be using the program? \n1. Administrator \n2. Teacher ");

        // Take in the users choice
        int usersPurporseSelection = input.nextInt();
        // consume the line
        input.nextLine();

        // Deal with the users choice
        switch (usersPurporseSelection) {

            // Create case 1 as if the user deems themselves administrator
            case 1:
                System.out.println("You have selected Administrator");
                // Create instance of the administrator
                Administrator admin = new Administrator();
                break;
            // Case two for those that are teachers
            case 2:
                System.out.println("You have selected Teacher");
                // Instance of the teacher
                Teachers teacher = new Teachers();
                break;
            default: {
                System.out.println(
                        "You did not enter a value that identifies you as a Administrator, Teacher, or Student.");
                break;
            }

        }
        input.close();

    }
}
