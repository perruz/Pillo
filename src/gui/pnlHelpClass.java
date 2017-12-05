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
		btnHelpRtnhome.setBounds(0, 130, 320, 37);
		btnHelpRtnhome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnHelpRtnhome.setBackground(Color.BLUE);
		btnHelpRtnhome.setForeground(Color.WHITE);
		
		add(btnHelpRtnhome);
		btnHelpRtnhome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Home.pnlHome.setVisible(true);
				setVisible(false);
				}
		});
		btnHelpRtnhome.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		
	}
}
