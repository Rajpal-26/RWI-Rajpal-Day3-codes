import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
//        Database URL
        String url = "jdbc:mysql://localhost:3360/home";

//        Database login
        String username = "root";
        String password = "root";

//        Establish the connection

        try(Connection connection = DriverManager.getConnection(url,username,password)) {
            System.out.println("connected to the database.");
            System.out.println(connection);
        }
        catch(SQLException e){
            System.err.println("connection failed" + e.getMessage());
        }
    }
}