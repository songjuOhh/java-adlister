package dao;

import com.mysql.cj.jdbc.Driver;
import controllers.Config;
import models.Ad;
import models.Ads;
import models.Album;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {

    private Connection connection;



    public MySQLAdsDao(Config config){
        try{
            DriverManager.registerDriver(new Driver());
//            Config config = new Config();   //We do not need to re-declare config
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<Ad> all() {

        List<Ad> adsAll = new ArrayList<>();
        try{
            // Create a statement object
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ads");

            while(rs.next()){
                Ad adsTitleDesc = new Ad(
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("description")
                );
                adsAll.add(adsTitleDesc);
            }
        }catch (SQLException e){
            throw new RuntimeException(e);

        }

        return adsAll;
    }

    @Override
    public Long insert(Ad ad){
//        String stringData = (String.format("%d, '%s', '%s'",ad.getUserId(), ad.getTitle(), ad.getDescription()));

        try{
            Statement stmt = connection.createStatement();

//            String query = String.format("INSERT INTO ads (user_id,title, description) VALUES (%s)", stringData);
            String query = String.format("INSERT INTO ads (user_id,title, description) VALUES (%d, %s, %s)",
                    ad.getUserId(),
                    ad.getTitle(),
                    ad.getDescription()
            );

            System.out.println(query);
            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();

//
            if (rs.next()) {
                System.out.println("Inserted a new record! New id: " + rs.getLong(1));

            }
            return rs.getLong(1);

        }catch (SQLException e){
            throw new RuntimeException(e);
        }


//        ads.add(new Ad(
//                1,
//                1,
//                "playstation for sale",
//                "This is a slightly used playstation"
//        ));
//        ads.add(new Ad(
//                2,
//                1,
//                "Super Nintendo",
//                "Get your game on with this old-school classic!"
//        ));
//        ads.add(new Ad(
//                3,
//                2,
//                "Junior Java Developer Position",
//                "Minimum 7 years of experience required. You will be working in the scripting language for Java, JavaScript"
//        ));
//        ads.add(new Ad(
//                4,
//                2,
//                "JavaScript Developer needed",
//                "Must have strong Java skills"
//        ));


    }

}
