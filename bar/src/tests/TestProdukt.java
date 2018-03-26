package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import model.Snack;
import model.SnacksHot;

public class TestProdukt {

	/**
	 * test correct functionality of constructor and getName
	 */
	@Test
	public void testCtor() {
		SnacksHot nachos = new SnacksHot("Chips", 3, "100gr", "img/icons/box.png");
		try {
			SnacksHot k = new SnacksHot("Chips", 3, "100gr", "img/icons/box.png");
			assertNotEquals(null, k);
			assertEquals("object should be created  with valid Nachos", nachos, k.getName());
		}
		catch (Exception ex) {
			fail("died calling ctor");
		}
	}
	/**
	 * test if constructor rejects empty SnackHor
	 */
	@Test
	public void testInvalidCtor() {
		SnacksHot nachos = new SnacksHot("Chips", 3, "100gr", "img/icons/box.png");
		List<Snack> getraenkeListe = new ArrayList<Snack>();
		try {
			getraenkeListe.add( new SnacksHot("Chips", 3, "100gr", "img/icons/box.png"));
		} catch (Exception e) {
			// hier erwarten wir tatsächlich, das uns die exception um die ohren fliegt
			//e.printStackTrace();
		}
		assertEquals("No object should be created for invalid IBAN", null, getraenkeListe);
	}

}
