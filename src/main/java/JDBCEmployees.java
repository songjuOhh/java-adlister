import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;

public class JDBCEmployees {

    public static void main(String[] args) {

        try {


            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    // DB connection url
                    "jdbc:mysql://localhost:3306/employees?allowPublicKeyRetrieval=true&useSSL=false",
                    // DB username
                    "root",
                    // DB password
                    "codeup"
            );

            System.out.println(connection);

            // create statement

            Statement statement = connection.createStatement();

            // (Select) execute the query with statement

            String query = "SELECT * FROM employees;";

//            ResultSet resultSet = statement.executeQuery("SELECT * FROM albums LIMIT 5");
            ResultSet rs = statement.executeQuery(query);



            ArrayList<String> firstNames = new ArrayList<>();

            int i = 0;
            while (rs.next()&& i<10){
                String firstName = rs.getString("first_name");
                firstNames.add(firstName);
                System.out.println(firstName);
                i++;
            }
            System.out.println(firstNames);


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
