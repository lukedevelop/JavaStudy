package swing_p;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.text.CompactNumberFormat;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ContainerMain {

	public static void main(String[] args) {
	
		JFrame f1 = new JFrame("JPanel");
		f1.setBounds(0, 50, 300, 200);
		f1.setLayout(null);
		
		JPanel p1 = new JPanel();       //"Jpanel": ������ ������(����������) ������ ���� ����
		p1.setBounds(10, 10, 100, 100);
		p1.setBackground(Color.yellow);
		
		JPanel p2 = new JPanel();
		p2.setBounds(120, 10, 100, 100);
		p2.setBackground(Color.pink);
		
		f1.add(p1);
		f1.add(p2);
		
		Container c1 = f1.getContentPane();              
		System.out.println(c1.getComponentCount());
		
		Component [] arr = c1.getComponents();
		System.out.println(arr[0].getBackground());
		System.out.println(arr[1].getBackground());
				
		
		for (int i = 0; i < 5 ; i++) {       // �ݺ��������� ��ưi(5)�� ����
			p1.add(new JButton("��ư"+i));
			p2.add(new JButton("��ư"+i));
			
		}
		
		f1.setVisible(true);
////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JFrame f2 = new JFrame("JScrollPane");
		f2.setBounds(300, 50, 300, 200);
		f2.setLayout(null);
		
		JPanel p3 = new JPanel();       
		JScrollPane jp3 = new JScrollPane(p3);
		jp3.setBounds(10, 10, 100, 100);        //scrollpane �������� bounds �� �������
		p3.setBackground(Color.yellow);         //panel �� ������ �г� ������ �� ����
		
		JPanel p4 = new JPanel();
		//p4.setBounds(120, 10, 100, 100);    // scroll �� �Ʒ��λ��� �ǹ̰� ����
		p4.setPreferredSize(new Dimension(80,300));  // scroll ����� ���簢�� ���� ����� ���ΰ� ��� ������ ���Ʒ��� �̻ڰ� ��ũ�� ����
		p4.setBackground(Color.pink);
	
		JScrollPane jp4 = new JScrollPane(p4);
		jp4.setBounds(120, 10, 100, 100);
		
		f2.add(jp3);
		f2.add(jp4);
		
	  
		
		for (int i = 0; i < 5 ; i++) {       
			p3.add(new JButton("��ư"+i));
			p4.add(new JButton("��ư"+i));
			
		}
		
		f2.setVisible(true);
////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		JFrame f3 = new JFrame("JDialog");
		f3.setBounds(0, 250, 300, 200);
//		Container                            //������ ���� ä��°�
		
		
		//(JDialog) true - doModal : ���� ��ȭâ�� �ݾƾ� owner â ����
		//(JDialog) false - Modaless : ���� ��ȭâ�� ���� owner â ����
		JDialog dd = new JDialog(f3,"�޼���â",false); //JDialog(owner,"",t/f) dialog�� �ٸ��͵�� �ٸ��� â�� ������ ����
		dd.setBounds(300, 250, 100, 100);
		dd.setLayout(new FlowLayout());            //??
		
		dd.add(new JLabel("���â �Դϴ�."));
		dd.add(new JButton("Ȯ��"));
		
		dd.setVisible(true);          //����â���� �и��� �Ǿ�����  dialog �� ����x
		
		f3.setVisible(true);
////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JFrame f4 = new JFrame("FileDialog");
		f4.setBounds(0, 450, 300, 200);
		f4.setBackground(Color.green);   //������� ����
		
		
		FileDialog fd = new FileDialog(f4,"���Ͽ����Դϴ�",FileDialog.LOAD);    //(awt)filedialog : <FileDialog.LOAD>���Ͽ���  load (����� ��)
		//fd.setBounds(300, 450, 100, 100);
		fd.setLocation(300, 450);     // setbounds �ʿ���� location ���� ����
		fd.setDirectory("C:\\Users\\whgml\\Desktop\\Java");    //setDirectory: ���� �ּҸ� ������ �������� ����
		
		fd.setVisible(true);          
		f4.setVisible(true);
		
		System.out.println(fd.getDirectory()); //?
		System.out.println(fd.getFile());
		
		
	}

}
