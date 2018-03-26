/**
 * 
 */
package model;

/**
 * @author morgado
 *
 */
public class Champagner extends AlkoholGetraenk{

	/*
	 * Konstruktor von Champagner
	 */
	public Champagner(String name, double preis, String iconPath,String groesse, double volPro) {
		super(name, preis, iconPath,groesse, volPro);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		String result =super.toString();
		return this.getClass().getSimpleName() + ":: " + result;
	}

}
