package model;

public class KaffeCold extends Kaffe {
	private String zusaetze;
//	private String land;
//	private boolean bio;

	/**
	 * Konstruktor vom KaffeCold
	 */
	public KaffeCold(String name, double preis, String iconPath,String groesse, String zusaetze) {
		// Aufruf des Basisklassenkonstruktor mit �bergabe der Parameter
		super(name, preis, iconPath, groesse);
		this.zusaetze = zusaetze;
	}

	public String toString() {
		String result = super.toString() + "," + this.zusaetze;
		return this.getClass().getSimpleName() + ":: " + result;

	}


}