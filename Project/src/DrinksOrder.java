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
import java.util.*;

public class DrinksOrder {

	JFrame frmDrinksOrder;
	private final JLabel lblDrinksMenu = new JLabel("Drinks Menu");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DrinksOrder window = new DrinksOrder();
					window.frmDrinksOrder.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DrinksOrder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDrinksOrder = new JFrame();
		frmDrinksOrder.setTitle("Drinks Menu");
		frmDrinksOrder.setBounds(100, 100, 687, 424);
		frmDrinksOrder.getContentPane().setLayout(null);
		lblDrinksMenu.setBounds(257, 21, 142, 32);
		frmDrinksOrder.getContentPane().add(lblDrinksMenu);
		lblDrinksMenu.setFont(new Font("Arial", Font.BOLD, 23));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.GRAY);
		panel.setBounds(53, 83, 559, 269);
		frmDrinksOrder.getContentPane().add(panel);
		
		JLabel lblTea = new JLabel("Tea............................................");
		lblTea.setFont(new Font("Arial", Font.PLAIN, 20));
		lblTea.setBounds(21, 21, 305, 26);
		panel.add(lblTea);
		
		JLabel lblTurkishCoffee = new JLabel("Turkish Coffee............................");
		lblTurkishCoffee.setFont(new Font("Arial", Font.PLAIN, 20));
		lblTurkishCoffee.setBounds(21, 65, 305, 26);
		panel.add(lblTurkishCoffee);
		
		JLabel lblCappuccino = new JLabel("Cappuccino................................");
		lblCappuccino.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCappuccino.setBounds(21, 112, 294, 26);
		panel.add(lblCappuccino);
		
		JLabel lblAmericano = new JLabel("Americano..................................");
		lblAmericano.setFont(new Font("Arial", Font.PLAIN, 20));
		lblAmericano.setBounds(21, 159, 305, 26);
		panel.add(lblAmericano);
		
		JLabel lblFrappuccino = new JLabel("Frappuccino.............................");
		lblFrappuccino.setFont(new Font("Arial", Font.PLAIN, 20));
		lblFrappuccino.setBounds(21, 206, 294, 26);
		panel.add(lblFrappuccino);
		
		JLabel lblTeaPrice = new JLabel("3TL");
		lblTeaPrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblTeaPrice.setBounds(320, 21, 34, 26);
		panel.add(lblTeaPrice);
		
		JLabel lblCoffePrice = new JLabel("9TL");
		lblCoffePrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCoffePrice.setBounds(320, 64, 34, 26);
		panel.add(lblCoffePrice);
		
		JLabel lblCapPrice = new JLabel("16TL");
		lblCapPrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCapPrice.setBounds(320, 111, 45, 26);
		panel.add(lblCapPrice);
		
		JLabel lblAmericaPrice = new JLabel("16TL");
		lblAmericaPrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblAmericaPrice.setBounds(318, 158, 45, 26);
		panel.add(lblAmericaPrice);
		
		JLabel lblFrapPrice = new JLabel("21.5TL");
		lblFrapPrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblFrapPrice.setBounds(306, 206, 62, 26);
		panel.add(lblFrapPrice);
		
		JButton btnAddTea = new JButton("Add");
		btnAddTea.setFont(new Font("Arial", Font.BOLD, 15));
		btnAddTea.setBackground(Color.LIGHT_GRAY);
		btnAddTea.setBounds(375, 20, 67, 31);
		panel.add(btnAddTea);
		
		JButton btnAddCoffee = new JButton("Add");
		btnAddCoffee.setFont(new Font("Arial", Font.BOLD, 15));
		btnAddCoffee.setBackground(Color.LIGHT_GRAY);
		btnAddCoffee.setBounds(375, 60, 67, 31);
		panel.add(btnAddCoffee);
		
		JButton btnAddCap = new JButton("Add");
		btnAddCap.setFont(new Font("Arial", Font.BOLD, 15));
		btnAddCap.setBackground(Color.LIGHT_GRAY);
		btnAddCap.setBounds(375, 107, 67, 31);
		panel.add(btnAddCap);
		
		JButton btnAddAmerica = new JButton("Add");
		btnAddAmerica.setFont(new Font("Arial", Font.BOLD, 15));
		btnAddAmerica.setBackground(Color.LIGHT_GRAY);
		btnAddAmerica.setBounds(375, 154, 67, 31);
		panel.add(btnAddAmerica);
		
		JButton btnAddFrap = new JButton("Add");
		btnAddFrap.setFont(new Font("Arial", Font.BOLD, 15));
		btnAddFrap.setBackground(Color.LIGHT_GRAY);
		btnAddFrap.setBounds(375, 201, 67, 31);
		panel.add(btnAddFrap);
		
		JButton btnRemoveTea = new JButton("Remove");
		btnRemoveTea.setForeground(Color.RED);
		btnRemoveTea.setFont(new Font("Arial", Font.BOLD, 13));
		btnRemoveTea.setBackground(Color.LIGHT_GRAY);
		btnRemoveTea.setBounds(451, 20, 87, 31);
		panel.add(btnRemoveTea);
		
		JButton btnRemoveCoffee = new JButton("Remove");
		btnRemoveCoffee.setForeground(Color.RED);
		btnRemoveCoffee.setFont(new Font("Arial", Font.BOLD, 13));
		btnRemoveCoffee.setBackground(Color.LIGHT_GRAY);
		btnRemoveCoffee.setBounds(451, 60, 87, 31);
		panel.add(btnRemoveCoffee);
		
		JButton btnRemoveCap = new JButton("Remove");
		btnRemoveCap.setForeground(Color.RED);
		btnRemoveCap.setFont(new Font("Arial", Font.BOLD, 13));
		btnRemoveCap.setBackground(Color.LIGHT_GRAY);
		btnRemoveCap.setBounds(451, 107, 87, 31);
		panel.add(btnRemoveCap);
		
		JButton btnRemoveAmerica = new JButton("Remove");
		btnRemoveAmerica.setForeground(Color.RED);
		btnRemoveAmerica.setFont(new Font("Arial", Font.BOLD, 13));
		btnRemoveAmerica.setBackground(Color.LIGHT_GRAY);
		btnRemoveAmerica.setBounds(451, 154, 87, 31);
		panel.add(btnRemoveAmerica);
		
		JButton btnRemoveFrap = new JButton("Remove");
		btnRemoveFrap.setForeground(Color.RED);
		btnRemoveFrap.setFont(new Font("Arial", Font.BOLD, 13));
		btnRemoveFrap.setBackground(Color.LIGHT_GRAY);
		btnRemoveFrap.setBounds(451, 201, 87, 31);
		panel.add(btnRemoveFrap);
		
		btnAddTea.addActionListener(event -> addProduct(lblTea.getText(), 3));
		btnAddCoffee.addActionListener(event -> addProduct(lblTurkishCoffee.getText(), 9));
		btnAddCap.addActionListener(event -> addProduct(lblCappuccino.getText(), 16));
		btnAddAmerica.addActionListener(event -> addProduct(lblAmericano.getText(), 16));
		btnAddFrap.addActionListener(event -> addProduct(lblFrappuccino.getText(), 21.5));
		
		btnRemoveTea.addActionListener(event -> removeProduct(lblTea.getText(), 3));
		btnRemoveCoffee.addActionListener(event -> removeProduct(lblTurkishCoffee.getText(), 9));
		btnRemoveCap.addActionListener(event -> removeProduct(lblCappuccino.getText(), 16));
		btnRemoveAmerica.addActionListener(event -> removeProduct(lblAmericano.getText(), 16));
		btnRemoveFrap.addActionListener(event -> removeProduct(lblFrappuccino.getText(), 21.5));
		
		frmDrinksOrder.setResizable(false);
		frmDrinksOrder.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
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
