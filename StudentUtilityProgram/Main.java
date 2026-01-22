public class Main {
    public static void main(String[] args) {

        // Create a Student object
        Student student = new Student();

        // Set student details
        student.setDetails("John Doe", 20, 85.5);

        // Call methods and display results
        System.out.println("Student Name: " + student.getName());
        student.displayInfo();
    }
}
