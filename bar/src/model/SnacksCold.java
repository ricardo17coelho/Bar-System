package model;


public class SnacksCold extends Snack {

		/**
		 * Konstruktor
		 */
		public SnacksCold(String name, double preis, String iconPath,String groesse) {
			super(name, preis, iconPath, groesse);

		}

		public String toString() {

			String result = super.toString();
			return getClass().getSimpleName() + ":: " + result;

		}


	}
