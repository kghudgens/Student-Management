public class Actors {
    // Users and their permissions

    class Users {
        // Get general information
        String fullName;
        String email;
        int phoneNumber;

    }

    class Administrator extends Users {
        // Extends the user class
        // Possess the ability for CRUD against student database
    }

    class Teacher {
        // Extends the user class
        // Possess the ability for RU against student database
    }

    class Student {
        // Extends the user class
        // Possess the ability to R against student database
    }
}
