package model;

import java.io.Serializable;

public abstract class Produkt implements Serializable, IBarItem{

	/**
	 * Variabeln vom Snack
	 */
	protected String name;
	protected double preis;
	protected String iconPath;
	protected int bestellungMenge;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the iconPath
	 */
	public String getIconPath() {
		return iconPath;
	}

	/**
	 * @return the preis
	 */
	public double getPreis() {
		return preis;
	}

	
	/*
	 * Konstruktor von Produkte
	 */
	public Produkt(String name, double preis, String iconPath) {
		this.name = name;
		this.preis = preis;
		this.iconPath = iconPath;		
	}
	
	/*
	 * toString Methode
	 */
	public String toString() {

		return this.name + ", " + this.preis + " CHF, ";

	}

	@Override
	public String getShortInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	/*
	 * instead of querying the database 
	 * we assume each product is available 10times
	 */
	@Override
	public int getBestellungMenge() {
		// TODO Auto-generated method stub
		return bestellungMenge;
	}


}
