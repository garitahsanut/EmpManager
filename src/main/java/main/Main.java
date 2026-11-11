package main;

import asset.Asset;
import dao.AssetDAO;
import timeline.TimeLine;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        System.out.println("Test");

        // debug test
        TimeLine newAsset = new TimeLine(1, "superadmin", "Josh", "male", 22);
        newAsset.timeOffReq(1, "Sick", "had a flu in sunday morning");

        // sql db debug test
        // initialize vector
        Vector<Asset> assets = new Vector<Asset>();

        // create asset object
        assets.add(
                new Asset(2, "Regular User", "Greg", "Male", 20)
        );

        // create dao
        AssetDAO dao = new AssetDAO();

        // add vector to db
        for (Asset eachAsset : assets) {
            dao.addAsset(eachAsset);
        }

        // get all data and print all data

    }

}
