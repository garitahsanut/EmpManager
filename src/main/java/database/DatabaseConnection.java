package database;
import java.sql.*;

public class DatabaseConnection {
    // helper method
    public static Connection getConnection()
    throws SQLException {
            // base url
            String url = "jdbc:mysql://localhost:3306/empmanager";

            // creds
            String username = "root";
            String password = "";

            // initialize connection
            return DriverManager.getConnection(
                    url, username, password
            );
    }
}
