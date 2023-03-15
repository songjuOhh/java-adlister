import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class JDBCIntro {

    public static void main(String[] args) {
        try {
            // register driver
            // create connection
            // create statement
            // (Select) execute the query with statement
            // scroll through ResultSet to print album artists

            // register driver

            DriverManager.registerDriver(new Driver());

            // create connection

            Connection connection = DriverManager.getConnection(
                    // DB connection url
                    "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                    // DB username
                    "root",
                    // DB password
                    "codeup"
            );

            System.out.println(connection);

            // create statement

            Statement statement = connection.createStatement();

            // (Select) execute the query with statement

            String query = "SELECT * FROM albums;";

//            ResultSet resultSet = statement.executeQuery("SELECT * FROM albums LIMIT 5");
            ResultSet rs = statement.executeQuery(query);


//            rs.next();rs.next();

            if(rs.next()){
                System.out.println(rs.getString("artist"));
            }




            // rs.next(); // look at first result

            // rs.next();
            // rs.next();
            // rs.next();
            //
             if (rs.next()) {
                 String firstArtist = rs.getString("artist");
                 String firstAlbum = rs.getString("name");
                 System.out.println(firstArtist);
                 System.out.println(firstAlbum);
             }



            while(rs.next()) {
                String artist = rs.getString("artist");
                if(artist.equals("Nirvana")){
                    System.out.println(rs.getString("name"));
                }
            }










            // scroll through ResultSet to print album artists


            // id |         artist |                      name | release_date | sales | genre <------------ column names
            // 1  |              2 |                         3 |            4 |     5 |     6 <------------ column numbers


            // 1 | Michael Jackson |                  Thriller |         1982 |  47.3 | Pop, Rock, R&B // next() returns true
            // 2 |           AC/DC |             Back in Black |         1980 |  26.1 | Hard rock // .next() returns true
            // 3 |      Pink Floyd | The Dark Side of the Moon |         1973 |  24.2 | Progressive rock .next() returns true
            // .next() false


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
