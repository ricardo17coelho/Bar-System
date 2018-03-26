/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author morgado
 *
 */
public class BierMitAlk extends AlkoholGetraenk {

	/**
	 * Variabeln vom Bier
	 */
	private double volumeProzent;
	private String brauerei;
	
	/*
	 * Konstruktor von BierMitAlk
	 */
	public BierMitAlk(String name, double preis, String iconPath,String groesse,double volPro, String brauerei) {
		// Aufruf des Basisklassenkonstruktor mit �bergabe der Parameter
		super(name, preis,iconPath,groesse, volPro);
		this.volumeProzent = volPro;

	}

	
	


	/**
	 * erweitert toString - Funktion der Basisklasse (super.toString()) um
	 * zus�tzliche Ausgabe
	 */
	public String toString() {
		String result = super.toString() + this.brauerei; // toString vom Getr�nk
		return getClass().getSimpleName() + ":: " + result;
	}

	@Override
	public String getShortInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
