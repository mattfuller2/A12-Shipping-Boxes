import java.text.DecimalFormat;

/**
 * @author Matt Fuller
 *
 */
public class Box {
	private double width, height, depth; // size of the box
	private boolean full; // keeps track of whether or not the box is full

	/**
	 * Constructor: Initializes the instance variables to the values passed in as parameters
	 */
	public Box(double width, double height, double depth)
		{
			this.width = width;
			this.height = height;
			this.depth = depth;
			full = false;
		}

	public void setWidth(double boxWidth) {
		width = 0;
	}

	/**
	 * Width value accessor.
	 * 
	 * @return The current width value.
	 */
	public double getWidth() {
		return width;
	}

	public void setHeight(double boxHeight) {

	}

	/**
	 * Height value accessor.
	 * 
	 * @return The current height value.
	 */
	public double getHeight() {
		return height;
	}

	public void setDepth(double boxDepth) {

	}

	/**
	 * Depth value accessor.
	 * 
	 * @return The current depth value.
	 */
	public double getDepth() {
		return depth;
	}

	/**
	 * Full value accessor.
	 * 
	 * @return The current full value.
	 */
	public boolean getFull() {
		return full;
	}

	public void setFull(boolean update) {
		full = update;
	}

	/**
	 * Calculates the surface area of the box.
	 * 
	 * @return The surface area of the box.
	 */
	public double surfaceArea() {
		double surfaceArea = (width * height * 2) + (depth * height * 2) + (width * depth * 2);
		return surfaceArea;
	}

	/**
	 * Returns a string representation of the box's dimensions in a specific format.
	 * 
	 * @return A description of the box.
	 */
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		if (full == false) {
			return "An empty " + df.format(width) + " x " + df.format(height) + " x " + df.format(depth)
			        + " box";
		} else {
			return "A full " + df.format(width) + " x " + df.format(height) + " x " + df.format(depth)
			        + " box";
		}
	}

	/**
	 * Calculates the volume of the box.
	 * 
	 * @return The volume of the box.
	 */
	public double volume() {
		double volume = width * height * depth;
		return volume;
	}
}
