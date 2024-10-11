package service;
import exceptions.*;
import entity.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

//Class: Appointment
public class Appointment {
 private ArrayList<AppointmentRecord> appointments;

 public Appointment() {
     appointments = new ArrayList<>();
 }

 public void scheduleAppointment(String patientId, String doctorId, Date appointmentDate) throws DoctorNotAvailableException {
     for (AppointmentRecord appointment : appointments) {
         if (appointment.getDoctorId().equals(doctorId) && !appointmentDate.equals(appointment.getAppointmentDate())) {
             throw new DoctorNotAvailableException("Doctor is not available on the selected date.");
         }
     }
     AppointmentRecord newAppointment = new AppointmentRecord(patientId, doctorId, "A" + (appointments.size() + 1), appointmentDate);
     appointments.add(newAppointment);
     System.out.println("Appointment scheduled successfully!");
 }

 public void cancelAppointment(String appointmentId) {
     appointments.removeIf(appointment -> appointment.getAppointmentId().equals(appointmentId));
     System.out.println("Appointment canceled successfully!");
 }

 public void displayAppointmentsByDoctor(String doctorId) {
     for (AppointmentRecord appointment : appointments) {
         if (appointment.getDoctorId().equals(doctorId)) {
             System.out.println(appointment);
         }
     }
 }

 public void displayAppointmentsByPatient(String patientId) {
     for (AppointmentRecord appointment : appointments) {
         if (appointment.getPatientId().equals(patientId)) {
             System.out.println(appointment);
         }
     }
 }
}