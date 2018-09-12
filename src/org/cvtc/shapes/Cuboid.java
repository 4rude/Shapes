/**
 * 
 */
package org.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author matt
 *
 */
public class Cuboid extends Shape {
	
	// Boolean used to determine if there is an error in the user input
	public boolean inputError = false;
	
	// Height Property
	private float height = 0;
	
	// Depth Property
	private float depth = 0;
	
	// Width Property
	private float width = 0;
	
	
	// Cuboid Constructor
	public Cuboid(float width, float height, float depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		
		if (height <= 0) {
			// Setting width to 1 because the user entered a 0 or less
			this.height = 1;
			inputError = true;
			
			// Error message which outputs if the user entered invalid data
			System.out.println("The height must be greater than zero for it to be physically possible. A #1 will replace what was inputted.");
		}
		
		if (depth <= 0) {
			// Setting width to 1 because the user entered a 0 or less
			this.height = 1;
			inputError = true;
			
			// Error message which outputs if the user entered invalid data
			System.out.println("The depth must be greater than zero for it to be physically possible. A #1 will replace what was inputted.");
		}
		
		if (width <= 0) {
			// Setting width to 1 because the user entered a 0 or less
			this.width = 1;
			inputError = true;
			
			// Error message which outputs if the user entered invalid data
			System.out.println("The width must be greater than zero for it to be physically possible. A #1 will replace what was inputted.");
		}
	}
	
	// Getter for width
	public float getWidth() {
		return width;
	}
	// Getter for width
	public void setWidth(float width) {
		this.width = width;
	}

	// Getter for height
	public float getHeight() {
		return height;
	}

	// Setter for height
	public void setHeight(float height) {
		this.height = height;
	}

	// Getter for depth
	public float getDepth() {
		return depth;
	}
	
	// Setter for depth
	public void setDepth(float depth) {
		this.depth = depth;
	}

	
	/* 
	 * This class creates and returns the surface area of a Cuboid.
	 */
	
	@Override
	public float surfaceArea() {
		// TODO Auto-generated method stub
		float surfaceArea = ((2 * this.depth * this.width) + (2 * this.depth * this.height) + (2 * this.height * this.width));
		return surfaceArea;
	}

	/* 
	 * This class creates and returns the volume of a Cuboid.
	 */
	
	@Override
	public float volume() {
		float volume = (getWidth() * getHeight() * getDepth());
		return volume;
	}

	/* 
	 * This class returns the height, width, depth, surface area, and the volume of a cuboid.
	 */
	
	@Override
	public void render() {
		final String MESSAGE = "Height: " + getHeight() + " Width: " + getWidth() + " Depth: " 
								+ getDepth() + " Surface Area: " + surfaceArea() + " Volume: " + volume();
		JOptionPane.showMessageDialog(null, MESSAGE);

	}

}
