package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class pnlHomeClass extends JPanel {
	
	private static final long serialVersionUID = -281723726844708202L;

	public pnlHomeClass() {
		initUI();
	}
	
	public final void initUI() {
	setVisible(false);
	setBackground(Color.WHITE);
	setForeground(Color.WHITE);
	setBounds(0, 0, 800, 480);
	
	
	JButton btnHomeViewpres = new JButton("VEDI PRESCRIZIONE");
	btnHomeViewpres.setForeground(Color.WHITE);
	btnHomeViewpres.setBackground(Color.BLUE);
	btnHomeViewpres.setBounds(10, 220, 263, 146);
	btnHomeViewpres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
	btnHomeViewpres.addMouseListener(new MouseAdapter() {
			@Override
	public void mouseClicked(MouseEvent e) {
				setVisible(false);
				Home.pnlPres.setVisible(true);
			}
		});
	btnHomeViewpres.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
	add(btnHomeViewpres);
	
	
	JButton btnHomeHelp = new JButton("AIUTO");
	btnHomeHelp.setBounds(543, 220, 252, 146);
	btnHomeHelp.setForeground(Color.WHITE);
	btnHomeHelp.setBackground(new Color(220,20,60));
	btnHomeHelp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			/*Actions*/
			Home.pnlHelp.setVisible(true);
			setVisible(false);
			}
		});
	setLayout(null);
	btnHomeHelp.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
	add(btnHomeHelp);

	
	
	/*
	 * Icon setting setting
	 * 
	 * ImageIcon imageForOne = new ImageIcon(myPicture1);
	JButton btnHomeViewpres = new JButton("VEDI PRESCRIZIONE",imageForOne);
	btnHomeViewpres.setBounds(93, 159, 243, 37);
	btnHomeViewpres.setForeground(Color.BLACK);
	btnHomeViewpres.setBackground(Color.blue);

	//Check this
	btnHomeViewpres.addMouseListener(new MouseAdapter() {
			@Override
	public void mouseClicked(MouseEvent e) {
			*Actions/
			Home.pnlPres.setVisible(true);
			setVisible(false);


			}
		});
		
	btnHomeViewpres.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
	add(btnHomeViewpres);
	*/
	
	/////////////////////////////////////////////////////////////////*Hidden Buttons start*/
	
	JButton btnHomeAlarmSetting = new JButton("O");
	btnHomeAlarmSetting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlarmTimeWindow window = new AlarmTimeWindow();
				window.setVisible(true);
			}
		});
	btnHomeAlarmSetting.setSelectedIcon(null);
	btnHomeAlarmSetting.setBackground(Color.BLUE);
	btnHomeAlarmSetting.setForeground(Color.WHITE);
	btnHomeAlarmSetting.setBounds(600, 420, 50, 52);
	btnHomeAlarmSetting.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
	add(btnHomeAlarmSetting);
	
	
	JButton btnTakePill = new JButton("1");
	btnTakePill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home.pnlTakePill.setVisible(true);
				setVisible(false);
			}
		});
	btnTakePill.setSelectedIcon(null);
	btnTakePill.setBackground(Color.BLUE);
	btnTakePill.setForeground(Color.WHITE);
	btnTakePill.setBounds(650, 420, 50, 52);
	btnTakePill.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
	add(btnTakePill);
	
	JButton btnInsertPill = new JButton("2");
	btnInsertPill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home.pnlInsertPill.setVisible(true);
				setVisible(false);
			}
		});
	btnInsertPill.setSelectedIcon(null);
	btnInsertPill.setBackground(Color.BLUE);
	btnInsertPill.setForeground(Color.WHITE);
	btnInsertPill.setBounds(700, 420, 50, 52);
	btnInsertPill.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
	add(btnInsertPill);
	
	
	/////////////////////////////////////////////////////////////////*Hidden Buttons end*/

		
			
	
	BufferedImage myPicture = null;
			try {
				myPicture = ImageIO.read(new File("img/LifeboxLogo.png"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    JLabel homepanel = new JLabel((new ImageIcon(myPicture)));
    homepanel.setBounds(222, 50, 373, 443);
	add(homepanel);
	homepanel.setVisible(true); 
	
	}
}
