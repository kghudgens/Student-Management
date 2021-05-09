import java.util.Scanner;

public class Administrator extends Users {

    public String fullName;
    Scanner input = new Scanner(System.in);

    public Administrator() {
        // Get name
        System.out.println("What is your name? ");
        this.fullName = input.nextLine();
        System.out.println("Welcome " + this.fullName + " as the administrator you have four options.");

        // Provide user options
        System.out.println("Select from the four:");
        System.out.println(
                "\n1. NEW student entry\n 2. UPDATE a student's entry \n3. VIEW a student's entry \n 4. VIEW ALL student entries \n5. DELETE a student's entry");

    }

    public static void newStudent() {

    }

    /**
     * Deletes the student
     */
    public static void deleteStudent() {

    }

}
