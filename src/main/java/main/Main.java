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

        assets.add(
                new Asset(3, "More than Regular User", "Grog", "Male", 22)
        );

        assets.add(
                new Asset(1, "Super Duper User", "Ben", "Male", 12)
        );

        // create dao
        AssetDAO dao = new AssetDAO();

        // add vector to db
        for (Asset eachAsset : assets) {
            dao.addAsset(eachAsset);
        }

        // update data
        Asset searchAsset = new Asset(2, "superhero", "batman", "male", 33);
        if(dao.updateAsset(searchAsset)) {
            System.out.println("Update Successfull");
        } else {
            System.out.println("Update failed");
        }


        // get all data and print all data
        Vector<Asset> allAssets =
                dao.viewAllAssets();

        for (Asset eachAsset: allAssets) {
            eachAsset.viewGenericAssets();
        }

        // delete
//        dao.purgeAsset(3);
//        dao.purgeAsset(1);
//        dao.purgeAsset(2);
    }

}
