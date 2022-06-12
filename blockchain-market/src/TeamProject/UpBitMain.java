// 03.08 18:00 �ǽð� ���� ����, �ŷ���� Ȱ��ȭ(����1����)
// 03.09 16:40 �ż��ŵ���� ����
// 03.10 11:00 ���� �Է� �ŷ� ����, �� ���� �ǽð�������� ������
// 03.10 20:30 �� ���� �ǽð� ������� ������
// 03.11 12:00 ��ɿϼ�
// 03.11 16:30 �ڸ����߱�, �����ŵ� ��ư �߰�
// 03.14 13:00 ��

package TeamProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;


// ���� Ŭ���� - ������ ����, ���� �� ����
class Coin {
	
	String name;	// ���� �̸�
	long price;		// ���� ����
	double con;		// ���� ������ ������ ex) 5 -> ��5%
	
	public Coin(String name, long price, double con) {
		this.name = name;
		this.price = price;
		this.con = con + 0.1;
	}
	
}


// ���� Ŭ���� - ���� �ܰ�, ���� ����
class Account {
	
	String name;
	long total;	// ���� �� �ż��ݾ�
	double qua;	// ���� ��������
	
	public Account(String name, long total, double qua) {
		this.name = name;
		this.total = total;
		this.qua = qua;
	}
	
}


// �ǽð� ���� ���� Ŭ����
class Price extends Thread {
	
	Coin [] coin;
	Account [] myacc;
	Browser bw;
	
	DecimalFormat dfmoney = new DecimalFormat("#,##0");
	DecimalFormat dfqua = new DecimalFormat("#,##0.00");
	DecimalFormat dfper = new DecimalFormat("#,##0.00%");
			
	public Price(Coin [] coin, Account [] myacc, Browser bw) {
		this.coin = coin;
		this.myacc = myacc;
		this.bw = bw;
	}

