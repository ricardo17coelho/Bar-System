package view;

import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.TitledBorder;

import controller.BarController;

import javax.swing.border.BevelBorder;
import javax.swing.JPasswordField;
import java.awt.FlowLayout;
import java.awt.Component;
import java.awt.Dimension;

public class StartScreen extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private BarController bc;
	
	///////////////////////////////AUDIO-CLIPS/////////////////////////////////
	///Aus andere Projekt MENDONZA_ELGA ///
//AudioClip error    = JApplet.newAudioClip(MainScreen.class.getResource("error.wav"));
//AudioClip numeric  = JApplet.newAudioClip(MainScreen.class.getResource("numeric.wav"));
//AudioClip intro    = JApplet.newAudioClip(MainScreen.class.getResource("intro.wav"));
//AudioClip welcome  = JApplet.newAudioClip(MainScreen.class.getResource("welcome.wav"));
//AudioClip chaching = JApplet.newAudioClip(MainScreen.class.getResource("chaching.wav"));

	public StartScreen(BarController bc) {
		setTitle("LaBarraca Shisha Bar 2018");
		this.bc = bc;
		this.createStartScreen();
	}

	/**
	 * Create the frame contentPane
	 */
	public void createStartScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 950);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(139, 0, 0));
		// setExtendedState(JFrame.MAXIMIZED_BOTH); //passt die Fenster auf die maximal
		// Grösse an
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		System.out.println(MAXIMIZED_BOTH);

		/**
		 * ActionPerformed fï¿½r Anmeldungsfenster und Weiterleitung
		 */
		contentPane.setLayout(new BorderLayout(0, 0));

		this.panelTop();
		this.panelCenter();

	}

	/*
	 * Create The Frame PanelTop
	 */
	public void panelTop() {
		JPanel panelTop = new JPanel();
		contentPane.add(panelTop, BorderLayout.NORTH);
		panelTop.setLayout(new BorderLayout(0, 0));

		JPanel panelTopWest = new JPanel();
		panelTop.add(panelTopWest, BorderLayout.WEST);
		panelTopWest.setLayout(new BoxLayout(panelTopWest, BoxLayout.Y_AXIS));

		JLabel lblLaBarracaShisha01 = new JLabel("La Barraca");
		panelTopWest.add(lblLaBarracaShisha01);
		lblLaBarracaShisha01.setFont(new Font("Snap ITC", Font.PLAIN, 75));
		lblLaBarracaShisha01.setHorizontalAlignment(SwingConstants.LEFT);
		lblLaBarracaShisha01.setForeground(Color.ORANGE);

		JLabel lblShishaBar = new JLabel("Shisha Bar");
		lblShishaBar.setHorizontalAlignment(SwingConstants.LEFT);
		lblShishaBar.setForeground(Color.ORANGE);
		lblShishaBar.setFont(new Font("Snap ITC", Font.PLAIN, 75));
		panelTopWest.add(lblShishaBar);

		JLabel lblBarkasseV = new JLabel("BarKasse v.1.0");
		lblBarkasseV.setHorizontalAlignment(SwingConstants.CENTER);
		panelTopWest.add(lblBarkasseV);
		lblBarkasseV.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblBarkasseV.setForeground(Color.RED);

		JPanel panelTopEast = new JPanel();
		panelTop.add(panelTopEast, BorderLayout.EAST);
		panelTopEast.setLayout(new BoxLayout(panelTopEast, BoxLayout.X_AXIS));

		JLabel lblLogoBar = new JLabel("");
		panelTopEast.add(lblLogoBar);
		Image barLogo = new ImageIcon(this.getClass().getResource("/shisha.png")).getImage();
		lblLogoBar.setIcon(new ImageIcon(barLogo));

	}

	/*
	 * Create The Frame PanelCenter
	 */
	public void panelCenter() {

		JPanel panelCenter = new JPanel();
		panelCenter.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.add(panelCenter, BorderLayout.CENTER);
		panelCenter.setLayout(new BoxLayout(panelCenter, BoxLayout.Y_AXIS));
		JPanel panelCenterUp = new JPanel();
		panelCenter.add(panelCenterUp);
		panelCenterUp.setLayout(new BorderLayout(0, 0));
		panelCenterUp.setPreferredSize(new Dimension(100, 200));

		JPanel panelCenterWest = new JPanel();
		panelCenterUp.add(panelCenterWest, BorderLayout.WEST);
		panelCenterWest.setPreferredSize(new Dimension(250, 100));

		JButton btnLogin = new JButton("");
//		btnLogin.addKeyListener(new KeyAdapter() {
//			@Override
//			public void keyPressed(KeyEvent e) {
//				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
//				String loginNamePassword = passwordField.getText();
//
//				if (loginNamePassword.equals("123") || loginNamePassword.equals("456")
//						|| loginNamePassword.equals("789")) {
//					MainScreen frameScreen = new MainScreen(loginNamePassword, null);
//					frameScreen.setVisible(true);
//					StartScreen frameStartScreen = new StartScreen(bc);
//					frameStartScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//				} else {
//
//					JOptionPane.showMessageDialog(null, "Loginname ist Falsch");
//				}
//				}
//			}
//		});
		panelCenterWest.add(btnLogin);
		btnLogin.setOpaque(false);
		btnLogin.setContentAreaFilled(false);
		btnLogin.setBorderPainted(false);
		btnLogin.setFocusPainted(false);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String loginNamePassword = passwordField.getText();

				if (loginNamePassword.equals("123") || loginNamePassword.equals("456")
						|| loginNamePassword.equals("789")) {
					dispose(); //Killt StartScreen
					MenuScreen frame = new MenuScreen(bc);
					frame.setVisible(true);
				} else {
					//error.play();
					JOptionPane.showMessageDialog(null, "Loginname ist Falsch");
				}

			}
		});
		btnLogin.setIcon(new ImageIcon(StartScreen.class.getResource("/icons/Login_Logo.png")));

		JPanel panelCenterCenter = new JPanel();
		panelCenterUp.add(panelCenterCenter, BorderLayout.CENTER);
		panelCenterCenter.setPreferredSize(new Dimension(200, 150));
		panelCenterCenter.setPreferredSize(new Dimension(70, 90));
		panelCenterCenter.setLayout(new BorderLayout(0, 0));

		passwordField = new JPasswordField();
		panelCenterCenter.add(passwordField, BorderLayout.NORTH);
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setFont(new Font("Dialog", Font.PLAIN, 40));

		JLabel lblMitarbeiterNr = new JLabel("(Mitarbeiter Nr. eingeben)");
		panelCenterCenter.add(lblMitarbeiterNr);
		lblMitarbeiterNr.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		JPanel panelCenterEast = new JPanel();
		panelCenterUp.add(panelCenterEast, BorderLayout.EAST);
		panelCenterEast.setLayout(new BoxLayout(panelCenterEast, BoxLayout.Y_AXIS));
		panelCenterEast.setPreferredSize(new Dimension(250, 100));

		JPanel panelGridLayout = new JPanel();
		panelCenter.add(panelGridLayout);

		JButton btnTastatur1 = new JButton("1");
		btnTastatur1.setBackground(new Color(192, 192, 192));
		btnTastatur1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				passwordField.setText(passwordField.getText() + "1");

			}
		});
		panelGridLayout.setLayout(new GridLayout(0, 3, 0, 0));
		panelGridLayout.setPreferredSize(new Dimension(600, 600));
		panelGridLayout.add(btnTastatur1);

		JButton btnTastatur2 = new JButton("2");
		btnTastatur2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				passwordField.setText(passwordField.getText() + "2");
			}
		});
		panelGridLayout.add(btnTastatur2);

		JButton btnTastatur3 = new JButton("3");
		btnTastatur3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				passwordField.setText(passwordField.getText() + "3");
			}
		});
		panelGridLayout.add(btnTastatur3);

		JButton btnTastatur4 = new JButton("4");
		btnTastatur4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				passwordField.setText(passwordField.getText() + "4");
			}
		});
		panelGridLayout.add(btnTastatur4);

		JButton btnTastatur5 = new JButton("5");
		btnTastatur5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				passwordField.setText(passwordField.getText() + "5");
			}
		});
		panelGridLayout.add(btnTastatur5);

		JButton btnTastatur6 = new JButton("6");
		btnTastatur6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				passwordField.setText(passwordField.getText() + "6");
			}
		});
		panelGridLayout.add(btnTastatur6);

		JButton btnTastatur7 = new JButton("7");
		btnTastatur7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				passwordField.setText(passwordField.getText() + "7");
			}
		});
		panelGridLayout.add(btnTastatur7);

		JButton btnTastatur8 = new JButton("8");
		btnTastatur8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				passwordField.setText(passwordField.getText() + "8");
			}
		});
		panelGridLayout.add(btnTastatur8);

		JButton btnTastatur9 = new JButton("9");
		btnTastatur9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				passwordField.setText(passwordField.getText() + "9");
			}
		});
		panelGridLayout.add(btnTastatur9);

		JButton btnTastatur0 = new JButton("0");
		btnTastatur0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				passwordField.setText(passwordField.getText() + "0");
			}
		});
		panelGridLayout.add(btnTastatur0);

		JButton btnAnmelden = new JButton("Anmelden");
		panelGridLayout.add(btnAnmelden);

		JButton btnAbrechen = new JButton("Loeschen");
		panelGridLayout.add(btnAbrechen);

		btnAbrechen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				passwordField.setText(null);
				;

			}
		});

		/*
		 * ##### LOESUNG MIT JPassword #####
		 */
		btnAnmelden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String loginNamePassword = passwordField.getText();

				if (loginNamePassword.equals("123") || loginNamePassword.equals("456")
						|| loginNamePassword.equals("789")) {
					MainScreen frameScreen = new MainScreen(loginNamePassword, null);
					frameScreen.setVisible(true);
					StartScreen frameStartScreen = new StartScreen(bc);
					frameStartScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				} else {

					JOptionPane.showMessageDialog(null, "Loginname ist Falsch");
				}
			}
		});
	}
}
