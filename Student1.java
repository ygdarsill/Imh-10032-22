
package lab5;

import java.util.*;
public class Student1
{
    public  String student_name;
    public  int student_roll;
    public  int student_fee;
    
    Student1 (String student_name,int student_roll,int student_fee)
     {
         this.student_name = student_name;
         this.student_roll = student_roll;
         this.student_fee = student_fee; 
         
     }
    Student1()
    {
        this("tomar",10,2300);     
    }
    void show(Object obj)
    {
        display(this);
    }
     void display(Object obj)
     {
         System.out.println("student name " +this.student_name);
         System.out.println("student roll " +this.student_roll);
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
         Student1 s1 = new Student1(name,roll,fee);
         Student1 s2 = new Student1();
         s1.show(s1);
         s2.show(s2);
     }
}