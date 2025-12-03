package model;

public class Visit {
    private int id;
    private int patientId;
    private String date;
    private String diagnosis;
    private String treatment;
    private String notes;

    public Visit(int patientId, String date, String diagnosis, String treatment, String notes) {
        this.patientId = patientId;
        this.date = date;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.notes = notes;
    }

    // getters & setters
    public int getId() { return id; }
    public int getPatientId() { return patientId; }
    public String getDate() { return date; }
    public String getDiagnosis() { return diagnosis; }
    public String getTreatment() { return treatment; }
    public String getNotes() { return notes; }
}
