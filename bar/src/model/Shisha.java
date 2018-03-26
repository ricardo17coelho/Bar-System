/**
 * 
 */
package model;

import java.io.Serializable;

/**
 * @author morga
 *
 */
public class Shisha extends Produkt{

	/**
	 * @param name
	 * @param preis
	 * @param iconPath
	 * Konstruktor von Shisha
	 */
	public Shisha(String name, double preis, String iconPath) {
		super(name, preis, iconPath);
	}
	/*
	 * toString Methode
	 */
	public String toString() {

		String result = super.toString();
		return getClass().getSimpleName() + ":: " + result;

	}

}
