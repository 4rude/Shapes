/**
 * 
 */
package org.cvtc.shapes;

/**
 * @author matt
 *
 */
public class ShapeFactory {
	
	private Dialog dialog;
	
	public ShapeFactory() {
		this.setDialog(dialog);
	}

	public Dialog getDialog() {
		return dialog;
	}

	public void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}
	
	// TODO: EDIT
	public Shape make(ShapeType type) {
		
		
		if (type == null) {
			return null;
		} 
		
		if (type == ShapeType.Cuboid) {
			return (Shape) new Cuboid(dialog);
		} else if (type.equals(ShapeType.Sphere)) {
			return (Shape) new Sphere(dialog);
		} else if (type.equals(ShapeType.Cylinder)) {
			return (Shape) new Cylinder(dialog);
		}
		
		if (type == null) {
			return null;
		
	}
	
	
}
