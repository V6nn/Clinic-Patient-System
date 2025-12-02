package model;

public class Patient {
    private int id;
    private String fullName;
    private int age;
    private String gender;
    private String address;
    private String phone;
    private String medicalHistory;

    public Patient(String fullName, int age, String gender, String address, String phone, String medicalHistory) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
        this.medicalHistory = medicalHistory;
    }

    // getters & setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getFullName() { return fullName; }
    public int getAge() { return age; }

    public String getGender() { return gender; }
    public String getAddress() { return address; }
    public String getPhone() { return phone; }
    public String getMedicalHistory() { return medicalHistory; }
}
