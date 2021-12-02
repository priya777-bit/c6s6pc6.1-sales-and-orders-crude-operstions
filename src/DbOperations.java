import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

public class DbOperations
{
    public boolean insertSales (SalesData sd)
    {
        boolean result = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Registered ..");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sales_data", "root", "root");
            System.out.println("Connection Established..");

            String query = "insert into sales_person values(?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, sd.getSales_id());
            pst.setString(2, sd.getFirst_name());
            pst.setString(3, sd.getCity());
            pst.setInt(4, sd.getCommission_rate());

            int res = pst.executeUpdate();
            System.out.println("Result" + res);
            if (res == 1)
                result=true;
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return result;
    }

    public boolean deleteSales(int sales_id)
    {
        boolean result = false;

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Registered ..");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sales_data", "root", "root");
            System.out.println("Connection Established..");

            String query = "delete from sales_person where sales_id=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1,sales_id);
            int rs = pst.executeUpdate();
            if(rs==1)
            {
                result = true;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return result;
    }

    public boolean insertCustomerOrder(CustomerData cd)
    {
        boolean result = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Registered ..");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sales_data", "root", "root");
            System.out.println("Connection Established..");

            String query = "insert into customer values(?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1,cd.getCustomer_id() );
            pst.setString(2, cd.getName());
            pst.setString(3, cd.getLast_name());
            pst.setString(4, cd.getCity());
            pst.setInt(5, cd.getRating());
            pst.setInt(6, cd.getSales_id());

            int res = pst.executeUpdate();
            if (res == 1) {
               result = true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return result;
    }

    public boolean insertCustomerOrder2(OrderData od)
    {
        boolean result = true;

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Registered ..");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sales_data", "root", "root");
            System.out.println("Connection Established..");

            String date1 = "";
            java.util.Date date =;
            String query2 = "insert into order_details values(?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query2);
            pst.setInt(1, od.getOrder_id());
            pst.setInt(2, od.getAmount());
            pst.setDate(3, new java.sql.Date(new SimpleDateFormat("dd/MM/yyyy").parse(date1).getTime());
            pst.setInt(4, od.getCustomer_id());

            int res = pst.executeUpdate();
            if (res == 1) {
                result = true;
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return result;
    }
}
