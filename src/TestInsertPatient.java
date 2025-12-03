// DELETE THIS SOON
// DELETE THIS SOON
// DELETE THIS SOON
// DELETE THIS SOON
// DELETE THIS SOON
// DELETE THIS SOON

import dao.PatientDAO;
import model.Patient;
import Database.DatabaseSetup;

public class TestInsertPatient {
    public static void main(String[] args) {
        // Initialize tables
        DatabaseSetup.initialize();

        // Create DAO
        PatientDAO dao = new PatientDAO();

        // Create a sample patient
        Patient p = new Patient(
                "Juan Dela Cruz",
                30,
                "Male",
                "Mandaluyong",
                "09123456789",
                "No allergies"
        );

        // Add patient to database
        dao.addPatient(p);

        System.out.println("Test patient inserted successfully!");
    }
}
