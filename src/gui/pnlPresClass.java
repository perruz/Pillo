package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
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

import classes.loadDatabase;

public class pnlPresClass extends JPanel {

	private static final long serialVersionUID = -5753507215249578083L;
	private loadDatabase databaseLocal;
	
	public pnlPresClass(loadDatabase database) {
		databaseLocal=database;
		initUI();
	}
	
	private class JLabelResize extends JLabel
	{
	    /**
		 * 
		 */
		private static final long serialVersionUID = 7958902697982183627L;
		ImageIcon imageIcon;
	    public JLabelResize(ImageIcon icon)
	    {
	        super();
	        this.imageIcon = icon;
	    }
	    @Override
	    public void paintComponent(Graphics g)
	    {
	        super.paintComponent(g);
	        g.drawImage(imageIcon.getImage(),0,0,getWidth(),getHeight(),this);
	    }
	}
	
	public final void initUI() {
		setBackground(Color.WHITE);
		setVisible(false);
		setBounds(0, 0, 800, 600);
		setLayout(null);
		
		/* First panel of "vedi prescrizione"(08.30 green)*/
		
		int distance = 37;
		
		JButton btnPresRtnhome = new JButton("INDIETRO");
		btnPresRtnhome.setBounds(0, 80, 227, 37);
		add(btnPresRtnhome);
		btnPresRtnhome.setBackground(Color.BLUE);
		btnPresRtnhome.setForeground(Color.WHITE);
		btnPresRtnhome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				Home.pnlHome.setVisible(true);
				}
		});
		btnPresRtnhome.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		
		JButton btnPres1_1 = new JButton(databaseLocal.getPrescription(1).TimeHours+":"+databaseLocal.getPrescription(1).TimeMinute);
		btnPres1_1.setBounds(0, 140, 227, 37);
		btnPres1_1.setForeground(Color.WHITE);
		btnPres1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		btnPres1_1.setBackground(Color.GREEN);
		add(btnPres1_1);
		
		
		JButton btnPres1_2 = new JButton(databaseLocal.getPrescription(2).TimeHours+":"+databaseLocal.getPrescription(2).TimeMinute);
		btnPres1_2.setForeground(Color.WHITE);
		btnPres1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		btnPres1_2.setBackground(Color.BLUE);
		btnPres1_2.setBounds(0, 140+distance, 227, 37);
		add(btnPres1_2);
		
		JButton btnPres1_3 = new JButton(databaseLocal.getPrescription(3).TimeHours+":"+databaseLocal.getPrescription(3).TimeMinute);
		btnPres1_3.setForeground(Color.WHITE);
		btnPres1_3.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		btnPres1_3.setBackground(Color.BLUE);
		btnPres1_3.setBounds(0, 140+2*distance, 227, 37);
		add(btnPres1_3);
		
		JButton btnPres1_4 = new JButton(databaseLocal.getPrescription(4).TimeHours+":"+databaseLocal.getPrescription(4).TimeMinute);
		btnPres1_4.setForeground(Color.WHITE);
		btnPres1_4.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		btnPres1_4.setBackground(Color.BLUE);
		btnPres1_4.setBounds(0, 140+3*distance, 227, 37);
		add(btnPres1_4);
		
		JButton btnPres1_5 = new JButton(databaseLocal.getPrescription(5).TimeHours+":"+databaseLocal.getPrescription(5).TimeMinute);
		btnPres1_5.setForeground(Color.WHITE);
		btnPres1_5.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		btnPres1_5.setBackground(Color.BLUE);
		btnPres1_5.setBounds(0, 140+4*distance, 227, 37);
		add(btnPres1_5);
		
		/*
		 * Text test (actually doesn't work)
		txtX = new JTextField();
		txtX.setBorder(null);
		txtX.setBounds(300, 300, 300, 300);
		txtX.setBackground(Color.WHITE);
		txtX.setForeground(Color.BLACK);
		pnlPres1.add(txtX);
		txtX.setText("X 2");
		txtX.setColumns(10);
		pnlHome.setLayout(null);
		*/
		
	/*******************************************	//*Image buffering section*/
		
		
			BufferedImage Balaton0830 = null;
			try {
				Balaton0830 = ImageIO.read(new File("img/Balaton0830.png"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			JLabelResize BalatonPanel = new JLabelResize((new ImageIcon(Balaton0830)));
				BalatonPanel.setBounds(222, 50, 373, 443);
				BalatonPanel.repaint();
				add(BalatonPanel);
			
			
				
			BufferedImage Enantyum0830 = null;
			try {
				Enantyum0830 = ImageIO.read(new File("img/Enantyum0830.jpg"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			JLabel EnantyumPanel = new JLabel((new ImageIcon(Enantyum0830)));
			EnantyumPanel.setBounds(222, 50, 373, 443);
				add(EnantyumPanel);
			
				
				BufferedImage Zirtec1230 = null;
				try {
					Zirtec1230 = ImageIO.read(new File("img/Zirtec1230.jpg"));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				JLabel ZirtecPanel = new JLabel((new ImageIcon(Zirtec1230)));
				ZirtecPanel.setBounds(222, 50, 373, 443);
				add(ZirtecPanel);
				ZirtecPanel.setVisible(false);
				
				
				BufferedImage Medicinale1530 = null;
				try {
					Medicinale1530 = ImageIO.read(new File("img/Zirtec1230.jpg"));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				JLabel MedicinalePanel = new JLabel((new ImageIcon(Medicinale1530)));
				MedicinalePanel.setBounds(222, 50, 373, 443);
				add(MedicinalePanel);
				MedicinalePanel.setVisible(false);
		
				
				BufferedImage Medicinale21730 = null;
				try {
					Medicinale21730 = ImageIO.read(new File("img/Zirtec1230.jpg"));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				JLabel Medicinale2Panel = new JLabel((new ImageIcon(Medicinale21730)));
				Medicinale2Panel.setBounds(222, 50, 373, 443);
				add(Medicinale2Panel);
				Medicinale2Panel.setVisible(false);
				
				
				BufferedImage Medicinale32100 = null;
				try {
					Medicinale32100 = ImageIO.read(new File("img/Zirtec1230.jpg"));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				JLabel Medicinale3Panel = new JLabel((new ImageIcon(Medicinale32100)));
				Medicinale3Panel.setBounds(222, 50, 373, 443);
				add(Medicinale3Panel);
				Medicinale3Panel.setVisible(false);
			
			
//////////////////////////////////////////////* Panel of "vedi prescrizione"(Dynamic)*/		
				
			btnPres1_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					btnPres1_1.setBackground(Color.GREEN);
					btnPres1_2.setBackground(Color.BLUE);
					btnPres1_3.setBackground(Color.BLUE);
					btnPres1_4.setBackground(Color.BLUE);
					btnPres1_5.setBackground(Color.BLUE);	
					BalatonPanel.setVisible(true);
					EnantyumPanel.setVisible(true);
					ZirtecPanel.setVisible(false);
					MedicinalePanel.setVisible(false);
					Medicinale2Panel.setVisible(false);
					Medicinale3Panel.setVisible(false);
					}
			});		
			
			btnPres1_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					btnPres1_1.setBackground(Color.BLUE);
					btnPres1_2.setBackground(Color.GREEN);
					btnPres1_3.setBackground(Color.BLUE);
					btnPres1_4.setBackground(Color.BLUE);
					btnPres1_5.setBackground(Color.BLUE);
					BalatonPanel.setVisible(false);
					EnantyumPanel.setVisible(false);
					ZirtecPanel.setVisible(true);
					MedicinalePanel.setVisible(false);
					Medicinale2Panel.setVisible(false);
					Medicinale3Panel.setVisible(false);
					}
			});				
			
			btnPres1_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					btnPres1_1.setBackground(Color.BLUE);
					btnPres1_2.setBackground(Color.BLUE);
					btnPres1_3.setBackground(Color.GREEN);
					btnPres1_4.setBackground(Color.BLUE);
					btnPres1_5.setBackground(Color.BLUE);
					BalatonPanel.setVisible(false);
					EnantyumPanel.setVisible(false);
					ZirtecPanel.setVisible(false);
					MedicinalePanel.setVisible(true);
					Medicinale2Panel.setVisible(false);
					Medicinale3Panel.setVisible(false);
					}
			});	
			
			btnPres1_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					btnPres1_1.setBackground(Color.BLUE);
					btnPres1_2.setBackground(Color.BLUE);
					btnPres1_3.setBackground(Color.BLUE);
					btnPres1_4.setBackground(Color.GREEN);
					btnPres1_5.setBackground(Color.BLUE);
					BalatonPanel.setVisible(false);
					EnantyumPanel.setVisible(false);
					ZirtecPanel.setVisible(false);
					MedicinalePanel.setVisible(false);
					Medicinale2Panel.setVisible(true);
					Medicinale3Panel.setVisible(false);
					}
			});	
				
			btnPres1_5.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					btnPres1_1.setBackground(Color.BLUE);
					btnPres1_2.setBackground(Color.BLUE);
					btnPres1_3.setBackground(Color.BLUE);
					btnPres1_4.setBackground(Color.BLUE);
					btnPres1_5.setBackground(Color.GREEN);
					BalatonPanel.setVisible(false);
					EnantyumPanel.setVisible(false);
					ZirtecPanel.setVisible(false);
					MedicinalePanel.setVisible(false);
					Medicinale2Panel.setVisible(false);
					Medicinale3Panel.setVisible(true);
					}
			});	
					

	


	}
}
