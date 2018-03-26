package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import controller.BarController;
import model.PDFwriter;

import javax.sql.rowset.CachedRowSet;
import javax.swing.BoxLayout;
import javax.swing.JTextArea;
import java.awt.FlowLayout;

public class Zahlung extends JFrame {

	private JPanel contentPane;
	private MainScreen ms;
	JTextArea textArea;
	
//////Table Zahlungsmethoden  //////
	JButton zahlungButton[] = {new JButton(""),
				new JButton(""),
				new JButton(""),
				new JButton(""),
				new JButton(""),
				new JButton(""),
				new JButton(""),
				new JButton(""),
				new JButton(""),};


	/**
	 * Create the frame.
	 */
	public Zahlung(MainScreen ms) {
		this.ms = ms;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 520, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelEastCenter = new JPanel();
		panelEastCenter.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panelEastCenter);
		panelEastCenter.setLayout(new BorderLayout(0, 0));
		panelEastCenter.setPreferredSize(new Dimension(getWidth(), 150));
		
		JPanel panelNorth = new JPanel();
		panelNorth.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelEastCenter.add(panelNorth, BorderLayout.NORTH);
		panelNorth.setPreferredSize(new Dimension(550, 100));
		panelNorth.setLayout(new BorderLayout(0, 0));
		
		JPanel panelNorthWest = new JPanel();
		panelNorth.add(panelNorthWest, BorderLayout.WEST);
		panelNorthWest.setPreferredSize(new Dimension(230, 50));
		panelNorthWest.setLayout(new BoxLayout(panelNorthWest, BoxLayout.Y_AXIS));
		
		JLabel lblBetrag = new JLabel("Offene Betrag:");
		lblBetrag.setPreferredSize(new Dimension(240, 60));
		lblBetrag.setFont(new Font("Tahoma", Font.BOLD, 30));
		panelNorthWest.add(lblBetrag);
		
		textArea = new JTextArea("");
		textArea.setTabSize(0);
		textArea.setForeground(Color.RED);
		textArea.setPreferredSize(new Dimension(240, 10));
		textArea.setFont(new Font("Courier New", Font.BOLD, 37));
		panelNorthWest.add(textArea);
		
