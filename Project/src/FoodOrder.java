import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FoodOrder {

	JFrame frmFoodOrder;
	private final JLabel lblFoodMenu = new JLabel("Food Menu");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FoodOrder window = new FoodOrder();
					window.frmFoodOrder.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FoodOrder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFoodOrder = new JFrame();
		frmFoodOrder.setTitle("Food Menu");
		frmFoodOrder.setBounds(100, 100, 687, 424);
		frmFoodOrder.getContentPane().setLayout(null);
		lblFoodMenu.setBounds(275, 19, 124, 32);
		frmFoodOrder.getContentPane().add(lblFoodMenu);
		lblFoodMenu.setFont(new Font("Arial", Font.BOLD, 23));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.GRAY);
		panel.setBounds(58, 83, 559, 269);
		frmFoodOrder.getContentPane().add(panel);
		
		JLabel lblMeatHam = new JLabel("Meat & Ham Sandwich................");
		lblMeatHam.setFont(new Font("Arial", Font.PLAIN, 20));
		lblMeatHam.setBounds(21, 112, 305, 26);
		panel.add(lblMeatHam);
		
		JLabel lblChickenSandwich = new JLabel("Chicken Sandwich.......................");
		lblChickenSandwich.setFont(new Font("Arial", Font.PLAIN, 20));
		lblChickenSandwich.setBounds(21, 159, 305, 26);
		panel.add(lblChickenSandwich);
		
		JLabel lblPizza = new JLabel("Margarita Pizza..........................");
		lblPizza.setFont(new Font("Arial", Font.PLAIN, 20));
		lblPizza.setBounds(21, 206, 305, 26);
		panel.add(lblPizza);
		
		JLabel lblCheeseSandwich = new JLabel("Cheese Sandwich.......................");
		lblCheeseSandwich.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCheeseSandwich.setBounds(21, 65, 305, 26);
		panel.add(lblCheeseSandwich);
		
		JLabel lblSimit = new JLabel("Simit..........................................");
		lblSimit.setFont(new Font("Arial", Font.PLAIN, 20));
		lblSimit.setBounds(21, 21, 305, 26);
		panel.add(lblSimit);
		
		JLabel lblSimitPrice = new JLabel("5TL");
		lblSimitPrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblSimitPrice.setBounds(320, 21, 34, 26);
		panel.add(lblSimitPrice);
		
		JLabel lblCheesePrice = new JLabel("10TL");
		lblCheesePrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCheesePrice.setBounds(320, 64, 51, 26);
		panel.add(lblCheesePrice);
		
		JLabel lblMeatPrice = new JLabel("15TL");
		lblMeatPrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblMeatPrice.setBounds(320, 111, 51, 26);
		panel.add(lblMeatPrice);
		
		JLabel lblChickenPrice = new JLabel("17TL");
		lblChickenPrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblChickenPrice.setBounds(320, 158, 51, 26);
		panel.add(lblChickenPrice);
		
		JLabel lblPizzaPrice = new JLabel("30TL");
		lblPizzaPrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblPizzaPrice.setBounds(320, 205, 51, 26);
		panel.add(lblPizzaPrice);
		
		JButton btnAddSimit = new JButton("Add");
		btnAddSimit.setFont(new Font("Arial", Font.BOLD, 15));
		btnAddSimit.setBackground(Color.LIGHT_GRAY);
		btnAddSimit.setBounds(375, 21, 67, 31);
		panel.add(btnAddSimit);
		
		JButton btnAddCheese = new JButton("Add");
		btnAddCheese.setFont(new Font("Arial", Font.BOLD, 15));
		btnAddCheese.setBackground(Color.LIGHT_GRAY);
		btnAddCheese.setBounds(375, 61, 67, 31);
		panel.add(btnAddCheese);
		
		JButton btnAddMeat = new JButton("Add");
		btnAddMeat.setFont(new Font("Arial", Font.BOLD, 15));
		btnAddMeat.setBackground(Color.LIGHT_GRAY);
		btnAddMeat.setBounds(375, 108, 67, 31);
		panel.add(btnAddMeat);
		
		JButton btnAddChicken = new JButton("Add");
		btnAddChicken.setFont(new Font("Arial", Font.BOLD, 15));
		btnAddChicken.setBackground(Color.LIGHT_GRAY);
		btnAddChicken.setBounds(375, 155, 67, 31);
		panel.add(btnAddChicken);
		
		JButton btnAddPizza = new JButton("Add");
		btnAddPizza.setFont(new Font("Arial", Font.BOLD, 15));
		btnAddPizza.setBackground(Color.LIGHT_GRAY);
		btnAddPizza.setBounds(375, 202, 67, 31);
		panel.add(btnAddPizza);
		
		JButton btnRemoveSimit = new JButton("Remove");
		btnRemoveSimit.setForeground(Color.RED);
		btnRemoveSimit.setFont(new Font("Arial", Font.BOLD, 13));
		btnRemoveSimit.setBackground(Color.LIGHT_GRAY);
		btnRemoveSimit.setBounds(451, 21, 87, 31);
		panel.add(btnRemoveSimit);
		
		JButton btnRemoveCheese = new JButton("Remove");
		btnRemoveCheese.setForeground(Color.RED);
		btnRemoveCheese.setFont(new Font("Arial", Font.BOLD, 13));
		btnRemoveCheese.setBackground(Color.LIGHT_GRAY);
		btnRemoveCheese.setBounds(451, 61, 87, 31);
		panel.add(btnRemoveCheese);
		
		JButton btnRemoveMeat = new JButton("Remove");
		btnRemoveMeat.setForeground(Color.RED);
		btnRemoveMeat.setFont(new Font("Arial", Font.BOLD, 13));
		btnRemoveMeat.setBackground(Color.LIGHT_GRAY);
		btnRemoveMeat.setBounds(451, 108, 87, 31);
		panel.add(btnRemoveMeat);
		
		JButton btnRemoveChicken = new JButton("Remove");
		btnRemoveChicken.setForeground(Color.RED);
		btnRemoveChicken.setFont(new Font("Arial", Font.BOLD, 13));
		btnRemoveChicken.setBackground(Color.LIGHT_GRAY);
		btnRemoveChicken.setBounds(451, 155, 87, 31);
		panel.add(btnRemoveChicken);
		
		JButton btnRemovePizza = new JButton("Remove");
		btnRemovePizza.setForeground(Color.RED);
		btnRemovePizza.setFont(new Font("Arial", Font.BOLD, 13));
		btnRemovePizza.setBackground(Color.LIGHT_GRAY);
		btnRemovePizza.setBounds(451, 202, 87, 31);
		panel.add(btnRemovePizza);
		
		frmFoodOrder.setResizable(false);
		frmFoodOrder.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		btnAddSimit.addActionListener(event -> addProduct(lblSimit.getText(), 5));
		btnAddCheese.addActionListener(event -> addProduct(lblCheeseSandwich.getText(), 10));
		btnAddMeat.addActionListener(event -> addProduct(lblMeatHam.getText(), 15));
		btnAddChicken.addActionListener(event -> addProduct(lblChickenSandwich.getText(), 17));
		btnAddPizza.addActionListener(event -> addProduct(lblPizza.getText(), 30));
		
		btnRemoveSimit.addActionListener(event -> removeProduct(lblSimit.getText(), 3));
		btnRemoveCheese.addActionListener(event -> removeProduct(lblCheeseSandwich.getText(), 9));
		btnRemoveMeat.addActionListener(event -> removeProduct(lblMeatHam.getText(), 16));
		btnRemoveChicken.addActionListener(event -> removeProduct(lblChickenSandwich.getText(), 16));
		btnRemovePizza.addActionListener(event -> removeProduct(lblPizza.getText(), 21.5));
	}
	
	private void addProduct(String name, double price)
	{
		boolean hasRoot;
		
		if(OrderPage.root == null)
		{
			hasRoot = false;
		}
		
		else
		{
			hasRoot = true;
		}
		
		if(!hasRoot)
		{
			OrderPage.root = new TreeNode(new Product(name, price));
			OrderPage.t.insert(OrderPage.root);
		}
		
		else
		{
			TreeNode newNode = new TreeNode(new Product(name, price));
			OrderPage.t.insert(newNode);
		}
		
		
		OrderPage.textArea.setText("");
		
		OrderPage.t.iterate(OrderPage.root, OrderPage.textArea);	
		
		
		OrderPage.totalPrice += price;
		OrderPage.lblprice.setText(String.valueOf(OrderPage.totalPrice) + "TL");
	}
	
	private void removeProduct(String name, double price)
	{		
		if(OrderPage.t.getSize() == 1)
		{			
			OrderPage.t.clearTree();
			OrderPage.root = null;
			OrderPage.totalPrice = 0;
			OrderPage.lblprice.setText(String.valueOf(OrderPage.totalPrice) + "TL");
			OrderPage.textArea.setText("");	
			return;
		}
		
		boolean exists = OrderPage.t.delete(new TreeNode(new Product(name, price)));
		
		if(exists && OrderPage.root != null)
		{		
			OrderPage.textArea.setText("");
			OrderPage.t.iterate(OrderPage.root, OrderPage.textArea);					
			OrderPage.totalPrice -= price;
			OrderPage.lblprice.setText(String.valueOf(OrderPage.totalPrice) + "TL");
			
		}
		
		else
		{
			JOptionPane.showMessageDialog(null, "ERROR: Product Not Found");
		}
		
		
	}

}
