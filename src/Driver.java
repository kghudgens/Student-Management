import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Driver {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

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
}
