package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class TischePlan extends JFrame {

	private JPanel contentPane;

//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					TischePlan frame = new TischePlan();
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
	public TischePlan() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		setBounds(100, 100, 1300, 744);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
				JPanel panel = new JPanel();
				panel.setBounds(0, 0, 1300, 744);
				contentPane.add(panel);
				panel.setLayout(null);
								
				JButton btnTisch01 = new JButton("Tisch 01");
				btnTisch01.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				btnTisch01.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnTisch01.setForeground(Color.RED);
				btnTisch01.setBounds(400, 189, 120, 122);
				btnTisch01.setContentAreaFilled(false);
//				btnTisch01.setBorderPainted(false);
				btnTisch01.setFocusPainted(false);
				panel.add(btnTisch01);
				
				JButton btnTisch02 = new JButton("Tisch 02");
				btnTisch02.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				btnTisch02.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnTisch02.setForeground(Color.RED);
				btnTisch02.setBounds(576, 144, 120, 117);
				btnTisch02.setContentAreaFilled(false);
//				btnTisch02.setBorderPainted(false);
				btnTisch02.setFocusPainted(false);
				panel.add(btnTisch02);
				
				JButton btnTisch03 = new JButton("Tisch 03");
				btnTisch03.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				btnTisch03.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnTisch03.setForeground(Color.RED);
				btnTisch03.setBounds(576, 423, 120, 122);
				btnTisch03.setContentAreaFilled(false);
				btnTisch03.setBorderPainted(false);
				btnTisch03.setFocusPainted(false);
				panel.add(btnTisch03);
				
				JButton btnTisch04 = new JButton("Tisch 04");
				btnTisch04.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				btnTisch04.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnTisch04.setForeground(Color.RED);
				btnTisch04.setBounds(649, 272, 120, 108);
				btnTisch04.setContentAreaFilled(false);
				btnTisch04.setBorderPainted(false);
				btnTisch04.setFocusPainted(false);
				panel.add(btnTisch04);
				
				JButton btnTisch05 = new JButton("Tisch 05");
				btnTisch05.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				btnTisch05.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnTisch05.setForeground(Color.RED);
				btnTisch05.setBounds(815, 390, 120, 117);
				btnTisch05.setContentAreaFilled(false);
				btnTisch05.setBorderPainted(false);
				btnTisch05.setFocusPainted(false);
				panel.add(btnTisch05);
				
				JButton btnTisch06 = new JButton("Tisch 06");
				btnTisch06.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				btnTisch06.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnTisch06.setForeground(Color.RED);
				btnTisch06.setBounds(800, 189, 120, 122);
				btnTisch06.setContentAreaFilled(false);
//				btnTisch06.setBorderPainted(false);
				btnTisch06.setFocusPainted(false);
				panel.add(btnTisch06);
				
				JButton btnTisch07 = new JButton("Tisch 07");
				btnTisch07.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				btnTisch07.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnTisch07.setForeground(Color.RED);
				btnTisch07.setBounds(380, 390, 120, 130);
				btnTisch07.setContentAreaFilled(false);
				btnTisch07.setBorderPainted(false);
				btnTisch07.setFocusPainted(false);
				panel.add(btnTisch07);
				
				JButton btnTisch08 = new JButton("Tisch 08");
				btnTisch08.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				btnTisch08.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnTisch08.setForeground(Color.RED);
				btnTisch08.setBounds(1008, 189, 120, 85);
				btnTisch08.setContentAreaFilled(false);
				btnTisch08.setBorderPainted(false);
				btnTisch08.setFocusPainted(false);
				panel.add(btnTisch08);
				
				
				
				JLabel lblHintergrung = new JLabel("");
				lblHintergrung.setBounds(0, 0, 1300, 744);
				panel.add(lblHintergrung);
				lblHintergrung.setIcon(new ImageIcon(TischePlan.class.getResource("/icons/room-layout.jpeg")));
				lblHintergrung.setOpaque(false);
	}
}
