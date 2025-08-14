package Practice.logicbuilding.Oops_BasedProjects.StudentManagment;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
     static ArrayList<Student> students = new ArrayList<>();
     static Scanner sc = new Scanner(System.in);
    // Add Student
    public static void addStudent() {
        System.out.print("Enter Student ID: ");
        String id = sc.next();
        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        students.add(new Student(name, age, id));
        System.out.println("Student Added Successfully!");
    }

    // View Students
    public static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    // Remove Student
    public static void removeStudent() {
        System.out.print("Enter Student ID to remove: ");
        String id = sc.next();
        boolean removed = students.removeIf(s -> s.getId().equals(id));
        if (removed) {
            System.out.println("Student Removed Successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Remove Student");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewStudents();
                case 3 -> removeStudent();
                case 4 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }
}

