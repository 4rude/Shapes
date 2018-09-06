/**
 * 
 */
package org.cvtc.shapes;

/**
 * @author matt
 * 
 * This is a test class created to test the abstract class Shape, subclass Cuboid, subclass Cylinder, and 
 * the subclass Sphere. 
 *
 */
public class ShapesTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Creating a Cuboid object
		Cuboid cuboidTestObject = new Cuboid(2, 4, 6);
		
		// Creating a Cylinder object
		Cylinder cylinderTestObject = new Cylinder(8, 2);
		
		// Creating a Sphere object
		Sphere sphereTestObject = new Sphere(0);
		
		
		// Testing all the shapes properties and functions of a Cuboid object
		cuboidTestObject.render();
		
		// Testing all the shapes properties and functions of a Cylinder object
		cylinderTestObject.render();
		
		// Testing all the shapes properties and functions of a Sphere object
		sphereTestObject.render();
	
	}

}
