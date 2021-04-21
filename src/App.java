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

        System.out.println("What is your name? ");
        String fullName = input.nextLine();

        // Prompt the user with their choices of privileges

        System.out.println(fullName + " how will you be using the program? As an administrator, teacher, or student?");

        // Take in the users choice
        String usersPurporseSelection = input.nextLine();

        // Deal with the users choice
        switch (usersPurporseSelection.toLowerCase()) {

        // Create case 1 as if the user deems themselves administrator
        case "administator":

            // Create instance of the administrator
            Administrator admin = new Administrator();

            System.out.println("Welcome " + fullName + " as the administrator you have four options.");

            // Show the administrator their permissions
            System.out.println("Select from the four:");
            System.out.println("\nNEW student entry");
            System.out.println("UPDATE a student's entry");
            System.out.println("VIEW a student's entry");
            System.out.println("VIEW ALL student entries");
            System.out.println("DELETE a student's entry");

            // Collect the users choice
            String adminChoice = input.nextLine();

            // Dealing with the users choices
            switch (adminChoice.toLowerCase()) {

            // if the user enters new
            case "new":
                System.out.println("CREATING NEW STUDENT");
                Administrator.newStudent();

                break;

            // if the user enters update
            case "update":
                System.out.println("UPDATING STUDENT");
                admin.updateStudent();

                break;

            // if the user enters view
            case "view":
                System.out.println("VIEW STUDENT");
                admin.viewStudent();

                break;
            case "view all":
                // add a view all function
                break;
            case "delete":
                System.out.println("DELETE STUDENT");
                Administrator.deleteStudent();

                break;
            default:
                Users.viewAllStudent();
            }
            break;

        // Case two for those that are teachers
        case "teacher":
            System.out.println("Welcome " + fullName + " as the administrator you have three options.");
            // Present the teachers options
            System.out.println("UPDATE a student's entry");
            System.out.println("VIEW a student's entry");
            System.out.println("VIEW all student's entry");
            // Collect the teachers choice
            String teachersChoice = input.nextLine();

            // Deal with the users choice as the teacher
            // Create an instance
            switch (teachersChoice.toLowerCase()) {
            case "update":
                // Call the update function
                break;

            case "view":
                // Call the view function
                break;
            case "view all":
                // Call the view all function
                break;

            }

            // Case for students
        case "student": {
            System.out.println("Welcome " + fullName + " as a student you have two options.");
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
            System.out
                    .println("You did not enter a value that identifies you as a Administrator, Teacher, or Student.");
            break;

        }

        }
        input.close();

    }
}
