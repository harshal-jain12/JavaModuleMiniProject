package javabypritimam;
import java.util.Scanner;

public class LoanEligibility {
 public static void main(String[] args) {
    
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter your age: ");
     int age = scanner.nextInt();

    
     System.out.print("Enter your annual income (in dollars): ");
     double income = scanner.nextDouble();

    
     if (age >= 18 && age <= 60 && income > 25000) {
         System.out.println("You are eligible for a loan.");
     } else {
         System.out.println("You are not eligible for a loan.");
     }

     scanner.close();
 }
}
