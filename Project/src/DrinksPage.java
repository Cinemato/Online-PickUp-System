import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DrinksPage {

	JFrame frmDrinksPage;
	private final JLabel lblDrinksMenu = new JLabel("Drinks Menu");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DrinksPage window = new DrinksPage();
					window.frmDrinksPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DrinksPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDrinksPage = new JFrame();
		frmDrinksPage.setTitle("Drinks Menu");
		frmDrinksPage.setBounds(100, 100, 566, 424);
		frmDrinksPage.getContentPane().setLayout(null);
		lblDrinksMenu.setBounds(205, 21, 142, 32);
		frmDrinksPage.getContentPane().add(lblDrinksMenu);
		lblDrinksMenu.setFont(new Font("Arial", Font.BOLD, 23));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.GRAY);
		panel.setBounds(53, 83, 447, 269);
		frmDrinksPage.getContentPane().add(panel);
		
		JLabel lblTea = new JLabel("Tea............................................");
		lblTea.setFont(new Font("Arial", Font.PLAIN, 20));
		lblTea.setBounds(53, 21, 305, 26);
		panel.add(lblTea);
		
		JLabel lblTurkishCoffe = new JLabel("Turkish Coffee............................");
		lblTurkishCoffe.setFont(new Font("Arial", Font.PLAIN, 20));
		lblTurkishCoffe.setBounds(53, 65, 305, 26);
		panel.add(lblTurkishCoffe);
		
		JLabel lblCappuccinotl = new JLabel("Cappuccino................................");
		lblCappuccinotl.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCappuccinotl.setBounds(53, 112, 294, 26);
		panel.add(lblCappuccinotl);
		
		JLabel lblAmericanotl = new JLabel("Americano..................................");
		lblAmericanotl.setFont(new Font("Arial", Font.PLAIN, 20));
		lblAmericanotl.setBounds(53, 159, 305, 26);
		panel.add(lblAmericanotl);
		
		JLabel lblFrappuccinotl = new JLabel("Frappuccino...............................");
		lblFrappuccinotl.setFont(new Font("Arial", Font.PLAIN, 20));
		lblFrappuccinotl.setBounds(53, 206, 294, 26);
		panel.add(lblFrappuccinotl);
		
		JLabel lblTeaPrice = new JLabel("3TL");
		lblTeaPrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblTeaPrice.setBounds(352, 21, 34, 26);
		panel.add(lblTeaPrice);
		
		JLabel lblCoffePrice = new JLabel("9TL");
		lblCoffePrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCoffePrice.setBounds(352, 64, 34, 26);
		panel.add(lblCoffePrice);
		
		JLabel lbltl = new JLabel("16TL");
		lbltl.setFont(new Font("Arial", Font.PLAIN, 20));
		lbltl.setBounds(352, 111, 45, 26);
		panel.add(lbltl);
		
		JLabel lbltl_1 = new JLabel("16TL");
		lbltl_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lbltl_1.setBounds(350, 158, 45, 26);
		panel.add(lbltl_1);
		
		JLabel lbltl_3 = new JLabel("21.5TL");
		lbltl_3.setFont(new Font("Arial", Font.PLAIN, 20));
		lbltl_3.setBounds(350, 205, 62, 26);
		panel.add(lbltl_3);
		
		JButton btnBack = new JButton("<< Back");
		btnBack.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				MenuPage window = new MenuPage();
				window.frmMenuPage.setVisible(true);
				
				frmDrinksPage.setVisible(false);
			}
		});
		btnBack.setFont(new Font("Arial", Font.BOLD, 18));
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.setBounds(21, 20, 104, 35);
		frmDrinksPage.getContentPane().add(btnBack);
		
		frmDrinksPage.setResizable(false);
		frmDrinksPage.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmDrinksPage.setLocationRelativeTo(null); 
	}

}
