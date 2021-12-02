import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SalesDataDml {
    public static void main(String args[]) {
        DbOperations dbms = new DbOperations();
        String date ="2021-05-15";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date dt = null;
        try {
            dt = sdf.parse(date);
        } catch (Exception e) {
            System.out.println(e);
        }
        //OrderData od = new OrderData(3015,3000,dt,2010);
        //SalesData sd = new SalesData(1012,"john_kenov","nordic",200);
        //CustomerData cd = new CustomerData(2010,"samuel","thomas","stockholm",150,1011);
        //boolean result = dbms.insertSales(sd);
        boolean result1 = dbms.deleteSales(1001);
        //boolean result2 = dbms.insertCustomerOrder(cd);
        //boolean result3 = dbms.insertCustomerOrder2(od);

        //OrderData od1 = dbms.getCustomerId(2010);
        //od1.setAmount(3500);
        //od1.setCustomer_id(2010);
        //boolean result4 = dbms.updateOrderAmount(od1);
    }
}