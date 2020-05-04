import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu {

	JFrame frmMainMenu;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
					window.frmMainMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMainMenu = new JFrame();
		frmMainMenu.setTitle("Main Window");
		frmMainMenu.setBounds(100, 100, 587, 626);
		frmMainMenu.getContentPane().setLayout(null);
		
		JLabel lblWelcome = new JLabel("Main Window");
		lblWelcome.setFont(new Font("Arial", Font.BOLD, 23));
		lblWelcome.setBounds(208, 48, 150, 26);
		frmMainMenu.getContentPane().add(lblWelcome);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.GRAY);
		panel.setBounds(103, 110, 359, 399);
		frmMainMenu.getContentPane().add(panel);
		
		JButton btnOrder = new JButton("Order");
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				OrderPage window = new OrderPage();
				window.t.clearTree();
				window.root = null;
				window.frmOrderPage.setVisible(true);
				
				frmMainMenu.setVisible(false);
			}
		});
		btnOrder.setFont(new Font("Arial", Font.BOLD, 21));
		btnOrder.setBackground(Color.LIGHT_GRAY);
		btnOrder.setBounds(108, 205, 141, 35);
		panel.add(btnOrder);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				MenuPage window = new MenuPage();
				window.frmMenuPage.setVisible(true);
				
				frmMainMenu.setVisible(false);
			}
		});
		btnMenu.setFont(new Font("Arial", Font.BOLD, 21));
		btnMenu.setBackground(Color.LIGHT_GRAY);
		btnMenu.setBounds(108, 126, 141, 35);
		panel.add(btnMenu);
		
		JButton btnAccount = new JButton("Account");
		btnAccount.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				AccountPage window = new AccountPage();
				window.frmAccountPage.setVisible(true);
				
				frmMainMenu.setVisible(false);
			}
		});
		btnAccount.setFont(new Font("Arial", Font.BOLD, 21));
		btnAccount.setBackground(Color.LIGHT_GRAY);
		btnAccount.setBounds(108, 49, 141, 35);
		panel.add(btnAccount);
		
		JButton btnSignOut = new JButton("Sign Out");
		btnSignOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				int a = JOptionPane.showConfirmDialog(null, "Are You Sure?");
				if(a == JOptionPane.YES_OPTION)
				{
					LoginPage window = new LoginPage();
					window.frmLogin.setVisible(true);
					
					frmMainMenu.setVisible(false);
				}
			}
		});
		btnSignOut.setForeground(Color.RED);
		btnSignOut.setFont(new Font("Arial", Font.BOLD, 21));
		btnSignOut.setBackground(Color.LIGHT_GRAY);
		btnSignOut.setBounds(108, 315, 141, 35);
		panel.add(btnSignOut);
		
		frmMainMenu.setResizable(false);
		frmMainMenu.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		frmMainMenu.setLocationRelativeTo(null); 
	}

}
