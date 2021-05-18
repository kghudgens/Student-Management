import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Driver {
    // create connection, statement, result set objects in the top level scope
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    /**
     * This function starts the connection to the MySQL DB tables or produces an
     * error message for troublshooting
     */
    public void connectDatabase() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management");
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }

    /**
     * Creates SELECT ALL query that returns all school information added to the
     * MySQL database
     */
    public void viewSchool() {
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM schools");
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

    }

    public void viewStudent() {

    }

    public void viewAllStudents() {

    }
}
