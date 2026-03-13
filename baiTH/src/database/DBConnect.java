package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class DBConnect {
	public static Connection getConnection() {
		Connection conn = null;

        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/qlsv",
                    "root",
                    ""
            );
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }
}
