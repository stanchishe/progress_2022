import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class whileLoopSQL {
    public static void main(String... args) throws Exception {

        Connection con = null;
        while (con == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/sample", "root", "pass");
            } catch (Exception e) {
                System.out.println("Connection refused. Retrying in 5 seconds ...");
                Thread.sleep(5000);
            }
        }
        // con != null, do something
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from test");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + "    " + rs.getString(2));
        }
        con.close();
    }
}