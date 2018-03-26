package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Tisch {

		/**
		 * @return the name
		 */
		public int getTischNr() {
			return tischNr;
		}

		private int tischNr;
//		private List<Produkt> produkte = new ArrayList<>();
		private HashMap<Produkt, Integer> produkte = new HashMap<>(); 
		
		/**
		 * @return the produkte
		 */
		public HashMap<Produkt, Integer> getProdukte() {
			return produkte;
		}

		/**
		 * @param name
		 */
		public Tisch(int tischNr) throws Exception {
			this.tischNr = tischNr;
		}
}
