package gui;


import java.awt.Color;
import java.awt.EventQueue;
import classes.loadDatabase;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class Home {

	private JFrame frame;
	private static Home window;
	private static loadDatabase database;
	
	public static pnlHomeClass pnlHome;
	public static pnlPresClass pnlPres;
	public static pnlHelpClass pnlHelp;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					database = new loadDatabase();
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
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(0, 0, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		try {
		    UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
		 } catch (Exception e) {
		            e.printStackTrace();
		 }
		
	
		pnlHome = new pnlHomeClass();
		pnlPres = new pnlPresClass(database);
		pnlHelp = new pnlHelpClass();
		
	    frame.getContentPane().add(pnlHome);
	    frame.getContentPane().add(pnlHelp);
	    frame.getContentPane().add(pnlPres);
	    
	    pnlHome.setVisible(true);
		
	}

}
	 /**
	 * END of initialize frame.
	 */