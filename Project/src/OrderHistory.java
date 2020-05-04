import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OrderHistory {

	JFrame frmOrderHistory;
	static Queue q;
	static JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderHistory window = new OrderHistory();
					window.frmOrderHistory.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OrderHistory() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmOrderHistory = new JFrame();
		frmOrderHistory.setTitle("Order History");
		frmOrderHistory.setBounds(100, 100, 436, 590);
		frmOrderHistory.getContentPane().setLayout(null);
		
		JLabel lblOrderHistory = new JLabel("Order History");
		lblOrderHistory.setFont(new Font("Arial", Font.BOLD, 23));
		lblOrderHistory.setBounds(134, 30, 148, 32);
		frmOrderHistory.getContentPane().add(lblOrderHistory);
		
		textArea.setBounds(60, 103, 302, 375);
		textArea.setEditable(false);
		frmOrderHistory.getContentPane().add(textArea);
		
		JButton btnBack = new JButton("<< Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				AccountPage window= new AccountPage();
				window.frmAccountPage.setVisible(true);
				
				frmOrderHistory.setVisible(false);
			}
		});
		btnBack.setFont(new Font("Arial", Font.BOLD, 14));
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.setBounds(5, 21, 95, 32);
		frmOrderHistory.getContentPane().add(btnBack);
		
		JLabel lblOrderId = new JLabel("Order ID");
		lblOrderId.setFont(new Font("Arial", Font.PLAIN, 14));
		lblOrderId.setBounds(60, 74, 54, 32);
		frmOrderHistory.getContentPane().add(lblOrderId);
		
		JLabel lblOrderDate = new JLabel("Order Date");
		lblOrderDate.setFont(new Font("Arial", Font.PLAIN, 14));
		lblOrderDate.setBounds(291, 74, 71, 32);
		frmOrderHistory.getContentPane().add(lblOrderDate);
		
		JButton btnClearHistory = new JButton("Clear History");
		btnClearHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				q.emptyQueue();
			}
		});
		btnClearHistory.setFont(new Font("Arial", Font.BOLD, 13));
		btnClearHistory.setBackground(Color.LIGHT_GRAY);
		btnClearHistory.setBounds(140, 499, 123, 32);
		frmOrderHistory.getContentPane().add(btnClearHistory);
		
		frmOrderHistory.setResizable(false);
		frmOrderHistory.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmOrderHistory.setLocationRelativeTo(null); 
	}
}
