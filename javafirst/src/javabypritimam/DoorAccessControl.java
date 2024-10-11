package javabypritimam;
import java.util.Scanner;

public class DoorAccessControl {
 public static void main(String[] args) {
    
     Scanner scanner = new Scanner(System.in);

    
     System.out.print("Do you have a valid ID? (yes/no): ");
     String hasID = scanner.next();

     
     System.out.print("Do you have a valid access card? (yes/no): ");
     String hasAccessCard = scanner.next();

    
     System.out.print("Are you an admin? (yes/no): ");
     String isAdmin = scanner.next();

   
     if ((hasID.equalsIgnoreCase("yes") && hasAccessCard.equalsIgnoreCase("yes")) || isAdmin.equalsIgnoreCase("yes")) {
         System.out.println("Access granted.");
     } else {
         System.out.println("Access denied.");
     }

    
     scanner.close();
 }
}

