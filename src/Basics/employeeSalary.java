package Basics;
//Q17. Employee Salary System
//Create an Employee class with:
//id
//name
//basicSalary
//Methods:
//calculateHRA()
//calculateDA()
//calculateGrossSalary()
class Employee{
    public int id;
    public String name;
    public int basicSalary;

    Employee(int id, String name, int basicSalary){
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }
    public double calculateHRA(){
        return basicSalary*0.20;
    }
    public double calculateDA(){
        return basicSalary*0.10;
    }
    public double calculateGrossSalary(){
        return basicSalary+calculateHRA()+calculateDA();
    }
    public void displayDetails(){
        System.out.println("Employee ID: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Basic Salary: "+basicSalary);
        System.out.println("HRA: "+calculateHRA());
        System.out.println("DA: "+calculateDA());
        System.out.println("Gross Salary: "+calculateGrossSalary());
    }

}
public class employeeSalary {
    public static void main(String[] args) {
        Employee e1 = new Employee(101,"XYZ",50000);
        e1.displayDetails();

    }
}
