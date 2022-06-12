package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MemberDAO {

	Connection con = null;
	Statement stmt;
	ResultSet rs = null;
	
	String sql = null;
	
	public MemberDAO() {
		
		String url = "jdbc:mariadb://localhost:3306/greem_db";
		String username = "jiwon_user";
		String password = "rlawldnjs12";
		
		try {
			// 1. DB driver 로딩
			Class.forName("org.mariadb.jdbc.Driver");
			
			// 2. connection
			Connection con = DriverManager.getConnection(url, username, password);
			
			stmt = con.createStatement();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	public ArrayList<MemberDTO> list(){
		ArrayList<MemberDTO> res = new ArrayList<MemberDTO>();
		sql = "select * from member";
		
		 try {
			rs = stmt.executeQuery(sql);
			
			//5. 결과 실행
			while(rs.next()) { 
			//System.out.println(rs.getString("name")); 
			MemberDTO  dto = new MemberDTO();
			dto.id = rs.getInt("id");
			dto.birth = rs.getTimestamp("birth");
			dto.tell = rs.getString("tell");
			dto.height = rs.getDouble("height");
			dto.reg_date = rs.getTimestamp("reg_date");
			dto.name = rs.getString("name");
			dto.friend = rs.getInt("friend");
			res.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
	
		
		return res;
	}
	
	
	public MemberDTO detail(int id) {
		MemberDTO res = null;
		
		sql = "select * from member where id = " + id;
		
		 try {
			rs = stmt.executeQuery(sql);
			
			//5. 결과 실행
		if(rs.next()) { 

			res = new MemberDTO();
			res.id = rs.getInt("id");
			res.birth = rs.getTimestamp("birth");
			res.tell = rs.getString("tell");
			res.height = rs.getDouble("height");
			res.reg_date = rs.getTimestamp("reg_date");
			res.name = rs.getString("name");
			res.friend = rs.getInt("friend");
		
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
	
		
		return res;
	}
	
	
	public int write(MemberDTO dto) {
		int res = 0;
		
		sql = "insert into member (id, name, birth, tell, height, reg_date, friend)"
				+ "values( " 
				+dto.id+",'"
				+dto.name+"','"
				+dto.getBirthStr()+"','"
				+dto.tell+"',"
				+dto.height+",sysdate(,"
				+dto.friend+") ";
				
		
		 try {
			 
			 res = stmt.executeUpdate(sql); 
			 // 실행된 갯수
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
	
		
		return res;
	}
	
	
	public int modify(MemberDTO dto) {
		int res = 0;
		
		sql = "update member set name = '"
				+ dto.name+"', birth = '"
				+dto.getBirthStr()+"', tell ='"
				+dto.tell+"', height ="
				+dto.height+", friend = "
				+dto.friend+ " where id = "
			    +dto.id ;
				
		
		 try {
			 
			 res = stmt.executeUpdate(sql); 
			 // 실행된 갯수
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
	
		
		return res;
	}
	
	public int delete(int id) {
		int res = 0;
		
		sql = "delete from member where id = "+id;
		
		System.out.println(sql);
		 try {
			 
			 res = stmt.executeUpdate(sql); 
			 // 실행된 갯수
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}

		 
		 
		return res;
	}
	
	void close() {
		// 6. 실행객체 해제
		if(rs!=null) try {rs.close(); } catch (SQLException e) {}
		if(stmt!=null) try {stmt.close(); } catch (SQLException e) {}
		if(con!=null) try {con.close(); } catch (SQLException e) {}
	}
	
	
}