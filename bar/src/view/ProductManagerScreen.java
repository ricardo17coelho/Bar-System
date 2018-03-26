package view;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import controller.BarController;
import model.Getraenk;
import model.Snack;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class ProductManagerScreen extends JFrame {

	private JPanel contentPane;
	private final JTable table = new JTable();
	private BarController bc;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductManagerScreen frame = new ProductManagerScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ProductManagerScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 1000);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelNortth = new JPanel();
		contentPane.add(panelNortth, BorderLayout.NORTH);
		panelNortth.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Wilkommen zu dem Produkt Manager ");
		panelNortth.add(lblNewLabel);
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 60));
		
		JPanel panelEast = new JPanel();
		contentPane.add(panelEast, BorderLayout.EAST);
		panelEast.setPreferredSize(new Dimension(getWidth()/4, getHeight()));
		panelEast.setLayout(new BoxLayout(panelEast, BoxLayout.Y_AXIS));
		
		JButton btnNewButton = new JButton("ADD");
		panelEast.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Remove");
		panelEast.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Edit");
		btnNewButton_2.setPreferredSize(new Dimension(100, 100));
		panelEast.add(btnNewButton_2);
		
		JPanel panelWest = new JPanel();
		contentPane.add(panelWest, BorderLayout.WEST);
		panelWest.setPreferredSize(new Dimension(getWidth()/2, getHeight()));
		panelWest.add(table);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setPreferredSize(new Dimension(750, 200));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Name", "Preis", "Gr\u00F6sse", "ProzVol"
			}
		));
		table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		
		JPanel panelSouth = new JPanel();
		contentPane.add(panelSouth, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_1 = new JLabel("Ricardo Coelho");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panelSouth.add(lblNewLabel_1);
		
		JPanel panelCenter = new JPanel();
		contentPane.add(panelCenter, BorderLayout.CENTER);
		panelCenter.setPreferredSize(new Dimension(getWidth()/3, getHeight()));
		panelCenter.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 103, 331, 69);
		panelCenter.add(textField);
		textField.setColumns(2);
		textField.setPreferredSize(new Dimension(100, 100));
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 217, 331, 69);
		textField_1.setColumns(2);
		textField_1.setPreferredSize(new Dimension(100, 100));
		panelCenter.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 329, 331, 69);
		textField_2.setColumns(2);
		textField_2.setPreferredSize(new Dimension(50, 50));
		panelCenter.add(textField_2);
	}
	
	
	public void addRowToJTable(BarController bc){
		this.bc = bc;
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        Object rowData[] = new Object[4];
        for(Getraenk getraenk : bc.getraenkeListe){
            rowData[0] = bc.getraenkeListe;
            rowData[1] = bc.getraenkeListe;
            rowData[2] = bc.getraenkeListe;
            rowData[3] = bc.getraenkeListe;
            model.addRow(rowData);
        }
                
    }
}
