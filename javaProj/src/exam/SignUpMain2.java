package exam;

import java.util.Scanner;
import java.util.regex.Pattern;

class RegexMem {
	class Data {
		String title, data;

		public Data(String title) {
			this.title = title;
		}

		@Override
		public String toString() {
			return title + " : " + data;
		}
	}

	Data[] data;

	public RegexMem() {
		String[] arr = "id,pw,tel,pname,img,addr,schGu".split(",");
		data = new Data[arr.length];

		for (int i = 0; i < arr.length; i++) {
			data[i] = new Data(arr[i]);
		}
	}

	void ppp() {

		for (Data dd : data) {
			System.out.println(dd);
		}
	}

	void input(RRQQ rq) {
		for (Data dd : data) {
			if (dd.title.equals(rq.title)) {
				dd.data = rq.answer;
			}
		}
	}
}

class RRQQ {
	String qq, title, regex, answer;

	public RRQQ(String qq, String title, String regex) {
		super();
		this.qq = qq;
		this.title = title;
		this.regex = regex;

	}

	void question(RegexMem rm) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print(qq + ":");
		answer = sc.next();

		if (!Pattern.matches(regex, answer.toLowerCase())) {
			throw new Exception(qq + " �Է¿���");
		}
		rm.input(this);
	}
}

class RegZipCode {

	String gu, zipcode;

	public RegZipCode(String str) {
		String[] arr = str.split("_");
		this.gu = arr[0];
		this.zipcode = arr[1];
	}

	@Override
	public String toString() {
		return gu + "=>" + zipcode;
	}

}

public class SignUpMain2 {

	public static void main(String[] args) {

		/*
		 * ȸ�� ���� ��ȿ�� �˻縦 �ǽ��ϼ��� 1. : ���� ���� ���� 2. , [a-zA-Z0-9]* 3. - ���� : ###-####-####,
		 * ##(#)-###-#### [0-9]{2,3}-[0-9]{3,4}-[0-9]{4} 4. (�ѱ۸� ����) [��-�R]* 5.
		 * ÷��-->����,����.�̹��� Ȯ���� [a-zA-Z0-9_]*.[a-z] �̹���(jpg, jpeg, bmp, png, gif) -- ��ҹ���
		 * ���о��� 6. �˻� - ������ (�ʼ��˻�) ����,����,����,����,��,��,��,�� ����ó���� ó���� ��
		 */

		String[] rgc = { "��������������������������������������", "�����ٶ󸶹ٻ������īŸ���Ͻα��¥��", "�����L���J����磠���i�M���R�υ�������" };

		String[] gu = "���α�_00111,�߱�_00222,��걸_00223,������_00224,������_00225,���빮��_00226,�߶���_00227,���ϱ�_00228,���ϱ�_00229,������_00230,�����_00231,����_00232,���빮��_00233,������_00234,��õ��_00235,������_00236,���α�_00237,��õ��_00238,��������_00239,���۱�_00240,���Ǳ�_00241,���ʱ�_00242,������_00243,���ı�_00244,������_00245"
				.split(",");

		RegZipCode[] zipArr = new RegZipCode[gu.length];

		for (int i = 0; i < zipArr.length; i++) {
			zipArr[i] = new RegZipCode(gu[i]);
		}

		RRQQ[] arr = {
//			new RRQQ("���̵�","id","[a-zA-Z0-9]{3,}"),
//			new RRQQ("���","pw",".{4,}"),
//			new RRQQ("���Ȯ��","",".{4,}"),
//			new RRQQ("��ȭ��ȣ","tel","([0-9]{3}-[0-9]{4}|[0-9]{2,3}-[0-9]{3})-[0-9]{4}"),
//			new RRQQ("�̸�","pname","[��-�R]{2,}"),
//			new RRQQ("����","img",".{1,}[.](jpg|jpeg|bmp|png|gif)"),
				new RRQQ("�����ȣ", "addr", "[��-����-�R]*") };

		RegexMem rm = null;

		while (true) {
			rm = new RegexMem();
			try {

				for (RRQQ rq : arr) {
					rq.question(rm);

					if (rq.qq.equals("���Ȯ��") && !rq.answer.equals(rm.data[1].data)) {
						throw new Exception("��й�ȣ ����ġ");
					}
				}

				String pp = ".*";

				for (char ch : rm.data[5].data.toCharArray()) {

					int pos = rgc[0].indexOf(ch);
					if (pos >= 0) {
						pp += "[" + rgc[1].charAt(pos) + "-" + rgc[2].charAt(pos) + "]";
					} else {
						pp += ch;
					}
				}

				pp += ".*";

				// System.out.println(pp);
				String schGu = "";

				for (RegZipCode zipcode : zipArr) {
					if (Pattern.matches(pp, zipcode.gu)) {
						schGu += zipcode + ",";
					}
				}

				// System.out.println(schGu);
				if (schGu.length() == 0) {
					throw new Exception("��ġ�ϴ� ���� �����ϴ�.");
				}

				rm.data[6].data = schGu;

				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
		System.out.println("ȸ������ �Ϸ�");
		rm.ppp();
	}

}
