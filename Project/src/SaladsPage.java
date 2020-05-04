import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SaladsPage {

	JFrame frmSaladsPage;
	private final JLabel lblSaladsMenu = new JLabel("Salads Menu");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SaladsPage window = new SaladsPage();
					window.frmSaladsPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SaladsPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSaladsPage = new JFrame();
		frmSaladsPage.setTitle("Salads Menu");
		frmSaladsPage.setBounds(100, 100, 566, 424);
		frmSaladsPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSaladsPage.getContentPane().setLayout(null);
		lblSaladsMenu.setBounds(205, 21, 143, 32);
		frmSaladsPage.getContentPane().add(lblSaladsMenu);
		lblSaladsMenu.setFont(new Font("Arial", Font.BOLD, 23));
		
		JButton btnBack = new JButton("<< Back");
		btnBack.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				MenuPage window = new MenuPage();
				window.frmMenuPage.setVisible(true);
				
				frmSaladsPage.setVisible(false);
			}
		});
		btnBack.setFont(new Font("Arial", Font.BOLD, 18));
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.setBounds(21, 20, 104, 35);
		frmSaladsPage.getContentPane().add(btnBack);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.GRAY);
		panel.setBounds(53, 83, 447, 269);
		frmSaladsPage.getContentPane().add(panel);
		
		JLabel lblGreenSalad = new JLabel("Green Salad..............................");
		lblGreenSalad.setFont(new Font("Arial", Font.PLAIN, 20));
		lblGreenSalad.setBounds(53, 21, 305, 26);
		panel.add(lblGreenSalad);
		
		JLabel lblCeasarSalad = new JLabel("Caesar Salad.............................");
		lblCeasarSalad.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCeasarSalad.setBounds(53, 65, 305, 26);
		panel.add(lblCeasarSalad);
		
		JLabel lblCappuccinotl = new JLabel("Tabbouleh..................................");
		lblCappuccinotl.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCappuccinotl.setBounds(53, 112, 305, 26);
		panel.add(lblCappuccinotl);
		
		JLabel lblAmericanotl = new JLabel("Pasta Salad...............................");
		lblAmericanotl.setFont(new Font("Arial", Font.PLAIN, 20));
		lblAmericanotl.setBounds(53, 159, 305, 26);
		panel.add(lblAmericanotl);
		
		JLabel lblFrappuccinotl = new JLabel("Chef Salad.................................");
		lblFrappuccinotl.setFont(new Font("Arial", Font.PLAIN, 20));
		lblFrappuccinotl.setBounds(53, 206, 294, 26);
		panel.add(lblFrappuccinotl);
		
		JLabel lblGreenPrice = new JLabel("10TL");
		lblGreenPrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblGreenPrice.setBounds(352, 21, 45, 26);
		panel.add(lblGreenPrice);
		
		JLabel lblCaesarPrice = new JLabel("23TL");
		lblCaesarPrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCaesarPrice.setBounds(352, 64, 45, 26);
		panel.add(lblCaesarPrice);
		
		JLabel lblTabboulehPrice = new JLabel("23TL");
		lblTabboulehPrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblTabboulehPrice.setBounds(352, 111, 45, 26);
		panel.add(lblTabboulehPrice);
		
		JLabel lblPastaPrice = new JLabel("26TL");
		lblPastaPrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblPastaPrice.setBounds(350, 158, 51, 26);
		panel.add(lblPastaPrice);
		
		JLabel lblChefPrice = new JLabel("28.5TL");
		lblChefPrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblChefPrice.setBounds(350, 205, 62, 26);
		panel.add(lblChefPrice);
		
		frmSaladsPage.setResizable(false);
		frmSaladsPage.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmSaladsPage.setLocationRelativeTo(null); 
	}

}
