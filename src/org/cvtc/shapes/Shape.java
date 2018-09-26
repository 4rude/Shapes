/**
 * 
 */
package org.cvtc.shapes;

/**
 * @author matt
 *
 * The Shape class creates an abstract idea of a shape, which can them be used as a superclass for specific shapes like:
 *  Cuboid, Sphere, or a Cylinder. 
 *  
 */

public abstract class Shape {
	
	// Shape property
	private Dialog messageBox;
	
	// Constructor
	public Shape(Dialog messageBox) {
		this.messageBox = messageBox;
	}
	
	
	public Dialog getMessageBox() {
		return messageBox;
	}


	public void setMessageBox(Dialog messageBox) {
		this.messageBox = messageBox;
	}


	// Property of a shape
	public abstract float surfaceArea();
	
	// Property of a shape
	public abstract float volume();
	
	
	
}
