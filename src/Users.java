import java.util.Scanner;

public class Users {

    public void getStudentID() {
        // Will be reused
        System.out.println("Please enter the five digit Student Identification Number?");
        this.studentID = input.nextInt();
        input.nextLine();
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
        System.out.println(this.studentID);
        // Prepared statement
    }

    public void updateStudent() {

    }

    public void viewAllStudent() {

    }

}
