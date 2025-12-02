// DELETE THIS SOON
// DELETE THIS SOON
// DELETE THIS SOON
// DELETE THIS SOON
// DELETE THIS SOON
// DELETE THIS SOON
// DELETE THIS SOON
// DELETE THIS SOON

import dao.PatientDAO;
import model.Patient;
import java.util.List;

public class TestSearchPatient {
    public static void main(String[] args) {
        PatientDAO dao = new PatientDAO();
        List<Patient> patients = dao.searchPatients("Juan");

        for (Patient p : patients) {
            System.out.println("ID: " + p.getId() + ", Name: " + p.getFullName() + ", Age: " + p.getAge() + ", Gender: " + p.getGender() + ", Address: " + p.getAddress()
             + ", Phone No.: " + p.getPhone() + ", Medical History: " + p.getMedicalHistory());
        }
    }
}
