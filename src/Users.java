import java.util.Scanner;

public class Users {

    /**
     * Function that gets the unique student ID to match them to database
     */
    public void getStudentID() {
        // Will be reused
        System.out.println("Please enter the five digit Student Identification Number?");
        this.studentID = input.nextInt();
        input.nextLine();
    }

    /**
     * Function that gets the name of the student to set in the classes attributes
     */
    public void getName() {
        System.out.println("What is the first name of the student?");
        this.firstName = input.nextLine();
        System.out.println("What is the last name of the student?");
        this.lastName = input.nextLine();
    }

    /**
     * Function that gets the goal of the student, sets it in the attributes and
     * gets it staged for the upcoming prepared statement
     */
    public void getGoal() {
        System.out.println("What is the goal of the student?");
        this.goal = input.nextLine();
    }

    /**
     * Function that gets the phone number of the student, sets it in the attributes
     * and gets it staged for the upcoming prepared statement
     */
    public void number() {
        System.out.println("What is the students phone number?");
        this.phoneNumber = input.nextLine();
    }

    Scanner input = new Scanner(System.in);

    public String firstName;
    public String lastName;
    public String goal;
    public String phoneNumber;
    public String course;
    public String favoriteSubject;
    public int studentID;

    // all users can view students in the database
    public void viewStudent() {
        getStudentID();

        // Prepared statement that compares the student ID and gathers that particular
        // students information
    }

    public void updateStudent() {
        getStudentID();

        // Call method that retrieves this student by ID viewStudent()

        System.out.println("What would you like to update?");
        System.out.println("1. Full Name \n2. Student Goal\n3. Phone Number \n4. Favorite Subject \n5.Courses");

        int userSelection = input.nextInt();

        switch (userSelection) {
            case 1:
                System.out.println("You selected to change the students first name?");
                getName();

                // Call function with name passed into it
            case 2:
            case 3:
            case 4:
            case 5:
        }
    }

    public void viewAllStudent() {

    }

}
