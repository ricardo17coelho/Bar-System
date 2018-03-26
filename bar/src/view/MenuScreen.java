package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.BarController;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuScreen extends JFrame {

	private JPanel contentPane;
	private BarController bc;

	/**
	 * Create the frame.
	 */
	public MenuScreen(BarController bc) {
		this.bc = bc;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 1000);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelNorth = new JPanel();
		contentPane.add(panelNorth, BorderLayout.NORTH);
		panelNorth.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTitel = new JLabel("Wilkommen bei der Menu");
		lblTitel.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitel.setForeground(Color.ORANGE);
		lblTitel.setFont(new Font("Tahoma", Font.BOLD, 56));
		panelNorth.add(lblTitel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Bitte w\u00E4hlen sie eine Option:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 36));
		panelNorth.add(lblNewLabel, BorderLayout.WEST);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLogo.setIcon(new ImageIcon(MenuScreen.class.getResource("/bar_logo.png")));
		panelNorth.add(lblLogo, BorderLayout.SOUTH);
		
		JPanel panelCenter = new JPanel();
		contentPane.add(panelCenter, BorderLayout.CENTER);
		panelCenter.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panelCenter.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 4, 0, 0));
		
		JButton btnNewButton = new JButton("MainScreen");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				MainScreen frameScreen = new MainScreen(null, bc);
				frameScreen.setVisible(true);
			}
		});
		panel.add(btnNewButton);
		
		JButton btnRechnungen = new JButton("Rechnungen");
		btnRechnungen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				RechnungsManager frame = new RechnungsManager();
				frame.setVisible(true);
			}
		});
		panel.add(btnRechnungen);
		
		JButton btnProdukteverwaltung = new JButton("Produkteverwaltung");
		btnProdukteverwaltung.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				ProductManagerScreen frame = new ProductManagerScreen();
				frame.setVisible(true);
			}
		});
		panel.add(btnProdukteverwaltung);
		
		JButton btnNewButton_1 = new JButton("Admin");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				AdminScreen frame = new AdminScreen();
				frame.setVisible(true);
			}
		});
		panel.add(btnNewButton_1);
		
		JPanel panelSouth = new JPanel();
		contentPane.add(panelSouth, BorderLayout.SOUTH);
		panelSouth.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Ricardo Coelho 2018");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1.setForeground(Color.RED);
		panelSouth.add(lblNewLabel_1, BorderLayout.SOUTH);
	}

}
