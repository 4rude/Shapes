/**
 * 
 */
package org.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author matt
 *
 */
public class Cylinder extends Shape {

	// Height Property 
	private float height = 0;
	
	// Radius property
	private float radius = 0;
		
		
	// Cylinder Constructor
	public Cylinder(float height, float radius) {
		this.height = height;
		this.radius = radius;
		
		
		if (height <= 0) {
			// Setting width to 1 because the user entered a 0 or less
			this.height = 1;
			
			// Error message which outputs if the user entered invalid data
			System.out.println("The height must be greater than zero for it to be physically possible. A #1 will replace what was inputted.");
		}
		
		if (radius <= 0) {
			// Setting width to 1 because the user entered a 0 or less
			this.radius = 1;
			
			// Error message which outputs if the user entered invalid data
			System.out.println("The radius must be greater than zero for it to be physically possible. A #1 will replace what was inputted.");
		}
	}
	
	// Getter for height
	public float getHeight() {
		return height;
	}

	// Setter for height
	public void setHeight(float height) {
		this.height = height;
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
	 * This class creates and returns the surface area of a Cylinder.
	 */
	@Override
	public float surfaceArea() {
		float surfaceArea = ((2 * (float) Math.PI * getRadius() * getHeight()) + (2 * (float) Math.PI * (getRadius() * getRadius())));
		return surfaceArea;
	}

	/* This class creates and returns the volume of a Cylinder.
	 */
	@Override
	public float volume() {
		float volume = ((float) Math.PI * (getRadius() * getRadius()) * getHeight());
		return volume;
	}

	/* This class creates and returns the height, radius, surface area, and volume of a Cylinder.
	 */
	@Override
	public void render() {
		final String MESSAGE = "Height: " + getHeight() + " Radius: " + getRadius() + " Surface Area: " + surfaceArea() + " Volume: " + volume();
		JOptionPane.showMessageDialog(null, MESSAGE);

	}

}
