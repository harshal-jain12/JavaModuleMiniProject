package javabypritimam;

import java.util.Scanner;

public class JobApplicationEligibility {
 public static void main(String[] args) {
   
     Scanner scanner = new Scanner(System.in);

     System.out.print("Do you have a bachelor's degree or equivalent experience? (yes/no): ");
     String hasQualification = scanner.next();

     System.out.print("Do you have a clean criminal record? (yes/no): ");
     String hasCleanRecord = scanner.next();

     
     if ((hasQualification.equalsIgnoreCase("yes")) && (hasCleanRecord.equalsIgnoreCase("yes"))) {
         System.out.println("You are eligible for the job.");
     } else {
         System.out.println("You are not eligible for the job.");
     }

     scanner.close();
 }
}

