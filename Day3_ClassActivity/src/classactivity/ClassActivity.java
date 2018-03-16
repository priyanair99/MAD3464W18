/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classactivity;

import java.util.Scanner;

/**
 *
 * @author Anoops PC
 */
public class ClassActivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    
        Person p1 = new Person();
        p1.readData();
        p1.displayData();
       Employee e1 = new Employee();
       e1.readData();
       e1.displayData();
       faculty f1 = new faculty();
       f1.readData();
       f1.displayData();
 }
    
}

 interface personInformation {  // interface for person information.
 String name = "priya";
 int age = 23;
   void readData();
   void displayData();
     
}
class Person implements personInformation { // Person class implementing personInformation interface.
   
    @Override 
       public  void readData() 
       {
           
           System.out.println("INSIDE PERSON");
          System.out.println("Name of the person is: " + name);
         System.out.println("Age of person is : " + age);
         System.out.println("-----------------");
       }
    @Override 
    public void displayData() 
    {
         System.out.println("Name of the person is: " + name);
         System.out.println("Age of person is : " + age);
         System.out.println("-----------------");
    }
  
 }

interface employeeInformation extends personInformation  // interface name employeeInformation extending personInformation.
{
    String type = "part/Fulltime";
    double salary = 1200;
    void readData();
   void displayData();
    
}

class Employee implements employeeInformation{ // Class Employee inheriting Person class and implementing employeeInformation.
    
    @Override 
    public void readData() {
        System.out.println("INSIDE Employee");
          System.out.println("Work type of the person is: " + type);
         System.out.println("Salary of person is : " + salary);
        System.out.println("-----------------");
        
}
    @Override 
    public void displayData() {
        System.out.println("Work type of the person is: " + type);
         System.out.println("Salary of person is : " + salary);
        System.out.println("-----------------");
 }
    
    }

class faculty extends Employee  // faculty class inheriting person and implementing person interfaces.
{
    
    String course;
    
    @Override 
            public void readData() {
                System.out.println("INSIDE Faculty");
           System.out.println("Enter Course name" );
           Scanner input = new Scanner(System.in);
          course = input.nextLine();
                }
            @Override
            public void displayData() {
                System.out.println("Name of person: " + name);
                System.out.println("Age of person: " + age);
                System.out.println("Work type of  person: "+ type);
                System.out.println("Salary of  person: "+ salary);
                System.out.println("Course taken: " + course);
                System.out.println("-----------------");
            }
  
}
