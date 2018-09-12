package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cylinder;
import org.junit.Test;

public class CylinderTest {

	@Test
	public void testSurfaceArea() {
		Cylinder cylinder1 = new Cylinder(2, 1);
		assertEquals(18.85, cylinder1.surfaceArea(), 0.01);
	}

	@Test
	public void testVolume() {
		Cylinder cylinder1 = new Cylinder(2, 1);
		assertEquals(6.28, cylinder1.volume(), 0.01);
	}

	@Test
	public void testCylinder() {
		Cylinder cylinder1 = new Cylinder(8, 6);
		assertFalse("Incorrect user input", cylinder1.inputError);
		assertEquals(527.79, cylinder1.surfaceArea(), 0.01);
	}

	@Test
	public void testGetHeight() {
		Cylinder cylinder1 = new Cylinder(8, 6);
		assertEquals(8, cylinder1.getHeight(), 0.0002);
	}

	@Test
	public void testGetRadius() {
		Cylinder cylinder1 = new Cylinder(10, 10);
		assertEquals(10, cylinder1.getRadius(), 0.0002);
	}

}
