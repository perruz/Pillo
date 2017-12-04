package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.border.Border;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.Choice;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JDesktopPane;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.ImageIcon;
import java.awt.Panel;
import net.miginfocom.swing.MigLayout;

public class Home {

	private JFrame frame;
	private static Home window;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new Home();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("Desktop.background"));
		frame.setBounds(0, 0, 1000, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	/**
	 * Initialize all the panel objs.
	 */
		
		JPanel pnlHome;
		JPanel pnlPres;
		JPanel pnlHelp;
		
		pnlHome = new JPanel();
			pnlHome.setBackground(Color.WHITE);
			pnlHome.setForeground(Color.WHITE);
			pnlHome.setBounds(0, 0, 1000, 550);
			frame.getContentPane().add(pnlHome);
		
		
		pnlPres = new JPanel();
			pnlPres.setBackground(Color.WHITE);
			pnlPres.setVisible(false);
		
		pnlHelp = new JPanel();
			pnlHelp.setBackground(Color.WHITE);
			pnlHelp.setVisible(false);
			pnlHelp.setBounds(0, 0, 1000, 550);
			pnlHelp.setLayout(null);

			frame.getContentPane().add(pnlHelp);
			
			
			
			
			JButton btnHomeHelp = new JButton("AIUTO");
			btnHomeHelp.setForeground(Color.BLACK);
			btnHomeHelp.setBackground(Color.GREEN);
			btnHomeHelp.setBounds(0, 96, 304, 37);
			btnHomeHelp.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
			btnHomeHelp.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						pnlHome.setVisible(false);
						pnlHelp.setVisible(true);
					}
				});
			btnHomeHelp.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
			pnlHome.add(btnHomeHelp);
			
			JButton btnHomeViewpres = new JButton("VEDI PRESCRIZIONE");
			btnHomeViewpres.setForeground(Color.BLACK);
			btnHomeViewpres.setBackground(Color.blue);
			btnHomeViewpres.setBounds(0, 146, 304, 37);
			btnHomeViewpres.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					}
				});
			btnHomeViewpres.addMouseListener(new MouseAdapter() {
					@Override
			public void mouseClicked(MouseEvent e) {
						pnlHome.setVisible(false);
						pnlPres.setVisible(true);
					}
				});
				
			btnHomeViewpres.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
			pnlHome.add(btnHomeViewpres);
			
			
			JButton btnHomeAssorelative = new JButton("ASSOCIA FAMIGLIARE");
			btnHomeAssorelative.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						AlarmTimeWindow window = new AlarmTimeWindow();
						window.setVisible(true);
					}
				});
			btnHomeAssorelative.setSelectedIcon(null);
			btnHomeAssorelative.setBackground(Color.BLUE);
			btnHomeAssorelative.setForeground(Color.BLACK);
			btnHomeAssorelative.setBounds(0, 196, 304, 39);
			btnHomeAssorelative.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
			pnlHome.add(btnHomeAssorelative);
			
						

JButton btnHelpRtnhome = new JButton("INDIETRO");
		btnHelpRtnhome.setBounds(0, 130, 320, 37);
		btnHelpRtnhome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnHelpRtnhome.setBackground(Color.BLUE);
		btnHelpRtnhome.setForeground(Color.WHITE);
		
		pnlHelp.add(btnHelpRtnhome);
		btnHelpRtnhome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pnlHelp.setVisible(false);
				pnlHome.setVisible(true);
				}
		});
		btnHelpRtnhome.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
				pnlPres.setBounds(0, 0, 982, 550);
				frame.getContentPane().add(pnlPres);
				pnlPres.setLayout(null);
				

JButton btnPresRtnhome = new JButton("INDIETRO");
				btnPresRtnhome.setBounds(0, 130, 318, 37);
				btnPresRtnhome.setBackground(Color.BLUE);
				btnPresRtnhome.setForeground(Color.WHITE);
				pnlPres.add(btnPresRtnhome);
				btnPresRtnhome.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						pnlPres.setVisible(false);
						pnlHome.setVisible(true);
						}
				});
				btnPresRtnhome.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
			
			
			
			pnlHome.setBackground(Color.WHITE);
			pnlHome.setForeground(Color.WHITE);
			
			
			pnlHome.setBounds(0, 0, 1000, 550);
			frame.getContentPane().add(pnlHome);
			
			
			pnlHome.setLayout(null);
			
						
			
			BufferedImage myPicture = null;
					try {
						myPicture = ImageIO.read(new File("img/LifeboxLogo.png"));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						JLabel homepanel = new JLabel((new ImageIcon(myPicture)));
						homepanel.setBounds(447, 36, 355, 426);
						pnlHome.add(homepanel);
			
	}
}
	 /**
	 * END of initialize frame.
	 */