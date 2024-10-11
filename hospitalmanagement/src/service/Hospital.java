package service;
import entity.*;
import exceptions.*;
import java.util.HashMap;

public class Hospital {
    private HashMap<String, Patient> patients;
    private HashMap<String, Doctor> doctors;

    public Hospital() {
        patients = new HashMap<>();
        doctors = new HashMap<>();
    }

    public void addPatient(Patient patient) {
        patients.put(patient.getPatientId(), patient);
        System.out.println("Patient added successfully!");
    }

    public void removePatient(String patientId) throws PatientNotFoundException {
        if (patients.remove(patientId) == null) {
            throw new PatientNotFoundException("Patient not found.");
        }
        System.out.println("Patient removed successfully!");
    }

    public void addDoctor(Doctor doctor) {
        doctors.put(doctor.getDoctorId(), doctor);
        System.out.println("Doctor added successfully!");
    }

    public void removeDoctor(String doctorId) throws DoctorNotFoundException {
        if (doctors.remove(doctorId) == null) {
            throw new DoctorNotFoundException("Doctor not found.");
        }
        System.out.println("Doctor removed successfully!");
    }

    public void updateDoctorAvailability(String doctorId, boolean availability) throws DoctorNotFoundException {
        Doctor doctor = doctors.get(doctorId);
        if (doctor == null) {
            throw new DoctorNotFoundException("Doctor not found.");
        }
        doctor.setAvailable(availability);
        System.out.println("Doctor availability updated successfully!");
    }

    public void displayAllPatients() {
        patients.values().forEach(System.out::println);
    }

    public void displayAllDoctors() {
        doctors.values().forEach(System.out::println);
    }
}
