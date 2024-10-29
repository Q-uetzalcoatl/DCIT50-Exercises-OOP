// Class to store student information
class StudentInfo {
    String studNo;
    String firstName;
    String lastName;
    String course;

    // Constructor to initialize student information
    StudentInfo(String studNo, String firstName, String lastName, String course) {
        this.studNo = studNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
    }
}

// Class to interact with the user and display output
public class StudentApp {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter your Student Number: ");
        String studNo = scanner.nextLine();
        
        System.out.print("Enter your First name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Enter your Last name: ");
        String lastName = scanner.nextLine();
        
        System.out.print("Enter your Course: ");
        String course = scanner.nextLine();

        // Creating an instance of StudentInfo with user inputs
        StudentInfo student = new StudentInfo(studNo, firstName, lastName, course);

        // Display output
        System.out.println("Hello! " + student.firstName + " " + student.lastName + "!");
        System.out.println("You are a " + student.course + " student and your Student Number is " + student.studNo + ".");
        
        scanner.close();
    }
}
