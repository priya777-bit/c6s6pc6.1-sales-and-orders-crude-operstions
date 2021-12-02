import java.sql.*;
import java.text.SimpleDateFormat;

public class SalesDataDml {
    public static void main(String args[]) {
        DbOperations dbms = new DbOperations();
        // sd.insertSales();
        //  sd.deleteSales();
        //sd.insertCustomerOrder();
        dbms.insertCustomerOrder2();
    }
}