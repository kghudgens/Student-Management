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

    public void getGoal() {

    }

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

    // all users can view students in the database
    public void viewStudent() {
        getStudentID();

        // Prepared statement
    }

    public void updateStudent() {
        getStudentID();
    }

    public void viewAllStudent() {

    }

}
