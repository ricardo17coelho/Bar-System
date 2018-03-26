/**
 * 
 */
package controller;

import java.awt.EventQueue;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JFrame;
import model.BierMitAlk;
import model.BierOhneAlk;
import model.Kaffe;
import model.KaffeCold;
import model.KaffeHot;
import model.Getraenk;
import model.Longdrink;
import model.Produkt;
import model.Calculator;
import model.Champagner;
import model.Shisha;
import model.Snack;
import model.SnacksCold;
import model.SnacksHot;
import model.Soda;
import model.Tisch;
import model.Wein;
import view.MainScreen;

/**
 * @author morga
 *
 */
public class BarController {
	public HashMap<Integer, Tisch> tische;
	static BarController bc = new BarController();
	// public HashMap<Snack, Integer> snacksMap;
	public List<Snack> snacksListe;
	public List<Shisha> shishasListe;
	public List<Kaffe> kaffeesListe;
	public List<Getraenk> getraenkeListe;

	/**
	 * @return the snacksListe
	 */
	public List<Snack> getSnacksListe() {
		return snacksListe;
	}

	/**
	 * @param snacksListe
	 *            the snacksListe to set
	 */
	public void setSnacksListe(List<Snack> snacksListe) {
		this.snacksListe = snacksListe;
	}

	/**
	 * @return the shishasListe
	 */
	public List<Shisha> getShishasListe() {
		return shishasListe;
	}

	/**
	 * @param shishasListe
	 *            the shishasListe to set
	 */
	public void setShishasListe(List<Shisha> shishasListe) {
		this.shishasListe = shishasListe;
	}

	/**
	 * @return the kaffeesListe
	 */
	public List<Kaffe> getKaffeesListe() {
		return kaffeesListe;
	}

	/**
	 * @param kaffeesListe
	 *            the kaffeesListe to set
	 */
	public void setKaffeesListe(List<Kaffe> kaffeesListe) {
		this.kaffeesListe = kaffeesListe;
	}

	/**
	 * @return the getraenkeListe
	 */
	public List<Getraenk> getGetraenkeListe() {
		return getraenkeListe;
	}

	/**
	 * @param getraenkeListe
	 *            the getraenkeListe to set
	 */
	public void setGetraenkeListe(List<Getraenk> getraenkeListe) {
		this.getraenkeListe = getraenkeListe;
	}

