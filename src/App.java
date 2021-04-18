import java.util.Scanner;

public class App {

    public static void connectDatabase() {

    }

    public static void main(String[] args) {
        System.out.println("Hello, welcome to the Management System for the School of Options");
        // Call functiont that connects to database
        connectDatabase();

        // Create instance of the user that collects the users info
        Users user = new Users();

        // How will the user be using the program
        Scanner input = new Scanner(System.in);

        // Prompt the user with their choices of privileges

        user.getUserInfo();
        System.out.println(
                user.fullName + " how will you be using the program? As an administrator, teacher, or student?");

        String usersPurporseSelection = input.nextLine();

        while (true) {
            // Take in the users choice

            // Deal with the users choice

            if (usersPurporseSelection.equalsIgnoreCase("administrator")) {

                Administrator admin = new Administrator();
                System.out.println("Welcome " + admin.fullName + " as the administrator you have four options.");

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
