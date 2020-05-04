import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPage {

	JFrame frmMenuPage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPage window = new MenuPage();
					window.frmMenuPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenuPage = new JFrame();
		frmMenuPage.setTitle("Menu Page");
		frmMenuPage.setBounds(100, 100, 673, 560);
		frmMenuPage.getContentPane().setLayout(null);
		
		JLabel lblMenu = new JLabel("Menu Page");
		lblMenu.setFont(new Font("Arial", Font.BOLD, 23));
		lblMenu.setBounds(266, 56, 123, 26);
		frmMenuPage.getContentPane().add(lblMenu);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.GRAY);
		panel.setBounds(104, 121, 447, 269);
		frmMenuPage.getContentPane().add(panel);
		
		JButton btnDrinks = new JButton("Drinks");
		btnDrinks.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				DrinksPage window = new DrinksPage();
				window.frmDrinksPage.setVisible(true);
				
				frmMenuPage.setVisible(false);
			}
		});
		btnDrinks.setFont(new Font("Arial", Font.BOLD, 18));
		btnDrinks.setBackground(Color.LIGHT_GRAY);
		btnDrinks.setBounds(21, 40, 165, 50);
		panel.add(btnDrinks);
		
		JButton btnFood = new JButton("Food");
		btnFood.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				FoodPage window = new FoodPage();
				window.frmFoodPage.setVisible(true);
				
				frmMenuPage.setVisible(false);
			}
		});
		btnFood.setFont(new Font("Arial", Font.BOLD, 18));
		btnFood.setBackground(Color.LIGHT_GRAY);
		btnFood.setBounds(261, 40, 165, 50);
		panel.add(btnFood);
		
		JButton btnDessert = new JButton("Desserts");
		btnDessert.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				DessertsPage window = new DessertsPage();
				window.frmDessertsPage.setVisible(true);
				
				frmMenuPage.setVisible(false);
			}
		});
		btnDessert.setFont(new Font("Arial", Font.BOLD, 18));
		btnDessert.setBackground(Color.LIGHT_GRAY);
		btnDessert.setBounds(21, 184, 165, 50);
		panel.add(btnDessert);
		
		JButton btnSalads = new JButton("Salads");
		btnSalads.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				SaladsPage window = new SaladsPage();
				window.frmSaladsPage.setVisible(true);
				
				frmMenuPage.setVisible(false);
			}
		});
		btnSalads.setFont(new Font("Arial", Font.BOLD, 18));
		btnSalads.setBackground(Color.LIGHT_GRAY);
		btnSalads.setBounds(261, 184, 165, 50);
		panel.add(btnSalads);
		
		JButton btnBack = new JButton("<< Back");
		btnBack.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				MainMenu window = new MainMenu();
				window.frmMainMenu.setVisible(true);
				
				frmMenuPage.setVisible(false);
			}
		});
		btnBack.setFont(new Font("Arial", Font.BOLD, 18));
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.setBounds(21, 21, 104, 35);
		frmMenuPage.getContentPane().add(btnBack);
		
		frmMenuPage.setResizable(false);
		frmMenuPage.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmMenuPage.setLocationRelativeTo(null); 
	}

}
