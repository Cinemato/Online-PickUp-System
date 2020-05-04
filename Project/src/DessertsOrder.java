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

public class DessertsOrder {

	JFrame frmDessertsOrder;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DessertsOrder window = new DessertsOrder();
					window.frmDessertsOrder.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DessertsOrder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDessertsOrder = new JFrame();
		frmDessertsOrder.setTitle("Desserts Menu");
		frmDessertsOrder.setBounds(100, 100, 687, 424);
		frmDessertsOrder.getContentPane().setLayout(null);
		
		JLabel lblDessertsMenu = new JLabel("Desserts Menu");
		lblDessertsMenu.setFont(new Font("Arial", Font.BOLD, 23));
		lblDessertsMenu.setBounds(250, 21, 167, 32);
		frmDessertsOrder.getContentPane().add(lblDessertsMenu);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.GRAY);
		panel.setBounds(53, 83, 559, 269);
		frmDessertsOrder.getContentPane().add(panel);
		
		JLabel lblBagel = new JLabel("Bagel.........................................");
		lblBagel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblBagel.setBounds(21, 21, 305, 26);
		panel.add(lblBagel);
		
		JLabel lblCookie = new JLabel("Chocolate Cookie......................");
		lblCookie.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCookie.setBounds(21, 65, 305, 26);
		panel.add(lblCookie);
		
		JLabel lblVanillaIcecream = new JLabel("Vanilla Icecream........................");
		lblVanillaIcecream.setFont(new Font("Arial", Font.PLAIN, 20));
		lblVanillaIcecream.setBounds(21, 112, 294, 26);
		panel.add(lblVanillaIcecream);
		
		JLabel lblCake = new JLabel("Cake.......................................");
		lblCake.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCake.setBounds(21, 159, 305, 26);
		panel.add(lblCake);
		
		JLabel lblBaklava = new JLabel("Baklava.....................................");
		lblBaklava.setFont(new Font("Arial", Font.PLAIN, 20));
		lblBaklava.setBounds(21, 206, 294, 26);
		panel.add(lblBaklava);
		
		JLabel lblBagelPrice = new JLabel("6TL");
		lblBagelPrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblBagelPrice.setBounds(320, 21, 34, 26);
		panel.add(lblBagelPrice);
		
		JLabel lblCookiePrice = new JLabel("13TL");
		lblCookiePrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCookiePrice.setBounds(306, 64, 45, 26);
		panel.add(lblCookiePrice);
		
		JLabel lblVanillaPrice = new JLabel("19.5TL");
		lblVanillaPrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblVanillaPrice.setBounds(306, 111, 62, 26);
		panel.add(lblVanillaPrice);
		
		JLabel lblCakePrice = new JLabel("21.5TL");
		lblCakePrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCakePrice.setBounds(306, 158, 64, 26);
		panel.add(lblCakePrice);
		
		JLabel lblBaklavaPrice = new JLabel("24TL");
		lblBaklavaPrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblBaklavaPrice.setBounds(320, 205, 51, 26);
		panel.add(lblBaklavaPrice);
		
		JButton btnAddBagel = new JButton("Add");
		btnAddBagel.setFont(new Font("Arial", Font.BOLD, 15));
		btnAddBagel.setBackground(Color.LIGHT_GRAY);
		btnAddBagel.setBounds(375, 21, 67, 31);
		panel.add(btnAddBagel);
		
		JButton btnAddCookie = new JButton("Add");
		btnAddCookie.setFont(new Font("Arial", Font.BOLD, 15));
		btnAddCookie.setBackground(Color.LIGHT_GRAY);
		btnAddCookie.setBounds(375, 61, 67, 31);
		panel.add(btnAddCookie);
		
		JButton btnAddVanilla = new JButton("Add");
		btnAddVanilla.setFont(new Font("Arial", Font.BOLD, 15));
		btnAddVanilla.setBackground(Color.LIGHT_GRAY);
		btnAddVanilla.setBounds(375, 108, 67, 31);
		panel.add(btnAddVanilla);
		
		JButton btnAddCake = new JButton("Add");
		btnAddCake.setFont(new Font("Arial", Font.BOLD, 15));
		btnAddCake.setBackground(Color.LIGHT_GRAY);
		btnAddCake.setBounds(375, 155, 67, 31);
		panel.add(btnAddCake);
		
		JButton btnAddBaklava = new JButton("Add");
		btnAddBaklava.setFont(new Font("Arial", Font.BOLD, 15));
		btnAddBaklava.setBackground(Color.LIGHT_GRAY);
		btnAddBaklava.setBounds(375, 202, 67, 31);
		panel.add(btnAddBaklava);
		
		JButton btnRemoveBagel = new JButton("Remove");
		btnRemoveBagel.setForeground(Color.RED);
		btnRemoveBagel.setFont(new Font("Arial", Font.BOLD, 13));
		btnRemoveBagel.setBackground(Color.LIGHT_GRAY);
		btnRemoveBagel.setBounds(451, 21, 87, 31);
		panel.add(btnRemoveBagel);
		
		JButton btnRemoveCookie = new JButton("Remove");
		btnRemoveCookie.setForeground(Color.RED);
		btnRemoveCookie.setFont(new Font("Arial", Font.BOLD, 13));
		btnRemoveCookie.setBackground(Color.LIGHT_GRAY);
		btnRemoveCookie.setBounds(451, 61, 87, 31);
		panel.add(btnRemoveCookie);
		
		JButton btnRemoveVanilla = new JButton("Remove");
		btnRemoveVanilla.setForeground(Color.RED);
		btnRemoveVanilla.setFont(new Font("Arial", Font.BOLD, 13));
		btnRemoveVanilla.setBackground(Color.LIGHT_GRAY);
		btnRemoveVanilla.setBounds(451, 108, 87, 31);
		panel.add(btnRemoveVanilla);
		
		JButton btnRemoveCake = new JButton("Remove");
		btnRemoveCake.setForeground(Color.RED);
		btnRemoveCake.setFont(new Font("Arial", Font.BOLD, 13));
		btnRemoveCake.setBackground(Color.LIGHT_GRAY);
		btnRemoveCake.setBounds(451, 155, 87, 31);
		panel.add(btnRemoveCake);
		
		JButton btnRemoveBaklava = new JButton("Remove");
		btnRemoveBaklava.setForeground(Color.RED);
		btnRemoveBaklava.setFont(new Font("Arial", Font.BOLD, 13));
		btnRemoveBaklava.setBackground(Color.LIGHT_GRAY);
		btnRemoveBaklava.setBounds(451, 202, 87, 31);
		panel.add(btnRemoveBaklava);
		
		btnAddBagel.addActionListener(event -> addProduct(lblBagel.getText(), 5));
		btnAddCookie.addActionListener(event -> addProduct(lblCookie.getText(), 13));
		btnAddVanilla.addActionListener(event -> addProduct(lblVanillaIcecream.getText(), 19.5));
		btnAddCake.addActionListener(event -> addProduct(lblCake.getText(), 21.5));
		btnAddBaklava.addActionListener(event -> addProduct(lblBaklava.getText(), 24));
		
		btnRemoveBagel.addActionListener(event -> removeProduct(lblBagel.getText(), 5));
		btnRemoveCookie.addActionListener(event -> removeProduct(lblCookie.getText(), 13));
		btnRemoveVanilla.addActionListener(event -> removeProduct(lblVanillaIcecream.getText(), 19.5));
		btnRemoveCake.addActionListener(event -> removeProduct(lblCake.getText(), 21.5));
		btnRemoveBaklava.addActionListener(event -> removeProduct(lblBaklava.getText(), 24));
		
		frmDessertsOrder.setResizable(false);
		frmDessertsOrder.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
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
