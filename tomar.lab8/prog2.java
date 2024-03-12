
package tomar;
abstract class bike
{
  abstract void  run();
}
class honda extends bike
{
    void run()
    {
        System.out.println("max speed 100 kmph");
        
    }
}
public class prog2
{
    public static void main(String[] args)
    {
       bike vroom = new honda();
       vroom.run();
    }
}
