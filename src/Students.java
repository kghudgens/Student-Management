import java.util.Scanner;

public class Students extends Users {
    Scanner input = new Scanner(System.in);

    // Extends the user class
    // Possess the ability to R against student database
    // Update only their entry

    public Students() {

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

    public void updateStudent() {

    }

    public void viewStudent() {

    }

}
