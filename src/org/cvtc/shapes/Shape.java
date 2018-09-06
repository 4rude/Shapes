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
	
	// Property of a shape
	public abstract float surfaceArea();
	
	// Property of a shape
	public abstract float volume();
	
	// Function used for data output
	public abstract void render();
	
	
}
