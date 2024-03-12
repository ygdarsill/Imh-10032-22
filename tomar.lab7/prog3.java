import java.util.*;
class Rectangle
{
    double len,bre;
    double area;
    public  Rectangle()
    {
        len=1;
        bre=1;
    }
    public  Rectangle(double len,double bre)
    {
        this.len=len;
        this.bre=bre;
    }
    public double getArea()
    {   area=len*bre;
        return area;
    }
    
    
}
class Cuboid extends Rectangle
{
    double height,vol,arr;
    public  Cuboid()
    {
        height=1;
    }
    public Cuboid(double height,double len, double bre)
    {
        super(len,bre);
        this.height=height;   
    }
    public double Volume()
    {
        vol = height*len*bre;
        return vol;
    }
}
public class prog3
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter len bre and height");
        double l= sc.nextDouble();
        double b= sc.nextDouble();
        double h= sc.nextDouble();
        Cuboid cub1 = new Cuboid(h,l,b);
        System.out.println("volume of cuboid " + cub1.Volume());
        Cuboid cub = new Cuboid();
        System.out.println("volume of cuboid " + cub.Volume());
        
    }
    
}