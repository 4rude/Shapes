/**
 * 
 */
package org.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author matt
 *
 */
public class Sphere extends Shape {

	// Boolean used to determine if there is an error in the user input
		public boolean inputError = false;
		
	// Property of Sphere
	private float radius = 0;
	
	// Sphere Constructor
	public Sphere(Dialog messageBox) {
		// , float radius
		super(messageBox);
		// this.radius = radius;
		
		// Error message which outputs if the user entered invalid data
		if (radius <= 0) {
			this.radius = 1;
			inputError = true;
			
			System.out.println("The radius must be greater than zero for it to be physically possible. A #1 will replace what was inputted.");
		}
	}
	
	// Getter for radius
	public float getRadius() {
		return radius;
	}
	
	// Setter for radius
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	
	/* 
	 * This class creates and returns the surface area of a Sphere.
	 */
	@Override
	public float surfaceArea() {
		float surfaceArea = (4 * (float) Math.PI * (getRadius() * getRadius()));
		return surfaceArea;
	}

	/* 
	 * This class creates and returns the volume of a Sphere.
	 */
	@Override
	public float volume() {
		// Had to instantiate the number 4 in a variable then divide it by 3 because Java is weird with fractions.
		float fourThirds = 4; 
		fourThirds /= 3;
		float volume = (float) (fourThirds * (Math.PI) * (getRadius() * getRadius() * getRadius()));
		return volume;
	}

	/* 
	 * This class displays the radius, surface area, and volume of a Sphere.
	 */
	
	public void render() {
		final String MESSAGE = "Radius: " + getRadius() + " Surface Area: " + surfaceArea() + " Volume: " + volume();
		JOptionPane.showMessageDialog(null, MESSAGE);

	}

	

}
