package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import model.SnacksHot;

public class TestSnackCold {

	/**
	 * teste öppis
	 */
	@Test
	public void testEqualsPositive() {
		SnacksHot x = new SnacksHot("Chips", 3, "100gr", "img/icons/box.png");
		SnacksHot y = new SnacksHot("Chips", 3, "100gr", "img/icons/box.png");
	
		assertEquals("testing equality ", true, x.equals(y));
	}
	
	/**
	 * teste öppis
	 */
	@Test
	public void testEqualsNegative() {
		SnacksHot x = new SnacksHot("Chips", 3, "100gr", "img/icons/box.png");
		SnacksHot y = new SnacksHot("Chips", 3, "100gr", "img/icons/box.png");
	
		assertEquals("testing equality ", false, x.equals(y));
	}

}
