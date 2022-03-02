package ex01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcTest {
    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testConnection() {
        try (Connection conn =
                     DriverManager.getConnection(
                             "jdbc:oracle:thin:@kosadb_high?TNS_ADMIN=C:/2_DB/Wallet_kosaDB",
                             "DONGHUN",
                             "!Dhfkzmf123456";
                     )) {
           System.out.println("connection success!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}