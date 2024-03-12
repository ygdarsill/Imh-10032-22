
package tomar;
import java.util.*;
abstract class shape
{
    abstract double perimeter();
    abstract double area();
}
class Circle extends shape
{ 
    private double radius;
    public Circle(double radius)
    {
        this.radius=radius;
    }
double perimeter()
{
    return (2*3.14*radius);
}
double area()
{
    return 3.14*radius*radius;
}
}
class rectangle extends shape
{ public double length;
  public double breadth;
  public rectangle(double length,double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
double perimeter()
{
    return 2*(length + breadth);
}
double area()
{
    return length*breadth;
}
}
        
public class prog3 
{
    public static void main(String[] args) 
    { Scanner sc = new Scanner (System.in);
    double r = sc.nextDouble();
    double l = sc.nextDouble();
    double b = sc.nextDouble();

        Circle cir = new Circle(r);
        System.out.println("area of circle " + cir.area() ); 
        System.out.println("perimeter of circle " + cir.perimeter());
        
        rectangle rec = new rectangle(l,b);
        System.out.println("area of rectangle " + rec.area());
        System.out.println("perimeter of rectangle " + rec.perimeter());
    }
}
