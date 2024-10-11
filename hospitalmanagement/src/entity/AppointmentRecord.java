package entity;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

// Class: AppointmentRecord
public class AppointmentRecord {
    private String patientId;
    private String doctorId;
    private String appointmentId;
    private Date appointmentDate;

    // Constructor
    public AppointmentRecord(String patientId, String doctorId, String appointmentId, Date appointmentDate) {
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.appointmentId = appointmentId;
        this.appointmentDate = appointmentDate;
    }

    // Getter and Setter methods
    public String getPatientId() { return patientId; }
    public void setPatientId(String patientId) { this.patientId = patientId; }
    public String getDoctorId() { return doctorId; }
    public void setDoctorId(String doctorId) { this.doctorId = doctorId; }
    public String getAppointmentId() { return appointmentId; }
    public void setAppointmentId(String appointmentId) { this.appointmentId = appointmentId; }
    public Date getAppointmentDate() { return appointmentDate; }
    public void setAppointmentDate(Date appointmentDate) { this.appointmentDate = appointmentDate; }

    // toString method
    public String toString() {
        return "Appointment ID: " + appointmentId + ", Patient ID: " + patientId + ", Doctor ID: " + doctorId + ", Date: " + appointmentDate;
    }
}