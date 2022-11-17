import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class doWhileLoopSQL {
    public static final int MAX_TRIES = 3;

    public static void main(String... args) throws Exception {

        int cntTries = 0;
        Connection con = null;
        do {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/sample", "root", "pass");
            } catch (Exception e) {
                ++cntTries;
                System.out.println("Connection refused. Retrying in 5 seconds ...");
                Thread.sleep(5000);
            }
        } while  (con == null && cntTries < MAX_TRIES);
        if (con != null) {
            // con != null, do something
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from test");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "    " + rs.getString(2));
            }
            con.close();
        } else {
            System.out.println("Could not connect!");
        }
    }
}