		JPanel panelNorthCenterGrid = new JPanel();
		panelNorth.add(panelNorthCenterGrid, BorderLayout.CENTER);
		panelNorthCenterGrid.setPreferredSize(new Dimension(270, 100));
		panelNorthCenterGrid.setLayout(new GridLayout(1, 1, 0, 0));
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					boolean complete = ms.textKasseWindow.print();
					if(complete) {
						JOptionPane.showMessageDialog(null, "Drucken war erfolgreich", "Information", JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "Printing!", "Printer", JOptionPane.ERROR_MESSAGE);
					}
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,e);
				}
			}
		});
		btnPrint.setPreferredSize(new Dimension(80, 100));
		panelNorthCenterGrid.add(btnPrint);
		
		JButton btnRabatt = new JButton("Rabatt");
		btnRabatt.setPreferredSize(new Dimension(80, 100));
		panelNorthCenterGrid.add(btnRabatt);
		
		
		
		
		
		///////////////////////////////////////////////////////////////////
		
		JButton btnBezahlen = new JButton("Bezahlen");
		panelNorthCenterGrid.add(btnBezahlen);
		btnBezahlen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Der Rechnung wurde bezahlt! Danke!");
				textArea.setText("");
				 for (int x = 0; x < zahlungButton.length; x++) {
					 zahlungButton[x].setBorder(new LineBorder(Color.BLACK));			    
				 }	
			}
		});
		btnBezahlen.setPreferredSize(new Dimension(80, 100));
		panelEastCenter.setPreferredSize(new Dimension(getWidth(), 50));
		

		JPanel panelCenter = new JPanel();
		panelCenter.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelEastCenter.add(panelCenter, BorderLayout.CENTER);
		panelCenter.setLayout(new BorderLayout(0, 0));
		
		JPanel panelEastCenterText = new JPanel();
		panelCenter.add(panelEastCenterText, BorderLayout.NORTH);
		panelEastCenterText.setPreferredSize(new Dimension(490, 40));
		panelEastCenterText.setLayout(new BoxLayout(panelEastCenterText, BoxLayout.X_AXIS));
		
		JLabel lblZahlungsMethode = new JLabel("Zahlungsmethoden");
		lblZahlungsMethode.setHorizontalAlignment(SwingConstants.CENTER);
		panelEastCenterText.add(lblZahlungsMethode);
		lblZahlungsMethode.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JPanel panelCenterSouth = new JPanel();
		panelCenter.add(panelCenterSouth, BorderLayout.SOUTH);
		panelCenterSouth.setPreferredSize(new Dimension(500, 270));
				
		JPanel panelCenterGrid = new JPanel();
		panelCenterSouth.add(panelCenterGrid);
		panelCenterGrid.setLayout(new GridLayout(3, 3, 0, 0));
		panelCenterGrid.setPreferredSize(new Dimension(500, 280));

		
		/////////////////////////////////////////////////////////////////////
		
		
		
		for(int x = 0; x < zahlungButton.length; x++)
		{
			panelCenterGrid.add(zahlungButton[x]);
			zahlungButton[x].setOpaque(false);
			zahlungButton[x].setContentAreaFilled(false);
			zahlungButton[x].setContentAreaFilled(false);
			zahlungButton[x].setBorder(new LineBorder(Color.BLACK));
			zahlungButton[x].setFocusPainted(false);
			zahlungButton[0].setIcon(new ImageIcon(MainScreen.class.getResource("/icons/geld_icon.png")));
			zahlungButton[1].setIcon(new ImageIcon(MainScreen.class.getResource("/icons/visa_icon.png")));
			zahlungButton[2].setIcon(new ImageIcon(MainScreen.class.getResource("/icons/mastercard_icon.png")));
			zahlungButton[3].setIcon(new ImageIcon(MainScreen.class.getResource("/icons/paypal_icon.png")));
			zahlungButton[4].setIcon(new ImageIcon(MainScreen.class.getResource("/icons/bitcoin_icon.png")));
			zahlungButton[5].setIcon(new ImageIcon(MainScreen.class.getResource("/icons/american-express_icon.png")));
			zahlungButton[6].setIcon(new ImageIcon(MainScreen.class.getResource("/icons/twint_icon.png")));
			zahlungButton[7].setIcon(new ImageIcon(MainScreen.class.getResource("/icons/apple-pay_icon.png")));
			zahlungButton[8].setIcon(new ImageIcon(MainScreen.class.getResource("/icons/samsung-pay_icon.png")));
		}
		
		////////// ZahlungBar  ///////////////
		zahlungButton[0].addActionListener(new ActionListener() {							
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Ausgewähltzahlung: Bar");
				zahlungButton[0].setBorder(new LineBorder(Color.GREEN, 5));
			}	
		});
		////////// ZahlungVisa  ///////////////
		zahlungButton[1].addActionListener(new ActionListener() {							
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Ausgewähltzahlung: Visa");
				zahlungButton[1].setBorder(new LineBorder(Color.GREEN, 5));
			}	
		});
		//////////ZahlungMastercard  ///////////////
		zahlungButton[2].addActionListener(new ActionListener() {							
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Ausgewähltzahlung: Mastercard");
				zahlungButton[2].setBorder(new LineBorder(Color.GREEN, 5));
			}	
		});
		//////////ZahlungPayPal   ///////////////
		zahlungButton[3].addActionListener(new ActionListener() {							
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Ausgewähltzahlung: PayPal");
				zahlungButton[3].setBorder(new LineBorder(Color.GREEN, 5));
			}	
		});//////////	ZahlungBitcoin ///////////////
		zahlungButton[4].addActionListener(new ActionListener() {							
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Ausgewähltzahlung: Bitcoin");
				zahlungButton[4].setBorder(new LineBorder(Color.GREEN, 5));
			}	
		});	
		//////////	ZahlungAmericanExpress ///////////////
		zahlungButton[5].addActionListener(new ActionListener() {							
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Ausgewähltzahlung: AmericanExpress");
				zahlungButton[5].setBorder(new LineBorder(Color.GREEN, 5));
			}	
		});
		//////////ZahlungTwint	  ///////////////
		zahlungButton[6].addActionListener(new ActionListener() {							
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Ausgewähltzahlung: Twint");
			zahlungButton[6].setBorder(new LineBorder(Color.GREEN, 5));
		}	
		});
		//////////	ZahlungApple-Pay  ///////////////
		zahlungButton[7].addActionListener(new ActionListener() {							
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Ausgewähltzahlung: Apple-Pay");
				zahlungButton[7].setBorder(new LineBorder(Color.GREEN, 5));
			}	
		});
		//////////	ZahlungSamsung-Pay  ///////////////
		zahlungButton[8].addActionListener(new ActionListener() {							
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Ausgewähltzahlung: Samsung-Pay");
				zahlungButton[8].setBorder(new LineBorder(Color.GREEN, 5));
			}	
		});	
		////////////////////////////////////////////////////////////////////////
		
		JPanel panelSouth = new JPanel();
		panelSouth.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelEastCenter.add(panelSouth, BorderLayout.SOUTH);
		panelSouth.setLayout(new BoxLayout(panelSouth, BoxLayout.Y_AXIS));
		panelSouth.setPreferredSize(new Dimension(getWidth() / 5, getHeight() / 8));

		JPanel panelEastDownText = new JPanel();
		panelSouth.add(panelEastDownText);
		panelEastDownText.setLayout(new BorderLayout(0, 0));

		JLabel lblExport = new JLabel("Rechnung exportieren:");
		panelEastDownText.add(lblExport);
		lblExport.setFont(new Font("Dialog", Font.BOLD, 20));
		lblExport.setHorizontalAlignment(SwingConstants.CENTER);
		lblExport.setPreferredSize(new Dimension(200, 50));

		JPanel panelEastDownGrid = new JPanel();
		panelSouth.add(panelEastDownGrid);
		panelEastDownGrid.setLayout(new GridLayout(0, 2, 0, 0));
		panelEastDownGrid.setPreferredSize(new Dimension(getWidth() / 5, getHeight() / 3));

		JButton btnExportPDF = new JButton("PDF");
		btnExportPDF.setFocusPainted(false);
		btnExportPDF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new PDFwriter();
			}
		});

		btnExportPDF.setBackground(new Color(178, 34, 34));
		btnExportPDF.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panelEastDownGrid.add(btnExportPDF);

		JButton btnExportCSV = new JButton("CSV");
		btnExportCSV.setBackground(new Color(0, 100, 0));
		btnExportCSV.setFocusPainted(false);
		btnExportCSV.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panelEastDownGrid.add(btnExportCSV);





		
	}

}
