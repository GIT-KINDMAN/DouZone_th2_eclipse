package ex01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GiftInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		
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
		
//		3. 사용 (DML 명령) - insert
		stmt = conn.createStatement();
		// INSERT INTO GIFT VALUES(11,'컵',10,200);
//		String sql = "INSERT INTO GIFT VALUES(12,'USB',100,2000)";
//		String sql = "INSERT INTO GIFT VALUES("+args[0]+",'"+args[1]+"',"+args[2]+","+args[3]+")"; // 정상 실행 성공
		System.out.println("상품번호, 상품명, 최저가, 최고가를 입력하시오.");
		int gno = sc.nextInt();
		String sql = "INSERT INTO GIFT VALUES("+gno+",'"+sc.next()+"',"+sc.next()+","+sc.next()+")"; // 정상 실행 성공
		
//		stmt.executeUpdate(sql); 
		
		int result = stmt.executeUpdate(sql); // 결과가 몇개인지 보여주기 위함
		System.out.println(result + "데이터 추가 성공");
		
		conn.commit();
		
//		4. 자원 반환 (닫기)
		stmt.close();
		conn.close();
	}

}
