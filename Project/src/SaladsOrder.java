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

public class SaladsOrder {

	JFrame frmSaladsOrder;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SaladsOrder window = new SaladsOrder();
					window.frmSaladsOrder.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SaladsOrder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSaladsOrder = new JFrame();
		frmSaladsOrder.setTitle("Salads Menu");
		frmSaladsOrder.setBounds(100, 100, 687, 424);
		frmSaladsOrder.getContentPane().setLayout(null);
		
		JLabel lblSaladsMenu = new JLabel("Salads Menu");
		lblSaladsMenu.setFont(new Font("Arial", Font.BOLD, 23));
		lblSaladsMenu.setBounds(265, 21, 143, 32);
		frmSaladsOrder.getContentPane().add(lblSaladsMenu);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.GRAY);
		panel.setBounds(53, 83, 559, 269);
		frmSaladsOrder.getContentPane().add(panel);
		
		JLabel lblGreenSalad = new JLabel("Green Salad..............................");
		lblGreenSalad.setFont(new Font("Arial", Font.PLAIN, 20));
		lblGreenSalad.setBounds(21, 21, 305, 26);
		panel.add(lblGreenSalad);
		
		JLabel lblCaesarSalad = new JLabel("Caesar Salad.............................");
		lblCaesarSalad.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCaesarSalad.setBounds(21, 65, 305, 26);
		panel.add(lblCaesarSalad);
		
		JLabel lblTabbouleh = new JLabel("Tabbouleh..................................");
		lblTabbouleh.setFont(new Font("Arial", Font.PLAIN, 20));
		lblTabbouleh.setBounds(21, 112, 305, 26);
		panel.add(lblTabbouleh);
		
		JLabel lblPastaSalad = new JLabel("Pasta Salad...............................");
		lblPastaSalad.setFont(new Font("Arial", Font.PLAIN, 20));
		lblPastaSalad.setBounds(21, 159, 305, 26);
		panel.add(lblPastaSalad);
		
		JLabel lblChefSalad = new JLabel("Chef Salad...............................");
		lblChefSalad.setFont(new Font("Arial", Font.PLAIN, 20));
		lblChefSalad.setBounds(21, 206, 294, 26);
		panel.add(lblChefSalad);
		
		JLabel lblGreenPrice = new JLabel("10TL");
		lblGreenPrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblGreenPrice.setBounds(320, 21, 45, 26);
		panel.add(lblGreenPrice);
		
		JLabel lblCaesarPrice = new JLabel("23TL");
		lblCaesarPrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCaesarPrice.setBounds(320, 64, 45, 26);
		panel.add(lblCaesarPrice);
		
		JLabel lblTabboulehPrice = new JLabel("23TL");
		lblTabboulehPrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblTabboulehPrice.setBounds(320, 111, 45, 26);
		panel.add(lblTabboulehPrice);
		
		JLabel lblPastaPrice = new JLabel("26TL");
		lblPastaPrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblPastaPrice.setBounds(320, 158, 51, 26);
		panel.add(lblPastaPrice);
		
		JLabel lblChefPrice = new JLabel("28.5TL");
		lblChefPrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblChefPrice.setBounds(306, 205, 62, 26);
		panel.add(lblChefPrice);
		
		JButton btnAddGreen = new JButton("Add");
		btnAddGreen.setFont(new Font("Arial", Font.BOLD, 15));
		btnAddGreen.setBackground(Color.LIGHT_GRAY);
		btnAddGreen.setBounds(375, 21, 67, 31);
		panel.add(btnAddGreen);
		
		JButton btnAddCaesar = new JButton("Add");
		btnAddCaesar.setFont(new Font("Arial", Font.BOLD, 15));
		btnAddCaesar.setBackground(Color.LIGHT_GRAY);
		btnAddCaesar.setBounds(375, 61, 67, 31);
		panel.add(btnAddCaesar);
		
		JButton btnAddTab = new JButton("Add");
		btnAddTab.setFont(new Font("Arial", Font.BOLD, 15));
		btnAddTab.setBackground(Color.LIGHT_GRAY);
		btnAddTab.setBounds(375, 108, 67, 31);
		panel.add(btnAddTab);
		
		JButton btnAddPasta = new JButton("Add");
		btnAddPasta.setFont(new Font("Arial", Font.BOLD, 15));
		btnAddPasta.setBackground(Color.LIGHT_GRAY);
		btnAddPasta.setBounds(375, 155, 67, 31);
		panel.add(btnAddPasta);
		
		JButton btnAddChef = new JButton("Add");
		btnAddChef.setFont(new Font("Arial", Font.BOLD, 15));
		btnAddChef.setBackground(Color.LIGHT_GRAY);
		btnAddChef.setBounds(375, 202, 67, 31);
		panel.add(btnAddChef);
		
		JButton btnRemoveGreen = new JButton("Remove");
		btnRemoveGreen.setForeground(Color.RED);
		btnRemoveGreen.setFont(new Font("Arial", Font.BOLD, 13));
		btnRemoveGreen.setBackground(Color.LIGHT_GRAY);
		btnRemoveGreen.setBounds(451, 21, 87, 31);
		panel.add(btnRemoveGreen);
		
		JButton btnRemoveCaesar = new JButton("Remove");
		btnRemoveCaesar.setForeground(Color.RED);
		btnRemoveCaesar.setFont(new Font("Arial", Font.BOLD, 13));
		btnRemoveCaesar.setBackground(Color.LIGHT_GRAY);
		btnRemoveCaesar.setBounds(451, 61, 87, 31);
		panel.add(btnRemoveCaesar);
		
		JButton btnRemoveTab = new JButton("Remove");
		btnRemoveTab.setForeground(Color.RED);
		btnRemoveTab.setFont(new Font("Arial", Font.BOLD, 13));
		btnRemoveTab.setBackground(Color.LIGHT_GRAY);
		btnRemoveTab.setBounds(451, 108, 87, 31);
		panel.add(btnRemoveTab);
		
		JButton btnRemovePasta = new JButton("Remove");
		btnRemovePasta.setForeground(Color.RED);
		btnRemovePasta.setFont(new Font("Arial", Font.BOLD, 13));
		btnRemovePasta.setBackground(Color.LIGHT_GRAY);
		btnRemovePasta.setBounds(451, 155, 87, 31);
		panel.add(btnRemovePasta);
		
		JButton btnRemoveChef = new JButton("Remove");
		btnRemoveChef.setForeground(Color.RED);
		btnRemoveChef.setFont(new Font("Arial", Font.BOLD, 13));
		btnRemoveChef.setBackground(Color.LIGHT_GRAY);
		btnRemoveChef.setBounds(451, 202, 87, 31);
		panel.add(btnRemoveChef);
		
		btnAddGreen.addActionListener(event -> addProduct(lblGreenSalad.getText(), 10));
		btnAddCaesar.addActionListener(event -> addProduct(lblCaesarSalad.getText(), 23));
		btnAddTab.addActionListener(event -> addProduct(lblTabbouleh.getText(), 23));
		btnAddPasta.addActionListener(event -> addProduct(lblPastaSalad.getText(), 26));
		btnAddChef.addActionListener(event -> addProduct(lblChefSalad.getText(), 28.5));
		
		btnRemoveGreen.addActionListener(event -> removeProduct(lblGreenSalad.getText(), 10));
		btnRemoveCaesar.addActionListener(event -> removeProduct(lblCaesarSalad.getText(), 23));
		btnRemoveTab.addActionListener(event -> removeProduct(lblTabbouleh.getText(), 23));
		btnRemovePasta.addActionListener(event -> removeProduct(lblPastaSalad.getText(), 26));
		btnRemoveChef.addActionListener(event -> removeProduct(lblChefSalad.getText(), 28.5));
		
		frmSaladsOrder.setResizable(false);
		frmSaladsOrder.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
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
