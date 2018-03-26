package model;

import java.io.Serializable;
;

/**
 * @author morga
 *
 */
public abstract class Snack extends Produkt{
	protected String groesse;
	/**
	 * Konstruktor von Snack
	 */
	public Snack(String name, double preis, String iconPath, String groesse) {
		super(name, preis, iconPath);
		this.groesse = groesse;

	}
	
	/*
	 * toString Methode
	 */
	public String toString() {

		String result = super.toString();
		return getClass().getSimpleName() + ":: " + result;

	}

}
