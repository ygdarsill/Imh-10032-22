package lab5;

import java.util.*;
public class student 
{
    public  String student_name;
    public  int student_roll;
    public  int student_fee;
    
    student (String student_name,int student_roll,int student_fee)
     {
         this.student_name = student_name;
         this.student_roll = student_roll;
         this.student_fee = student_fee; 
         
     }
     void display()
     {
         System.out.println("student name" +this.student_name);
         System.out.println("student roll" +this.student_roll);
         System.out.println("student fee " +this.student_fee);
     }
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);
         System.out.println("name");
         String name = sc.next();
         System.out.println("roll");
         int roll = sc.nextInt();
         System.out.println("fees");
         int fee = sc.nextInt();
         student myobj = new student(name,roll,fee);
         student s1 = new student(name,roll,fee);
         myobj.display();
         s1.display();
                 
    }
}
