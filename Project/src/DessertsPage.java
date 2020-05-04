import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DessertsPage {

	JFrame frmDessertsPage;
	private final JLabel lblDessertsMenu = new JLabel("Desserts Menu");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DessertsPage window = new DessertsPage();
					window.frmDessertsPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DessertsPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDessertsPage = new JFrame();
		frmDessertsPage.setTitle("Desserts Menu");
		frmDessertsPage.setBounds(100, 100, 566, 424);
		frmDessertsPage.getContentPane().setLayout(null);
		lblDessertsMenu.setBounds(194, 21, 167, 32);
		frmDessertsPage.getContentPane().add(lblDessertsMenu);
		lblDessertsMenu.setFont(new Font("Arial", Font.BOLD, 23));
		
		JButton btnBack = new JButton("<< Back");
		btnBack.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				MenuPage window = new MenuPage();
				window.frmMenuPage.setVisible(true);
				
				frmDessertsPage.setVisible(false);
			}
		});
		btnBack.setFont(new Font("Arial", Font.BOLD, 18));
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.setBounds(21, 20, 104, 35);
		frmDessertsPage.getContentPane().add(btnBack);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.GRAY);
		panel.setBounds(53, 83, 447, 269);
		frmDessertsPage.getContentPane().add(panel);
		
		JLabel lblBagel = new JLabel("Bagel.........................................");
		lblBagel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblBagel.setBounds(53, 21, 305, 26);
		panel.add(lblBagel);
		
		JLabel lblCookie = new JLabel("Chocolate Cookie......................");
		lblCookie.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCookie.setBounds(53, 65, 305, 26);
		panel.add(lblCookie);
		
		JLabel lblVanillaIcecream = new JLabel("Vanilla Icecream........................");
		lblVanillaIcecream.setFont(new Font("Arial", Font.PLAIN, 20));
		lblVanillaIcecream.setBounds(53, 112, 294, 26);
		panel.add(lblVanillaIcecream);
		
		JLabel lblAmericanotl = new JLabel("Cake.........................................");
		lblAmericanotl.setFont(new Font("Arial", Font.PLAIN, 20));
		lblAmericanotl.setBounds(53, 159, 305, 26);
		panel.add(lblAmericanotl);
		
		JLabel lblFrappuccinotl = new JLabel("Baklava.....................................");
		lblFrappuccinotl.setFont(new Font("Arial", Font.PLAIN, 20));
		lblFrappuccinotl.setBounds(53, 206, 294, 26);
		panel.add(lblFrappuccinotl);
		
		JLabel lblBagelPrice = new JLabel("6TL");
		lblBagelPrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblBagelPrice.setBounds(352, 21, 34, 26);
		panel.add(lblBagelPrice);
		
		JLabel lblCookiePrice = new JLabel("13TL");
		lblCookiePrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCookiePrice.setBounds(352, 64, 45, 26);
		panel.add(lblCookiePrice);
		
		JLabel lblVanillaPrice = new JLabel("19.5TL");
		lblVanillaPrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblVanillaPrice.setBounds(352, 111, 62, 26);
		panel.add(lblVanillaPrice);
		
		JLabel lblCakePrice = new JLabel("21.5TL");
		lblCakePrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCakePrice.setBounds(350, 158, 64, 26);
		panel.add(lblCakePrice);
		
		JLabel lblBaklavaPrice = new JLabel("24TL");
		lblBaklavaPrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblBaklavaPrice.setBounds(350, 205, 51, 26);
		panel.add(lblBaklavaPrice);
		
		frmDessertsPage.setResizable(false);
		frmDessertsPage.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmDessertsPage.setLocationRelativeTo(null); 
	}

}
