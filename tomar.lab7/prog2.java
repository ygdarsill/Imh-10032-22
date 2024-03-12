import java.util.*;
class Circle
{
    double radius;
    public Circle( double radius)
    {
        this.radius = radius;
    }
    public double Area()
    {
        return 3.14*radius*radius;
    }
    public double circumference()
    {
     return 2*radius*3.14;   
    }
}
class Cylinder extends Circle
        
{
    double height,crossarea ;
    public Cylinder(double radius, double height)
    {
        super(radius);
        this.height=height;   
    }
    public double volume()
    {
        crossarea = Area();
        return crossarea*height;
    }
}
public class prog2
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter radius and height");
        double r= sc.nextDouble();
        double h= sc.nextDouble();
        Cylinder cyl = new Cylinder(r,h);
        System.out.println("area of rectagle " + cyl.volume());
        Circle cir = new Circle (r);
        System.out.println("area of circle " + cir.Area());
    }
}
