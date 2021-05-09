import java.util.Scanner;

public class App {

    public static void connectDatabase() {

    }

    public static void main(String[] args) {
        System.out.println("Hello, welcome to the Management System for the School of Options");
        // Call function that connects to database
        connectDatabase();

        // How will the user be using the program
        Scanner input = new Scanner(System.in);
        // Prompt the user with their choices of privileges

        System.out.println(" How will you be using the program? \n1. Administrator \n2. Teacher \n3. student?");

        // Take in the users choice
        int usersPurporseSelection = input.nextInt();

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

                Teachers teacher = new Teachers();
                break;

            // Case for students
            case 3: {
                System.out.println("Welcome as a student you have two options.");
                // Present the students options
                System.out.println("VIEW a student's entry");
                System.out.println("VIEW all student's entry");

                String studentChoice = input.nextLine();
                // Deal with the users choice
                switch (studentChoice.toLowerCase()) {
                    case "view":

                        break;
                    case "view all":

                        break;
                }

            }
            default: {
                System.out.println(
                        "You did not enter a value that identifies you as a Administrator, Teacher, or Student.");
                break;

            }

        }
        input.close();

    }
}
