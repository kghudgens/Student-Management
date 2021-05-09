public class Teachers extends Users {

    System.out.println("Welcome "+fullName+" as the administrator you have four options.");

    // Show the administrator their permissions
    System.out.println("Select from the four:");System.out.println("\nNEW student entry");System.out.println("UPDATE a student's entry");System.out.println("VIEW a student's entry");System.out.println("VIEW ALL student entries");System.out.println("DELETE a student's entry");

    // Collect the users choice
    String adminChoice = input.nextLine();

    // Dealing with the users choices
    switch(adminChoice.toLowerCase())
    {

    // if the user enters new
    case "new":
        System.out.println("CREATING NEW STUDENT");
        Administrator.newStudent();

        break;

    // if the user enters update
    case "update":
        System.out.println("UPDATING STUDENT");
        admin.updateStudent();

        break;

    // if the user enters view
    case "view":
        System.out.println("VIEW STUDENT");
        admin.viewStudent();

        break;
    case "view all":
        // add a view all function
        break;
    case "delete":
        System.out.println("DELETE STUDENT");
        Administrator.deleteStudent();

        break;
    default:
        Users.viewAllStudent();
    }

}
