package dao;
import database.DatabaseConnection;
import timeline.TimeLine;

import java.sql.*;
import java.util.Vector;

public class TimeLineDAO {
    public void createTimeLine(TimeLine newTimeLine) {
        String sqlAddQuery =
                "INSERT INTO timeline (id, shifts, working_hours)" + "VALUES (?, ?, ?)";
        try (
                Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmnt = conn.prepareStatement(sqlAddQuery);
                ) {
                stmnt.setInt(1, newTimeLine.getId());
                stmnt.setInt(2, newTimeLine.getShifts());
                stmnt.setInt(3, newTimeLine.getWorking_hours());

                stmnt.executeUpdate();
                System.out.println("New TimeLine derived from Asset is successfully added.");
        } catch (SQLException e) {
            (e).printStackTrace();
        }
    }
}
