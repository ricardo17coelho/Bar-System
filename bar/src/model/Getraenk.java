/**
 * 
 */
package model;

import java.io.Serializable;

/**
 * @author morgado
 *
 */
public abstract class Getraenk extends Produkt  {
	protected String groesse;
	/**
	 * Konstruktor vom Getraek
	 */
	public Getraenk(String name, double preis, String iconPath, String groesse) {
		super(name, preis, iconPath);
		this.groesse = groesse;

	}

	@Override
	public String toString() {

		String result = super.toString();
		return getClass().getSimpleName() + ":: " + result;

	}

}
