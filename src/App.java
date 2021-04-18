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

        while (true) {
            // Take in the users choice

            // Deal with the users choice

            if (usersPurporseSelection.equalsIgnoreCase("administrator")) {

                Administrator admin = new Administrator();
                System.out.println("Welcome " + fullName + " as the administrator you have four options.");

                // To create
                Administrator.newStudent();
                // To read
                admin.viewStudent();
                // update
                admin.updateStudent();
                // to delete
                Administrator.deleteStudent();

                break;

            } else if (usersPurporseSelection.equalsIgnoreCase("teacher")) {

            } else if (usersPurporseSelection.equalsIgnoreCase("student")) {

            } else if (usersPurporseSelection.equalsIgnoreCase("q")) {
                System.out.println("Thank you for using the Student Management System");
                break;
            } else {
                System.out.println("You didnt enter a one of the three options");
                System.out.println("Please select from being an administrator, teacher, or student");
                usersPurporseSelection = input.nextLine();
            }
        }

        // user.userPurpose();

    }
}
