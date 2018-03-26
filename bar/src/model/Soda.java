/**
 * 
 */
package model;

/**
 * @author morgado
 *
 */
public class Soda extends NoAlkoholGetraenk {
	
	/*
	 * Variabeln von Soda
	 */
	private String marke;

	/**
	 * Konstruktor von Soda
	 */
	public Soda(String name, double preis, String iconPath,String groesse, String marke) {
		super(name, preis,iconPath, groesse);
		this.marke = marke;
	}

	public String toString() {
		String result = super.toString() + "," + this.marke;
		return this.getClass().getSimpleName() + ":: " + result;

	}
}
