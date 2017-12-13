package gui;

import java.awt.Color;
import java.awt.Font;
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
	setBounds(0, 0, 800, 600);
	
	JButton btnHomeHelp = new JButton("AIUTO");
	btnHomeHelp.setBounds(553, 176, 241, 174);
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
	
	JButton btnHomeAlarmSetting = new JButton("IMPOSTA ORARIO");
	btnHomeAlarmSetting.setBounds(336, 159, 255, 37);
	btnHomeAlarmSetting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlarmTimeWindow window = new AlarmTimeWindow();
				window.setVisible(true);
			}
		});
	btnHomeAlarmSetting.setSelectedIcon(null);
	btnHomeAlarmSetting.setBackground(Color.BLUE);
	btnHomeAlarmSetting.setForeground(Color.WHITE);
	btnHomeAlarmSetting.setBounds(6, 362, 241, 85);
	btnHomeAlarmSetting.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
	add(btnHomeAlarmSetting);
	
	JButton btnHomeViewpres = new JButton("VEDI PRESCRIZIONE");
	btnHomeViewpres.setForeground(Color.WHITE);
	btnHomeViewpres.setBackground(Color.BLUE);
	btnHomeViewpres.setBounds(6, 176, 241, 174);
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
	add(homepanel);
	
	}
}
