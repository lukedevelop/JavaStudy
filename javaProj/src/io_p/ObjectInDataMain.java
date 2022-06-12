package io_p;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import io_obj.ObjEx;


public class ObjectInDataMain {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("fff/ooData.zzz");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		while(fis.available()>0) {
			ObjData od = (ObjData)ois.readObject();
			//System.out.println(od);
			ObjEx oe = (ObjEx)Class.forName("io_obj."+od.tag).newInstance();
			oe.execute(od.data);
		}
		
		ois.close();
		fis.close();

////이름, 국, 영, 수 시험 결과를 파일에 저장하시오
////이름, 국, 영, 수는 scanner 로 입력 받아 처리	
/// 처리 내용 총점, 평균, 등급
/// 결과 파일에서 내용을 가져와 출력하시오

		
//		FileInputStream fis = new FileInputStream("fff/ootest.zzz");
//		ObjectInputStream ois = new ObjectInputStream(fis);
//		
//		while(fis.available()>0) {
//			ObjData od = (ObjData)ois.readObject();
//			ObjEx oe = (ObjEx)Class.forName("io_obj"+od.name).newInstance();
//			oe.execute(od.data);
//		}
//		
//		
//		ois.close();
//		fis.close();
		
	
	}
	
	
	
}
