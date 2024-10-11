package entity;


//Class: Doctor
public class Doctor {
 private String doctorId;
 private String doctorName;
 private String specialization;
 private String contactNumber;
 private boolean isAvailable;

 // Constructor
 public Doctor(String doctorId, String doctorName, String specialization, String contactNumber, boolean isAvailable) {
     this.doctorId = doctorId;
     this.doctorName = doctorName;
     this.specialization = specialization;
     this.contactNumber = contactNumber;
     this.isAvailable = isAvailable;
 }

 // Getter and Setter methods
 public String getDoctorId() { return doctorId; }
 public void setDoctorId(String doctorId) { this.doctorId = doctorId; }
 public String getDoctorName() { return doctorName; }
 public void setDoctorName(String doctorName) { this.doctorName = doctorName; }
 public String getSpecialization() { return specialization; }
 public void setSpecialization(String specialization) { this.specialization = specialization; }
 public String getContactNumber() { return contactNumber; }
 public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }
 public boolean isAvailable() { return isAvailable; }
 public void setAvailable(boolean isAvailable) { this.isAvailable = isAvailable; }

 // toString method
 public String toString() {
     return "Doctor ID: " + doctorId + ", Name: " + doctorName + ", Specialization: " + specialization + ", Available: " + isAvailable;
 }
}
	
