package jdbc_p;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class MemberListMain {

	public static void main(String[] args) {
		try {
			// 1.DB driver �ε�
			Class.forName("org.mariadb.jdbc.Driver");
			
			// 2. connection
			Connection con = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/greem_db",  // url
					"jiwon_user",							   // ����
					"rlawldnjs12"							   // ��ȣ
					);
			
			//3. sql ���� ���� ��ü
			Statement stmt = con.createStatement();
			
			//4. sql ���� ��� ��ü
			ResultSet rs = stmt.executeQuery("select * from member");
			
			//5. ��� ����
			while(rs.next()) { // rs.next() --> �������� record ������ ���྿ Ŀ���� �ʾ��.
				System.out.println(rs.getString("name")); // �ڷ����� ���� �÷��� ���� �����´�.
			}
					
		
			// 6. ���ఴü ����
			rs.close();
			stmt.close();
			
			// 7. ���ᰴü ����
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
