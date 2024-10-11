package javafirststart;

import java.util.Scanner;

class Employee {
    String name;
    int age;
    double salary;

    // Constructor to initialize the object
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Method to display employee details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Salary: " + salary);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many employees they want to enter
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();

        // Array to hold employee objects
        Employee[] employees = new Employee[n];

        // Loop to get employee details from the user
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Enter name: ");
            String name = scanner.next(); // Read name

            System.out.print("Enter age: ");
            int age = scanner.nextInt(); // Read age

            System.out.print("Enter salary: ");
            double salary = scanner.nextDouble(); // Read salary

            // Create a new Employee object and store it in the array
            employees[i] = new Employee(name, age, salary);
        }

        // Display all employee details
        System.out.println("\nEmployee details entered:");
        for (Employee employee : employees) {
            employee.display();
        }

        scanner.close();
    }
}


