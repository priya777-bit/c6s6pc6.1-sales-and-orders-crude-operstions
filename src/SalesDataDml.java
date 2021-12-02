import java.sql.*;
import java.text.SimpleDateFormat;

public class SalesDataDml {
    public static void main(String args[]) {
        SalesDataDml sd = new SalesDataDml();
        sd.insertSales();
        sd.deleteSales();
        sd.insertCustomerOrder();
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

    public void insertCustomerOrder()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Registered ..");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sales_data", "root", "root");
            System.out.println("Connection Established..");

            String query = "insert into customer values(?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, 2008);
            pst.setString(2, "samuel");
            pst.setString(3, "thomas");
            pst.setString(4, "stockholm");
            pst.setInt(5, 150);
            pst.setInt(6, 1010);

            int res = pst.executeUpdate();
            if (res == 0) {
                System.out.println("Customer Record Not Inserted..");
            } else {
                System.out.println("Customer Record Inserted");
            }

            String date1 = "15/05/2021";
            //java.util.Date date = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
            String query2 = "insert into order_details values(?,?,?,?)";
            PreparedStatement pst2 = con.prepareStatement(query2);
            pst2.setInt(1, 3012);
            pst2.setInt(2, 3000);
            pst2.setDate(3, new java.sql.Date(new SimpleDateFormat("dd/MM/yyyy").parse(date1).getTime()));
            pst2.setInt(4, 2008);

            int res2 = pst2.executeUpdate();
            if (res2 == 0) {
                System.out.println("No Record Inserted In Order Details..");
            } else {
                System.out.println("Record Inserted In Order Details..");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}