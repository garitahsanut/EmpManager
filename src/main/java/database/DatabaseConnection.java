package database;
import java.sql.*;

public class DatabaseConnection {
    // helper method
    public static Connection getConnection()
    throws SQLException {
            // base url
            String url = "jdbc:mysql://localhost:3306/DB_NAME";

            // creds
            String username = "DB_USERNAME";
            String password = "DB_PASSWORD";

            // initialize connection
            return DriverManager.getConnection(
                    url, username, password
            );
    }
}
