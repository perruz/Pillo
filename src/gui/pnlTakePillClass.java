package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class pnlTakePillClass extends JPanel {

	
	private static final long serialVersionUID = -1258735571158003112L;
	
	
	public pnlTakePillClass() {
		initUI();
	}
	
	public final void initUI() {
		
		/*First panel during sound alarm working*/

		
		setBackground(Color.WHITE);
		setVisible(false);
		setBounds(0, 0, 800, 480);
		setLayout(null);
		
		BufferedImage AlarmTriangleTakePill = null;
		try {
			AlarmTriangleTakePill = ImageIO.read(new File("img/Warning-triangle.png"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		JLabel AlarmPanel = new JLabel((new ImageIcon(AlarmTriangleTakePill)));
		AlarmPanel.setBounds(222, 50, 373, 443);
		add(AlarmPanel);
		
		
		JButton btnTimeToGetPill = new JButton("E' ORA DI PRENDERE LE PILLOLE DELLE 08.30");
		btnTimeToGetPill.setBounds(66, 174, 630, 53);
		add(btnTimeToGetPill);
		btnTimeToGetPill.setBackground(Color.RED);
		btnTimeToGetPill.setForeground(Color.WHITE);
		btnTimeToGetPill.setFont(new Font("Lucida Grande", Font.PLAIN, 21));

		
				
		JButton btnTakePill = new JButton("PRONTO");
		btnTakePill.setBounds(260, 254, 252, 53);
		add(btnTakePill);
		btnTakePill.setBackground(Color.BLUE);
		btnTakePill.setForeground(Color.WHITE);
		btnTakePill.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				initUI2();
				btnTakePill.setVisible(false);
				btnTimeToGetPill.setVisible(false);
				AlarmPanel.setVisible(false);
			}
		});
		btnTakePill.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
	}
		
		
		///////////////////////////////* First panel of "take pill"(08.30 green)*/
		public void initUI2() {
		
		int distance = 160;
		
		JButton btnTimeToGetPill = new JButton("PRENDI 3 PILLOLE DAL CASSETTO 1");
		btnTimeToGetPill.setBounds(99, 44, 573, 53);
		add(btnTimeToGetPill);
		btnTimeToGetPill.setBackground(Color.BLUE);
		btnTimeToGetPill.setForeground(Color.WHITE);
		btnTimeToGetPill.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		
		
		JButton btnPres1_1 = new JButton("08.30");
		btnPres1_1.setBounds(0, 393, 160, 87);
		btnPres1_1.setForeground(Color.WHITE);
		btnPres1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		btnPres1_1.setBackground(Color.GREEN);
		add(btnPres1_1);
		
		
		JButton btnPres1_2 = new JButton("12.30");
		btnPres1_2.setForeground(Color.WHITE);
		btnPres1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		btnPres1_2.setBackground(Color.BLUE);
		btnPres1_2.setBounds(0+distance, 393, 160, 87);
		add(btnPres1_2);
		
		JButton btnPres1_3 = new JButton("15.30");
		btnPres1_3.setForeground(Color.WHITE);
		btnPres1_3.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		btnPres1_3.setBackground(Color.BLUE);
		btnPres1_3.setBounds(0+2*distance, 393, 160, 87);
		add(btnPres1_3);
		
		JButton btnPres1_4 = new JButton("17.30");
		btnPres1_4.setForeground(Color.WHITE);
		btnPres1_4.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		btnPres1_4.setBackground(Color.BLUE);
		btnPres1_4.setBounds(0+3*distance, 393, 160, 87);
		add(btnPres1_4);
		
		JButton btnPres1_5 = new JButton("21.00");
		btnPres1_5.setForeground(Color.WHITE);
		btnPres1_5.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		btnPres1_5.setBackground(Color.BLUE);
		btnPres1_5.setBounds(0+4*distance, 393, 160, 87);
		add(btnPres1_5);
		
		
		
		JButton btnGO = new JButton("AVANTI");
		btnGO.setForeground(Color.WHITE);
		btnGO.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		btnGO.setBackground(Color.BLUE);
		btnGO.setBounds(524, 289, 202, 78);
		add(btnGO);
		btnGO.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Home.pnlTakePill.setVisible(false);
				Home.pnlHome.setVisible(true);
				}
		});
		}
	
		
	}

