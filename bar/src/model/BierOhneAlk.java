/**
 * 
 */
package model;

/**
 * @author morgado
 *
 */
public class BierOhneAlk extends NoAlkoholGetraenk {
	

	/**
	 * Variabeln vom Bier
	 */
	private String brauerei;

	public BierOhneAlk(String name, double preis, String iconPath,String groesse, String brauerei) {
		super(name, preis,iconPath, groesse);
		this.brauerei = brauerei;

	}

	/**
	 * toString Methode
	 */
	public String toString() {
		String result = super.toString() + this.brauerei; // toString vom Getr�nk
		return getClass().getSimpleName() + ":: " + result;
	}	

}
