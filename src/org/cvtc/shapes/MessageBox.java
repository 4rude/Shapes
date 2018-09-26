/**
 * 
 */
package org.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author matt
 *
 */
public class MessageBox implements Dialog {

	// Constructor
	public MessageBox() {
		
	}
	
	// Implementing the dialog interface show function
	@Override
	public int show(String message, String title) {
		JOptionPane.showMessageDialog(null, message);

		return JOptionPane.OK_OPTION;
	}

}
