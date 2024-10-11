package operations;
import java.util.Date;
import java.util.Scanner;

import entity.Doctor;
import entity.Patient;
import exceptions.DoctorNotAvailableException;
import exceptions.DoctorNotFoundException;
import exceptions.PatientNotFoundException;
import service.Appointment;
import service.Hospital;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hospital hospital = new Hospital();
        Appointment appointment = new Appointment();
        
        while (true) {
            System.out.println("\n--- Hospital Management System Menu ---");
            System.out.println("1. Add Patient");
            System.out.println("2. Remove Patient");
            System.out.println("3. Add Doctor");
            System.out.println("4. Remove Doctor");
            System.out.println("5. Update Doctor Availability");
            System.out.println("6. Schedule Appointment");
            System.out.println("7. Cancel Appointment");
            System.out.println("8. Display All Patients");
            System.out.println("9. Display All Doctors");
            System.out.println("10. Display Appointments by Doctor");
            System.out.println("11. Display Appointments by Patient");
            System.out.println("12. Exit");
            System.out.print("Choose an option: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character after the integer input

            switch (choice) {
                case 1:
                    // Add Patient
                    System.out.print("Enter Patient ID: ");
                    String patientId = sc.nextLine();
                    System.out.print("Enter Patient Name: ");
                    String patientName = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter Gender: ");
                    String gender = sc.nextLine();
                    System.out.print("Enter Contact Number: ");
                    String contactNumber = sc.nextLine();
                    
                    Patient newPatient = new Patient(patientId, patientName, age, gender, contactNumber);
                    hospital.addPatient(newPatient);
                    break;
                
                case 2:
                    // Remove Patient
                    System.out.print("Enter Patient ID to Remove: ");
                    String removePatientId = sc.nextLine();
                    try {
                        hospital.removePatient(removePatientId);
                    } catch (PatientNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                
                case 3:
                    // Add Doctor
                    System.out.print("Enter Doctor ID: ");
                    String doctorId = sc.nextLine();
                    System.out.print("Enter Doctor Name: ");
                    String doctorName = sc.nextLine();
                    System.out.print("Enter Specialization: ");
                    String specialization = sc.nextLine();
                    System.out.print("Enter Contact Number: ");
                    String doctorContact = sc.nextLine();
                    System.out.print("Is the doctor available (true/false): ");
                    boolean isAvailable = sc.nextBoolean();
                    
                    Doctor newDoctor = new Doctor(doctorId, doctorName, specialization, doctorContact, isAvailable);
                    hospital.addDoctor(newDoctor);
                    break;
                
                case 4:
                    // Remove Doctor
                    System.out.print("Enter Doctor ID to Remove: ");
                    String removeDoctorId = sc.nextLine();
                    try {
                        hospital.removeDoctor(removeDoctorId);
                    } catch (DoctorNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                
                case 5:
                    // Update Doctor Availability
                    System.out.print("Enter Doctor ID to Update Availability: ");
                    String updateDoctorId = sc.nextLine();
                    System.out.print("Enter New Availability (true/false): ");
                    boolean newAvailability = sc.nextBoolean();
                    try {
                        hospital.updateDoctorAvailability(updateDoctorId, newAvailability);
                    } catch (DoctorNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                
                case 6:
                    // Schedule Appointment
                    System.out.print("Enter Patient ID: ");
                    String appPatientId = sc.nextLine();
                    System.out.print("Enter Doctor ID: ");
                    String appDoctorId = sc.nextLine();
                    System.out.print("Enter Appointment Date (as long in milliseconds): ");
                    long dateMillis = sc.nextLong();
                    Date appointmentDate = new Date(dateMillis); // Convert milliseconds to Date
                    
                    try {
                        appointment.scheduleAppointment(appPatientId, appDoctorId, appointmentDate);
                    } catch (DoctorNotAvailableException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                
                case 7:
                    // Cancel Appointment
                    System.out.print("Enter Appointment ID to Cancel: ");
                    String appointmentId = sc.nextLine();
                    appointment.cancelAppointment(appointmentId);
                    break;
                
                case 8:
                    // Display All Patients
                    hospital.displayAllPatients();
                    break;
                
                case 9:
                    // Display All Doctors
                    hospital.displayAllDoctors();
                    break;
                
                case 10:
                    // Display Appointments by Doctor
                    System.out.print("Enter Doctor ID: ");
                    String appByDoctorId = sc.nextLine();
                    appointment.displayAppointmentsByDoctor(appByDoctorId);
                    break;
                
                case 11:
                    // Display Appointments by Patient
                    System.out.print("Enter Patient ID: ");
                    String appByPatientId = sc.nextLine();
                    appointment.displayAppointmentsByPatient(appByPatientId);
                    break;
                
                case 12:
                    // Exit
                    System.out.println("Exiting the system. Goodbye!");
                    sc.close();
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
