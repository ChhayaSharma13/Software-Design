import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.ScrollPaneConstants;
import java.awt.Color;

public class MainFrame {

	private JFrame frame;
	private JTextField idTxt;
	private JTextField nameTxt;
	private JTextField diseaseTxt;
	private JTextField expiryDateTxt;
	private JTextField priceTxt;
	private JTextField stockTxt;
	
	private BST bst;
	private HashTable hashTable;
	private JTextField idShowTxt;
	private JTextField bstTxt;
	private JTextField hashTableTxt;
	private JTextField idPurchaseTxt;
	private JTextField quantityUpdateTxt;
	private JTextField textField_2;

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
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 804, 615);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Tahoma", Font.BOLD, 15));
		tabbedPane.setBounds(0, 0, 780, 594);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(112, 128, 144));
		tabbedPane.addTab("Add Medicine", null, panel, null);
		panel.setLayout(null);
		
		JPanel jPanel = new JPanel();
		jPanel.setBackground(new Color(245, 245, 245));
		jPanel.setBounds(107, 65, 567, 427);
		panel.add(jPanel);
		jPanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Id");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(85, 61, 77, 13);
		jPanel.add(lblNewLabel_1);
		
		JLabel lblName = new JLabel("Medicine");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName.setBounds(85, 96, 77, 13);
		jPanel.add(lblName);
		
		JLabel lblDisease = new JLabel("Disease");
		lblDisease.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDisease.setBounds(85, 130, 77, 13);
		jPanel.add(lblDisease);
		
		JLabel lblExpiryDate = new JLabel("Expiry Date");
		lblExpiryDate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblExpiryDate.setBounds(85, 165, 77, 13);
		jPanel.add(lblExpiryDate);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPrice.setBounds(85, 200, 77, 13);
		jPanel.add(lblPrice);
		
		JLabel lblStock = new JLabel("Stock");
		lblStock.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblStock.setBounds(85, 237, 77, 13);
		jPanel.add(lblStock);
		
		idTxt = new JTextField();
		idTxt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		idTxt.setBounds(281, 61, 187, 19);
		jPanel.add(idTxt);
		idTxt.setColumns(10);
		
		nameTxt = new JTextField();
		nameTxt.setColumns(10);
		nameTxt.setBounds(281, 96, 187, 19);
		jPanel.add(nameTxt);
		
		diseaseTxt = new JTextField();
		diseaseTxt.setColumns(10);
		diseaseTxt.setBounds(281, 130, 187, 19);
		jPanel.add(diseaseTxt);
		
		expiryDateTxt = new JTextField();
		expiryDateTxt.setColumns(10);
		expiryDateTxt.setBounds(281, 165, 187, 19);
		jPanel.add(expiryDateTxt);
		
		priceTxt = new JTextField();
		priceTxt.setColumns(10);
		priceTxt.setBounds(281, 200, 187, 19);
		jPanel.add(priceTxt);
		
		stockTxt = new JTextField();
		stockTxt.setColumns(10);
		stockTxt.setBounds(281, 237, 187, 19);
		jPanel.add(stockTxt);
		
		bst = new BST();
		hashTable = new HashTable();
		HashMap<Integer, Medicine> medicinesMap = new HashMap<Integer, Medicine>();
		LinkedList<Medicine> medList = new LinkedList<Medicine>();


		JButton addBtn = new JButton("Add to BST");
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(idTxt.getText());
				String name = nameTxt.getText();
				String disease = diseaseTxt.getText();
				String date = expiryDateTxt.getText();
				String[] dateArr =  date.split("/");
				int d = Integer.parseInt(dateArr[0]);
				int m = Integer.parseInt(dateArr[1]);
				int y = Integer.parseInt(dateArr[2]);
				Date expDate = new Date(d,m,y);
				int stock = Integer.parseInt(stockTxt.getText());
				double price = Double.parseDouble(priceTxt.getText());
				Medicine med = new Medicine(name, disease, expDate, price, stock);
				bst.insert(id, med);
				JOptionPane.showMessageDialog(null, "Data entered into BST");
			}
		});
		addBtn.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		addBtn.setBounds(69, 300, 159, 21);
		jPanel.add(addBtn);
		
		JButton btnAddToHash = new JButton("Add to Hash Table");
		btnAddToHash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(idTxt.getText());
				String name = nameTxt.getText();
				String disease = diseaseTxt.getText();
				String date = expiryDateTxt.getText();
				String[] dateArr =  date.split("/");
				int d = Integer.parseInt(dateArr[0]);
				int m = Integer.parseInt(dateArr[1]);
				int y = Integer.parseInt(dateArr[2]);
				Date expDate = new Date(d,m,y);
				int stock = Integer.parseInt(stockTxt.getText());
				double price = Double.parseDouble(priceTxt.getText());
				Medicine med = new Medicine(name, disease, expDate, price, stock);
				hashTable.insert(id, med);
				JOptionPane.showMessageDialog(null, "Data entered into Hash Table");
			}
		});
		btnAddToHash.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnAddToHash.setBounds(281, 300, 187, 21);
		jPanel.add(btnAddToHash);
		
		JButton hashMapBtn = new JButton("Add to Hash Map");
		hashMapBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(idTxt.getText());
				String name = nameTxt.getText();
				String disease = diseaseTxt.getText();
				String date = expiryDateTxt.getText();
				String[] dateArr =  date.split("/");
				int d = Integer.parseInt(dateArr[0]);
				int m = Integer.parseInt(dateArr[1]);
				int y = Integer.parseInt(dateArr[2]);
				Date expDate = new Date(d,m,y);
				int stock = Integer.parseInt(stockTxt.getText());
				double price = Double.parseDouble(priceTxt.getText());
				Medicine med = new Medicine(name, disease, expDate, price, stock);
				medicinesMap.put(id, med);
				JOptionPane.showMessageDialog(null, "Data entered into Hash Map");
			}
		});
		hashMapBtn.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		hashMapBtn.setBounds(69, 342, 159, 21);
		jPanel.add(hashMapBtn);
		
		JButton btnAddToLinked = new JButton("Add to Linked List");
		btnAddToLinked.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(idTxt.getText());
				String name = nameTxt.getText();
				String disease = diseaseTxt.getText();
				String date = expiryDateTxt.getText();
				String[] dateArr =  date.split("/");
				int d = Integer.parseInt(dateArr[0]);
				int m = Integer.parseInt(dateArr[1]);
				int y = Integer.parseInt(dateArr[2]);
				Date expDate = new Date(d,m,y);
				int stock = Integer.parseInt(stockTxt.getText());
				double price = Double.parseDouble(priceTxt.getText());
				Medicine med = new Medicine(name, disease, expDate, price, stock);
				medList.add(med);
				JOptionPane.showMessageDialog(null, "Data entered into Linked List");
			}
		});
		btnAddToLinked.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnAddToLinked.setBounds(281, 342, 187, 21);
		jPanel.add(btnAddToLinked);
		 
		
		JLabel lblNewLabel = new JLabel("Medical Management System");
		lblNewLabel.setBounds(257, 22, 258, 20);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(112, 128, 144));
		tabbedPane.addTab("Search Medicine", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(245, 245, 245));
		panel_3.setLayout(null);
		panel_3.setBounds(116, 69, 580, 439);
		panel_1.add(panel_3);
		
		JLabel label = new JLabel("Id");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(133, 39, 33, 13);
		panel_3.add(label);
		
		idShowTxt = new JTextField();
		idShowTxt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		idShowTxt.setColumns(10);
		idShowTxt.setBounds(176, 36, 161, 19);
		panel_3.add(idShowTxt);
		
		JScrollPane scrollPane = new JScrollPane((Component) null, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(51, 115, 202, 100);
		panel_3.add(scrollPane);
		
		JTextArea bstTextArea = new JTextArea(5, 20);
		scrollPane.setViewportView(bstTextArea);
				
		JScrollPane scrollPane_1 = new JScrollPane((Component) null, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane_1.setBounds(329, 115, 202, 100);
		panel_3.add(scrollPane_1);
		
		JTextArea hashTableTextArea = new JTextArea(5, 20);
		scrollPane_1.setViewportView(hashTableTextArea);
		
		bstTxt = new JTextField();
		bstTxt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		bstTxt.setColumns(10);
		bstTxt.setBounds(51, 230, 202, 19);
		panel_3.add(bstTxt);
		
		hashTableTxt = new JTextField();
		hashTableTxt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		hashTableTxt.setColumns(10);
		hashTableTxt.setBounds(329, 225, 202, 19);
		panel_3.add(hashTableTxt);
		
		JLabel lblBst = new JLabel("BST");
		lblBst.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBst.setBounds(51, 87, 33, 13);
		panel_3.add(lblBst);
		
		JLabel lblHashTable = new JLabel("Hash Table");
		lblHashTable.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHashTable.setBounds(329, 87, 103, 13);
		panel_3.add(lblHashTable);
		
		JLabel lblHashmap = new JLabel("HashMap");
		lblHashmap.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHashmap.setBounds(51, 286, 141, 13);
		panel_3.add(lblHashmap);
		
		JScrollPane scrollPane_2 = new JScrollPane((Component) null, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane_2.setBounds(51, 318, 480, 100);
		panel_3.add(scrollPane_2);
		
		JTextArea hashMapTxtArea = new JTextArea(5, 20);
		scrollPane_2.setViewportView(hashMapTxtArea);
		JButton button = new JButton("Show");
		button.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(idShowTxt.getText());
				Node result = bst.search(id);
				if(result != null) {
					bstTextArea.setText(result.readMedicine());
					bstTxt.setText("Iterations: "+ bst.getCount());
				}else {
					bstTextArea.setText("No result found");
					bstTxt.setText("Iteration : 0");
				}
				HNode resultH = hashTable.search(id);
				if(resultH != null) {
					hashTableTextArea.setText(resultH.readMedicine());
					hashTableTxt.setText("Iterations: "+ hashTable.getCount());
				}
				else {
					hashTableTextArea.setText("No result found");
					hashTableTxt.setText("Iterations: 0");
				}
				Medicine med = medicinesMap.get(id);
				if(med != null) {
					hashMapTxtArea.setText(med.toString());
				}else {
					hashMapTxtArea.setText("No result found!");
				}
				
				
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		button.setBounds(347, 35, 85, 21);
		panel_3.add(button);
		
		JLabel label_1 = new JLabel("Medical Management System");
		label_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		label_1.setBounds(256, 25, 258, 20);
		panel_1.add(label_1);
		
		JPanel hashMap = new JPanel();
		hashMap.setBackground(new Color(119, 136, 153));
		tabbedPane.addTab("Purchase Medicine", null, hashMap, null);
		hashMap.setLayout(null);
		
		JLabel label_2 = new JLabel("Medical Management System");
		label_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		label_2.setBounds(257, 10, 258, 38);
		hashMap.add(label_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(46, 74, 686, 442);
		hashMap.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label_3 = new JLabel("Id");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(166, 33, 46, 13);
		panel_2.add(label_3);
		
		JLabel label_4 = new JLabel("Quantity");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_4.setBounds(166, 74, 78, 19);
		panel_2.add(label_4);
		
		idPurchaseTxt = new JTextField();
		idPurchaseTxt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		idPurchaseTxt.setColumns(10);
		idPurchaseTxt.setBounds(254, 30, 258, 19);
		panel_2.add(idPurchaseTxt);
		
		quantityUpdateTxt = new JTextField();
		quantityUpdateTxt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		quantityUpdateTxt.setColumns(10);
		quantityUpdateTxt.setBounds(254, 74, 258, 19);
		panel_2.add(quantityUpdateTxt);
		
		JScrollPane scrollPane_3 = new JScrollPane((Component) null, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane_3.setBounds(46, 156, 226, 100);
		panel_2.add(scrollPane_3);
		
		JTextArea BSTUpdatedTextArea = new JTextArea();
		scrollPane_3.setViewportView(BSTUpdatedTextArea);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(46, 156, 226, 98);
		panel_2.add(textField_2);
		
		JScrollPane scrollPane_4 = new JScrollPane((Component) null, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane_4.setBounds(400, 156, 258, 100);
		panel_2.add(scrollPane_4);
		
		JTextArea hashTableUpdatedTextArea = new JTextArea();
		scrollPane_4.setViewportView(hashTableUpdatedTextArea);
		
		JLabel label_5 = new JLabel("BST Updated");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_5.setBounds(46, 133, 106, 13);
		panel_2.add(label_5);
		
		JLabel label_6 = new JLabel("Hash Table Updated");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_6.setBounds(400, 133, 144, 13);
		panel_2.add(label_6);
		
		JLabel label_7 = new JLabel("Hash Map Updated");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_7.setBounds(43, 289, 162, 13);
		panel_2.add(label_7);
		
		JScrollPane scrollPane_5 = new JScrollPane((Component) null, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane_5.setBounds(46, 312, 612, 100);
		panel_2.add(scrollPane_5);
		
		JTextArea hashMapUpdatedTextArea = new JTextArea();
		scrollPane_5.setViewportView(hashMapUpdatedTextArea);
		
		JButton purchaseBtn = new JButton("Purchase");
		purchaseBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(idPurchaseTxt.getText());
				int quantity = Integer.parseInt(quantityUpdateTxt.getText());
				
				Node res = bst.update(id, quantity);
				if(res != null) {
					BSTUpdatedTextArea.setText(res.readMedicine());
				}
				else {
					BSTUpdatedTextArea.setText("Not enough stock");
				}
				
				HNode resH = hashTable.update(id, quantity);
				if(resH != null) {
					hashTableUpdatedTextArea.setText(resH.readMedicine());
				}
				else {
					hashTableUpdatedTextArea.setText("Not enough stock");
				}
				
				//medicinesMap.put(id, );
				Medicine resMed = medicinesMap.get(id);
				if(resMed != null) {
					if(resMed.stock < quantity) {
						hashMapUpdatedTextArea.setText("Not eough stock");
					}else {
						resMed.stock -= quantity;
						hashMapUpdatedTextArea.setText(resMed.toString());
					}
				}
				else {
					hashMapUpdatedTextArea.setText("Not enough stock");
				}
			}
		});
		purchaseBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		purchaseBtn.setBounds(277, 108, 106, 21);
		panel_2.add(purchaseBtn);
	}
}
