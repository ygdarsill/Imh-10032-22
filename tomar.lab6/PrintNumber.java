
package lab5;

public class PrintNumber 
{
    public void PrintNumber(Integer num)
    {
        int uxednum = num;
        System.out.println("Integer no:"+uxednum);
    }
     public void PrintNumber(double num)
    {
        double uxednum = num;
        System.out.println("Double no:"+uxednum);
    } 
     public void PrintNumber(Character ch)
    {
        char uxedch = ch;
        System.out.println("Character:"+uxedch);
    }
     public void PrintNumber(Boolean bool)
    {
        boolean uxedbool = bool;
        System.out.println("Boolean value:"+uxedbool);
    }
     public static void main(String[] args) 
     {
        PrintNumber print = new PrintNumber();
        Integer intnum = 123;
        Double doublenum = 2.7328;
        Character charch = 'a';
        Boolean boolval = true;
        
        print.PrintNumber(intnum);
        print.PrintNumber(doublenum);
        print.PrintNumber(charch);
        print.PrintNumber(boolval);
       
        
    }
}
