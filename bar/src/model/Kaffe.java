/**
 * 
 */
package model;

import java.io.Serializable;

/**
 * @author morgado
 *
 */
public abstract class Kaffe extends Produkt {
	protected String groesse;
	/**
	 * Kontruktor vom Kaffee
	 */
	public Kaffe(String name, double preis, String iconPath, String groesse) {
		super(name, preis, iconPath);
		this.groesse = groesse;
	}

	public String toString() {

		String result = super.toString();
		return getClass().getSimpleName() + ":: " + result;

	}
	
	
}

