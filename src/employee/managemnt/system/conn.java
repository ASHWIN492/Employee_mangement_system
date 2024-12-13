package employee.managemnt.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class conn {
    Connection connection;
    Statement statement;

    public conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/employeemanagement";
            String username = "root";
            String password = "root";

            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}