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
		
		// Create a new shapeFactory object
		ShapeFactory shapeFactory = new ShapeFactory();
		
		// Create the Cuboid test object
		Cuboid cuboidTestObject = (Cuboid) shapeFactory.make(ShapeType.Cuboid);
		
		// Creating a Cuboid object
		cuboidTestObject.setWidth(1);
		cuboidTestObject.setHeight(5);
		cuboidTestObject.setDepth(10);
		
		// Creating a Cylinder test object
		Cylinder cylinderTestObject = (Cylinder) shapeFactory.make(ShapeType.Cylinder);
		
		// Assign the properties
		cylinderTestObject.setHeight(10);
		cylinderTestObject.setRadius(4);
		
		
		// Creating a Sphere test object
		Sphere sphereTestObject = (Sphere) shapeFactory.make(ShapeType.Sphere);
		
		// Assign the properties
		sphereTestObject.setRadius(0);
	
		
		// Testing all the shapes properties and functions of a Cuboid object
		cuboidTestObject.render();
		
		// Testing all the shapes properties and functions of a Cylinder object
		cylinderTestObject.render();
		
		// Testing all the shapes properties and functions of a Sphere object
		sphereTestObject.render();
	
	}

}
