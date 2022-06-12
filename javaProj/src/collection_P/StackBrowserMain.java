package collection_P;

import java.util.Stack;

class StackBrowser{
	String now = null;
	Stack back = new Stack();
	Stack next = new Stack();
	
	void goUrl(String url) {
		
		System.out.println("goUrl("+url+")------------------");
		if(now != null) {
		back.push(now);
		}
		
		now = url;
		next.clear();
		
		ppp();
		
	}
	
	void goBack() {
		System.out.println("goBack()------------------");
		
		if(back.empty()) {
			System.out.println("�ڷ� �� �������� �����ϴ�.");
			return;
		}
		
		next.push(now);
		now = (String)back.pop();
		
		ppp();
	}
	
	void goNext() {
		System.out.println("goNext()------------------");
		
		if(next.empty()) {
			System.out.println("������ �� �������� �����ϴ�.");
			return;
		}
		
		back.push(now);
		now = (String)next.pop();
		
		ppp();
	}
	
	
	void ppp() {
		System.out.println("���� : "+now);
		System.out.println("���� : "+back);
		System.out.println("���� : "+next);
	}
	
}


public class StackBrowserMain {

	public static void main(String[] args) {
		StackBrowser sb = new StackBrowser();
		
		sb.goUrl("������");
		sb.goUrl("���׸�");
		sb.goUrl("����");
        sb.goBack();
        sb.goBack();                 //2-empty �϶�������
        sb.goBack();
//        sb.goNext();
//        sb.goNext();
        sb.goUrl("��");
        
	}

}
