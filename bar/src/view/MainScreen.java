package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import model.Shisha;
import model.Snack;
import model.Kaffe;
import model.Getraenk;
import model.Produkt;
import model.Tisch;

import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;
import controller.BarController;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
public class MainScreen extends JFrame {

	private JPanel contentPane;
	private static String loginName;
	public JTextArea textKasseWindow;
	private BarController bc;
	private Zahlung zh;
	JButton btn;
	JLabel lblTischNr = new JLabel("TischNr");
	int tischNr;
	private HashMap<Integer, String> bestellProdukte;

	LocalDateTime actDate = LocalDateTime.now();
	DateTimeFormatter dateFormat;

	////// Table Buttons //////
	JTableButton tableButtons[] = { new JTableButton(1), new JTableButton(2), new JTableButton(3), new JTableButton(4), new JTableButton(5),
			new JTableButton(6), new JTableButton(7), new JTableButton(8) };
	public JTextField textFieldSumme;

	/////////////////////////////// AUDIO-CLIPS/////////////////////////////////
	// AudioClip error =
	// JApplet.newAudioClip(MainScreen.class.getResource("error.wav"));
	// AudioClip numeric =
	// JApplet.newAudioClip(MainScreen.class.getResource("numeric.wav"));
	// AudioClip intro =
	// JApplet.newAudioClip(MainScreen.class.getResource("intro.wav"));
	// AudioClip welcome =
	// JApplet.newAudioClip(MainScreen.class.getResource("welcome.wav"));
	// AudioClip chaching =
	// JApplet.newAudioClip(MainScreen.class.getResource("chaching.wav"));

	/**
	 * Create the MainScreen
	 */

	public MainScreen(String loginName, BarController bc) {
		setTitle("LaBarraca Shisha Bar 2018");
		this.bc = bc;
		this.loginName = loginName;
		this.createMainScreenFrame(bc);
		tischNr = 0;
	}

