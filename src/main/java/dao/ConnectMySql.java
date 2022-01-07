package dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectMySql {
    public static Connection getConnection()  {
        String jdbcURL = "jdbc:mysql://localhost:3306/clother";
        String jdbcUserName = "root";
        String jdbcPassword = "mylove99";
        Connection connection = null;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL,jdbcUserName,jdbcPassword);
        }catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }

    //test connect my sql
    public static void main(String[] args) {
        System.out.println(getConnection());
    }

}
