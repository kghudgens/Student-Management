import java.util.Scanner;

public class Administrator extends Users {
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

    // Attributes that define the administrator instance
    private String adminFirstName;
    private String adminLastName;

    private String adminID;

    private void submitNewStudent(String firstName, String lastName, int ID) {

    }

    /**
     * Deletes the student
     */
    private void deleteStudent() {

    }

    // TODO: find out how to call the view school method
    private void viewSchoolInformation() {
        // driver.viewSchool();

    }

    public Administrator() {

        // Get name
        System.out.println("What is your first name? ");
        this.adminFirstName = input.nextLine();

        System.out.println("Welcome " + this.adminFirstName + " as the administrator you have six options.");

        // Get admin ID to make sure user has permissions
        System.out.println("What is your Five digit Administrator ID?");
        this.adminID = input.nextLine();

        // Provide user options
        System.out.println(
                "\n1. New student entry\n2. Update a student's entry \n3. View a student's entry \n4. View all student entries \n5. Delete a student's entry \n6. View School Information \n6. QUIT");

        // Admins menu choice
        int adminChoice = input.nextInt();
        // Consume the line
        input.nextLine();

        // Switch statement handling the comparison of the admin choice statement
        switch (adminChoice) {
            case 1:
                // Inform user about choice
                System.out.println("You have selected created NEW student entry");
                // Create instance of student to submit to database
                Student student = new Student();
                // use recently created instance to submit to database by passing into function
                submitNewStudent(student.studentFirstName, student.studentLastName, student.studentID);
                break;
            case 2:
                System.out.println("You have selected created UPDATE student entry");
                updateStudent();
                break;
            case 3:
                System.out.println("You have selected created VIEW student entry");
                viewStudent();
                break;
            case 4:
                System.out.println("You have selected created VIEW ALL student entries");
                viewAllStudent();
                break;
            case 5:
                System.out.println("You have selected created DELETE student entry");
                deleteStudent();
                break;
            case 6:
                System.out.println("You have selected to view the school information");
                viewSchoolInformation();
            case 7:
                System.out.println("You have selected Quit");
                System.out.println("Good Bye " + this.adminFirstName);
                break;
            default:
                System.out.println(
                        "You have not selected a valid choice. By default all student entries will be displayed");
        }

    }

}
