package lab5;

public class integer 
{
    private int value;
    public integer (int value)
    {
        this.value=value;
        
    }
    public int getvalue ()
    {
        return value;
    }
    public void setvalue (int value)
    {
       this.value = value;
    }
    public void disp()
    {
        System.out.println("wrapped integer value "+ value);
    }
    public static void main(String[] args) 
    {
        integer in = new integer (14);
        in.disp();
    }
