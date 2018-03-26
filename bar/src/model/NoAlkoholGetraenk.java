/**
 * 
 */
package model;

/**
 * @author morgado
 *
 */
public abstract class NoAlkoholGetraenk extends Getraenk {
	
	/*¨
	 * Konstruktor von NoAlkoholGetraenk
	 */
	public NoAlkoholGetraenk (String name, double preis, String iconPath,String groesse) {
		super(name, preis,iconPath, groesse);
		
	}
	
}
