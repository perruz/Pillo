package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JPanel;

public class pnlPresClass extends JPanel {

	private static final long serialVersionUID = -5753507215249578083L;

	public pnlPresClass() {
		initUI();
	}
	
	public final void initUI() {
		setBackground(Color.WHITE);
		setVisible(false);
		setBounds(0, 0, 982, 550);
		setLayout(null);
		JButton btnPresRtnhome = new JButton("INDIETRO");
		btnPresRtnhome.setBounds(0, 130, 318, 37);
		btnPresRtnhome.setBackground(Color.BLUE);
		btnPresRtnhome.setForeground(Color.WHITE);
		add(btnPresRtnhome);
		btnPresRtnhome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Home.pnlHome.setVisible(true);
				setVisible(false);

			}
		});
		btnPresRtnhome.setFont(new Font("Lucida Grande", Font.PLAIN, 21));


	}
}
