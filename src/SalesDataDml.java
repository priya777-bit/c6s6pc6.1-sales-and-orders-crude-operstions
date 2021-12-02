import java.sql.*;
import java.util.concurrent.Callable;

public class SalesDataDml {
    public static void main(String args[]) {
        SalesDataDml sd = new SalesDataDml();
        sd.insertSales();
        sd.deleteSales();
    }
    public void insertSales ()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Registered ..");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sales_data", "root", "root");
            System.out.println("Connection Established..");

            String query = "insert into sales_person values(?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, 1010);
            pst.setString(2, "john_kenov");
            pst.setString(3, "Nordic");
            pst.setInt(4, 200);

            int res = pst.executeUpdate();
            System.out.println("Result" + res);
            if (res == 0)
                System.out.println("No Record Inserted");
            else
                System.out.println("Records Inserted");

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public void deleteSales()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Registered ..");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sales_data", "root", "root");
            System.out.println("Connection Established..");

            String first_name="axel_rod";
            String query = "delete from sales_person where first_name=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1,first_name);
            int rs = pst.executeUpdate();
            if(rs==0)
            {
                System.out.println("Record Not Deleted");
            }
            else
            {
                System.out.println("Record Deleted");
            }

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public
}