	@Override
	public void run() {
		
		while(true) {
			try {
				sleep(1000);
				
				long tot_money = myacc[coin.length].total;
				int tot_coin_maip = 0;
				
				for(int i=0 ; i<coin.length ; i++) {
					
					// ���� ���� ��ȯ
					coin[i].price = (int)(coin[i].price*(100 - coin[i].con + 2*coin[i].con*Math.random())*0.01);

					// �������� 
					long nowtot = (long)(coin[i].price*myacc[i].qua);							
					double suik;
					if(myacc[i].total != 0) {
						suik = (double)(coin[i].price*myacc[i].qua)/myacc[i].total-1;
					} else {
						suik = 0;
					}
					String nowPri = dfmoney.format(coin[i].price);				// ������ ���簡��
					String nowTot = dfmoney.format(nowtot);						// �������� �򰡱ݾ�
					String nowSonik = dfmoney.format(nowtot-myacc[i].total);	// �������� �򰡼���
					String Suik = dfper.format(suik);							// �������� ���ͷ�

					// ���ͷ��� ���� ����ȯ
					if(suik>0) {
						bw.myAccount.nowSon_arr.get(i).setForeground(Color.red);
						bw.myAccount.suik_arr.get(i).setForeground(Color.red);
					} else if(suik<0) {
						bw.myAccount.nowSon_arr.get(i).setForeground(Color.blue);
						bw.myAccount.suik_arr.get(i).setForeground(Color.blue);
					} else {
						bw.myAccount.nowSon_arr.get(i).setForeground(Color.black);
						bw.myAccount.suik_arr.get(i).setForeground(Color.black);
					}
					
					// ����â �ǽð� ��ȭ setText
					bw.nowPri_arr.get(i).setText(nowPri+" ");
					bw.myAccount.nowPri_arr.get(i).setText(nowPri+" ");
					bw.myAccount.nowTot_arr.get(i).setText(nowTot + " ");
					bw.myAccount.nowSon_arr.get(i).setText(nowSonik + " ");
					bw.myAccount.suik_arr.get(i).setText(Suik);
					
					// �Ѿ� ����
					tot_money += myacc[i].qua*coin[i].price;
					tot_coin_maip += myacc[i].total;
					
				}
				
				// �� ���� �Ѿ� ����
				long tot_sonik = tot_money-myacc[coin.length].total-tot_coin_maip;
				double tot_suik = (tot_coin_maip != 0 ? (double)(tot_money-myacc[coin.length].total)/tot_coin_maip-1 : 0);	// �� ���ͷ�

				String tot_Money = dfmoney.format(tot_money);							// �� �ڻ�
				String tot_Coin = dfmoney.format(tot_money-myacc[coin.length].total);	// ��ü���� �򰡱ݾ�
				String tot_Sonik = dfmoney.format(tot_sonik);							// �� �򰡼���
				String tot_Suik = dfper.format(tot_suik);								// �� ���ͷ�
				
				// ����â �ǽð� ��ȭ setText
				bw.myAccount.tot_1.setText("  ���� �ڻ�  :  " + tot_Money);
				bw.myAccount.tot_4.setText("  ���� �򰡱ݾ�  :  " + tot_Coin);
				bw.myAccount.tot_5.setText("  �� ����  :  " + tot_Sonik);
				bw.myAccount.tot_6.setText("  �� ���ͷ�  :  " + tot_Suik);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}


// ����������
class Browser extends JFrame {
	
	MyAccount myAccount;
	Coin [] coin;
	Account [] myacc;
	Image logo;
	JLabel n_3;
	ArrayList<JLabel> nowPri_arr;
	
	DecimalFormat dfmoney = new DecimalFormat("#,##0");
	DecimalFormat dfqua = new DecimalFormat("#,##0.00");
	DecimalFormat dfper = new DecimalFormat("#,##0.00%");
	LineBorder lb = new LineBorder(Color.gray);
	
	Date today = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd / HH:mm:ss");
	
	// ���� â
	public Browser(Coin[]coin, Account[]myacc) {
		
		super("����Ʈ");
		this.coin = coin;
		this.myacc = myacc;
		
		String myMoney = dfmoney.format(myacc[coin.length].total);	// ����
		
		setBounds(100, 50, 600, 850); // ���� ������ 584*781
		Container con = getContentPane();
		con.setBackground(new Color(9,54,135));
		setLayout(null);
		
		//�޴���
		JMenuBar bar = new JMenuBar();
		setJMenuBar(bar);
		JButton account = new JButton("�� ����");
		account.setBackground(Color.white);
		bar.add(account);
		
		// ������ ���� ��ư
		account.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myAccount = new MyAccount();
			}
		});

		//�ΰ�
		Toolkit	kit = Toolkit.getDefaultToolkit();
		logo = kit.getImage("ffff/upbit.png");
		
		JLabel title = new JLabel("Markets");
		title.setBounds(44, 26, 120, 30);
		title.setFont(new Font("�޸յձ�������", Font.ITALIC, 21));
		title.setForeground(Color.white);
		add(title);
		
		//
		JPanel firstLine = new JPanel();
		firstLine.setBounds(42, 60, 500, 40);
		firstLine.setBackground(new Color(244, 245, 248));
		firstLine.setLayout(null);
		
		JLabel n_1 = new JLabel("�ѱ۸�");
		n_1.setBounds(0, 0, 200, 40);
		n_1.setBorder(lb);
		n_1.setFont(new Font("���� ���", Font.PLAIN, 14));
		n_1.setHorizontalAlignment(JLabel.CENTER);
		firstLine.add(n_1);
		
		JLabel n_2 = new JLabel("���簡");
		n_2.setBounds(200, 0, 140, 40);
		n_2.setBorder(lb);
		n_2.setFont(new Font("���� ���", Font.PLAIN, 14));
		n_2.setHorizontalAlignment(JLabel.CENTER);
		firstLine.add(n_2);
		
		n_3 = new JLabel("���� : " + myMoney);
		n_3.setBounds(340, 0, 160, 40);
		n_3.setBorder(lb);
		n_3.setFont(new Font("���� ���", Font.PLAIN, 14));
		n_3.setHorizontalAlignment(JLabel.CENTER);
		firstLine.add(n_3);
	
		add(firstLine);
		
		// ���� ����Ʈ
		JPanel coinList = new JPanel();
		coinList.setBounds(42, 100, 200, 630);
		coinList.setBackground(Color.white);
		coinList.setLayout(new GridLayout(coin.length,1));
				
		for(int i=0 ; i<coin.length ; i++) {
			ImageIcon icon_i = new ImageIcon("ffff/bitcoin"+i+".png");
			JLabel c_i = new JLabel(" " + coin[i].name, icon_i, SwingConstants.LEFT);
			c_i.setBorder(lb);
			c_i.setFont(new Font("���� ���", Font.BOLD, 15));
			coinList.add(c_i);
		}
		
		add(coinList);
		
		// ���ΰ���
		JPanel priceList = new JPanel();
		priceList.setBounds(242, 100, 140, 630);
		priceList.setBackground(Color.white);
		priceList.setLayout(new GridLayout(coin.length,1));
		
		nowPri_arr = new ArrayList<>();
		for(int i=0 ; i<coin.length ; i++) {
			String nowPri = dfmoney.format(coin[i].price);
			JLabel c_i = new JLabel(nowPri + " ");
			c_i.setBorder(lb);
			c_i.setFont(new Font("���� ���", Font.PLAIN, 15));
			c_i.setHorizontalAlignment(JLabel.RIGHT);
			priceList.add(c_i);
			nowPri_arr.add(c_i);
		}
		
		add(priceList);
				
		// �ż���ư
		JPanel buyList = new JPanel();
		buyList.setBounds(382, 100, 80, 630);
		buyList.setBackground(Color.white);
		buyList.setLayout(new GridLayout(coin.length,1));
		
		for(int i=0 ; i<coin.length ; i++) {
			JButton buyBtn_i = new JButton("�ż�");
			buyBtn_i.setBackground(Color.white);
			buyBtn_i.setFont(new Font("���� ���", Font.BOLD, 14));
			buyBtn_i.setForeground(Color.red);
			buyList.add(buyBtn_i);
			
			// �ż���ư �׼Ǹ�����
			buyBtn_i.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
					int buynum = ((JButton)e.getSource()).getY() / (buyList.getHeight()/coin.length);	// �ż���ư �迭��ȣ(i)
					double qua = 0;
					
					try {
						qua = Double.parseDouble(JOptionPane.showInputDialog("[" + coin[buynum].name + " �ż�] ������ �Է����ּ���."));
						if(qua<0.01) {
							System.out.println("0.01�� �̻���� �ż��� �����մϴ�.");
							System.out.println("-----------------");
						} else {
							buy(buynum, qua);
						}
					} catch(Exception e1) {
						System.out.println("���ڸ� �Է����ּ���.");
						System.out.println("-----------------");
					}
					
				}
			});
			
		}
		add(buyList);

		// �ŵ���ư
		JPanel sellList = new JPanel();
		sellList.setBounds(462, 100, 80, 630);
		sellList.setBackground(Color.white);
		sellList.setLayout(new GridLayout(coin.length,1));
		
		for(int i=0 ; i<coin.length ; i++) {
			JButton sellBtn_i = new JButton("�ŵ�");
			sellBtn_i.setBackground(Color.white);
			sellBtn_i.setFont(new Font("���� ���", Font.BOLD, 14));
			sellBtn_i.setForeground(Color.blue);
			sellList.add(sellBtn_i);

			// �ŵ���ư �׼Ǹ�����
			sellBtn_i.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
					int sellnum = ((JButton)e.getSource()).getY() / (sellList.getHeight()/coin.length);	// �迭��ȣ (i)
					double qua = 0;
					
					try {
						qua = Double.parseDouble(JOptionPane.showInputDialog("[" + coin[sellnum].name + " �ŵ�] ������ �Է����ּ���."));
						if(qua<0.01) {
							System.out.println("0.01�� �̻���� �ŵ��� �����մϴ�.");
							System.out.println("-----------------");
						} else {
							sell(sellnum, qua);
						}
					} catch(Exception e1) {
						System.out.println("���ڸ� �Է����ּ���.");
						System.out.println("-----------------");
					}
					
				}
			});
			
		}
		add(sellList);
		
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// �� ���� ����
		myAccount = new MyAccount();
		
	}
	
	
	// �ΰ�
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(logo, 460, 80, this);
	}

	
	// �ż� �޼ҵ�
	void buy(int i, double k) {
					
		if(myacc[coin.length].total >= k*coin[i].price) {
		
			// ����
			String buyQua = dfqua.format(k);					// �ŷ� ����
			String nowPri = dfmoney.format(coin[i].price);		// ���� ����
			
			// �ż� �ŷ�
			myacc[coin.length].total -= k*coin[i].price;
			myacc[i].qua += k;
			myacc[i].total += k*coin[i].price;
			System.out.println(sdf.format(today));
			System.out.println(coin[i].name + " " + buyQua + "�� �ż�");
			System.out.println("���Դܰ� : " + nowPri + "��");
			
			// �ŷ� �� ����
			String myMoney = dfmoney.format(myacc[coin.length].total);		// ����
			String qua = dfqua.format(myacc[i].qua);						// ���� ������
			String unitPri = dfmoney.format(myacc[i].total/myacc[i].qua);	// �ż� �ܰ�
			int tot_coinmaip = 0;
				for(int j=0 ; j<coin.length ; j++) {
					tot_coinmaip += myacc[j].total;
				}
			String totCoinMaip = dfmoney.format(tot_coinmaip);				// �� ���Աݾ�
			
			// ���� �ż� �� setText
			n_3.setText("���� : " + myMoney);
			myAccount.myQua_arr.get(i).setText(qua);
			myAccount.unitPri_arr.get(i).setText(unitPri + " ");
			myAccount.tot_2.setText("  ���� �ڻ�  :  " + myMoney);
			myAccount.tot_3.setText("  ���� ���Աݾ�  :  " + totCoinMaip);
			
			// �ܼ�â ���
			result();
			
		} else {
			String myMoney = dfmoney.format(myacc[coin.length].total);	// ����
			System.out.println("������ �����մϴ�.");
			System.out.println("���� : " + myMoney);
			System.out.println("-----------------");
		}
	
	}
	
	
	// �ŵ� �޼ҵ�
	void sell(int i, double k) {
		
		if(myacc[i].qua >= k) {
			
			// ����
			String sellQua = dfqua.format(k);				// �ŷ� ����
			String nowPri = dfmoney.format(coin[i].price);	// ���� ����
						
			// �ŵ� �ŷ�
			myacc[coin.length].total += k*coin[i].price;
			myacc[i].qua -= k;
			myacc[i].total *= myacc[i].qua;
			myacc[i].total = (int)(myacc[i].total/(myacc[i].qua+k));
			System.out.println(sdf.format(today));
			System.out.println(coin[i].name + " " + sellQua + "�� �ŵ�");
			System.out.println("�ŵ��ܰ� : " + nowPri + "��");
			
			// �ŷ� �� ����
			String myMoney = dfmoney.format(myacc[coin.length].total);
			String qua = dfqua.format(myacc[i].qua);
			int tot_coin_maip = 0;
				for(int j=0 ; j<coin.length ; j++) {
					tot_coin_maip += myacc[j].total;
				}
			String tot_Coin_Maip = dfmoney.format(tot_coin_maip);
			
			// ���� �ŵ� �� setText
			n_3.setText("���� : " + myMoney);
			if (myacc[i].qua == 0) {
				myAccount.unitPri_arr.get(i).setText("0 ");
			}
			myAccount.myQua_arr.get(i).setText(qua);
			myAccount.tot_2.setText("  ���� �ڻ�  :  " + myMoney);
			myAccount.tot_3.setText("  ���� ���Աݾ�  :  " + tot_Coin_Maip);
			
			// �ܼ�â ���
			result();
			
		} else {
			String qua = dfqua.format(myacc[i].qua);
			System.out.println("���������� �����մϴ�.");
			System.out.println(myacc[i].name + " ���� ���� : " + qua + "��");
			System.out.println("-----------------");
		}
		
	}
	
	
	// �ܼ�â ǥ��
	void result() {
		
		// ����
		long tot_money = myacc[coin.length].total;
		for(int i=0 ; i<coin.length ; i++) {
			tot_money += myacc[i].qua*coin[i].price;
		}
		String tot_Money = dfmoney.format(tot_money);
		String myMoney = dfmoney.format(myacc[coin.length].total);
		
		
		// ���
		System.out.println();
		System.out.println("�� �ڻ� : " + tot_Money + "��");
		System.out.println("���� : " + myMoney + "��");
		if ((tot_money - myacc[coin.length].total) != 0 ) {
			System.out.println();
			System.out.println("-- ���� ���� ��� --");
		}
		for(int i=0 ; i<coin.length ; i++) {
			if(myacc[i].qua != 0) {
				String qua = dfqua.format(myacc[i].qua);
				String unitPri = dfmoney.format(myacc[i].total/myacc[i].qua);
				System.out.println(myacc[i].name + " " + qua + "��\t���Դܰ� : " + unitPri);
			}
		}
		System.out.println("-----------------");
				
	}
	

	// ������ 
	class MyAccount extends JFrame {
		
		ArrayList<JLabel> nowPri_arr, suik_arr, myQua_arr, nowTot_arr, nowSon_arr, unitPri_arr;
		JLabel tot_1, tot_2, tot_3, tot_4, tot_5, tot_6;
		
		public MyAccount() {
			super("�� ����");
			
			// ������ ����
			setBounds(705, 50, 600, 850);
			Container con = getContentPane();
			con.setBackground(new Color(9,54,135));
			setLayout(null);
			LineBorder lb = new LineBorder(Color.gray);
						
			JLabel title = new JLabel("Account");
			title.setBounds(44, 26, 120, 30);
			title.setFont(new Font("�޸յձ�������", Font.ITALIC, 21));
			title.setForeground(Color.white);
			add(title);
			
			// ��ü �ڻ곻��
			JPanel tot = new JPanel();
			tot.setBounds(42, 60, 500, 80);
			tot.setBackground(Color.white);
			tot.setLayout(null);
			
			// ���� ����
			int tot_money = 0;
			tot_money += myacc[coin.length].total;
			for(int i=0 ; i<coin.length ; i++) {
				tot_money += myacc[i].qua*coin[i].price;
			}
			int tot_coin_maip = 0;
			for(int i=0 ; i<coin.length ; i++) {
				tot_coin_maip += myacc[i].total;
			}
			long tot_sonik = tot_money-myacc[coin.length].total-tot_coin_maip;
			double tot_su = (tot_coin_maip != 0 ? (double)(tot_money-myacc[coin.length].total)/tot_coin_maip-1 : 0);
			
			String tot_Money = dfmoney.format(tot_money);							// �� �ڻ�
			String myMoney = dfmoney.format(myacc[coin.length].total);				// ���� ����
			String tot_Coin_Maip = dfmoney.format(tot_coin_maip);					// �� ���Ա�
			String tot_Coin = dfmoney.format(tot_money-myacc[coin.length].total);	// �������� �򰡱ݾ�
			String tot_Sonik = dfmoney.format(tot_sonik);							// ��ü �򰡼���
			String tot_Su = dfper.format(tot_su);									// �� ���ͷ�
								
			tot_1 = new JLabel("  ���� �ڻ�  :  " + tot_Money);
			tot_1.setBounds(0,0,160,40);
			tot_1.setBorder(lb);
			tot_1.setFont(new Font("���� ���", Font.BOLD, 12));
			tot.add(tot_1);
			
			tot_2 = new JLabel("  ���� �ڻ�  :  " + myMoney);
			tot_2.setBounds(0,40,160,40);
			tot_2.setBorder(lb);
			tot_2.setFont(new Font("���� ���", Font.BOLD, 12));
			tot.add(tot_2);
			
			tot_3 = new JLabel("  ���� ���Աݾ�  :  " + tot_Coin_Maip);
			tot_3.setBounds(160,0,180,40);
			tot_3.setBorder(lb);
			tot_3.setFont(new Font("���� ���", Font.BOLD, 12));
			tot.add(tot_3);
			
			tot_4 = new JLabel("  ���� �򰡱ݾ�  :  " + tot_Coin);
			tot_4.setBounds(160,40,180,40);
			tot_4.setBorder(lb);
			tot_4.setFont(new Font("���� ���", Font.BOLD, 12));
			tot.add(tot_4);
			
			tot_5 = new JLabel("  �� ����  :  " + tot_Sonik);
			tot_5.setBounds(340,0,160,40);
			tot_5.setBorder(lb);
			tot_5.setFont(new Font("���� ���", Font.BOLD, 12));
			tot.add(tot_5);		
			
			tot_6 = new JLabel("  �� ���ͷ�  :  " + tot_Su );
			tot_6.setBounds(340,40,160,40);
			tot_6.setBorder(lb);
			tot_6.setFont(new Font("���� ���", Font.BOLD, 12));
			tot.add(tot_6);
					
			add(tot);
			
			
			// �̸�
			JPanel name = new JPanel();
			name.setBounds(42, 140, 500, 50);
			name.setBackground(new Color(244, 245, 248));
			name.setLayout(null);
			
			String [] nameLab = {"��������", "��������", "<html><body><center>�򰡱ݾ�<br>�򰡼���</body></html>",
					"<html><body><center>���簡<br>���Դܰ�</body></html>", "���ͷ�" };
			int [] widLab = {0, 160, 230, 330, 430, 500};
			for (int i=0 ; i<5 ; i++) {
				JLabel name_i = new JLabel(nameLab[i]);
				name_i.setBounds(widLab[i], 0, widLab[i+1]-widLab[i], 50);
				name_i.setFont(new Font("���� ���", Font.BOLD, 12));
				name_i.setBorder(lb);
				name_i.setHorizontalAlignment(JLabel.CENTER);
				name.add(name_i);
			}
			
			add(name);
			
			
			// �������� ����Ʈ
			JPanel list1 = new JPanel();
			list1.setBounds(42, 190, 160, 570);
			list1.setBackground(Color.white);
			list1.setLayout(new GridLayout(coin.length, 1));
			
			for(int i=0 ; i<coin.length ; i++) {
				
				JLabel c_i = new JLabel("  " + coin[i].name);
				c_i.setBorder(lb);
				c_i.setFont(new Font("���� ���", Font.PLAIN, 13));
				list1.add(c_i);
				
				// �����ŵ� ��ư
				ImageIcon icon = new ImageIcon("ffff/�����ŵ�.jpg");
				JButton allSell_i = new JButton(i+"", icon);
				allSell_i.setBackground(Color.white);
				allSell_i.setFont(new Font("���� ���", Font.PLAIN, 8));
				allSell_i.setBounds(125,5,30,30);
				c_i.add(allSell_i);
				
				// ��ư �׼Ǹ�����
				allSell_i.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						int btnNum = Integer.parseInt(((JButton)e.getSource()).getText());
						if(myacc[btnNum].qua != 0) {
							sell(btnNum, myacc[btnNum].qua);
						}
					}
				});
				
			}
			
			add(list1);
			
			
			//���� �������� ����
			JPanel list2 = new JPanel();
			list2.setBounds(202, 190, 70, 570);
			list2.setBackground(Color.white);
			list2.setLayout(new GridLayout(coin.length, 1));
			
			myQua_arr = new ArrayList<>();
			
			for(int i=0 ; i<coin.length ; i++) {
				
				String qua = dfqua.format(myacc[i].qua);
				JLabel c_i = new JLabel(qua);
				c_i.setBorder(lb);
				c_i.setFont(new Font("���� ���", Font.PLAIN, 12));
				c_i.setHorizontalAlignment(JLabel.CENTER);
				list2.add(c_i);
				myQua_arr.add(c_i);	
				
			}
			
			add(list2);
			
			
			// ���� �򰡱ݾ�, �򰡼���
			JPanel list3 = new JPanel();
			list3.setBounds(272, 190, 100, 570);
			list3.setBackground(Color.white);
			list3.setLayout(new GridLayout(coin.length*2, 1));
			
			nowTot_arr = new ArrayList<>();
			nowSon_arr = new ArrayList<>();
			
			for(int i=0 ; i<coin.length ; i++) {
				
				long nowtot = (long)(coin[i].price * myacc[i].qua);
				String nowTot = dfmoney.format(nowtot);
				JLabel c_i = new JLabel(nowTot + " ");
				c_i.setBorder(lb);
				c_i.setFont(new Font("���� ���", Font.PLAIN, 12));
				c_i.setHorizontalAlignment(JLabel.RIGHT);
				list3.add(c_i);
				nowTot_arr.add(c_i);
				
				String nowSon = dfmoney.format(nowtot - myacc[i].total);
				JLabel d_i = new JLabel(nowSon + " ");
				d_i.setBorder(lb);
				d_i.setFont(new Font("���� ���", Font.PLAIN, 12));
				d_i.setHorizontalAlignment(JLabel.RIGHT);
				list3.add(d_i);
				nowSon_arr.add(d_i);
				
			}
			
			add(list3);
			
			
			// ���簡, ���Դܰ�
			JPanel list4 = new JPanel();
			list4.setBounds(372, 190, 100, 570);
			list4.setBackground(Color.white);
			list4.setLayout(new GridLayout(coin.length * 2, 1));
			
			nowPri_arr = new ArrayList<>();
			unitPri_arr = new ArrayList<>();
			
			for(int i=0 ; i<coin.length ; i++) {
				
				String nowPri = dfmoney.format(coin[i].price);
				JLabel c_i = new JLabel(nowPri + " ");
				c_i.setBorder(lb);
				c_i.setFont(new Font("���� ���", Font.PLAIN, 12));
				c_i.setHorizontalAlignment(JLabel.RIGHT);
				list4.add(c_i);
				nowPri_arr.add(c_i);
				
				String unitPri;
				if(myacc[i].qua != 0) {
					unitPri = dfmoney.format(myacc[i].total/myacc[i].qua);
				} else {
					unitPri = "0";
				}
				JLabel d_i = new JLabel(unitPri + " ");
				d_i.setBorder(lb);
				d_i.setFont(new Font("���� ���", Font.PLAIN, 12));
				d_i.setHorizontalAlignment(JLabel.RIGHT);
				list4.add(d_i);
				unitPri_arr.add(d_i);
				
			}
			
			add(list4);
			
			
			//���ͷ�
			JPanel list5 = new JPanel();
			list5.setBounds(472, 190, 70, 570);
			list5.setBackground(Color.white);
			list5.setLayout(new GridLayout(coin.length, 1));
		
			suik_arr = new ArrayList<>();		
			for(int i=0 ; i<coin.length ; i++) {
				
				double suik;
				if(myacc[i].total != 0) {
					suik = (double)(coin[i].price * myacc[i].qua) / myacc[i].total-1;
				} else {
					suik = 0;
				}
				String Suik = dfper.format(suik);
				
				JLabel c_i = new JLabel(Suik);
				c_i.setBorder(lb);
				c_i.setFont(new Font("���� ���", Font.PLAIN, 12));
				if(suik>0) {
					c_i.setForeground(Color.red);
				} else if(suik<0) {
					c_i.setForeground(Color.blue);
				}
				c_i.setHorizontalAlignment(JLabel.CENTER);
				list5.add(c_i);
				suik_arr.add(c_i);
				
			}
			
			add(list5);
			
			
			setVisible(true);
			setResizable(false);
			
		}
		
		// �ΰ�
		@Override
		public void paint(Graphics g) {
			super.paint(g); 
			g.drawImage(logo, 460, 50, this);
		}
	
	}
	
}


