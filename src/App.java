import java.util.Scanner;

public class App {

    public static void connectDatabase() {

    }

    public static void main(String[] args) {
        System.out.println("Hello, welcome to the Management System for the School of Options");
        // Call functiont that connects to database
        connectDatabase();

        // How will the user be using the program
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name? ");
        String fullName = input.nextLine();

        // Prompt the user with their choices of privileges

        System.out.println(fullName + " how will you be using the program? As an administrator, teacher, or student?");

        String usersPurporseSelection = input.nextLine();

        // Not BUG but more of cleaning code as it goes
        // Further research the practices for if else vs switch
        // while (true) {
        // Take in the users choice

        // Deal with the users choice

        if (usersPurporseSelection.equalsIgnoreCase("administrator")) {

            Administrator admin = new Administrator();
            System.out.println("Welcome " + fullName + " as the administrator you have four options.");
            // Show the administrator their permissions
            System.out.println("\nCreate NEW student entry");
            System.out.println("UPDATE a student's entry");
            System.out.println("VIEW a student's entry");
            System.out.println("DELETE a student's entry");

            String adminChoice = input.nextLine();

            // Dealing with the users choices
            switch (adminChoice.toLowerCase()) {
            case "new":
                System.out.println("CREATING NEW STUDENT");
                Administrator.newStudent();

                break;
            case "update":
                System.out.println("UPDATING STUDENT");
                admin.updateStudent();

                break;
            case "view":
                System.out.println("VIEW STUDENT");
                admin.viewStudent();

                break;
            case "delete":
                System.out.println("DELETE STUDENT");
                Administrator.deleteStudent();

                break;
            default:
                Users.viewAllStudent();
            }

        } else if (usersPurporseSelection.equalsIgnoreCase("teacher")) {

        } else if (usersPurporseSelection.equalsIgnoreCase("student")) {

        } else if (usersPurporseSelection.equalsIgnoreCase("q")) {
            System.out.println("Thank you for using the Student Management System");

        } else {
            System.out.println("You didnt enter a one of the three options");
            System.out.println("Please select from being an administrator, teacher, or student");
            usersPurporseSelection = input.nextLine();
        }

    }
}
