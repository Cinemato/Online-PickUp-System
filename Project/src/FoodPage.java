import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FoodPage {

	JFrame frmFoodPage;
	private final JLabel lblFoodMenu = new JLabel("Food Menu");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FoodPage window = new FoodPage();
					window.frmFoodPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FoodPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFoodPage = new JFrame();
		frmFoodPage.setTitle("Food Menu");
		frmFoodPage.setBounds(100, 100, 566, 424);
		frmFoodPage.getContentPane().setLayout(null);
		lblFoodMenu.setBounds(213, 19, 124, 32);
		frmFoodPage.getContentPane().add(lblFoodMenu);
		lblFoodMenu.setFont(new Font("Arial", Font.BOLD, 23));
		
		JButton btnBack = new JButton("<< Back");
		btnBack.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				MenuPage window = new MenuPage();
				window.frmMenuPage.setVisible(true);
				
				frmFoodPage.setVisible(false);
			}
		});
		btnBack.setFont(new Font("Arial", Font.BOLD, 18));
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.setBounds(21, 20, 104, 35);
		frmFoodPage.getContentPane().add(btnBack);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.GRAY);
		panel.setBounds(53, 83, 447, 269);
		frmFoodPage.getContentPane().add(panel);
		
		JLabel lblMeatHam = new JLabel("Meat & Ham Sandwich................");
		lblMeatHam.setFont(new Font("Arial", Font.PLAIN, 20));
		lblMeatHam.setBounds(53, 112, 305, 26);
		panel.add(lblMeatHam);
		
		JLabel lblChickenSandwich = new JLabel("Chicken Sandwich.......................");
		lblChickenSandwich.setFont(new Font("Arial", Font.PLAIN, 20));
		lblChickenSandwich.setBounds(53, 159, 305, 26);
		panel.add(lblChickenSandwich);
		
		JLabel lblPizza = new JLabel("Margarita Pizza..........................");
		lblPizza.setFont(new Font("Arial", Font.PLAIN, 20));
		lblPizza.setBounds(53, 206, 305, 26);
		panel.add(lblPizza);
		
		JLabel lblCheeseSandwich = new JLabel("Cheese Sandwich.......................");
		lblCheeseSandwich.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCheeseSandwich.setBounds(53, 65, 305, 26);
		panel.add(lblCheeseSandwich);
		
		JLabel lblSimit = new JLabel("Simit..........................................");
		lblSimit.setFont(new Font("Arial", Font.PLAIN, 20));
		lblSimit.setBounds(53, 21, 305, 26);
		panel.add(lblSimit);
		
		JLabel lblSimitPrice = new JLabel("5TL");
		lblSimitPrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblSimitPrice.setBounds(352, 21, 34, 26);
		panel.add(lblSimitPrice);
		
		JLabel lblCheesePrice = new JLabel("10TL");
		lblCheesePrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCheesePrice.setBounds(352, 64, 51, 26);
		panel.add(lblCheesePrice);
		
		JLabel lblMeatPrice = new JLabel("15TL");
		lblMeatPrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblMeatPrice.setBounds(352, 111, 51, 26);
		panel.add(lblMeatPrice);
		
		JLabel lblChickenPrice = new JLabel("17TL");
		lblChickenPrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblChickenPrice.setBounds(350, 158, 51, 26);
		panel.add(lblChickenPrice);
		
		JLabel lblPizzaPrice = new JLabel("30TL");
		lblPizzaPrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblPizzaPrice.setBounds(350, 205, 51, 26);
		panel.add(lblPizzaPrice);
		
		frmFoodPage.setResizable(false);
		frmFoodPage.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmFoodPage.setLocationRelativeTo(null); 
	}

}