	/**
	 * Create the contentPane
	 */
	private void createMainScreenFrame(BarController bc) {
		this.bc = bc;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 1000);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		this.panelTop();
		this.panelWest();
		this.panelCenter(bc, zh);

	}

	/**
	 * Create the panelTop
	 */
	public void panelTop() {
		JPanel panelTop = new JPanel();
		contentPane.add(panelTop, BorderLayout.NORTH);
		panelTop.setPreferredSize(new Dimension(getWidth(), getHeight() / 20));
		panelTop.setLayout(new BorderLayout(0, 0));

		JPanel panelTopWest = new JPanel();
		panelTop.add(panelTopWest, BorderLayout.WEST);

		JLabel lblYourLoginName = new JLabel("Hallo,");
		panelTopWest.add(lblYourLoginName);
		lblYourLoginName.setFont(new Font("Tahoma", Font.PLAIN, 30));

		JLabel lblYourName = new JLabel("");
		panelTopWest.add(lblYourName);
		lblYourName.setForeground(Color.RED);
		lblYourName.setFont(new Font("Dialog", Font.BOLD, 30));

		// if (MainScreen.loginName.equals("123")) {
		// lblYourName.setText("Ricardo");
		// }
		// if (MainScreen.loginName.equals("456")) {
		// lblYourName.setText("Ralf");
		// }
		// if (MainScreen.loginName.equals("789")) {
		// lblYourName.setText("Albin");
		// }

		JLabel lblYourLoginNr = new JLabel("Deine Mitartbeiternummer ist: ");
		panelTopWest.add(lblYourLoginNr);
		lblYourLoginNr.setFont(new Font("Tahoma", Font.PLAIN, 30));

		JLabel lblLoginNr = new JLabel(this.loginName);
		panelTopWest.add(lblLoginNr);
		lblLoginNr.setFont(new Font("Dialog", Font.BOLD, 30));
		lblLoginNr.setForeground(Color.RED);

		/**
		 * Hier wird der aktuelle Zeit und Datum Programmiert
		 */

		JPanel panelTopCenter = new JPanel();
		panelTop.add(panelTopCenter, BorderLayout.CENTER);

		JLabel lblTime = new JLabel("Es ist: ");
		panelTopCenter.add(lblTime);
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 30));
		JLabel lblActTime = new JLabel("");
		panelTopCenter.add(lblActTime);
		lblActTime.setForeground(Color.RED);
		lblActTime.setFont(new Font("Dialog", Font.BOLD, 30));

		JPanel panelTopEast = new JPanel();
		panelTop.add(panelTopEast, BorderLayout.EAST);
		panelTopEast.setLayout(new BoxLayout(panelTopEast, BoxLayout.X_AXIS));

		JLabel lblHeuteIst = new JLabel("Heute ist: ");
		panelTopEast.add(lblHeuteIst);
		lblHeuteIst.setFont(new Font("Tahoma", Font.PLAIN, 30));

		JLabel lblActDate = new JLabel("------");
		panelTopEast.add(lblActDate);
		lblActDate.setFont(new Font("Dialog", Font.BOLD, 30));
		lblActDate.setForeground(Color.ORANGE);
		dateFormat = DateTimeFormatter.ISO_LOCAL_DATE;
		lblActDate.setText(actDate.format(dateFormat));

		Timer timer = new Timer(1000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
				String aktuelleZeit = sdf.format(new Date());
				lblActTime.setText(aktuelleZeit);
			}
		});
		timer.start();
	}

	/**
	 * Create the panelWest
	 */
	public void panelWest() {
		JPanel panelWest = new JPanel();
		contentPane.add(panelWest, BorderLayout.WEST);
		panelWest.setPreferredSize(new Dimension(getWidth() / 3, getHeight()));
		panelWest.setLayout(new BorderLayout(0, 0));

		JPanel panelWestUp = new JPanel();
		panelWestUp.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelWest.add(panelWestUp, BorderLayout.WEST);
		panelWestUp.setPreferredSize(new Dimension(500, 700));
		panelWestUp.setLayout(new BoxLayout(panelWestUp, BoxLayout.X_AXIS));

		textKasseWindow = new JTextArea();
		panelWestUp.add(textKasseWindow);
		setHeaderText();
		
		JPanel panelWestDown = new JPanel();
		panelWestDown.setForeground(new Color(0, 0, 0));
		panelWestDown.setPreferredSize(new Dimension(500, 200));
		panelWest.add(panelWestDown, BorderLayout.SOUTH);
		panelWestDown.setLayout(new GridLayout(2, 0, 0, 0)); // Rows, Columns, Abstand x und y
		panelWestUp.setPreferredSize(new Dimension(getWidth() / 3, getHeight() / 2));

		JLabel label = new JLabel("Aktuell Rechnungsbetrag:");
		label.setFont(new Font("Dialog", Font.BOLD, 18));
		panelWestDown.add(label);

		textFieldSumme = new JTextField("Offen");
		textFieldSumme.setForeground(Color.RED);
		textFieldSumme.setFont(new Font("SansSerif", Font.BOLD, 45));
		textFieldSumme.setColumns(1);
		panelWestDown.add(textFieldSumme);

		JButton rechner = new JButton("Rechner");
		rechner.setFont(new Font("Tahoma", Font.BOLD, 30));
		rechner.setForeground(Color.RED);
		rechner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Rechner frame = new Rechner();
				frame.setVisible(true);
			}
		});
		panelWestDown.add(rechner);

		JButton btnZahlungen = new JButton("Bezahlen");
		btnZahlungen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblTischNr.setText(tableButtons[7].getName());
				Zahlung frame = new Zahlung(null);
				frame.setVisible(true);
			}
		});
		panelWestDown.add(btnZahlungen);
	}
	
	private void setHeaderText() {
		textKasseWindow.setFont(new Font("Courier New", Font.PLAIN, 20));
		textKasseWindow.setEditable(false);
		textKasseWindow.setMaximumSize(new Dimension(getWidth(), 750)); // Das ist sehr Hilfreich um den JTextField
																		// Groesse anzupasse
		textKasseWindow.setText("");
		textKasseWindow.append("##########################################\n");
		textKasseWindow.append("\t  La Barraca Shihsa-Bar\n");
		textKasseWindow.append("\t" + "Time? \t" + actDate.format(dateFormat) + "\n");
		textKasseWindow.append("       Rechnung Nr.: " + "Tisch Nr.: " + tischNr + "\n");
		textKasseWindow.append("##########################################\n");
		textKasseWindow.append("Product \t   Menge\t    Preis\n");
		textKasseWindow.append("------------------------------------------\n");
		textKasseWindow.setForeground(new Color(0, 0, 0));
		textKasseWindow.setBackground(new Color(240, 230, 140));
		
	}

	/**
	 * Create the panelCenter
	 */
	public void panelCenter(BarController bc, Zahlung zh) {
		this.bc = bc;
		this.zh = zh;
		JPanel panelCenter = new JPanel();
		contentPane.add(panelCenter, BorderLayout.CENTER);
		panelCenter.setLayout(new BorderLayout(0, 0));
		panelCenter.setPreferredSize(new Dimension(1000, 1000));

		JPanel panelCenterUp = new JPanel();
		panelCenter.add(panelCenterUp, BorderLayout.NORTH);
		panelCenterUp.setLayout(new BorderLayout(0, 0));

		JPanel panelCenterUpNorth = new JPanel();
		panelCenterUp.add(panelCenterUpNorth, BorderLayout.NORTH);
		panelCenterUpNorth.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelCenterUpNorth.setPreferredSize(new Dimension(1000, 50));
		panelCenterUpNorth.setLayout(new BoxLayout(panelCenterUpNorth, BoxLayout.X_AXIS));

		JLabel lblAktTischNr = new JLabel("Aktuelle Tisch Nr: " + tischNr);
		lblAktTischNr.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panelCenterUpNorth.add(lblAktTischNr);
		JPanel panelCenterUpWest = new JPanel();
		panelCenterUp.add(panelCenterUpWest, BorderLayout.WEST);
		panelCenterUpWest.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelCenterUpWest.setPreferredSize(new Dimension(490, 333));
		panelCenterUpWest.setLayout(new BorderLayout(0, 0));

		JPanel panelCenterUpCenterText = new JPanel();
		panelCenterUpWest.add(panelCenterUpCenterText, BorderLayout.NORTH);
		panelCenterUpCenterText.setLayout(new BorderLayout(0, 0));
		panelCenterUpCenterText.setPreferredSize(new Dimension(490, 50));

		JLabel lblKategorie = new JLabel("Produkte");
		lblKategorie.setHorizontalAlignment(SwingConstants.CENTER);
		panelCenterUpCenterText.add(lblKategorie);
		lblKategorie.setFont(new Font("Dialog", Font.BOLD, 18));

		JPanel panelCenterUpCenterGrid = new JPanel();
		panelCenterUpWest.add(panelCenterUpCenterGrid);
		panelCenterUpCenterGrid.setLayout(new GridLayout(2, 2, 10, 10));
		panelCenterUpCenterGrid.setPreferredSize(new Dimension(490, 333));

		

		JPanel panelCenterUpEast = new JPanel();
		panelCenterUp.add(panelCenterUpEast, BorderLayout.EAST);
		panelCenterUpEast.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelCenterUpEast.setLayout(new BorderLayout(0, 0));
		panelCenterUpEast.setPreferredSize(new Dimension(490, 333));

		JPanel panelEastUpText = new JPanel();
		panelCenterUpEast.add(panelEastUpText, BorderLayout.NORTH);
		panelEastUpText.setLayout(new BorderLayout(0, 0));

		JLabel lblTischView = new JLabel("Tisch-View");
		panelEastUpText.add(lblTischView);
		lblTischView.setHorizontalAlignment(SwingConstants.CENTER);
		lblTischView.setFont(new Font("Dialog", Font.BOLD, 20));
		lblTischView.setPreferredSize(new Dimension(0, 50));

		JPanel panelEastUpGrid = new JPanel();
		panelCenterUpEast.add(panelEastUpGrid);
		panelEastUpGrid.setLayout(new GridLayout(3, 3, 0, 0));
		panelEastUpGrid.setPreferredSize(new Dimension(490, 333));
		JPanel panelEast = new JPanel();
		panelCenter.add(panelEast, BorderLayout.SOUTH);
		panelEast.setPreferredSize(new Dimension(1000, 500));
		panelEast.setLayout(new BorderLayout(0, 0));

		JPanel panelCenterDown = new JPanel();
		panelEast.add(panelCenterDown, BorderLayout.SOUTH);
		panelCenterDown.setPreferredSize(new Dimension(1000, 617));
		panelCenterDown.setLayout(new BorderLayout(0, 0));

		JPanel panelCenterDownText = new JPanel();
		panelCenterDown.add(panelCenterDownText, BorderLayout.NORTH);
		panelCenterDownText.setLayout(new BorderLayout(0, 0));
		panelCenterDownText.setPreferredSize(new Dimension(1000, 50));

		JLabel lblProdukte = new JLabel("Produkte-View");
		lblProdukte.setHorizontalAlignment(SwingConstants.CENTER);
		panelCenterDownText.add(lblProdukte);
		lblProdukte.setFont(new Font("Dialog", Font.BOLD, 18));
		lblProdukte.setPreferredSize(new Dimension(150, 100));

		JPanel panelScroll = new JPanel();
		panelScroll.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelCenterDown.add(panelScroll);
		panelCenterDown.setPreferredSize(new Dimension(getWidth(), getHeight() / 2));
		panelScroll.setMaximumSize(new Dimension(1000, 617));
		panelScroll.setLayout(new GridLayout(4, 0, 0, 0));

		JScrollPane scrollPane = new JScrollPane(panelScroll);

		panelCenterDown.add(scrollPane, BorderLayout.CENTER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setPreferredSize(new Dimension(1000, 617));
		scrollPane.setBounds(50, 30, 300, 50);
		
		JButton btnSnacks = new JButton("Snacks");
		btnSnacks.setIcon(new ImageIcon(MainScreen.class.getResource("/icons/snacks-icon.png")));
		btnSnacks.setFocusPainted(false);
		btnSnacks.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				panelScroll.removeAll();
				if (tischNr != 0) {
					for (Snack snack : bc.snacksListe) {
						btn = new JButton();
						btn.setIcon(new ImageIcon(snack.getIconPath()));
						btn.setText(snack.getName());
						btn.setHorizontalAlignment(SwingConstants.LEFT);
						btn.setHorizontalTextPosition(SwingConstants.RIGHT);
						btn.setPreferredSize(new Dimension(230, 100));
						btn.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								String s = snack.getName() + ":\t\t " + snack.getPreis() + " CHF\n";
								Tisch tisch = bc.tische.get(tischNr);
								HashMap<Produkt, Integer> produkte = tisch.getProdukte();
								int amount;
								try
								{
									amount = produkte.get(snack);
								} catch (NullPointerException b) {
									amount = 0;
								}
								produkte.put(snack, amount + 1);
								setHeaderText();
								for (Produkt produkt : produkte.keySet()) {
									textKasseWindow.append(produkt.getName() + "\t" + produkte.get(produkt) +"\t" + produkt.getPreis()+ "\n");
									
								}
							}
						});
						panelScroll.add(btn);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Bitte Wählen Sie ein Tisch zuerst!");
				}
			}
		});
		btnSnacks.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSnacks.setBackground(new Color(34, 139, 34));
		panelCenterUpCenterGrid.add(btnSnacks);

		JButton btnShishas = new JButton("Shisha");
		btnShishas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelScroll.removeAll();
				if (tischNr != 0) {
					for (Shisha shishas : bc.shishasListe) {
						btn = new JButton();
						btn.setIcon(new ImageIcon(shishas.getIconPath()));
						btn.setText(shishas.getName());
						btn.setHorizontalAlignment(SwingConstants.LEFT);
						btn.setHorizontalTextPosition(SwingConstants.RIGHT);
						btn.setPreferredSize(new Dimension(230, 100));
						btn.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent arg0) {
								// Snacks-Button-Test
								String s = shishas.getName() + ":\t\t " + shishas.getPreis() + " CHF\n";
								Tisch tisch = bc.tische.get(tischNr);
								HashMap<Produkt, Integer> produkte = tisch.getProdukte();
								int amount;
								try
								{
									amount = produkte.get(shishas);
								} catch (NullPointerException b) {
									amount = 0;
								}
								produkte.put(shishas, amount + 1);
								setHeaderText();
								for (Produkt produkt : produkte.keySet()) {
									textKasseWindow.append(produkt.getName() + "\t" + produkte.get(produkt) +"\t" + produkt.getPreis()+ "\n");
									
								}
							}
						});
						panelScroll.add(btn);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Bitte Wählen Sie ein Tisch zuerst!");
				}
			}
		});
		btnShishas.setHorizontalAlignment(SwingConstants.LEFT);
		btnShishas.setIcon(new ImageIcon(MainScreen.class.getResource("/icons/shisha_small.png")));
		btnShishas.setFocusPainted(false);
		btnShishas.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnShishas.setBackground(new Color(255, 0, 0));
		panelCenterUpCenterGrid.add(btnShishas);

		JButton btnKaffe = new JButton("Kaffe");
		btnKaffe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelScroll.removeAll();
				if (tischNr != 0) {
					for (Kaffe kaffees : bc.kaffeesListe) {
						btn = new JButton();
						btn.setIcon(new ImageIcon(kaffees.getIconPath()));
						btn.setText(kaffees.getName());
						btn.setHorizontalAlignment(SwingConstants.LEFT);
						btn.setHorizontalTextPosition(SwingConstants.RIGHT);
						btn.setPreferredSize(new Dimension(230, 100));
						btn.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent arg0) {
								// Snacks-Button-Test
								String s = kaffees.getName() + ":\t\t " + kaffees.getPreis() + " CHF\n";
								Tisch tisch = bc.tische.get(tischNr);
								HashMap<Produkt, Integer> produkte = tisch.getProdukte();
								int amount;
								try
								{
									amount = produkte.get(kaffees);
								} catch (NullPointerException b) {
									amount = 0;
								}
								produkte.put(kaffees, amount + 1);
								setHeaderText();
								for (Produkt produkt : produkte.keySet()) {
									textKasseWindow.append(produkt.getName() + "\t" + produkte.get(produkt) +"\t" + produkt.getPreis()+ "\n");
									
								}
							}
						});
						panelScroll.add(btn);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Bitte Wählen Sie ein Tisch zuerst!");
				}
			}
		});
		btnKaffe.setIcon(new ImageIcon(MainScreen.class.getResource("/icons/coffe_logo.png")));
		btnKaffe.setFocusPainted(false);
		btnKaffe.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnKaffe.setBackground(new Color(65, 105, 225));
		panelCenterUpCenterGrid.add(btnKaffe);

		JButton btnGetreank = new JButton("Getränk");
		btnGetreank.setHorizontalAlignment(SwingConstants.LEFT);
		btnGetreank.setIcon(new ImageIcon(MainScreen.class.getResource("/icons/drinks_logo.png")));
		btnGetreank.setFocusPainted(false);
		btnGetreank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelScroll.removeAll();
				if (tischNr != 0) {
					for (Getraenk getraenk : bc.getraenkeListe) {
						btn = new JButton();
						btn.setIcon(new ImageIcon(getraenk.getIconPath()));
						btn.setText(getraenk.getName());
						btn.setHorizontalAlignment(SwingConstants.LEFT);
						btn.setHorizontalTextPosition(SwingConstants.RIGHT);
						btn.setPreferredSize(new Dimension(230, 100));
						btn.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								// Getränk-Button
								String s = getraenk.getName() + ":\t\t " + getraenk.getPreis() + " CHF\n";
								Tisch tisch = bc.tische.get(tischNr);
								HashMap<Produkt, Integer> produkte = tisch.getProdukte();
								int amount;
								try
								{
									amount = produkte.get(getraenk);
								} catch (NullPointerException b) {
									amount = 0;
								}
								produkte.put(getraenk, amount + 1);
								setHeaderText();
								for (Produkt produkt : produkte.keySet()) {
									textKasseWindow.append(produkt.getName() + "\t" + produkte.get(produkt) +"\t" + produkt.getPreis()+ "\n");
									Collection<Integer> values = produkte.values();
									textFieldSumme.setText("" +produkt.getPreis() * amount);
							
								}
//								textFieldSumme.setText("" + produkte.get(getraenk) * amount);
							}
						});
						panelScroll.add(btn);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Bitte Wählen Sie ein Tisch zuerst!");
				}
			}
		});
		btnGetreank.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnGetreank.setBackground(Color.ORANGE);
		panelCenterUpCenterGrid.add(btnGetreank);
		
		for (int x = 0; x < tableButtons.length; x++) {
			final JTableButton btn = tableButtons[x];
			panelEastUpGrid.add(tableButtons[x]);
			btn.setBackground(Color.RED);
			btn.setForeground(Color.ORANGE);
			btn.setFont(new Font("Tahoma", Font.BOLD, 30));
			btn.setForeground(Color.RED);
			btn.setIcon(new ImageIcon(MainScreen.class.getResource("/icons/table_logo.png")));
			btn.setContentAreaFilled(false);
			btn.setFocusPainted(false);
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					tischNr = btn.getTischNr();		
					lblAktTischNr.setText("Aktuel Tisch Nr.: "+tischNr);
					setHeaderText();
					
				}
			});
			if(tableButtons[x].isSelected()) {
				tableButtons[x].setBorder(new LineBorder(Color.GREEN, 5));
			}else {
//				tableButtons[x].setBorder(new LineBorder(Color.BLACK, 1));
			}
			tableButtons[x].setHorizontalTextPosition(SwingConstants.CENTER);
			// tischNr =Integer.parseInt(tableButtons[x].getName());

		}

		JButton btnView = new JButton("View");
		panelEastUpGrid.add(btnView);
		btnView.setBackground(Color.RED);
		btnView.setForeground(Color.ORANGE);
		btnView.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnView.setForeground(Color.RED);
		btnView.setIcon(new ImageIcon(MainScreen.class.getResource("/icons/table_logo.png")));
		btnView.setContentAreaFilled(false);
		btnView.setFocusPainted(false);
		btnView.setHorizontalTextPosition(SwingConstants.CENTER);
		btnView.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				TischePlan frame = new TischePlan();
				frame.setVisible(true);
				
				}
			});
	}
}