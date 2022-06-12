package swing_p;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;

public class PaintMain extends JFrame {
	
	public PaintMain() {
		super("paint");
		System.out.println("�����ڴ�!!");
		
		setBounds(50, 50, 900, 600);
		getContentPane().setBackground(Color.white);   //������ ������ ������� �ϱ�����
		setLayout(null);
		//setResizable(false);
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void paint(Graphics g) {

		super.paint(g);      //ȭ���� ���� �׸��� --> ����� �ٽñ׸�
		//ȭ�� ������ �ɶ� �ڵ�ȣ��
		//ȭ�� ���� : ȭ�� ũ�⺯��(�ִ�ȭ ����)
		//System.out.println("paint() ����");
		g.setColor(Color.blue);                // "������ ����" �� �� ����
		g.setFont(new Font("�޸���ü", Font.ITALIC, 30));       // �۲�, ����ũ��
		g.drawString("������ ����",50,100);        //�ؽ�Ʈ�� �ƴ�, ���� ��ȭ �׸�����       
		
		g.setColor(Color.red);                  // fillrect���簢�� ���� ����
		g.fillRect(50, 120, 200, 100);          // fillrect : ��ä���� ���簢�� ������ �������   (x��,y��,����,������)
		
		g.setColor(Color.green); 
		g.drawRect(150, 150, 200, 100);          // drawrect : (���̺�) ���鸸 ��Ÿ��  <fillrect �ٷ����� ����� ��ġ�°Ծƴ϶� ���ο� �׸��ǿ� �׷� ��ġ�°�ó�� ����>
		
		g.setColor(Color.pink); 
		g.fillOval(50, 250, 200, 100);           // fillOval : ��
		
		g.setColor(Color.green); 
		g.drawRect(50, 250, 200, 100); 
		
		g.setColor(Color.blue); 
		g.drawOval(100, 300, 70, 70);            //drawOval : (���̺�) �� 

		g.setColor(Color.darkGray); 
		g.drawLine(50, 100, 350, 350);           // drawLine : ��
		
		g.setColor(Color.darkGray); 
		g.drawRoundRect(50, 370, 200, 100,50,50);        // drawRoundRect: ������ �簢�� 
		
		g.setColor(Color.blue); 
		g.drawArc(400, 50, 100, 100, 45, 90);       //  drawArc: 45�� ���� 90�� ������ �׸� (���)
		
		g.setColor(Color.blue); 
		g.fillArc(600, 50, 100, 100, 45, 90);        // fillArc: 45�� ���� 90�� ������ �׸� (��ä����)
		
		g.fillPolygon(                              //  fillPolygon: ������Ʈ ��������� ���� ����
				new int[] {600,700,800,500},        // {x,x,x,x}  �迭������ x�� ������ y�ೡ�� ���� ����
				new int[] {400,370,530,500},        // {y,y,y,y}  
				4                                   // ��4��
				);
		
		g.setColor(Color.green); 
		g.drawPolygon(
				new int[] {500,600,700,400}, 
				new int[] {400,370,530,500},
				4
				);
		
		g.drawPolyline(
				new int[] {700,800,900,600}, 
				new int[] {400,370,530,500},
				4
				);
		
		g.setColor(Color.red); 
		g.drawPolyline(
				new int[] {600,700,800,500,600}, 
				new int[] {200,170,330,300,200},
				5
				);
		
		
		
	};
		

	public static void main(String[] args) {
		new PaintMain();

	}

}
