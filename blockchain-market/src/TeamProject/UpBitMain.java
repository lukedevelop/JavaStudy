// 03.08 18:00 실시간 가격 변동, 거래기능 활성화(코인1개씩)
// 03.09 16:40 매수매도기능 정리
// 03.10 11:00 수량 입력 거래 가능, 내 계좌 실시간변동기능 구현중
// 03.10 20:30 내 계좌 실시간 변동기능 구현중
// 03.11 12:00 기능완성
// 03.11 16:30 자리맞추기, 전량매도 버튼 추가
// 03.14 13:00 끝

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


// 코인 클래스 - 코인의 종류, 가격 등 저장
class Coin {
	
	String name;	// 코인 이름
	long price;		// 코인 가격
	double con;		// 코인 고유의 변동폭 ex) 5 -> ±5%
	
	public Coin(String name, long price, double con) {
		this.name = name;
		this.price = price;
		this.con = con + 0.1;
	}
	
}


// 계좌 클래스 - 코인 잔고, 수량 저장
class Account {
	
	String name;
	long total;	// 코인 총 매수금액
	double qua;	// 코인 보유수량
	
	public Account(String name, long total, double qua) {
		this.name = name;
		this.total = total;
		this.qua = qua;
	}
	
}


// 실시간 가격 변동 클래스
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
					
					// 코인 가격 변환
					coin[i].price = (int)(coin[i].price*(100 - coin[i].con + 2*coin[i].con*Math.random())*0.01);

					// 변수정리 
					long nowtot = (long)(coin[i].price*myacc[i].qua);							
					double suik;
					if(myacc[i].total != 0) {
						suik = (double)(coin[i].price*myacc[i].qua)/myacc[i].total-1;
					} else {
						suik = 0;
					}
					String nowPri = dfmoney.format(coin[i].price);				// 코인의 현재가격
					String nowTot = dfmoney.format(nowtot);						// 보유코인 평가금액
					String nowSonik = dfmoney.format(nowtot-myacc[i].total);	// 보유코인 평가손익
					String Suik = dfper.format(suik);							// 보유코인 수익률

					// 수익률에 따른 색상변환
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
					
					// 스윙창 실시간 변화 setText
					bw.nowPri_arr.get(i).setText(nowPri+" ");
					bw.myAccount.nowPri_arr.get(i).setText(nowPri+" ");
					bw.myAccount.nowTot_arr.get(i).setText(nowTot + " ");
					bw.myAccount.nowSon_arr.get(i).setText(nowSonik + " ");
					bw.myAccount.suik_arr.get(i).setText(Suik);
					
					// 총액 변수
					tot_money += myacc[i].qua*coin[i].price;
					tot_coin_maip += myacc[i].total;
					
				}
				
				// 내 계좌 총액 변수
				long tot_sonik = tot_money-myacc[coin.length].total-tot_coin_maip;
				double tot_suik = (tot_coin_maip != 0 ? (double)(tot_money-myacc[coin.length].total)/tot_coin_maip-1 : 0);	// 총 수익률

				String tot_Money = dfmoney.format(tot_money);							// 총 자산
				String tot_Coin = dfmoney.format(tot_money-myacc[coin.length].total);	// 전체코인 평가금액
				String tot_Sonik = dfmoney.format(tot_sonik);							// 총 평가손익
				String tot_Suik = dfper.format(tot_suik);								// 총 수익률
				
				// 스윙창 실시간 변화 setText
				bw.myAccount.tot_1.setText("  추정 자산  :  " + tot_Money);
				bw.myAccount.tot_4.setText("  코인 평가금액  :  " + tot_Coin);
				bw.myAccount.tot_5.setText("  평가 손익  :  " + tot_Sonik);
				bw.myAccount.tot_6.setText("  평가 수익률  :  " + tot_Suik);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}


