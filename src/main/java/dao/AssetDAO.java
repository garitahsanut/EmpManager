package dao;
import asset.Asset;
import database.DatabaseConnection;

import java.sql.*;
import java.util.Vector;

public class AssetDAO {
    // CRUD
    // create
    public void addAsset (Asset newAsset) {
        // create sql query
        String sqlCreateQuery =
                "INSERT INTO asset (id, role, name, sex, age) " + "VALUES (?, ?, ?, ?, ?)";

        try (
                // connect to db
                Connection conn = DatabaseConnection.getConnection();
                // use query multiple times -> use prepared statement
                PreparedStatement stmnt = conn.prepareStatement(sqlCreateQuery);
                ) {
            // assign parameter to database from getter and setter
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

    // read
    public Vector<Asset> viewAllAssets() {

        Vector<Asset> viewAsset = new Vector<>();

        String sqlReadQuery =
                "SELECT * FROM asset";

        try (
            Connection conn = DatabaseConnection.getConnection();
            Statement stmnt = conn.createStatement();
            ResultSet allAssetsSet = stmnt.executeQuery(sqlReadQuery);
                ) {
            // print
                while(allAssetsSet.next()) {

                    Asset asset =  new Asset(
                            allAssetsSet.getInt("id"),
                            allAssetsSet.getString("role"),
                            allAssetsSet.getString("name"),
                            allAssetsSet.getString("sex"),
                            allAssetsSet.getInt("age")
                    );
                    viewAsset.add(asset);
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return viewAsset;
    }
}
