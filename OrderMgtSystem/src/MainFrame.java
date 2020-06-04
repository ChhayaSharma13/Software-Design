import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MainFrame {

	private JFrame frame;
	private JTextField txtItemName;
	private JTextField txtOrderNo;
	
	static MyArrayList list;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		list = new MyArrayList(50);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.getContentPane().setForeground(Color.BLUE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtItemName = new JTextField();
		txtItemName.setBounds(23, 133, 130, 19);
		frame.getContentPane().add(txtItemName);
		txtItemName.setColumns(10);
		
		txtOrderNo = new JTextField();
		txtOrderNo.setBounds(259, 133, 130, 19);
		frame.getContentPane().add(txtOrderNo);
		txtOrderNo.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Check Status");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(47, 83, 83, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Place Order");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(284, 91, 72, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Order Management System");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setBackground(new Color(240, 240, 240));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(78, 34, 278, 29);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Check");
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item = txtItemName.getText();
				
			     new OrderStatus(item).frame.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(45, 172, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Place");
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int orderId = Integer.parseInt(txtOrderNo.getText());
			        new PlaceOrder(orderId).frame.setVisible(true);
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(284, 170, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnPrintOrders = new JButton("Print Orders");
		btnPrintOrders.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					MainFrame.list.readFromFile();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnPrintOrders.setForeground(Color.BLUE);
		btnPrintOrders.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPrintOrders.setBounds(143, 217, 130, 21);
		frame.getContentPane().add(btnPrintOrders);
	}
}
