class Employee {
    String name;
    int hoursWorked;
    double hourlyRate;

    // Constructor to initialize employee details
    Employee(String name, int hoursWorked) {
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = 150.0;
    }

    // Method to calculate and print salary
    void printSalary() {
        double salary = hoursWorked * hourlyRate;
        System.out.println("Employee name: " + name);
        System.out.println("Hours worked: " + hoursWorked + " hours");
        System.out.println("Total Salary: PHP " + salary);
    }
}

public class EmployeeApp {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Hours worked: ");
        int hoursWorked = scanner.nextInt();

        // Creating an Employee object and printing salary
        Employee employee = new Employee(name, hoursWorked);
        employee.printSalary();
        
        scanner.close();
    }
}
