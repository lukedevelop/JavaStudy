package exam;

import java.awt.Color;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class MakeSignupMain {

	public static void main(String[] args) {
		JFrame n = new JFrame("회원가입 하라");
		n.setBounds(300,100,800,700);
		n.setLayout(null);
		
		JLabel idLB = new JLabel("아이디");
		idLB.setBounds(50,20,100,50);
		n.add(idLB);
		JTextField id = new JTextField();
		id.setBounds(50, 50, 150, 30);
		n.add(id);
		JButton b1 = new JButton("중복확인");
		b1.setBounds(50,80,100,30);
		n.add(b1);

		
		
		JLabel pwLB = new JLabel("비밀번호");
		pwLB.setBounds(50,100,100,50);
		n.add(pwLB);
		JPasswordField pw  = new JPasswordField();
		pw.setBounds(50, 130, 150, 30);
		n.add(pw);
		
		JLabel pwLB1 = new JLabel("비밀번호 재확인");
		pwLB1.setBounds(50,150,100,50);
		n.add(pwLB1);
		JPasswordField pw1  = new JPasswordField();
		pw1.setBounds(50, 180, 150, 30);
		n.add(pw1);
		
		JLabel name = new JLabel("이름");
		name.setBounds(50, 200, 100, 50);
		n.add(name);
		JTextField nm = new JTextField();
		nm.setBounds(50, 230, 150, 30);
		n.add(nm);
		
		JLabel bd = new JLabel("생년월일");
		bd.setBounds(50, 250, 100, 50);
		n.add(bd);
		Vector<String> yy = new Vector<String>();
		yy.add("1990");
		yy.add("1991");
		yy.add("1992");
		yy.add("1993");
		yy.add("1994");
		yy.add("1995");
		yy.add("1996");
		yy.add("1997");
		yy.add("1998");
		yy.add("1999");
		yy.add("2000");
		
		JComboBox<String> box = new JComboBox<String>(yy);
		box.setBounds(50, 280, 60, 30);
		box.setSelectedItem("1990");
		n.add(box);
		
		JLabel month = new JLabel("월");
		month.setBounds(130, 250, 100, 50);
		n.add(month);
		Vector<String> mm = new Vector<String>();
		mm.add("1");
		mm.add("2");
		mm.add("3");
		mm.add("4");
		mm.add("5");
		mm.add("6");
		mm.add("7");
		mm.add("8");
		mm.add("9");
		mm.add("10");
		mm.add("11");
		mm.add("12");
		
		JComboBox<String> box1 = new JComboBox<String>(mm);
		box1.setBounds(120, 280, 60, 30);
		box1.setSelectedItem("1");
		n.add(box1);
		
		JLabel date = new JLabel("일");
		date.setBounds(200, 250, 100, 50);
		n.add(date);
		JTextField dd = new JTextField();
		dd.setBounds(200, 280, 50, 30);
		n.add(dd);
		
		JLabel gen = new JLabel("성별");
		gen.setBounds(50, 320, 100, 50);
		n.add(gen);
		
		JRadioButton rb1 = new JRadioButton("남");
		JRadioButton rb2 = new JRadioButton("여");
		JRadioButton rb3 = new JRadioButton("??");
		
		rb1.setBounds(100, 320, 60, 50);
		rb2.setBounds(160, 320, 60, 50);
		rb3.setBounds(220, 320, 100, 50);
				
		
		n.add(rb1);
		n.add(rb2);
		n.add(rb3);
		
		ButtonGroup bg2 = new ButtonGroup(); 
		bg2.add(rb1);
		bg2.add(rb2);
		bg2.add(rb3);
		
		JLabel em = new JLabel("본인 확인 이메일");
		em.setBounds(250,20,100,50);
		n.add(em);
		JTextField email = new JTextField();
		email.setBounds(250, 50, 150, 30);
		n.add(email);
		
		JLabel ph = new JLabel("휴대전화");
		ph.setBounds(250,100,100,50);
		n.add(ph);
		
		
		Vector<String> ph1 = new Vector<String>();
		ph1.add("대한민국 +82");
		ph1.add("호주 +61");
		ph1.add("미국 +1");
		ph1.add("일본 +81");
		ph1.add("독일 +49");
		
		JComboBox<String> box2 = new JComboBox<String>(ph1);
		box2.setBounds(250, 130, 150, 30);
		box2.setSelectedItem("대한민국 +82");
		n.add(box2);
		
		JLabel number = new JLabel("번호입력");
		number.setBounds(250,150,100,50);
		n.add(number);
		JTextField num  = new JTextField();
		num.setBounds(250, 180, 100, 30);
		n.add(num);
		JButton ch = new JButton("인증번호");
		ch.setBounds(350,180,100,30);
		n.add(ch);
		
		JLabel ch1 = new JLabel("인증번호를 입력하세요");
		ch1.setBounds(250,200,150,50);
		n.add(ch1);
		JTextField chb  = new JTextField();
		chb.setBounds(250, 230, 150, 30);
		n.add(chb);
		
		JButton agree = new JButton("가입하기");
		agree.setBounds(280,500,200,100);
		n.add(agree);
		
		ImageIcon icon = new ImageIcon("fff/Chalsu.jpg");
		JButton b4 = new JButton("찰수",icon);  
		b4.setBounds(320,260,460,240);
		n.add(b4);
		
		n.setVisible(true);
		n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