// 메인프레임
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
	
	// 메인 창
	public Browser(Coin[]coin, Account[]myacc) {
		
		super("업비트");
		this.coin = coin;
		this.myacc = myacc;
		
		String myMoney = dfmoney.format(myacc[coin.length].total);	// 현금
		
		setBounds(100, 50, 600, 850); // 실제 사이즈 584*781
		Container con = getContentPane();
		con.setBackground(new Color(9,54,135));
		setLayout(null);
		
		//메뉴바
		JMenuBar bar = new JMenuBar();
		setJMenuBar(bar);
		JButton account = new JButton("내 계좌");
		account.setBackground(Color.white);
		bar.add(account);
		
		// 내계좌 실행 버튼
		account.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myAccount = new MyAccount();
			}
		});

		//로고
		Toolkit	kit = Toolkit.getDefaultToolkit();
		logo = kit.getImage("ffff/upbit.png");
		
		JLabel title = new JLabel("Markets");
		title.setBounds(44, 26, 120, 30);
		title.setFont(new Font("휴먼둥근헤드라인", Font.ITALIC, 21));
		title.setForeground(Color.white);
		add(title);
		
		//
		JPanel firstLine = new JPanel();
		firstLine.setBounds(42, 60, 500, 40);
		firstLine.setBackground(new Color(244, 245, 248));
		firstLine.setLayout(null);
		
		JLabel n_1 = new JLabel("한글명");
		n_1.setBounds(0, 0, 200, 40);
		n_1.setBorder(lb);
		n_1.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		n_1.setHorizontalAlignment(JLabel.CENTER);
		firstLine.add(n_1);
		
		JLabel n_2 = new JLabel("현재가");
		n_2.setBounds(200, 0, 140, 40);
		n_2.setBorder(lb);
		n_2.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		n_2.setHorizontalAlignment(JLabel.CENTER);
		firstLine.add(n_2);
		
		n_3 = new JLabel("현금 : " + myMoney);
		n_3.setBounds(340, 0, 160, 40);
		n_3.setBorder(lb);
		n_3.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		n_3.setHorizontalAlignment(JLabel.CENTER);
		firstLine.add(n_3);
	
		add(firstLine);
		
		// 코인 리스트
		JPanel coinList = new JPanel();
		coinList.setBounds(42, 100, 200, 630);
		coinList.setBackground(Color.white);
		coinList.setLayout(new GridLayout(coin.length,1));
				
		for(int i=0 ; i<coin.length ; i++) {
			ImageIcon icon_i = new ImageIcon("ffff/bitcoin"+i+".png");
			JLabel c_i = new JLabel(" " + coin[i].name, icon_i, SwingConstants.LEFT);
			c_i.setBorder(lb);
			c_i.setFont(new Font("맑은 고딕", Font.BOLD, 15));
			coinList.add(c_i);
		}
		
		add(coinList);
		
		// 코인가격
		JPanel priceList = new JPanel();
		priceList.setBounds(242, 100, 140, 630);
		priceList.setBackground(Color.white);
		priceList.setLayout(new GridLayout(coin.length,1));
		
		nowPri_arr = new ArrayList<>();
		for(int i=0 ; i<coin.length ; i++) {
			String nowPri = dfmoney.format(coin[i].price);
			JLabel c_i = new JLabel(nowPri + " ");
			c_i.setBorder(lb);
			c_i.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
			c_i.setHorizontalAlignment(JLabel.RIGHT);
			priceList.add(c_i);
			nowPri_arr.add(c_i);
		}
		
		add(priceList);
				
		// 매수버튼
		JPanel buyList = new JPanel();
		buyList.setBounds(382, 100, 80, 630);
		buyList.setBackground(Color.white);
		buyList.setLayout(new GridLayout(coin.length,1));
		
		for(int i=0 ; i<coin.length ; i++) {
			JButton buyBtn_i = new JButton("매수");
			buyBtn_i.setBackground(Color.white);
			buyBtn_i.setFont(new Font("맑은 고딕", Font.BOLD, 14));
			buyBtn_i.setForeground(Color.red);
			buyList.add(buyBtn_i);
			
			// 매수버튼 액션리스너
			buyBtn_i.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
					int buynum = ((JButton)e.getSource()).getY() / (buyList.getHeight()/coin.length);	// 매수버튼 배열번호(i)
					double qua = 0;
					
					try {
						qua = Double.parseDouble(JOptionPane.showInputDialog("[" + coin[buynum].name + " 매수] 수량을 입력해주세요."));
						if(qua<0.01) {
							System.out.println("0.01개 이상부터 매수가 가능합니다.");
							System.out.println("-----------------");
						} else {
							buy(buynum, qua);
						}
					} catch(Exception e1) {
						System.out.println("숫자를 입력해주세요.");
						System.out.println("-----------------");
					}
					
				}
			});
			
		}
		add(buyList);

		// 매도버튼
		JPanel sellList = new JPanel();
		sellList.setBounds(462, 100, 80, 630);
		sellList.setBackground(Color.white);
		sellList.setLayout(new GridLayout(coin.length,1));
		
		for(int i=0 ; i<coin.length ; i++) {
			JButton sellBtn_i = new JButton("매도");
			sellBtn_i.setBackground(Color.white);
			sellBtn_i.setFont(new Font("맑은 고딕", Font.BOLD, 14));
			sellBtn_i.setForeground(Color.blue);
			sellList.add(sellBtn_i);

			// 매도버튼 액션리스너
			sellBtn_i.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
					int sellnum = ((JButton)e.getSource()).getY() / (sellList.getHeight()/coin.length);	// 배열번호 (i)
					double qua = 0;
					
					try {
						qua = Double.parseDouble(JOptionPane.showInputDialog("[" + coin[sellnum].name + " 매도] 수량을 입력해주세요."));
						if(qua<0.01) {
							System.out.println("0.01개 이상부터 매도가 가능합니다.");
							System.out.println("-----------------");
						} else {
							sell(sellnum, qua);
						}
					} catch(Exception e1) {
						System.out.println("숫자를 입력해주세요.");
						System.out.println("-----------------");
					}
					
				}
			});
			
		}
		add(sellList);
		
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// 내 계좌 실행
		myAccount = new MyAccount();
		
	}
	
	
	// 로고
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(logo, 460, 80, this);
	}

	
	// 매수 메소드
	void buy(int i, double k) {
					
		if(myacc[coin.length].total >= k*coin[i].price) {
		
			// 변수
			String buyQua = dfqua.format(k);					// 거래 수량
			String nowPri = dfmoney.format(coin[i].price);		// 코인 가격
			
			// 매수 거래
			myacc[coin.length].total -= k*coin[i].price;
			myacc[i].qua += k;
			myacc[i].total += k*coin[i].price;
			System.out.println(sdf.format(today));
			System.out.println(coin[i].name + " " + buyQua + "개 매수");
			System.out.println("매입단가 : " + nowPri + "원");
			
			// 거래 후 변수
			String myMoney = dfmoney.format(myacc[coin.length].total);		// 현금
			String qua = dfqua.format(myacc[i].qua);						// 코인 보유량
			String unitPri = dfmoney.format(myacc[i].total/myacc[i].qua);	// 매수 단가
			int tot_coinmaip = 0;
				for(int j=0 ; j<coin.length ; j++) {
					tot_coinmaip += myacc[j].total;
				}
			String totCoinMaip = dfmoney.format(tot_coinmaip);				// 총 매입금액
			
			// 코인 매수 후 setText
			n_3.setText("현금 : " + myMoney);
			myAccount.myQua_arr.get(i).setText(qua);
			myAccount.unitPri_arr.get(i).setText(unitPri + " ");
			myAccount.tot_2.setText("  현금 자산  :  " + myMoney);
			myAccount.tot_3.setText("  코인 매입금액  :  " + totCoinMaip);
			
			// 콘솔창 출력
			result();
			
		} else {
			String myMoney = dfmoney.format(myacc[coin.length].total);	// 현금
			System.out.println("현금이 부족합니다.");
			System.out.println("현금 : " + myMoney);
			System.out.println("-----------------");
		}
	
	}
	
	
	// 매도 메소드
	void sell(int i, double k) {
		
		if(myacc[i].qua >= k) {
			
			// 변수
			String sellQua = dfqua.format(k);				// 거래 수량
			String nowPri = dfmoney.format(coin[i].price);	// 코인 가격
						
			// 매도 거래
			myacc[coin.length].total += k*coin[i].price;
			myacc[i].qua -= k;
			myacc[i].total *= myacc[i].qua;
			myacc[i].total = (int)(myacc[i].total/(myacc[i].qua+k));
			System.out.println(sdf.format(today));
			System.out.println(coin[i].name + " " + sellQua + "개 매도");
			System.out.println("매도단가 : " + nowPri + "원");
			
			// 거래 후 변수
			String myMoney = dfmoney.format(myacc[coin.length].total);
			String qua = dfqua.format(myacc[i].qua);
			int tot_coin_maip = 0;
				for(int j=0 ; j<coin.length ; j++) {
					tot_coin_maip += myacc[j].total;
				}
			String tot_Coin_Maip = dfmoney.format(tot_coin_maip);
			
			// 코인 매도 후 setText
			n_3.setText("현금 : " + myMoney);
			if (myacc[i].qua == 0) {
				myAccount.unitPri_arr.get(i).setText("0 ");
			}
			myAccount.myQua_arr.get(i).setText(qua);
			myAccount.tot_2.setText("  현금 자산  :  " + myMoney);
			myAccount.tot_3.setText("  코인 매입금액  :  " + tot_Coin_Maip);
			
			// 콘솔창 출력
			result();
			
		} else {
			String qua = dfqua.format(myacc[i].qua);
			System.out.println("보유코인이 부족합니다.");
			System.out.println(myacc[i].name + " 보유 갯수 : " + qua + "개");
			System.out.println("-----------------");
		}
		
	}
	
	
	// 콘솔창 표시
	void result() {
		
		// 변수
		long tot_money = myacc[coin.length].total;
		for(int i=0 ; i<coin.length ; i++) {
			tot_money += myacc[i].qua*coin[i].price;
		}
		String tot_Money = dfmoney.format(tot_money);
		String myMoney = dfmoney.format(myacc[coin.length].total);
		
		
		// 출력
		System.out.println();
		System.out.println("총 자산 : " + tot_Money + "원");
		System.out.println("현금 : " + myMoney + "원");
		if ((tot_money - myacc[coin.length].total) != 0 ) {
			System.out.println();
			System.out.println("-- 보유 코인 목록 --");
		}
		for(int i=0 ; i<coin.length ; i++) {
			if(myacc[i].qua != 0) {
				String qua = dfqua.format(myacc[i].qua);
				String unitPri = dfmoney.format(myacc[i].total/myacc[i].qua);
				System.out.println(myacc[i].name + " " + qua + "개\t매입단가 : " + unitPri);
			}
		}
		System.out.println("-----------------");
				
	}
	

	// 내계좌 
	class MyAccount extends JFrame {
		
		ArrayList<JLabel> nowPri_arr, suik_arr, myQua_arr, nowTot_arr, nowSon_arr, unitPri_arr;
		JLabel tot_1, tot_2, tot_3, tot_4, tot_5, tot_6;
		
		public MyAccount() {
			super("내 계좌");
			
			// 프레임 설정
			setBounds(705, 50, 600, 850);
			Container con = getContentPane();
			con.setBackground(new Color(9,54,135));
			setLayout(null);
			LineBorder lb = new LineBorder(Color.gray);
						
			JLabel title = new JLabel("Account");
			title.setBounds(44, 26, 120, 30);
			title.setFont(new Font("휴먼둥근헤드라인", Font.ITALIC, 21));
			title.setForeground(Color.white);
			add(title);
			
			// 전체 자산내역
			JPanel tot = new JPanel();
			tot.setBounds(42, 60, 500, 80);
			tot.setBackground(Color.white);
			tot.setLayout(null);
			
			// 변수 선언
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
			
			String tot_Money = dfmoney.format(tot_money);							// 총 자산
			String myMoney = dfmoney.format(myacc[coin.length].total);				// 보유 현금
			String tot_Coin_Maip = dfmoney.format(tot_coin_maip);					// 총 매입금
			String tot_Coin = dfmoney.format(tot_money-myacc[coin.length].total);	// 보유코인 평가금액
			String tot_Sonik = dfmoney.format(tot_sonik);							// 전체 평가손익
			String tot_Su = dfper.format(tot_su);									// 총 수익률
								
			tot_1 = new JLabel("  추정 자산  :  " + tot_Money);
			tot_1.setBounds(0,0,160,40);
			tot_1.setBorder(lb);
			tot_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
			tot.add(tot_1);
			
			tot_2 = new JLabel("  현금 자산  :  " + myMoney);
			tot_2.setBounds(0,40,160,40);
			tot_2.setBorder(lb);
			tot_2.setFont(new Font("맑은 고딕", Font.BOLD, 12));
			tot.add(tot_2);
			
			tot_3 = new JLabel("  코인 매입금액  :  " + tot_Coin_Maip);
			tot_3.setBounds(160,0,180,40);
			tot_3.setBorder(lb);
			tot_3.setFont(new Font("맑은 고딕", Font.BOLD, 12));
			tot.add(tot_3);
			
			tot_4 = new JLabel("  코인 평가금액  :  " + tot_Coin);
			tot_4.setBounds(160,40,180,40);
			tot_4.setBorder(lb);
			tot_4.setFont(new Font("맑은 고딕", Font.BOLD, 12));
			tot.add(tot_4);
			
			tot_5 = new JLabel("  평가 손익  :  " + tot_Sonik);
			tot_5.setBounds(340,0,160,40);
			tot_5.setBorder(lb);
			tot_5.setFont(new Font("맑은 고딕", Font.BOLD, 12));
			tot.add(tot_5);		
			
			tot_6 = new JLabel("  평가 수익률  :  " + tot_Su );
			tot_6.setBounds(340,40,160,40);
			tot_6.setBorder(lb);
			tot_6.setFont(new Font("맑은 고딕", Font.BOLD, 12));
			tot.add(tot_6);
					
			add(tot);
			
			
			// 이름
			JPanel name = new JPanel();
			name.setBounds(42, 140, 500, 50);
			name.setBackground(new Color(244, 245, 248));
			name.setLayout(null);
			
			String [] nameLab = {"보유코인", "보유수량", "<html><body><center>평가금액<br>평가손익</body></html>",
					"<html><body><center>현재가<br>매입단가</body></html>", "수익률" };
			int [] widLab = {0, 160, 230, 330, 430, 500};
			for (int i=0 ; i<5 ; i++) {
				JLabel name_i = new JLabel(nameLab[i]);
				name_i.setBounds(widLab[i], 0, widLab[i+1]-widLab[i], 50);
				name_i.setFont(new Font("맑은 고딕", Font.BOLD, 12));
				name_i.setBorder(lb);
				name_i.setHorizontalAlignment(JLabel.CENTER);
				name.add(name_i);
			}
			
			add(name);
			
			
			// 보유코인 리스트
			JPanel list1 = new JPanel();
			list1.setBounds(42, 190, 160, 570);
			list1.setBackground(Color.white);
			list1.setLayout(new GridLayout(coin.length, 1));
			
			for(int i=0 ; i<coin.length ; i++) {
				
				JLabel c_i = new JLabel("  " + coin[i].name);
				c_i.setBorder(lb);
				c_i.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
				list1.add(c_i);
				
				// 전량매도 버튼
				ImageIcon icon = new ImageIcon("ffff/전량매도.jpg");
				JButton allSell_i = new JButton(i+"", icon);
				allSell_i.setBackground(Color.white);
				allSell_i.setFont(new Font("맑은 고딕", Font.PLAIN, 8));
				allSell_i.setBounds(125,5,30,30);
				c_i.add(allSell_i);
				
				// 버튼 액션리스너
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
			
			
			//코인 보유수량 라인
			JPanel list2 = new JPanel();
			list2.setBounds(202, 190, 70, 570);
			list2.setBackground(Color.white);
			list2.setLayout(new GridLayout(coin.length, 1));
			
			myQua_arr = new ArrayList<>();
			
			for(int i=0 ; i<coin.length ; i++) {
				
				String qua = dfqua.format(myacc[i].qua);
				JLabel c_i = new JLabel(qua);
				c_i.setBorder(lb);
				c_i.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
				c_i.setHorizontalAlignment(JLabel.CENTER);
				list2.add(c_i);
				myQua_arr.add(c_i);	
				
			}
			
			add(list2);
			
			
			// 코인 평가금액, 평가손익
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
				c_i.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
				c_i.setHorizontalAlignment(JLabel.RIGHT);
				list3.add(c_i);
				nowTot_arr.add(c_i);
				
				String nowSon = dfmoney.format(nowtot - myacc[i].total);
				JLabel d_i = new JLabel(nowSon + " ");
				d_i.setBorder(lb);
				d_i.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
				d_i.setHorizontalAlignment(JLabel.RIGHT);
				list3.add(d_i);
				nowSon_arr.add(d_i);
				
			}
			
			add(list3);
			
			
			// 현재가, 매입단가
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
				c_i.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
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
				d_i.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
				d_i.setHorizontalAlignment(JLabel.RIGHT);
				list4.add(d_i);
				unitPri_arr.add(d_i);
				
			}
			
			add(list4);
			
			
			//수익률
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
				c_i.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
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
		
		// 로고
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

		// 코인정보 입력
		Coin [] coin = {
				new Coin("비트코인", 40000000, 1.5),
				new Coin("이더리움", 3000000, 1.8),
				new Coin("리플", 1000, 3.5),
				new Coin("퀀텀", 7000, 2.5),
				new Coin("비트코인캐시", 400000, 2),
				new Coin("루나", 100000, 2.3),
				new Coin("도지코인", 800, 5.1),
				new Coin("트론", 250, 3.3),
				new Coin("라이트코인", 120000, 2.2),
				new Coin("이더리움클래식", 30000, 2.6),
				new Coin("스택스", 1750, 2.1),
				new Coin("솔라나", 102000, 2),
				new Coin("샌드박스", 3500, 3.2),
				new Coin("코스모스", 34000, 2.8),
				new Coin("플로우", 7000, 3)
		};
		
		// 초기계좌 입력
		Account [] myacc = {
				new Account("비트코인", 0, 0),
				new Account("이더리움", 0, 0),
				new Account("리플", 0, 0),
				new Account("퀀텀", 0, 0),
				new Account("비트코인캐시", 0, 0),
				new Account("루나", 0, 0),
				new Account("도지코인", 0, 0),
				new Account("트론", 0, 0),
				new Account("라이트코인", 0, 0),
				new Account("이더리움클래식", 0, 0),
				new Account("스택스", 0, 0),
				new Account("솔라나", 0, 0),
				new Account("샌드박스", 0, 0),
				new Account("코스모스", 0, 0),
				new Account("플로우", 0, 0),
				new Account("현금", money, 0)
		};
		
		Browser bw = new Browser(coin, myacc);
		Price timer = new Price(coin, myacc, bw);
		timer.start();
		
	}

}



