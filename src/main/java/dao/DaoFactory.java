package dao;

import models.Config;
import models.Ads;

public class DaoFactory {
    private static Ads adsDao;

//    private static Config config;



    public static Ads getAdsDao() {
        if (adsDao == null) {
            Config config = new Config();
            adsDao = new MySQLAdsDao(config);

        }
        return adsDao;
    }
}
