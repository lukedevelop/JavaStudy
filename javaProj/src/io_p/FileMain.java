package io_p;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

public class FileMain {

	public static void main(String[] args) throws Exception {
		
		
		File ff = new File("fff/asdf.txt");
		
		System.out.println("존재유무"+ff.exists());  //파일이 존재하나 안하나 여부 확인
		System.out.println("파일인지"+ff.isFile());  // 파일인가?
		System.out.println("폴더인지"+ff.isDirectory()); // 디렉토리인가아닌가확인
		System.out.println("절대경로인지"+ff.isHidden()); // 숨김파일인지를 검사하는
		System.out.println("숨김파일인지"+ff.isAbsolute());// 해당 파일의 경로명이 절대 경로인지
		System.out.println("부모파일인지"+ff.canWrite()); // 파일 읽기전용
		System.out.println("부모폴더"+ff.canRead()); // 해당 파일이 읽을 수 있는 파일인지
		System.out.println("파일명"+ff.canExecute());
		System.out.println("절대경로"+ff.length()); //byte 단위
		System.out.println("경로"+ff.getName()); // 이파일에 이름을 반환하는
		System.out.println("실행유무"+ff.getParent());
		System.out.println("읽기유무"+ff.getPath()); // 파일의 전체 경로와 이름을 반환
		System.out.println("쓰기유무"+ff.getAbsolutePath());
		System.out.println("마지막수"+new Date(ff.lastModified())); // 언제 마지막수정 했는가
		
		File bb = new File("fff/qaws.txt");
		//bb.createNewFile(); //파일 만들게함
		//System.out.println(bb.delete()); // 파일삭제
		//bb.renameTo(new File("dst/bnm.txt"));  // renameTo : 이동
		
		File dd = new File("fff/ggg/sss");
		//dd.mkdir(); // 단일계층 디렉토리만 생성
		dd.mkdirs(); // 다중계층 디렉토리 생성
		
		File [] arr = new File("fff").listFiles();
		
		for(File f : arr) {
			System.out.println(f.getName()); //fff 에 있는 파일들을 다 보여줌
		}
	}

}
