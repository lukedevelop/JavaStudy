package io_p;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

public class FileMain {

	public static void main(String[] args) throws Exception {
		
		
		File ff = new File("fff/asdf.txt");
		
		System.out.println("��������"+ff.exists());  //������ �����ϳ� ���ϳ� ���� Ȯ��
		System.out.println("��������"+ff.isFile());  // �����ΰ�?
		System.out.println("��������"+ff.isDirectory()); // ���丮�ΰ��ƴѰ�Ȯ��
		System.out.println("����������"+ff.isHidden()); // �������������� �˻��ϴ�
		System.out.println("������������"+ff.isAbsolute());// �ش� ������ ��θ��� ���� �������
		System.out.println("�θ���������"+ff.canWrite()); // ���� �б�����
		System.out.println("�θ�����"+ff.canRead()); // �ش� ������ ���� �� �ִ� ��������
		System.out.println("���ϸ�"+ff.canExecute());
		System.out.println("������"+ff.length()); //byte ����
		System.out.println("���"+ff.getName()); // �����Ͽ� �̸��� ��ȯ�ϴ�
		System.out.println("��������"+ff.getParent());
		System.out.println("�б�����"+ff.getPath()); // ������ ��ü ��ο� �̸��� ��ȯ
		System.out.println("��������"+ff.getAbsolutePath());
		System.out.println("��������"+new Date(ff.lastModified())); // ���� ���������� �ߴ°�
		
		File bb = new File("fff/qaws.txt");
		//bb.createNewFile(); //���� �������
		//System.out.println(bb.delete()); // ���ϻ���
		//bb.renameTo(new File("dst/bnm.txt"));  // renameTo : �̵�
		
		File dd = new File("fff/ggg/sss");
		//dd.mkdir(); // ���ϰ��� ���丮�� ����
		dd.mkdirs(); // ���߰��� ���丮 ����
		
		File [] arr = new File("fff").listFiles();
		
		for(File f : arr) {
			System.out.println(f.getName()); //fff �� �ִ� ���ϵ��� �� ������
		}
	}

}
