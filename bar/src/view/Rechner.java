package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import java.awt.GridLayout;

public class Rechner extends JFrame {

	private JPanel contentPane;
	
	

	//////  Taschenrechner-Button ////////
	JButton rechnerButtons[] = {new JButton("1"),
			new JButton("2"),
			new JButton("3"),
			new JButton("4"),
			new JButton("5"),
			new JButton("6"),
			new JButton("7"),
			new JButton("8"),
			new JButton("9"),
			new JButton("C"),
			new JButton("0"),
			new JButton("."),};
	

//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Rechner frame = new Rechner();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Rechner() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelTop = new JPanel();
		contentPane.add(panelTop, BorderLayout.NORTH);
		panelTop.setLayout(new BoxLayout(panelTop, BoxLayout.X_AXIS));
		panelTop.setPreferredSize(new Dimension(getWidth(), getHeight()/5));
		
		JTextArea textArea = new JTextArea();
		panelTop.add(textArea);
		textArea.setFont(new Font("Tahoma", Font.BOLD, 70));
		textArea.setEditable(false);
		
		JPanel panelGrid = new JPanel();
		contentPane.add(panelGrid);
		panelGrid.setLayout(new GridLayout(3, 3, 0, 0));
		
		
		////RechnerButtons werden zu den Panel hinzufügt
		for(int x = 0; x < rechnerButtons.length; x++)
		{
			panelGrid.add(rechnerButtons[x]);
			rechnerButtons[x].setBackground(Color.BLUE);
			rechnerButtons[x].setForeground(Color.WHITE);
			rechnerButtons[x].setFont(new Font("Tahoma", Font.BOLD, 30));
		}
	
		
		
		
		
	}

}
