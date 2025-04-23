package electricity.billing.system;

import java.sql.*;

public class database {
    public Connection connection;
    public Statement statement;

    public database() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");


            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bill_system", "root", "Sb@052863$");


            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



