package javabypritimam;

import java.util.Scanner;

public class WeatherConditions {
 public static void main(String[] args) {
    
     Scanner scanner = new Scanner(System.in);

    
     System.out.print("Enter the current temperature (°C): ");
     int temperature = scanner.nextInt();

     System.out.print("Is it raining? (yes/no): ");
     String isRaining = scanner.next();

     if (temperature >= 20 && temperature <= 30 && !isRaining.equalsIgnoreCase("yes")) {
         System.out.println("It is safe to go outside.");
     } else {
         System.out.println("It is not safe to go outside.");
     }

     scanner.close();
 }
}

