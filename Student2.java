package lab5;
import java.util.*;
public class Student2
{
    public  String student_name;
    public  int student_roll;
    public  int student_fee;
    
    Student2 (String student_name,int student_roll,int student_fee)
     {
         this.student_name = student_name;
         this.student_roll = student_roll;
         this.student_fee = student_fee; 
         
     }
    Student2()
    {
        Scanner sc = new Scanner(System.in);
         String namee = sc.next();
         int rollno = sc.nextInt();
         int fees = sc.nextInt();
         this.namee = namee;
         this.rollno = rollno;
         this.fees = fees; 
         return this;
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
         String name = sc.next();
         int roll = sc.nextInt();
         int fee = sc.nextInt();
         Student2 s1 = new Student2(name,roll,fee);
         Student2 s2 = new Student2();
         s1.show(s1);
         s2.show(s2);
     }
}
