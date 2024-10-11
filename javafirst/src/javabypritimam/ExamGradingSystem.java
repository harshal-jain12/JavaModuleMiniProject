package javabypritimam;
import java.util.Scanner;

public class ExamGradingSystem {
 public static void main(String[] args) {
     
     Scanner scanner = new Scanner(System.in);

   
     System.out.print("Enter the score for subject 1: ");
     int subject1 = scanner.nextInt();

     System.out.print("Enter the score for subject 2: ");
     int subject2 = scanner.nextInt();

     System.out.print("Enter the score for subject 3: ");
     int subject3 = scanner.nextInt();

     
     double average = (subject1 + subject2 + subject3) / 3.0;

  
     if (average >= 60 && subject1 >= 40 && subject2 >= 40 && subject3 >= 40) {
         System.out.println("The student passes the exam.");
     } else {
         System.out.println("The student fails the exam.");
     }

   
     scanner.close();
 }
}
