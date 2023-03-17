package dao;

import controllers.Config;
import models.Ads;
import models.Ad;

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
