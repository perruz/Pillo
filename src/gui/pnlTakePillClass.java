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
	private int i=1;
	private JButton btnPres1_1;
	private JButton btnPres1_2;
	private JButton btnPres1_3;
	private JButton btnPres1_4;
	private JButton btnPres1_5;
	
	 private void refresh() {
			
			
			switch(i) {
			 
		    case 2:
				btnPres1_1.setBackground(Color.BLUE);
				btnPres1_2.setBackground(Color.GREEN);
		        break;
		 
		    case 3:
			    	btnPres1_2.setBackground(Color.BLUE);
				btnPres1_3.setBackground(Color.GREEN);
		        break;
		     	 
		    case 4: 
			    	btnPres1_3.setBackground(Color.BLUE);
				btnPres1_4.setBackground(Color.GREEN);
		        break;
		     
		    case 5: 
			    	btnPres1_4.setBackground(Color.BLUE);
				btnPres1_5.setBackground(Color.GREEN);
		        break;
	        
		    default:
			}

	}
	
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
			}
		});
		btnTakePill.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
	}
		
		
		///////////////////////////////* First panel of "take pill"(08.30 green)*/
		private void initUI2() {
		
		int distance = 120;
		
		
		JButton btnPres1_1 = new JButton("08.30");
		btnPres1_1.setBounds(0, 563, 120, 37);
		btnPres1_1.setForeground(Color.WHITE);
		btnPres1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		btnPres1_1.setBackground(Color.GREEN);
		add(btnPres1_1);
		
		
		JButton btnPres1_2 = new JButton("12.30");
		btnPres1_2.setForeground(Color.WHITE);
		btnPres1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		btnPres1_2.setBackground(Color.BLUE);
		btnPres1_2.setBounds(0+distance, 563 , 120, 37);
		add(btnPres1_2);
		
		JButton btnPres1_3 = new JButton("15.30");
		btnPres1_3.setForeground(Color.WHITE);
		btnPres1_3.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		btnPres1_3.setBackground(Color.BLUE);
		btnPres1_3.setBounds(0+1*distance, 563 , 120, 37);
		add(btnPres1_3);
		
		JButton btnPres1_4 = new JButton("17.30");
		btnPres1_4.setForeground(Color.WHITE);
		btnPres1_4.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		btnPres1_4.setBackground(Color.BLUE);
		btnPres1_4.setBounds(0+2*distance, 563 , 120, 37);
		add(btnPres1_4);
		
		JButton btnPres1_5 = new JButton("21.00");
		btnPres1_5.setForeground(Color.WHITE);
		btnPres1_5.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		btnPres1_5.setBackground(Color.BLUE);
		btnPres1_5.setBounds(0+3*distance, 563, 120, 37);
		add(btnPres1_5);
		
		
		
		JButton btnGO = new JButton("AVANTI");
		btnGO.setForeground(Color.WHITE);
		btnGO.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		btnGO.setBackground(Color.BLUE);
		btnGO.setBounds(0+3*distance, 563, 120, 37);
		add(btnGO);
		
		btnGO.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				i=i+1;
				refresh();
				}
		});
		}
	
		
	}

