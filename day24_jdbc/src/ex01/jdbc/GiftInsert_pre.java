package ex01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GiftInsert_pre {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn = null;
//		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		
		Scanner sc = new Scanner(System.in);
		
//		1. 드라이브 로드
		Class.forName("oracle.jdbc.OracleDriver");
		
//		2. Connection & Open
		
		String url = "jdbc:oracle:thin:@kosaDB_high?TNS_ADMIN=D:/DB/Wallet_kosaDB";
		String uid = "donghun";
		String pwd = "!Dhfkzmf123456";
		
		conn = DriverManager.getConnection(url, uid, pwd);
		
//		3. 사용 (DML 명령) - insert
		ps = conn.prepareStatement("INSERT INTO GIFT VALUES(?, ?, ?, ?)"); // ? 쓰는걸 기억해라
		System.out.println("상품번호, 상품명, 최저가, 최고가를 입력하시오.");
		int gno = sc.nextInt();
		String gname = sc.next();
//		int g_s = sc.nextInt();
		int g_e = sc.nextInt();
		
		ps.setInt(1, gno);
		ps.setNString(2, gname);
		ps.setInt(3, sc.nextInt());
		ps.setInt(4, g_e);
		
		int result = ps.executeUpdate(); //
		
		System.out.println(result + "데이터 추가 성공");
		System.out.println(gname + "상품이 추가 되었습니다.");
		
// 		conn.commit();
		
//		4. 자원 반환 (닫기)
		ps.close();
		conn.close();
	}

}
