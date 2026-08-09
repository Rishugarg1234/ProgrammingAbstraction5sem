package Basics;
//Q15. Student Management System
//Create a Student class with:
//id
//name
//course
//marks
//Create methods:
//inputDetails()
//displayDetails()
//calculateGrade()
import java.util.Scanner;

class Student {
    int id;
    String name;
    String course;
    int marks;

    // Input student details
    public void inputDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        id = sc.nextInt();

        sc.nextLine(); // consume newline

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Course: ");
        course = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks = sc.nextInt();
    }

    // Calculate grade
    public char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else if (marks >= 50) {
            return 'E';
        } else {
            return 'F';
        }
    }

    // Display student details
    public void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.inputDetails();
        s1.displayDetails();
    }
}