	/**
	 * BarController Liste initialisiert
	 */
	public BarController() {
		// TODO Auto-generated constructor stub
		getraenkeListe = new ArrayList<Getraenk>();
		snacksListe = new ArrayList<Snack>();
		// snacksMap = new HashMap();
		shishasListe = new ArrayList<Shisha>();
		kaffeesListe = new ArrayList<Kaffe>();
		tische = new HashMap<>();
		for (int i = 1; i <= 8; i++) {
			try {
				tische.put(i, new Tisch(i));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	private void generateDataGetraenk() {
		////////////////// BierMitAlkohol////////////////////
		getraenkeListe.add(new BierMitAlk("Quellfrisch", 5,
				"img/icons_products/icons_getraenk/icons_beer/klein/beer-01.png", "300 ml", 4.8, ", Locher AG"));
		getraenkeListe.add(new BierMitAlk("Calanda Lager", 4,
				"img/icons_products/icons_getraenk/icons_beer/klein/beer-01.png", "500ml", 4.8, "Calanda"));
		getraenkeListe.add(new BierMitAlk("Feldschlösschen Original", 4,
				"img/icons_products/icons_getraenk/icons_beer/klein/beer-01.png", "3330ml", 6.5, "Feldschlösschen"));
		getraenkeListe.add(new BierMitAlk("Schützengarten", 4,
				"img/icons_products/icons_getraenk/icons_beer/klein/beer-01.png", "500ml", 5.2, "Schützengarten"));
		getraenkeListe.add(new BierMitAlk("Sonnenbräu Bockbier", 4,
				"img/icons_products/icons_getraenk/icons_beer/klein/beer-01.png", "500ml", 4.8, "Locher"));
		getraenkeListe.add(new BierMitAlk("Wädi Bräu Hanf", 5,
				"img/icons_products/icons_getraenk/icons_beer/klein/beer-01.png", "500ml", 5, "Wädi-Brau-Huus"));
		getraenkeListe.add(new BierMitAlk("Hopfemandli Lagerbier", 4,
				"img/icons_products/icons_getraenk/icons_beer/klein/beer-01.png", "500ml", 4.8, "Baar"));
		getraenkeListe.add(new BierMitAlk("Eichhof Barbara", 4.50,
				"img/icons_products/icons_getraenk/icons_beer/klein/beer-01.png", "500ml", 6.5, "Eichhof-Brauerei"));
		getraenkeListe.add(new BierMitAlk("Chopfab hell und dunkel", 5,
				"img/icons_products/icons_getraenk/icons_beer/klein/beer-01.png", "500ml", 5.0,
				"Doppelleu BrauwerkStatt"));
		getraenkeListe.add(new BierMitAlk("Bier Deluxe", 10,
				"img/icons_products/icons_getraenk/icons_beer/klein/beer-deluxe.png", "2 Stk.", 8, "Deluxe"));

		////////////////// BierOhneAlkohol////////////////////
		getraenkeListe.add(new BierOhneAlk("Egger", 3, "img/icons_products/icons_getraenk/icons_beer/klein/beer-05.png",
				"330ml", "Albert Egger AG"));
		getraenkeListe.add(new BierOhneAlk("Sonnwendlig", 4,
				"img/icons_products/icons_getraenk/icons_beer/klein/beer-05.png", "330ml", "Locher"));
		getraenkeListe.add(new BierOhneAlk("Leermond", 4,
				"img/icons_products/icons_getraenk/icons_beer/klein/beer-05.png", "330ml", "Locher"));
		getraenkeListe.add(new BierOhneAlk("Flauder", 4.5,
				"img/icons_products/icons_getraenk/icons_beer/klein/beer-05.png", "330ml", "Locher"));
		getraenkeListe.add(new BierOhneAlk("Bitburger", 3.5,
				"img/icons_products/icons_getraenk/icons_beer/klein/beer-05.png", "330ml", "Bitburger"));
		getraenkeListe.add(new BierOhneAlk("Holsten", 3,
				"img/icons_products/icons_getraenk/icons_beer/klein/beer-05.png", "330ml", "Calsberg"));
		getraenkeListe.add(new BierOhneAlk("Warsteiner", 3,
				"img/icons_products/icons_getraenk/icons_beer/klein/beer-05.png", "330ml", "Warsteiner"));
		getraenkeListe.add(new BierOhneAlk("Feldschlösschen-Alkoholfrei", 2.80,
				"img/icons_products/icons_getraenk/icons_beer/klein/beer-05.png", "330ml", "Feldschloss"));

		//////////////// SODA///////////////////////////////
		getraenkeListe.add(new Soda("Aquarius", 3, "img/icons_products/icons_getraenk/icons_soda/klein/aquarius.png",
				"333ml", "Lipton"));
		getraenkeListe.add(new Soda("Coca-Cola", 3.5, "img/icons_products/icons_getraenk/icons_soda/klein/coke-04.png",
				"333ml", "Coca-Cola"));
		getraenkeListe.add(new Soda("Cocal-Cola Zero", 3.5,
				"img/icons_products/icons_getraenk/icons_soda/klein/cocacolazero.png", "333ml", "Coca-Cola"));
		getraenkeListe.add(new Soda("Rivella", 3.5, "img/icons_products/icons_getraenk/icons_soda/klein/rivella.png",
				"333ml", "Coca-Cola"));
		getraenkeListe.add(new Soda("Pepsi", 3.5, "img/icons_products/icons_getraenk/icons_soda/klein/pepsi-01.png",
				"333ml", "Pepsi"));
		getraenkeListe.add(new Soda("Fanta", 3.5, "img/icons_products/icons_getraenk/icons_soda/klein/fanta.png",
				"333ml", "Fanta"));
		getraenkeListe.add(new Soda("Nestea", 3.5, "img/icons_products/icons_getraenk/icons_soda/klein/nestea.png",
				"333ml", "Rivela"));
		getraenkeListe.add(new Soda("Fritz-Kola", 5,
				"img/icons_products/icons_getraenk/icons_soda/klein/fritz-kola.png", "333ml", "Fritz-Kola"));
		getraenkeListe.add(new Soda("Fentimans-Tonic", 3,
				"img/icons_products/icons_getraenk/icons_longdrinks/klein/Fentimans_Tonic_Water.png", "120ml",
				"Fentimans"));
		getraenkeListe.add(new Soda("Schweppes-Tonic", 3,
				"img/icons_products/icons_getraenk/icons_longdrinks/klein/schweppes_tonic_water.png", "120ml",
				"Fentimans"));
		getraenkeListe.add(new Soda("Goldberg-Tonic", 3,
				"img/icons_products/icons_getraenk/icons_longdrinks/klein/Goldberg_Tonic_Water.png", "120ml",
				"Fentimans"));
		getraenkeListe.add(new Soda("Fever-Tree-Tonic", 3,
				"img/icons_products/icons_getraenk/icons_longdrinks/klein/Fever_Tree_Tonic_Water.png", "120ml",
				"Fentimans"));

		/////////////// Longdrinks/////////////////////////
		getraenkeListe.add(new Longdrink("Hendrick's", 16,
				"img/icons_products/icons_getraenk/icons_longdrinks/klein/gin_hendricks.png", "350 ml", 10, "Gurke"));
		getraenkeListe.add(new Longdrink("Bombay", 13.5,
				"img/icons_products/icons_getraenk/icons_longdrinks/klein/gin_bombay.png", "350 ml", 10, "Zitrone"));
		getraenkeListe.add(new Longdrink("Beefeater", 13,
				"img/icons_products/icons_getraenk/icons_longdrinks/klein/gin_beefeater.png", "350 ml", 10, "Orange"));
		getraenkeListe.add(new Longdrink("Gordons", 14,
				"img/icons_products/icons_getraenk/icons_longdrinks/klein/gin_tanqueray.png", "350 ml", 10, "Gurke"));
		getraenkeListe.add(new Longdrink("Tanqueray", 12,
				"img/icons_products/icons_getraenk/icons_longdrinks/klein/gin_hendricks.png", "350 ml", 10, "Gurke"));
		getraenkeListe.add(new Longdrink("Belvedere", 9,
				"img/icons_products/icons_getraenk/icons_longdrinks/klein/Vodka.png", "350 ml", 6.4, "Keine"));
		getraenkeListe.add(new Longdrink("Jaeger-Meister", 7,
				"img/icons_products/icons_getraenk/icons_longdrinks/klein/jaeger_meister.png", "350 ml", 20, "Orange"));
		getraenkeListe.add(new Longdrink("Crystal-Skull", 10,
				"img/icons_products/icons_getraenk/icons_longdrinks/klein/crystal-skull-vodka.png", "350 ml", 25,
				"Cola"));
		getraenkeListe.add(new Longdrink("Grey-Goose", 10,
				"img/icons_products/icons_getraenk/icons_longdrinks/klein/Vodka-2.png", "350 ml", 25, "Cola"));
		getraenkeListe.add(new Longdrink("Blue Lagune", 8,
				"img/icons_products/icons_getraenk/icons_longdrinks/klein/blue.png", "350ml", 17, "Zitrone"));
		getraenkeListe.add(new Longdrink("Pina-Colada", 8,
				"img/icons_products/icons_getraenk/icons_longdrinks/klein/Pina-Colada.png", "350ml", 17, "Zitrone"));
		getraenkeListe.add(new Longdrink("Mojito", 8,
				"img/icons_products/icons_getraenk/icons_longdrinks/klein/Mojito.png", "350ml", 17, "Zitrone"));
		getraenkeListe.add(new Longdrink("Campari-Orange", 8,
				"img/icons_products/icons_getraenk/icons_longdrinks/klein/Campari-Orange.png", "350ml", 17, "Zitrone"));
		getraenkeListe.add(new Longdrink("Purple-Passion", 8,
				"img/icons_products/icons_getraenk/icons_longdrinks/klein/Purple-Passion.png", "350ml", 17, "Zitrone"));
		getraenkeListe.add(new Longdrink("Scotch", 16,
				"img/icons_products/icons_getraenk/icons_longdrinks/klein/Scotch.png", "100ml", 50, "Ice Würfel"));
		getraenkeListe.add(new Longdrink("Maker's 46", 19,
				"img/icons_products/icons_getraenk/icons_longdrinks/klein/Whiskey.png", "100ml", 47, "Ice Würfel"));
		getraenkeListe.add(new Longdrink("Glendronach 18", 18,
				"img/icons_products/icons_getraenk/icons_longdrinks/klein/Whiskey-2.png", "350ml", 57, "Ice Würfel"));

		/////////////// WEIN /////////////////////////
		getraenkeListe.add(new Wein("Cayas-Wein", 30,
				"img/icons_products/icons_getraenk/icons_longdrinks/klein/Red_Wine.png", "1 Flasche", 37));
		getraenkeListe.add(new Wein("Syrah-Wein", 35,
				"img/icons_products/icons_getraenk/icons_longdrinks/klein/RedWine.png", "1 Flasche", 40));
		getraenkeListe.add(new Wein("Lapon-Wein", 130,
				"img/icons_products/icons_getraenk/icons_longdrinks/klein/wein-deluxe.png", "1 Flasche", 35));
		getraenkeListe.add(new Wein("Mitis-Wein", 130,
				"img/icons_products/icons_getraenk/icons_longdrinks/klein/wein.png", "1 Flasche", 35));

		////////////// CHAMPAGNER /////////////////////////
		getraenkeListe.add(new Champagner("MOÊT & CHANDON", 100,
				"img/icons_products/icons_getraenk/icons_champagner/klein/champagne.png", "1 Flasche", 30));
		getraenkeListe.add(new Champagner("MOÊT & CHANDON-Deluxe", 140,
				"img/icons_products/icons_getraenk/icons_champagner/klein/champagner-deluxe.png", "1 Flasche", 30));
	}

	private void generateDataSnacks() {
		////////////////// SnacksCold////////////////////
		snacksListe
				.add(new SnacksCold("Erdnüsse", 2, "img/icons_products/icons_snacks/cold_snacks/popcorn.png", "150gr"));
		snacksListe
				.add(new SnacksCold("Chips", 3.80, "img/icons_products/icons_snacks/cold_snacks/popcorn.png", "500gr"));
		snacksListe.add(
				new SnacksCold("Nachos", 3.80, "img/icons_products/icons_snacks/cold_snacks/popcorn.png", "400gr"));
		snacksListe
				.add(new SnacksCold("Cokies", 3, "img/icons_products/icons_snacks/cold_snacks/popcorn.png", "4 Stk."));
		snacksListe.add(new SnacksCold("M&M's", 3, "img/icons_products/icons_snacks/cold_snacks/popcorn.png", "125gr"));
		snacksListe
				.add(new SnacksCold("Brownie", 4, "img/icons_products/icons_snacks/cold_snacks/popcorn.png", "1 Stk."));
		snacksListe.add(
				new SnacksCold("Snickers", 2, "img/icons_products/icons_snacks/cold_snacks/popcorn.png", "1 Stk."));
		snacksListe.add(new SnacksCold("PopCorn", 4.90, "img/icons_products/icons_snacks/cold_snacks/popcorn.png",
				"1 Portion"));

		///////////////// SnacksHot/////////////////////
		snacksListe.add(
				new SnacksHot("Nuggets", 2.50, "img/icons_products/icons_snacks/cold_snacks/popcorn.png", "10 Skt."));
		snacksListe.add(new SnacksHot("Nachos con Queso", 5.80,
				"img/icons_products/icons_snacks/cold_snacks/popcorn.png", "400gr"));
		snacksListe.add(new SnacksHot("Nachos con Carne", 3, "img/icons_products/icons_snacks/cold_snacks/popcorn.png",
				"400gr"));
		snacksListe.add(
				new SnacksHot("Leckerier", 4, "img/icons_products/icons_snacks/cold_snacks/popcorn.png", "2meter"));
		snacksListe.add(new SnacksHot("Tapas des Tages", 5, "img/icons_products/icons_snacks/cold_snacks/popcorn.png",
				"1 Portion"));
		snacksListe.add(new SnacksHot("La Barraca Burger", 10,
				"img/icons_products/icons_snacks/cold_snacks/popcorn.png", "1 Stk."));
		snacksListe.add(new SnacksHot("Süss-Kartoffeln", 4, "img/icons_products/icons_snacks/cold_snacks/popcorn.png",
				"1 Portion"));
		snacksListe.add(new SnacksHot("Pizza Magrherita", 9, "img/icons_products/icons_snacks/cold_snacks/popcorn.png",
				"30 cm"));
	}

	private void generateDataKaffees() {
		///////////////// KaffeHot/////////////////////
		kaffeesListe.add(new KaffeHot("Espresso", 3, "img/icons/box.png", "100ml", "Keine"));
		kaffeesListe.add(new KaffeHot("Espresso Ristretto", 3.5, "img/icons/box.png", "125ml", "Keine"));
		kaffeesListe.add(new KaffeHot("Espresso Machiatto", 4, "img/icons/box.png", "125ml", "Rahm"));
		kaffeesListe.add(new KaffeHot("Lungo", 4, "img/icons/box.png", "200ml", "Keine"));
		kaffeesListe.add(new KaffeHot("Cappuccino", 4.80, "img/icons/box.png", "350ml", "Rahm + Milch"));
		kaffeesListe.add(new KaffeHot("Café Latte", 5, "img/icons/box.png", "350ml", "Milch"));
		kaffeesListe.add(new KaffeHot("Americano", 3.80, "img/icons/box.png", "300ml", "Keine"));
		kaffeesListe.add(new KaffeHot("Latte Machiatto", 5.50, "img/icons/box.png", "350ml", "Warmes Milch"));
		kaffeesListe.add(new KaffeHot("Caramel Machiatto", 6, "img/icons/box.png", "400ml", "Caramel"));

		//////////////// KaffeHot/////////////////////
		kaffeesListe.add(new KaffeCold("Frappuccino", 3.5, "img/icons/box.png", "350ml", "Ice Würfel"));
		kaffeesListe.add(new KaffeCold("Caramel-Frappuccino", 4.30, "img/icons/box.png", "350ml", "Karamel"));
		kaffeesListe.add(new KaffeCold("Shoki-Frappuccino", 4.30, "img/icons/box.png", "350ml", "Shoki"));
		kaffeesListe.add(new KaffeCold("Vanille-Frappuccino", 4.30, "img/icons/box.png", "350ml", "Vanille"));
		kaffeesListe.add(new KaffeCold("Mocha-Frappe", 5, "img/icons/box.png", "350ml", "Mocha"));
		kaffeesListe.add(new KaffeCold("Iced Coffe", 3, "img/icons/box.png", "200ml", "Ice Würfel"));
		kaffeesListe.add(new KaffeCold("Ice Irish Coffe", 6, "img/icons/box.png", "350ml", "Irish Whisky"));
		kaffeesListe.add(new KaffeCold("Ice Brew", 7, "img/icons/box.png", "400ml", "Ice Würfel"));

	}

	private void generateDataShisha() {
		///////////////// Shishas/////////////////////
		shishasListe.add(new Shisha("Standard", 10, "img/icons/box.png"));
		shishasListe.add(new Shisha("Ton-Kopf", 2, "img/icons/box.png"));
		shishasListe.add(new Shisha("Äpfel-Kopf", 4, "img/icons/box.png"));
		shishasListe.add(new Shisha("Ananas-kopf", 8, "img/icons/box.png"));
		shishasListe.add(new Shisha("Standard", 10, "img/icons/box.png"));
		shishasListe.add(new Shisha("Ton-Kopf", 2, "img/icons/box.png"));
		shishasListe.add(new Shisha("Äpfel-Kopf", 4, "img/icons/box.png"));
		shishasListe.add(new Shisha("Ananas-kopf", 8, "img/icons/box.png"));
		shishasListe.add(new Shisha("Standard", 10, "img/icons/box.png"));
		shishasListe.add(new Shisha("Ton-Kopf", 2, "img/icons/box.png"));
		shishasListe.add(new Shisha("Äpfel-Kopf", 4, "img/icons/box.png"));
		shishasListe.add(new Shisha("Ananas-kopf", 8, "img/icons/box.png"));
		shishasListe.add(new Shisha("Standard", 10, "img/icons/box.png"));
		shishasListe.add(new Shisha("Ton-Kopf", 2, "img/icons/box.png"));
		shishasListe.add(new Shisha("Äpfel-Kopf", 4, "img/icons/box.png"));
		shishasListe.add(new Shisha("Ananas-kopf", 8, "img/icons/box.png"));
		shishasListe.add(new Shisha("Standard", 10, "img/icons/box.png"));
		shishasListe.add(new Shisha("Ton-Kopf", 2, "img/icons/box.png"));
		shishasListe.add(new Shisha("Äpfel-Kopf", 4, "img/icons/box.png"));
		shishasListe.add(new Shisha("Ananas-kopf", 8, "img/icons/box.png"));
		shishasListe.add(new Shisha("Standard", 10, "img/icons/box.png"));
		shishasListe.add(new Shisha("Ton-Kopf", 2, "img/icons/box.png"));
		shishasListe.add(new Shisha("Äpfel-Kopf", 4, "img/icons/box.png"));
		shishasListe.add(new Shisha("Ananas-kopf", 8, "img/icons/box.png"));

	}

	/**
	 * save objects to file Getränke-File
	 * 
	 * @param liste
	 * @param fileName
	 */
	public void saveGetraenk(List<Getraenk> getraenks, String fileName) {

		FileOutputStream fos = null;
		ObjectOutputStream out = null;

		try {
			fos = new FileOutputStream(fileName);
			out = new ObjectOutputStream(fos);

			for (Getraenk p : getraenks) {
				out.writeObject(p);
			}
			out.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * loads serialized objects from Getränke-File
	 * 
	 * @param filename
	 * @return
	 */
	public List<Getraenk> readGetraenk(String filename) {
		ObjectInputStream in = null;
		List<Getraenk> liste = new LinkedList<Getraenk>();
		try {
			in = new ObjectInputStream(new FileInputStream(filename));
			Getraenk ge = null;
			while ((ge = (Getraenk) in.readObject()) != null)
				liste.add(ge);
			in.close();
		} catch (Exception ex) {
			// ex.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (Exception ex) {
				/* */ }
		}
		return liste;
	}

	/**
	 * save objects to file Snacks-File
	 * 
	 * @param liste
	 * @param fileName
	 */
	public void saveSnacks(List<Snack> snacks, String fileName) {

		FileOutputStream fos = null;
		ObjectOutputStream out = null;

		try {
			fos = new FileOutputStream(fileName);
			out = new ObjectOutputStream(fos);

			for (Snack snack : snacks) {
				out.writeObject(snack);
			}
			out.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * loads serialized objects from Snacks-File
	 * 
	 * @param filename
	 * @return
	 */
	public List<Snack> readSnacks(String filename) {
		ObjectInputStream in = null;
		List<Snack> liste = new LinkedList<Snack>();
		try {
			in = new ObjectInputStream(new FileInputStream(filename));
			Snack sn = null;
			while ((sn = (Snack) in.readObject()) != null)
				liste.add(sn);
			in.close();
		} catch (Exception ex) {
			// ex.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (Exception ex) {
				/* */ }
		}
		return liste;
	}

	/*
	 * save objects to file Shishas
	 * 
	 * @param liste
	 * 
	 * @param fileName
	 */
	public void saveShishas(List<Shisha> shishas, String fileName) {

		FileOutputStream fos = null;
		ObjectOutputStream out = null;

		try {
			fos = new FileOutputStream(fileName);
			out = new ObjectOutputStream(fos);

			for (Shisha shisha : shishas) {
				out.writeObject(shisha);
			}
			out.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * loads serialized objects from Shishas-File
	 * 
	 * @param filename
	 * @return
	 */
	public List<Shisha> readShishas(String filename) {
		ObjectInputStream in = null;
		List<Shisha> liste = new LinkedList<Shisha>();
		try {
			in = new ObjectInputStream(new FileInputStream(filename));
			Shisha sh = null;
			while ((sh = (Shisha) in.readObject()) != null)
				liste.add(sh);
			in.close();
		} catch (Exception ex) {
			// ex.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (Exception ex) {
				/* */ }
		}
		return liste;

	}

	/*
	 * save objects to file Kaffees
	 * 
	 * @param liste
	 * 
	 * @param fileName
	 */
	public void saveKaffees(List<Kaffe> kaffees, String fileName) {

		FileOutputStream fos = null;
		ObjectOutputStream out = null;

		try {
			fos = new FileOutputStream(fileName);
			out = new ObjectOutputStream(fos);

			for (Kaffe kaffee : kaffees) {
				out.writeObject(kaffee);
			}
			out.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * loads serialized objects from Kaffees-File
	 * 
	 * @param filename
	 * @return
	 */
	public List<Kaffe> readKaffees(String filename) {
		ObjectInputStream in = null;
		List<Kaffe> liste = new LinkedList<Kaffe>();
		try {
			in = new ObjectInputStream(new FileInputStream(filename));
			Kaffe ka = null;
			while ((ka = (Kaffe) in.readObject()) != null)
				liste.add(ka);
			in.close();
		} catch (Exception ex) {
			// ex.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (Exception ex) {
				/* */ }
		}
		return liste;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BarController bc = new BarController();

		//// Getränke ////
		bc.generateDataGetraenk();
		bc.saveGetraenk(bc.getraenkeListe, "GetraenkListe");
		bc.setGetraenkeListe(bc.readGetraenk("GetraenkListe"));
		//// Snacks ////
		bc.generateDataSnacks();
		bc.saveSnacks(bc.snacksListe, "SnacksListe");
		bc.setSnacksListe(bc.readSnacks("SnacksListe"));
		//// Shishas ////
		bc.generateDataShisha();
		bc.saveShishas(bc.shishasListe, "ShishasListe");
		bc.setShishasListe(bc.readShishas("ShishasListe"));
		//// Kaffees ////
		bc.generateDataKaffees();
		bc.saveKaffees(bc.kaffeesListe, "KaffeesListe");
		bc.setKaffeesListe(bc.readKaffees("KaffeesListe"));

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// StartScreen frameStartScreen = new StartScreen(bc);
					// frameStartScreen.setVisible(true);
					// MenuScreen frame = new MenuScreen(bc);
					// frame.setVisible(true);
					MainScreen frameScreen = new MainScreen(null, bc);
					frameScreen.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
}
