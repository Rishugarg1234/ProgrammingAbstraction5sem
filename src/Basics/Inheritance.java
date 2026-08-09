package Basics;
//Q18. Inheritance
//Create:
//Person
//Student
//Student should inherit Person and additionally store:
//Roll Number
//Course
//Display complete student details.
class person{
    public String name;
    public int age;

    person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
class student extends person{
    public int rollNumber;
    public String course;
    student(String name, int age, int rollNumber, String course){
        super(name,age);
        this.rollNumber = rollNumber;
        this.course = course;
    }
    void display_details(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("RollNumber: "+rollNumber);
        System.out.println("Course: "+course);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        student s = new student("XYZ",18, 11,"Computer Science");
        s.display_details();
    }
}
