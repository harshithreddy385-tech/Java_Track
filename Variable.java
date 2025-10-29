//Variable: A variable is a container that holds data that can be changed during program execution.
//1. Primitive data type:It  stores the actual value e.g; int, float, char, boolean
//2.Reference data type: It stores the address of the value e.g., Arrays, Classes, Interfaces
//Steps to declare a variable
//declare a variable and assign a value to it
public class Variable {
    public static void main(String[] args) {
        //declaring variables
        int age = 10; // integer variable
        float price = 20.5f; // float variable
        String number = "Ten"; // String variable

        //printing variables
        System.out.println("Integer: " + age);
        System.out.println("Float: " + price + " /-");
        System.out.println("String: " + number + " Chocolates");

        String name = "Harshith";
        int age1 = 20;
        double gpa = 8.5;

        System.out.println(name +" of age "+ age1 + " has a GPA of " + gpa);
        
        


    }

}