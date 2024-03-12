import java.util.*;
class shape
{
    public double getArea()
    {
        return 0;
    }
}
class rectangle extends shape
{
    double len,bre;
    double area;
    public  rectangle(double len,double bre)
    {
        this.len=len;
        this.bre=bre;
    }
    public double getArea()
    {   area=len*bre;
        return area;
    }
    
    
}
class box extends rectangle
{
    double height,surfarea;
    public box(double len,double bre, double height)
    {
        super(len,bre);
        this.height=height;   
    }
    public double getArea()
    {
        surfarea = 2*(len*bre + bre*height + height*len);
        return surfarea;
    }
}
public class prog1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter len bre and height");
        double l= sc.nextDouble();
        double b= sc.nextDouble();
        double h= sc.nextDouble();
        rectangle rec = new rectangle(l,b);
        System.out.println("area of rectagle " + rec.getArea());
        box bo = new box (l,b,h);
        System.out.println("surface area of box " + bo.getArea());
    }
    
}
