/**
 * 
 */
package model;

/**
 * @author morgado
 *
 */
public class Longdrink extends AlkoholGetraenk{
	
	/*
	 * Variablen vom Longdrink
	 */
	private String Zutaten;
	
	/*
	 * Konstruktor von Longdrink
	 */
	public Longdrink(String name, double preis, String iconPath,String groesse, double volPro, String Zutaten) {
		super(name, preis,iconPath, groesse, volPro);
		this.Zutaten = Zutaten;
	}
	
	public String toString() {
		String result =super.toString() + ", " + this.Zutaten;
		return this.getClass().getSimpleName() + ":: " + result;
	}
		

}
