package jdbc_p;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class MemberListMain {

	public static void main(String[] args) {
		try {
			// 1.DB driver 로딩
			Class.forName("org.mariadb.jdbc.Driver");
			
			// 2. connection
			Connection con = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/greem_db",  // url
					"jiwon_user",							   // 계정
					"rlawldnjs12"							   // 암호
					);
			
			//3. sql 구문 실행 객체
			Statement stmt = con.createStatement();
			
			//4. sql 실행 결과 객체
			ResultSet rs = stmt.executeQuery("select * from member");
			
			//5. 결과 실행
			while(rs.next()) { // rs.next() --> 실행결과를 record 단위로 한행씩 커서가 너어간다.
				System.out.println(rs.getString("name")); // 자료형에 맞춰 컬럼의 값을 가져온다.
			}
					
		
			// 6. 실행객체 해제
			rs.close();
			stmt.close();
			
			// 7. 연결객체 해제
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
