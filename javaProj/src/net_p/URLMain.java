package net_p;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class URLMain {

	public static void main(String[] args) throws Exception {
		URL uu =
				new URL("https://comic.naver.com/webtoon/detail?titleId=183559&no=532&weekday=mon");
		
		System.out.println(uu);
		System.out.println(uu.getAuthority()); // 도메인이 뭐냐
		System.out.println(uu.getDefaultPort()); 
		System.out.println(uu.getContent());  // 내용이뭐냐 (개체?)
		System.out.println(uu.getPort());  
		System.out.println(uu.getFile());  //도메인 이후부터 - 이폴더 이파일이야 라고 알려줌  
		System.out.println(uu.getHost());  // authority 랑 같음
		System.out.println(uu.getPath());  //경로
		System.out.println(uu.getQuery());
		System.out.println(uu.getProtocol()); // 프로토콜 뭐냐
		System.out.println(uu.toURI());  // 문자열(String)
		
		System.out.println(".................");
		InputStreamReader isr = new InputStreamReader(uu.openStream());
		BufferedReader br = new BufferedReader(isr);
		String line;
		
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		br.close();
		isr.close();
		
	}

}
