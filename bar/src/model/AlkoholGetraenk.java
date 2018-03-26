/**
 * 
 */
package model;

/**
 * @author morga
 *
 */
public abstract class AlkoholGetraenk extends Getraenk {
	
	private double volumenProzent;
	
	/**
	 * @return the volumenProzent
	 */
	public double getVolumenProzent() {
		return volumenProzent;
	}
	/*
	 * Konstruktor von AlkoholGetraenk
	 */
	public AlkoholGetraenk (String name, double preis, String iconPath,String groesse, double volPro) {
		super(name, preis, iconPath, groesse);
		this.volumenProzent = volPro;
		
	}	
	
}
