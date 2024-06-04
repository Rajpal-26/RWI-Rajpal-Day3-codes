package DButil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
    private static final String JDBC_Url = "jdbc:mysql://localhost:3360/hotel_db";
    private static final String JDBC_Username = "root";
    private static final String JDBC_Password = "root";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_Url,JDBC_Username,JDBC_Password);
    }
}
