
package tomar;

abstract class phone
{
   abstract void call();
   abstract void sms(); 
}
interface camera
{
    public void click();
    public void record();
}
interface musicplayer
{
    public void play();
    public void pause();
    public void record();
           
}
class smartphone extends phone implements camera,musicplayer
{
   void call()
   {
       System.out.println("on call");
   }
   void sms()
   {
       System.out.println("sending sms");
   }
   @Override
 public  void click()
   {
       System.out.println("clicks photos");
       
   }
 @Override
 public void record()
   {
       System.out.println("records videos");
   }
   public void play()
   {
       System.out.println("plays music");
   }
   public void pause()
   {
       System.out.println("pauses music");
   }
   public void stop()
   {
       System.out.println("stops app from making any further comments");
   }
   
}
public class prog6
{
    public static void main(String[] args) {
        smartphone sp = new smartphone();
        sp.call();
        sp.sms();
        sp.click();
        sp.record();
        sp.pause();
        sp.play();
        sp.stop();
    }
    
}
