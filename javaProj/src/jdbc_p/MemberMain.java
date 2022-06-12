package jdbc_p;

import java.util.ArrayList;

import model.MemberDAO;
import model.MemberDTO;

public class MemberMain {

	public static void main(String[] args) {
		//MemberDAO dao = new MemberDAO();
		
		/*
		ArrayList<MemberDTO> res = dao.list();
		
		for (MemberDTO dto : res) {
			System.out.println(dto);
			
		}*/
	
		
		System.out.println("1. list-----------------");
		for (MemberDTO dto : new MemberDAO().list()) {
			System.out.println(dto);
		}
		System.out.println("2. detail-----------------");
		
		System.out.println(new MemberDAO().detail(13));  // 13번 송한솔의 정보가 출력
		System.out.println(new MemberDAO().detail(100)); // 없는 번호를 넣으면 null값 출력
	
		System.out.println("3. write-----------------");
		MemberDTO dto = new MemberDTO(25,"송두솔","2003-05-06","74125",182.3,8);
		//dto.setId(25);
		//System.out.println(new MemberDAO().write(dto));
		
		System.out.println("4. modify-----------------");
		dto = new MemberDTO(25,"송송송","2022-05-06","85236",147.3,7);
		System.out.println(new MemberDAO().modify(dto));
		
		System.out.println("5. delete-----------------");
		System.out.println(new MemberDAO().delete(13)); //13 번이 사라짐
	}

}
