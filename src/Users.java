import java.util.Scanner;

public class Users {
    // Instance of the driver class
    Driver driver = new Driver();

    Scanner input = new Scanner(System.in);

    /**
     * Instance of the student for the administrator to submit to database
     */
    public class Student {
        private String studentFirstName;
        private String studentLastName;
        private int studentID;

        /**
         * Initialize student instance
         */
        public Student() {
            // Gather information on the attributes for the student
            System.out.println("Student ID:");
            this.studentID = input.nextInt();
            input.nextLine();

            System.out.println("Student First Name: ");
            this.studentFirstName = input.nextLine();

            System.out.println("Student Last Name:");
            this.studentLastName = input.nextLine();
        }

        /**
         * sets the student ID for the student instance
         */
        private void setStudentID() {
            System.out.println("Student ID:");
            this.studentID = input.nextInt();
            input.nextLine();
        }

    }

    public String firstName;
    public String lastName;
    public String phoneNumber;
    public int studentID;

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
     * Function that gets the phone number of the student, sets it in the attributes
     * and gets it staged for the upcoming prepared statement
     */
    public void number() {
        System.out.println("What is the students phone number?");
        this.phoneNumber = input.nextLine();
    }

    // all users can view students in the database
    public void viewStudent() {
        getStudentID();

        // Prepared statement that compares the student ID and gathers that particular
        // students information
    }

    public void viewSchoolInformation() {
        driver.viewSchool();

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
