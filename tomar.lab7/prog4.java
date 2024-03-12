class office
{
    public void message()
    {
        System.out.println(" he work at bane  ");
    }
}
class employee extends office
{
    public void message()
    {
        System.out.println(" emloyee name is aditya ");
    }
    public void show()
    {
        message();
        super.message();
    }
}
public class prog4 
{
    public static void main(String[] args) 
    {
    employee  emp = new employee();
    emp.show();
    
}
}
