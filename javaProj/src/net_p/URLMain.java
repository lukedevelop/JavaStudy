package net_p;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class URLMain {

	public static void main(String[] args) throws Exception {
		URL uu =
				new URL("https://comic.naver.com/webtoon/detail?titleId=183559&no=532&weekday=mon");
		
		System.out.println(uu);
		System.out.println(uu.getAuthority()); // �������� ����
		System.out.println(uu.getDefaultPort()); 
		System.out.println(uu.getContent());  // �����̹��� (��ü?)
		System.out.println(uu.getPort());  
		System.out.println(uu.getFile());  //������ ���ĺ��� - ������ �������̾� ��� �˷���  
		System.out.println(uu.getHost());  // authority �� ����
		System.out.println(uu.getPath());  //���
		System.out.println(uu.getQuery());
		System.out.println(uu.getProtocol()); // �������� ����
		System.out.println(uu.toURI());  // ���ڿ�(String)
		
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
