import java.util.concurrent.Callable;

public class SalesDataDml
{
    public static void main(String args[])
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Registered ..");


            }
        catch (Exception e){
            System.out.println(e);
        };
    }
}
