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
                // Show the administrator their permissions
                System.out.println("\nCreate NEW student entry");
                System.out.println("UPDATE a student's entry");
                System.out.println("VIEW a student's entry");
                System.out.println("DELETE a student's entry");

                String adminChoice = input.nextLine();

                switch (adminChoice.toLowerCase()) {
                case "new":
                    System.out.println("CREATING NEW STUDENT");
                    Administrator.newStudent();

                    break;
                case "update":
                    admin.updateStudent();

                    break;
                case "view":
                    admin.viewStudent();

                    break;
                case "delete":
                    Administrator.deleteStudent();

                    break;
                }

                // if (adminChoice.equalsIgnoreCase("new")) {
                // // To create

                // Administrator.newStudent();

                // } else if (adminChoice.equalsIgnoreCase("update")) {
                // // update

                // admin.updateStudent();

                // } else if (adminChoice.equalsIgnoreCase("view")) {
                // // To read

                // admin.viewStudent();

                // } else if (adminChoice.equalsIgnoreCase("delete")) {
                // // to delete

                // Administrator.deleteStudent();

                // }

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

    }
}
