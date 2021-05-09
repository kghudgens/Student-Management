import java.util.Scanner;

public class Students extends Users {
    Scanner input = new Scanner(System.in);

    public String firstName;
    public String lastName;
    public String goal;
    public String phoneNumber;
    public String classOne;
    public String classTwo;
    public String classThree;
    public String classFour;
    public String favoriteSubject;
    public int studentID;

    // Extends the user class
    // Possess the ability to R against student database
    // Update only their entry

    public Students() {
        //
        System.out.println("Welcome, what is your first name? ");
        this.firstName = input.nextLine();

        System.out.println("Welcome what is your last name? ");
        this.lastName = input.nextLine();

        System.out.println("What is your five digit Student ID?");
        this.studentID = input.nextInt();
        input.nextLine();

        System.out.println("Welcome as a student you have two options.");
        // Present the students options
        System.out.println("VIEW their own student entry");
        System.out.println("UPDATE their own student entry");

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
