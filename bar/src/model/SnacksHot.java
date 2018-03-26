package model;

public class SnacksHot extends Snack {

	/*
	 * Konstruktor von SnacksHot
	 */
	public SnacksHot(String name, double preis, String iconPath,String groesse) {
		super(name, preis,iconPath, groesse);

	}

	/*
	 * toString Methoode
	 */
	public String toString() {
		String result =super.toString();
		return this.getClass().getSimpleName() + ":: " + result;
	}
	
}
