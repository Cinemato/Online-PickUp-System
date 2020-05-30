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

public class LoginPage {

	JFrame frmLogin;
	static JTextField userNameTextField;
	static JTextField passTextField;
	
	User users[];
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private String getTextField()
	{
		return userNameTextField.getText();
	}
	
	private void initialize() {
		users = new User[3]; 
		
		users[0] = new User("Khaled", "4444"); //Constant Values Because No Time For Database, Use Them To Enter
		users[1] = new User("Basma", "333");
		users[2] = new User("Adam", "22");
		
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 627, 507);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login Page");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 23));
		lblNewLabel.setBounds(240, 35, 125, 26);
		frmLogin.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setForeground(Color.WHITE);
		panel.setBounds(59, 102, 498, 257);
		frmLogin.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblUserName = new JLabel("User Name:");
		lblUserName.setFont(new Font("Arial", Font.BOLD, 23));
		lblUserName.setBounds(61, 74, 127, 26);
		panel.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Arial", Font.BOLD, 23));
		lblPassword.setBounds(61, 121, 117, 26);
		panel.add(lblPassword);
		
		userNameTextField = new JTextField();
		userNameTextField.setFont(new Font("Arial", Font.PLAIN, 21));
		userNameTextField.setBounds(199, 71, 232, 32);
		panel.add(userNameTextField);
		userNameTextField.setColumns(10);
		
		JButton loginBtn = new JButton("Login");
		
		loginBtn.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent arg0) 
			{		
				boolean exists = false;
				
				for(int i = 0; i < users.length; i++)
				{
					if(userNameTextField.getText().equals(users[i].getName()) && passTextField.getText().equals(users[i].getPassword()))
					{				
						exists = true;
						MainMenu window = new MainMenu();
						OrderHistory.q = new Queue();
						window.frmMainMenu.setVisible(true);
						
						frmLogin.setVisible(false);
						break;
					}
				}
				
				if(!exists)
				{
					JOptionPane.showMessageDialog(null, "ERROR: Wrong Username or Password");
				}
				
			}
		});
		
		
		loginBtn.setBackground(Color.LIGHT_GRAY);
		loginBtn.setFont(new Font("Arial", Font.BOLD, 21));
		loginBtn.setBounds(171, 185, 141, 35);
		panel.add(loginBtn);
		
		passTextField = new JTextField();
		passTextField.setFont(new Font("Arial", Font.PLAIN, 21));
		passTextField.setColumns(10);
		passTextField.setBounds(199, 118, 232, 32);
		panel.add(passTextField);
		
		frmLogin.setResizable(false);
		frmLogin.setLocationRelativeTo(null); 
	}
}
