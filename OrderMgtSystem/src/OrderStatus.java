import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class OrderStatus {

	JFrame frame;
	private JTextField txtId;
	private String itemName;
	private JTextArea txtItemList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderStatus window = new OrderStatus();
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
	public OrderStatus() {
		initialize();
	}

	public OrderStatus(String item) {
		// TODO Auto-generated constructor stub
		this.itemName = item;
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtItemList = new JTextArea();
		txtItemList.setBounds(10, 29, 400, 112);
		frame.getContentPane().add(txtItemList);
		
		txtId = new JTextField();
		txtId.setBounds(79, 186, 96, 19);
		frame.getContentPane().add(txtId);
		txtId.setColumns(10);
		
		JButton btnStatus = new JButton("Confirm Order");
		btnStatus.setForeground(Color.BLUE);
		btnStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(txtId.getText());
				MainFrame.list.updateStatus(id);
			}
		});
		btnStatus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnStatus.setBounds(240, 183, 170, 21);
		frame.getContentPane().add(btnStatus);
		
		Order retOrder = MainFrame.list.getOrdersByName(itemName);
		
		txtItemList.append(retOrder.toString());
		
	}
}
