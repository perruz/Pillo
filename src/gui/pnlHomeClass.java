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
	setBounds(0, 0, 534, 365);
	JButton btnHomeHelp = new JButton("AIUTO");
	btnHomeHelp.setBounds(0, 159, 93, 37);
	btnHomeHelp.setForeground(Color.BLACK);
	btnHomeHelp.setBackground(Color.GREEN);
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

	BufferedImage myPicture1 = null;
	try {
		myPicture1 = ImageIO.read(new File("img/LifeboxLogo.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	ImageIcon imageForOne = new ImageIcon(myPicture1);
	JButton btnHomeViewpres = new JButton("VEDI PRESCRIZIONE",imageForOne);
	btnHomeViewpres.setBounds(93, 159, 243, 37);
	btnHomeViewpres.setForeground(Color.BLACK);
	btnHomeViewpres.setBackground(Color.blue);

	//Check this
	btnHomeViewpres.addMouseListener(new MouseAdapter() {
			@Override
	public void mouseClicked(MouseEvent e) {
			/*Actions*/
			Home.pnlPres.setVisible(true);
			setVisible(false);

			}
		});
		
	btnHomeViewpres.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
	add(btnHomeViewpres);
	
	
	JButton btnHomeAssorelative = new JButton("ASSOCIA FAMIGLIARE");
	btnHomeAssorelative.setBounds(336, 159, 255, 37);
	btnHomeAssorelative.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlarmTimeWindow window = new AlarmTimeWindow();
				window.setVisible(true);
			}
		});
	btnHomeAssorelative.setSelectedIcon(null);
	btnHomeAssorelative.setBackground(Color.BLUE);
	btnHomeAssorelative.setForeground(Color.BLACK);
	btnHomeAssorelative.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
	add(btnHomeAssorelative);
			
	
	BufferedImage myPicture = null;
			try {
				myPicture = ImageIO.read(new File("img/LifeboxLogo.png"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    JLabel homepanel = new JLabel((new ImageIcon(myPicture)));
	add(homepanel);
	
	}
}
