class base
{
    public void display()
    {
        System.out.println("base class");
    }
}
class derived extends base
{
    public void display()
    {
        System.out.println("in derived");
    }
    public void show()
    {
        System.out.println("inside show");
    }
}
public class prog5 
{ 
    public static void main(String[] args) 
    {
        base b1 = new base();
        b1.display();
        base b2 = new derived();
        b2.display();
        
    }
    
    
}
