package view;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

public class JTableButton extends JButton {

	private int tischNr;
	
	/**
	 * @return the tischNr
	 */
	public int getTischNr() {
		return tischNr;
	}

	public JTableButton(int tischNr, Icon arg0) {
		super(arg0);
		this.tischNr = tischNr;
	}

	public JTableButton(int tischNr) {
		super(Integer.toString(tischNr));
		this.tischNr = tischNr;
	}

	public JTableButton(int tischNr, Action arg0) {
		super(arg0);
		this.tischNr = tischNr;
	}

	public JTableButton(int tischNr, String arg0, Icon arg1) {
		super(arg0, arg1);
		this.tischNr = tischNr;
	}

}
