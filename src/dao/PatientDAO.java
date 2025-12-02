// CRUD FOR PATIENT
// addPatient()
// editPatient()
// getPatientById()
// searchPatientByName()
// getAllPatients()

package dao;

import model.Patient;
import Database.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PatientDAO {

    public void addPatient(Patient p) {
        String sql = """
            INSERT INTO patients(full_name, age, gender, address, phone, medical_history)
            VALUES (?, ?, ?, ?, ?, ?);
        """;

        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, p.getFullName());
            stmt.setInt(2, p.getAge());
            stmt.setString(3, p.getGender());
            stmt.setString(4, p.getAddress());
            stmt.setString(5, p.getPhone());
            stmt.setString(6, p.getMedicalHistory());

            stmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error adding patient: " + e.getMessage());
        }
    }

    public List<Patient> searchPatients(String name) {
        List<Patient> list = new ArrayList<>();
        String sql = "SELECT * FROM patients WHERE full_name LIKE ?";

        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, "%" + name + "%");

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Patient p = new Patient(
                    rs.getString("full_name"),
                    rs.getInt("age"),
                    rs.getString("gender"),
                    rs.getString("address"),
                    rs.getString("phone"),
                    rs.getString("medical_history")
                );
                p.setId(rs.getInt("id"));
                list.add(p);
            }

        } catch (Exception e) {
            System.out.println("Search error: " + e.getMessage());
        }

        return list;
    }
}
