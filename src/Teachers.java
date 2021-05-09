import java.util.Scanner;

public class Teachers extends Users {
    // Create scanner object
    Scanner input = new Scanner(System.in);
    public String name;

    // Get users name
    public Teachers() {
        System.out.println("What is your name?");

        this.name = input.nextLine();

        // Dealing with the users choices
        System.out.println("Welcome " + this.name + "as a teacher you have three options.");
        // Present the teachers options
        System.out.println("\n1. UPDATE a student's entry \n2.View a student's entry  \n3. VIEW ALL student entries");
        System.out.println("VIEW a student's entry");
        System.out.println("VIEW all student's entry");
        // Collect the teachers choice
        int teachersChoice = input.nextInt();

        // Deal with the users choice as the teacher
        // Create an instance
        switch (teachersChoice) {
            case 1:
                // Call the update function
                break;

            case 2:
                // Call the view function
                break;
            case 3:
                // Call the view all function
                break;
        }
    }

}
