/**
 * 
 */
package model;

/**
 * @author morgado
 *
 */
public class Wein extends AlkoholGetraenk{

	/*
	 * Konstruktor von Wein
	 */
	public Wein(String name, double preis, String iconPath,String groesse, double volPro) {
		super(name, preis,iconPath, groesse, volPro);
	}
	
	/*
	 * toString Methode
	 */
	public String toString() {
		String result =super.toString();
		return this.getClass().getSimpleName() + ":: " + result;
	}

}
