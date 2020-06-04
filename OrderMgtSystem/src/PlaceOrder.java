import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class PlaceOrder {

	JFrame frame;
	private JTextField txtName;
	private JTextField txtDate;
	private JTextField txtAddress;
	private JTextField txtMobileNo;
	private JTextField txtTime;
	private int orderId;
	private JTextField txtItem;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlaceOrder window = new PlaceOrder();
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
	public PlaceOrder() {
		initialize();
	}

	public PlaceOrder(int orderId) {
		// TODO Auto-generated constructor stub
		this.orderId = orderId;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.getContentPane().setFont(new Font("Footlight MT Light", Font.PLAIN, 14));
		frame.setBounds(100, 100, 550, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtName = new JTextField();
		txtName.setBounds(115, 85, 96, 19);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtDate = new JTextField();
		txtDate.setBounds(115, 137, 96, 19);
		frame.getContentPane().add(txtDate);
		txtDate.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(115, 179, 96, 19);
		frame.getContentPane().add(txtAddress);
		txtAddress.setColumns(10);
		
		txtMobileNo = new JTextField();
		txtMobileNo.setBounds(387, 137, 96, 19);
		frame.getContentPane().add(txtMobileNo);
		txtMobileNo.setColumns(10);
		
		txtTime = new JTextField();
		txtTime.setBounds(387, 179, 96, 19);
		frame.getContentPane().add(txtTime);
		txtTime.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setBounds(23, 87, 96, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Date");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(23, 139, 46, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Address");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(23, 181, 76, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Mobile No.");
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(300, 139, 86, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		
		JLabel lblNewLabel_4 = new JLabel("Time\r\n");
		lblNewLabel_4.setForeground(Color.BLUE);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(300, 181, 46, 13);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnPlaceOrder = new JButton("Place Order");
		btnPlaceOrder.setForeground(Color.BLUE);
		btnPlaceOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = txtName.getText() ;
				String mobileNo = txtMobileNo.getText() ;
				String date= txtDate.getText() ;
				String time = txtTime.getText() ;
				String address = txtAddress.getText() ;
				String item = txtItem.getText();

				String[] dateArr = date.split("/");
				String[] timeArr = time.split(":");
				Date date1 = new Date(dateArr[0],dateArr[1],dateArr[2]);
				Time time1 = new Time(timeArr[0],timeArr[1]);
				try {
					MainFrame.list.insert(orderId,item, name, mobileNo, date1, time1, address);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnPlaceOrder.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPlaceOrder.setBounds(199, 235, 128, 21);
		frame.getContentPane().add(btnPlaceOrder);
		
		JLabel lblNewLabel_5 = new JLabel("PLACE ORDER");
		lblNewLabel_5.setForeground(Color.BLUE);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_5.setBounds(183, 29, 281, 30);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Item");
		lblNewLabel_6.setForeground(Color.BLUE);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(300, 88, 46, 13);
		frame.getContentPane().add(lblNewLabel_6);
		
		txtItem = new JTextField();
		txtItem.setBounds(387, 85, 96, 19);
		frame.getContentPane().add(txtItem);
		txtItem.setColumns(10);
	}
}
