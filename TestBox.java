import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author Matt Fuller
 *
 */
public class TestBox {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");

		Box smallBox = new Box(4, 5, 2);

		// Description of box using toString method
		System.out.println(smallBox);

		// Checks return values from getter methods
		System.out.println("smallbox's width = " + smallBox.getWidth());
		System.out.println("smallbox's height = " + smallBox.getHeight());
		System.out.println("smallbox's depth = " + smallBox.getDepth());
		System.out.println("smallbox's volume = " + smallBox.volume());
		System.out.println("smallbox's surface area = " + smallBox.surfaceArea());
		System.out.println("smallbox reports its full status as: " + smallBox.getFull());

		System.out.println();

		// Header
		System.out.print("========");
		System.out.print("Change smallbox using it's setters");
		System.out.println("========");

		System.out.println();

		// Changes smallbox's dimension values
		smallBox.setWidth(2);
		smallBox.setHeight(3);
		smallBox.setDepth(1);

		// Changes smallBox from "empty" to "full"
		smallBox.setFull(true);

		// Description of box using toString method
		System.out.println(smallBox);

		// Checks return values from getter methods
		System.out.println("smallbox's width = " + smallBox.getWidth());
		System.out.println("smallbox's height = " + smallBox.getHeight());
		System.out.println("smallbox's depth = " + smallBox.getDepth());
		System.out.println("smallbox's volume = " + smallBox.volume());
		System.out.println("smallbox's surface area = " + smallBox.surfaceArea());
		System.out.println("smallbox reports its full status as: " + smallBox.getFull());

		System.out.println();

		// Header
		System.out.print("========");
		System.out.print("Create 5 boxes");
		System.out.println("========");

		System.out.println();

		Random rand = new Random();

		// Store dimension values to array list.
		ArrayList<Box> boxList = new ArrayList<Box>();

		int numBoxes = 5;
		Box largestBox = new Box(0, 0, 0);
		for (int row = 1; row <= numBoxes; row++) {

			double newWidth = rand.nextDouble() * 100 + 1;
			double newHeight = rand.nextDouble() * 100 + 1;
			double newDepth = rand.nextDouble() * 100 + 1;
			boolean newFull = rand.nextBoolean();

			Box boxes = new Box(newWidth, newHeight, newDepth);

			if (largestBox.volume() < boxes.volume()) {
				largestBox = boxes;
			}

			boxes.setFull(newFull);

			boxList.add(boxes);

			System.out.println("Box " + row + ": " + boxes);

		}

		System.out.println();

		System.out.println();

		// Header
		System.out.print("========");
		System.out.print("Find the largest box");
		System.out.println("========");;

		System.out.println();

		// Prints largest box and its dimensions
		System.out.println("Largest Box\n" + largestBox + " with volume " + df.format(largestBox.volume())
		        + " and surface area " + df.format(largestBox.surfaceArea()));

	}

}
