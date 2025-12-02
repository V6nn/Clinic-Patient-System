// CRUD FOR VISITS
// addVisit()
// getVisitsByPatientId()

package dao;

import model.Visit;
import Database.DatabaseConnection;

import java.sql.*;

public class VisitDAO {

    public void addVisit(Visit v) {
        String sql = """
            INSERT INTO visits(patient_id, date, diagnosis, treatment, notes)
            VALUES (?, ?, ?, ?, ?);
        """;

        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, v.getPatientId());
            stmt.setString(2, v.getDate());
            stmt.setString(3, v.getDiagnosis());
            stmt.setString(4, v.getTreatment());
            stmt.setString(5, v.getNotes());

            stmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error adding visit: " + e.getMessage());
        }
    }
}
