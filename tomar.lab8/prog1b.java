package tomar;
import jav
class outer
{
     void outerdisplay()
       {
        System.out.println ("inside of outer class");
       }
    static class inner
    {
       void innerdisplay()
       {
        System.out.println ("inside of inner class");
       }
    }
    inner insert = new inner();
    insert.innerdisplay();
}
public class prog1b
{
    public static void main(String[] args) 
    {
        outer out = new outer();
        out.outerdisplay();
    }
}
