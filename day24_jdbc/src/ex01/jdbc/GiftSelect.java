package ex01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftSelect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
//		1. 드라이브 로드
		Class.forName("oracle.jdbc.OracleDriver");
//		System.out.println("driver load success!!"); // 성공했으니 일단 주석
		
//		2. Connection & Open
					// driver:@IP:portNumber:SID
//		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String url = "jdbc:oracle:thin:@kosaDB_high?TNS_ADMIN=D:/DB/Wallet_kosaDB";
		String uid = "donghun";
		String pwd = "!Dhfkzmf123456";
		
		conn = DriverManager.getConnection(url, uid, pwd);
//		System.out.println("connection success!!"); // 성공했으니 일단 주석
		
//		3. 사용 (DML 명령)
		stmt = conn.createStatement(); // Statement / PreaparedStatement Interface
		rs = stmt.executeQuery("SELECT * FROM GIFT"); // Ctrl + Shift + X = 대문자로
		// excuteQuery(): 반환값이 있는 경우 - select
		// excuteUpdate(): 반환값이 없는 경우 - insert/update/delete
		
		System.out.println("상품번호\t상품명\t\t최저가\t\t최고가");
		
		while (rs.next()) { // 훑을 튜플을 내려가는 구문
			int gno = rs.getInt(1); // getXXX 자료형
			String gname = rs.getNString("gname"); // 필드 명으로 갖고오는 것을 권장 --> get자료형("필드명"); 권장함
			int g_s = rs.getInt(3);
			int g_e = rs.getInt(4);
			
			System.out.println(gno+"\t"+gname+"\t\t"+g_s+"\t\t"+g_e);
		}
		
//		4. 자원 반환 (닫기)
		stmt.close();
		conn.close();
	}

}
