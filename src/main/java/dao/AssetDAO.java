package dao;
import asset.Asset;
import database.DatabaseConnection;

import java.sql.*;
import java.util.Vector;

public class AssetDAO {
    // create
    public void addAsset (Asset newAsset) {
        String sqlQuery =
                "INSERT INTO asset (id, role, name, sex, age) " + "VALUES (?, ?, ?, ?, ?)";

        try (
                Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmnt = conn.prepareStatement(sqlQuery);
                ) {

            stmnt.setInt(1, newAsset.getId());
            stmnt.setString(2, newAsset.getRole());
            stmnt.setString(3, newAsset.getName());
            stmnt.setString(4, newAsset.getSex());
            stmnt.setInt(5, newAsset.getAge());

            stmnt.executeUpdate();

            System.out.println("New Asset are successfully added");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
