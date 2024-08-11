import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

// 
// Decompiled by Procyon v0.5.36
// 

public class ExampleQuery
{
    private static String url;
    
    static {
        ExampleQuery.url = "jdbc:unity://test/xspec/UnityDemo.xml";
    }
    
    public static void main(final String[] args) {
        Connection con = null;
        Statement stmt = null;
        try {
            System.out.println("\nRegistering driver.");
            Class.forName("unity.jdbc.UnityDriver");
            System.out.println("\nGetting connection:  " + ExampleQuery.url);
            con = DriverManager.getConnection(ExampleQuery.url);
            System.out.println("\nConnection successful for " + ExampleQuery.url);
            System.out.println("\nCreating statement.");
            stmt = con.createStatement();
            final String sql = "SELECT PartDB.Part.P_NAME, OrderDB.LineItem.L_QUANTITY, OrderDB.Customer.C_Name, PartDB.Supplier.s_name  FROM OrderDB.CUSTOMER, OrderDB.LINEITEM, OrderDB.ORDERS, PartDB.PART, PartDB.Supplier  WHERE OrderDB.LINEITEM.L_PARTKEY = PartDB.PART.P_PARTKEY AND OrderDB.LINEITEM.L_ORDERKEY = OrderDB.ORDERS.O_ORDERKEY  AND OrderDB.ORDERS.O_CUSTKEY = OrderDB.CUSTOMER.C_CUSTKEY and PartDB.supplier.s_suppkey = OrderDB.lineitem.l_suppkey  AND OrderDB.Customer.C_Name = 'Customer#000000025';";
            System.out.println("\nExecuting query: \nSELECT PartDB.Part.P_NAME, OrderDB.LineItem.L_QUANTITY, OrderDB.Customer.C_Name, PartDB.Supplier.s_name  FROM OrderDB.CUSTOMER, OrderDB.LINEITEM, OrderDB.ORDERS, PartDB.PART, PartDB.Supplier  WHERE OrderDB.LINEITEM.L_PARTKEY = PartDB.PART.P_PARTKEY AND OrderDB.LINEITEM.L_ORDERKEY = OrderDB.ORDERS.O_ORDERKEY  AND OrderDB.ORDERS.O_CUSTKEY = OrderDB.CUSTOMER.C_CUSTKEY and PartDB.supplier.s_suppkey = OrderDB.lineitem.l_suppkey  AND OrderDB.Customer.C_Name = 'Customer#000000025';");
            final ResultSet rst = stmt.executeQuery("SELECT PartDB.Part.P_NAME, OrderDB.LineItem.L_QUANTITY, OrderDB.Customer.C_Name, PartDB.Supplier.s_name  FROM OrderDB.CUSTOMER, OrderDB.LINEITEM, OrderDB.ORDERS, PartDB.PART, PartDB.Supplier  WHERE OrderDB.LINEITEM.L_PARTKEY = PartDB.PART.P_PARTKEY AND OrderDB.LINEITEM.L_ORDERKEY = OrderDB.ORDERS.O_ORDERKEY  AND OrderDB.ORDERS.O_CUSTKEY = OrderDB.CUSTOMER.C_CUSTKEY and PartDB.supplier.s_suppkey = OrderDB.lineitem.l_suppkey  AND OrderDB.Customer.C_Name = 'Customer#000000025';");
            System.out.println("\n\nTHE RESULTS:");
            int i = 0;
            final long timeStart = System.currentTimeMillis();
            final ResultSetMetaData meta = rst.getMetaData();
            System.out.println("Total columns: " + meta.getColumnCount());
            System.out.print(meta.getColumnName(1));
            for (int j = 2; j <= meta.getColumnCount(); ++j) {
                System.out.print(", " + meta.getColumnName(j));
            }
            System.out.println();
            while (rst.next()) {
                System.out.print(rst.getObject(1));
                for (int j = 2; j <= meta.getColumnCount(); ++j) {
                    System.out.print(", " + rst.getObject(j));
                }
                System.out.println();
                ++i;
            }
            final long timeEnd = System.currentTimeMillis();
            System.out.println("Query took: " + (timeEnd - timeStart) / 1000L + " seconds");
            System.out.println("Number of results printed: " + i);
            stmt.close();
            rst.close();
            System.out.println("\nOPERATION COMPLETED SUCCESSFULLY!");
        }
        catch (Exception ex) {
            System.out.println("Exception: " + ex);
            if (con != null) {
                try {
                    con.close();
                }
                catch (SQLException ex2) {
                    System.out.println("SQLException: " + ex2);
                }
            }
            return;
        }
        finally {
            if (con != null) {
                try {
                    con.close();
                }
                catch (SQLException ex3) {
                    System.out.println("SQLException: " + ex3);
                }
            }
        }
        if (con != null) {
            try {
                con.close();
            }
            catch (SQLException ex3) {
                System.out.println("SQLException: " + ex3);
            }
        }
        if (con != null) {
            try {
                con.close();
            }
            catch (SQLException ex4) {
                System.out.println("SQLException: " + ex4);
            }
        }
    }
}
