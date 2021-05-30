import java.util.Scanner;

public class Administrator extends Users {
    /**
     * Instance of the student for the administrator to work with
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

    }

    private String adminFirstName;
    private String adminLastName;

    private String adminID;

    Scanner input = new Scanner(System.in);

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
                "\n1. NEW student entry\n2. UPDATE a student's entry \n3. VIEW a student's entry \n4. VIEW ALL student entries \n5. DELETE a student's entry \n6. View School Information \n6. QUIT");

        // Admins menu choice
        int adminChoice = input.nextInt();
        // Consume the line
        input.nextLine();

        // Switch statement handling the comparison of the admin choice statement
        switch (adminChoice) {
            case 1:
                System.out.println("You have selected created NEW student entry");
                newStudent();
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

    private void newStudent() {

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

}