public class UpBitMain {

	public static void main(String[] args) {
		
		int money = 200000000;

		// �������� �Է�
		Coin [] coin = {
				new Coin("��Ʈ����", 40000000, 1.5),
				new Coin("�̴�����", 3000000, 1.8),
				new Coin("����", 1000, 3.5),
				new Coin("����", 7000, 2.5),
				new Coin("��Ʈ����ĳ��", 400000, 2),
				new Coin("�糪", 100000, 2.3),
				new Coin("��������", 800, 5.1),
				new Coin("Ʈ��", 250, 3.3),
				new Coin("����Ʈ����", 120000, 2.2),
				new Coin("�̴�����Ŭ����", 30000, 2.6),
				new Coin("���ý�", 1750, 2.1),
				new Coin("�ֶ�", 102000, 2),
				new Coin("����ڽ�", 3500, 3.2),
				new Coin("�ڽ���", 34000, 2.8),
				new Coin("�÷ο�", 7000, 3)
		};
		
		// �ʱ���� �Է�
		Account [] myacc = {
				new Account("��Ʈ����", 0, 0),
				new Account("�̴�����", 0, 0),
				new Account("����", 0, 0),
				new Account("����", 0, 0),
				new Account("��Ʈ����ĳ��", 0, 0),
				new Account("�糪", 0, 0),
				new Account("��������", 0, 0),
				new Account("Ʈ��", 0, 0),
				new Account("����Ʈ����", 0, 0),
				new Account("�̴�����Ŭ����", 0, 0),
				new Account("���ý�", 0, 0),
				new Account("�ֶ�", 0, 0),
				new Account("����ڽ�", 0, 0),
				new Account("�ڽ���", 0, 0),
				new Account("�÷ο�", 0, 0),
				new Account("����", money, 0)
		};
		
		Browser bw = new Browser(coin, myacc);
		Price timer = new Price(coin, myacc, bw);
		timer.start();
		
	}

}



