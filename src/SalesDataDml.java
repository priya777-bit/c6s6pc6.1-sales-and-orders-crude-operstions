import java.sql.*;
import java.text.SimpleDateFormat;

public class SalesDataDml {
    public static void main(String args[]) {
        DbOperations dbms = new DbOperations();
        OrderData od = new OrderData();
        // sd.insertSales();
        //  sd.deleteSales();
        //sd.insertCustomerOrder();
        boolean result3 = dbms.insertCustomerOrder2(od);
    }
}