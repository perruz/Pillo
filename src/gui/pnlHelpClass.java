package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JPanel;



public class pnlHelpClass extends JPanel {

	private static final long serialVersionUID = -6700787446478609339L;

	public pnlHelpClass() {
		initUI();
	}
	
	public final void initUI() {
		setBackground(Color.WHITE);
		setVisible(false);
		setBounds(0, 0, 800, 600);
		setLayout(null);
		
		JButton btnHelpRtnhome = new JButton("INDIETRO");
		btnHelpRtnhome.setBounds(0, 80, 227, 37);
		btnHelpRtnhome.setBackground(Color.BLUE);
		btnHelpRtnhome.setForeground(Color.WHITE);
		btnHelpRtnhome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnHelpRtnhome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Home.pnlHome.setVisible(true);
				setVisible(false);
				}
		});
		btnHelpRtnhome.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		add(btnHelpRtnhome);
		
		JButton btnAlertFam = new JButton("FAMIGLIARE AVVISATO");
		btnAlertFam.setBounds(230, 200, 400, 200);
		btnAlertFam.setBackground(Color.GREEN);
		btnAlertFam.setForeground(Color.WHITE);
		btnAlertFam.setFont(new Font("Lucida Grande", Font.PLAIN, 32));
		add(btnAlertFam);

				
	}
}
