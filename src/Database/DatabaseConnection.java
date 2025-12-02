package Database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    private static final String DB_URL = "jdbc:sqlite:database/clinic.db";

    public static Connection connect() {
        Connection conn = null;
        try {
            Class.forName("org.sqlite.JDBC");   // ← IMPORTANT
            conn = DriverManager.getConnection(DB_URL);
            System.out.println("Connected to database.");
        } catch (Exception e) {
            System.out.println("Database connection error: " + e.getMessage());
        }
        return conn;
    }
}