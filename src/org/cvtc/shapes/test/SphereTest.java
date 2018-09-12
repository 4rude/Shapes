package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Sphere;
import org.junit.Test;

public class SphereTest {

	@Test
	public void testSurfaceArea() {
		Sphere sphere1 = new Sphere(6);
		assertEquals(452.39, sphere1.surfaceArea(), 0.01);
	}

	@Test
	public void testVolume() {
		Sphere sphere1 = new Sphere(6);
		assertEquals(452.39, sphere1.surfaceArea(), 0.01);
	}

	@Test
	public void testSphere() {
		Sphere sphere1 = new Sphere(3);
		assertFalse("Incorrect user input", sphere1.inputError);
		assertEquals(113.1, sphere1.surfaceArea(), 0.01);
	}

	@Test
	public void testGetRadius() {
		Sphere sphere1 = new Sphere(1);
		assertEquals(1, sphere1.getRadius(), 0.01);
	}

}
