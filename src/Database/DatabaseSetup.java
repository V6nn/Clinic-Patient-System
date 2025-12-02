package Database;

import java.sql.Connection;
import java.sql.Statement;

public class DatabaseSetup {

    public static void initialize() {
        try (Connection conn = DatabaseConnection.connect();
             Statement stmt = conn.createStatement()) {

            // Patients table
            String patientTable = """
                CREATE TABLE IF NOT EXISTS patients (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    full_name TEXT NOT NULL,
                    age INTEGER,
                    gender TEXT,
                    address TEXT,
                    phone TEXT,
                    medical_history TEXT
                );
            """;

            // Visits table
            String visitTable = """
                CREATE TABLE IF NOT EXISTS visits (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    patient_id INTEGER NOT NULL,
                    date TEXT NOT NULL,
                    diagnosis TEXT,
                    treatment TEXT,
                    notes TEXT,
                    FOREIGN KEY (patient_id) REFERENCES patients(id)
                );
            """;

            stmt.execute(patientTable);
            stmt.execute(visitTable);

            System.out.println("Tables created successfully.");

        } catch (Exception e) {
            System.out.println("Error creating tables: " + e.getMessage());
        }
    }
}
