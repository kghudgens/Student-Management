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
        // Collect the teachers choice
        int teachersChoice = input.nextInt();

        // Deal with the users choice as the teacher
        // Create an instance
        switch (teachersChoice) {
            case 1:
                System.out.println("You have selected to UPDATE a student's entry");
                updateStudent();
                break;
            case 2:
                System.out.println("You have selected VIEW a student's entry");
                viewStudent();
                break;
            case 3:
                System.out.println("You have selected to VIEW ALL student entries");
                viewAllStudent();
                break;
        }
    }

}
