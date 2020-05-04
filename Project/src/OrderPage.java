import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;

public class OrderPage {
	
	static TreeNode root;
	static double totalPrice;
	JFrame frmOrderPage;
	static JLabel lblprice;
	static JTextArea textArea;
	static LinkedList<Product> P;
	static Tree t;
	private final JLabel lblOrderPage = new JLabel("Order Page");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderPage window = new OrderPage();
					window.frmOrderPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OrderPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		P = new LinkedList();
		t = new Tree();
		
		totalPrice = 0;
		
		frmOrderPage = new JFrame();
		frmOrderPage.setTitle("Order Page");
		frmOrderPage.setBounds(100, 100, 733, 620);
		frmOrderPage.getContentPane().setLayout(null);
		lblOrderPage.setBounds(300, 19, 126, 32);
		frmOrderPage.getContentPane().add(lblOrderPage);
		lblOrderPage.setFont(new Font("Arial", Font.BOLD, 23));		
		
		
		JButton btnBack = new JButton("<< Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				MainMenu window = new MainMenu();
				window.frmMainMenu.setVisible(true);
				
				frmOrderPage.setVisible(false);
			}
		});
		btnBack.setFont(new Font("Arial", Font.BOLD, 18));
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.setBounds(21, 20, 104, 35);
		frmOrderPage.getContentPane().add(btnBack);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 159, 208, 440);
		frmOrderPage.getContentPane().add(panel);
		
		JButton btnDrinks = new JButton("Drinks");
		btnDrinks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				DrinksOrder window = new DrinksOrder();
				window.frmDrinksOrder.setVisible(true);
			}
		});
		btnDrinks.setFont(new Font("Arial", Font.BOLD, 18));
		btnDrinks.setBackground(Color.LIGHT_GRAY);
		btnDrinks.setBounds(21, 49, 165, 50);
		panel.add(btnDrinks);
		
		JButton btnFood = new JButton("Food");
		btnFood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				FoodOrder window = new FoodOrder();
				window.frmFoodOrder.setVisible(true);
			}
		});
		btnFood.setFont(new Font("Arial", Font.BOLD, 18));
		btnFood.setBackground(Color.LIGHT_GRAY);
		btnFood.setBounds(21, 120, 165, 50);
		panel.add(btnFood);
		
		JButton btnDessert = new JButton("Desserts");
		btnDessert.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				DessertsOrder window = new DessertsOrder();
				window.frmDessertsOrder.setVisible(true);
			}
		});
		btnDessert.setFont(new Font("Arial", Font.BOLD, 18));
		btnDessert.setBackground(Color.LIGHT_GRAY);
		btnDessert.setBounds(21, 233, 165, 50);
		panel.add(btnDessert);
		
		JButton btnSalads = new JButton("Salads");
		btnSalads.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				SaladsOrder window = new SaladsOrder();
				window.frmSaladsOrder.setVisible(true);
			}
		});
		btnSalads.setFont(new Font("Arial", Font.BOLD, 18));
		btnSalads.setBackground(Color.LIGHT_GRAY);
		btnSalads.setBounds(21, 304, 165, 50);
		panel.add(btnSalads);
		
		JLabel lblYourOrder = new JLabel("Your Order");
		lblYourOrder.setFont(new Font("Arial", Font.BOLD, 23));
		lblYourOrder.setBounds(454, 106, 126, 32);
		frmOrderPage.getContentPane().add(lblYourOrder);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setFont(new Font("Arial", Font.BOLD, 23));
		lblTotal.setBounds(357, 506, 64, 28);
		frmOrderPage.getContentPane().add(lblTotal);
		
		lblprice = new JLabel("(price)");
		lblprice.setFont(new Font("Arial", Font.BOLD, 23));
		lblprice.setBounds(426, 506, 140, 28);
		frmOrderPage.getContentPane().add(lblprice);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				MainMenu window = new MainMenu();
				Order order = new Order();
				OrderHistory.q.addToQueue(order);
				OrderHistory.q.outputQueue();
				JOptionPane.showMessageDialog(null, "SUCCESS: Order Created! Order ID:" + order.getOrderId());
				
				frmOrderPage.setVisible(false);
				window.frmMainMenu.setVisible(true);
			}
		});
		btnConfirm.setFont(new Font("Arial", Font.BOLD, 18));
		btnConfirm.setBackground(Color.LIGHT_GRAY);
		btnConfirm.setBounds(582, 503, 104, 35);
		frmOrderPage.getContentPane().add(btnConfirm);
		
		textArea = new JTextArea();
		textArea.setBounds(364, 159, 308, 322);
		textArea.setEditable(false);
		frmOrderPage.getContentPane().add(textArea);
		
		lblprice.setText(String.valueOf(totalPrice) + "TL");
		
		frmOrderPage.setResizable(false);
		frmOrderPage.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmOrderPage.setLocationRelativeTo(null); 
	
	}
}
