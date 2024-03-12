
package tomar;
class outter
{
    static class inner
    {
       void display()
       {
        System.out.println ("inside of inner class");
       }
    }
}
public class prog1
{
    public static void main(String[] args) 
    { 
    
        outter.inner in = new outter.inner();
        in.display();
    }
}
