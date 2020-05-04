import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AccountPage {

	JFrame frmAccountPage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountPage window = new AccountPage();
					window.frmAccountPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AccountPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAccountPage = new JFrame();
		frmAccountPage.setTitle("Account Page");
		frmAccountPage.setBounds(100, 100, 657, 593);
		frmAccountPage.getContentPane().setLayout(null);
		
		JLabel lblYourAccount = new JLabel("Your Account Details");
		lblYourAccount.setFont(new Font("Arial", Font.BOLD, 23));
		lblYourAccount.setBounds(198, 66, 238, 26);
		frmAccountPage.getContentPane().add(lblYourAccount);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.GRAY);
		panel.setBounds(95, 137, 447, 269);
		frmAccountPage.getContentPane().add(panel);
		
		JLabel lblUserName = new JLabel("User Name:");
		lblUserName.setFont(new Font("Arial", Font.BOLD, 23));
		lblUserName.setBounds(70, 51, 127, 26);
		panel.add(lblUserName);
		

		
		
		JLabel lblname = new JLabel(LoginPage.userNameTextField.getText());
		lblname.setFont(new Font("Arial", Font.BOLD, 23));
		lblname.setBounds(268, 51, 158, 26);
		panel.add(lblname);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Arial", Font.BOLD, 23));
		lblPassword.setBounds(70, 116, 127, 26);
		panel.add(lblPassword);
		
		JLabel lblpass = new JLabel(LoginPage.passTextField.getText());
		lblpass.setFont(new Font("Arial", Font.BOLD, 23));
		lblpass.setBounds(268, 116, 158, 26);
		panel.add(lblpass);
		
		JButton btnOrderHistory = new JButton("Order History");
		btnOrderHistory.setFont(new Font("Arial", Font.BOLD, 18));
		btnOrderHistory.setBackground(Color.LIGHT_GRAY);
		btnOrderHistory.setBounds(135, 193, 165, 35);		
		btnOrderHistory.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				try 
				{
					OrderHistory.q.outputQueue();
					OrderHistory window = new OrderHistory();
					window.frmOrderHistory.setVisible(true);
				
					frmAccountPage.setVisible(false);
				}
				catch(Exception e) {}			
			}
		});
		
		panel.add(btnOrderHistory);
		
		JButton btnBack = new JButton("<< Back");
		btnBack.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				MainMenu window = new MainMenu();
				window.frmMainMenu.setVisible(true);
				
				frmAccountPage.setVisible(false);
			}
		});
		btnBack.setFont(new Font("Arial", Font.BOLD, 18));
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.setBounds(21, 21, 104, 35);
		frmAccountPage.getContentPane().add(btnBack);
		
		frmAccountPage.setResizable(false);
		frmAccountPage.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmAccountPage.setLocationRelativeTo(null); 
	}

}
