import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {
    database() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/d17","root","");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}
