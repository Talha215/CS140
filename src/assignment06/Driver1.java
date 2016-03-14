package assignment06;

import java.awt.Color;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class Driver1 {
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				// make an ArrayList<Box> list with 5 Box elements
				ArrayList<Box> list = new ArrayList<Box>();
				Box b1 = new Box(),
					b2 = new Box(),
					b3 = new Box(),
					b4 = new Box(),
					b5 = new Box();
				
				b1.setBox(new Rectangle2D.Double(0, 0, 5, 10));
				b1.setColor(Color.GREEN);
				b2.setBox(new Rectangle2D.Double(0, 0, 10, 20));
				b2.setColor(Color.GREEN);
				b3.setBox(new Rectangle2D.Double(0, 0, 20, 40));
				b3.setColor(Color.GREEN);
				b4.setBox(new Rectangle2D.Double(0, 0, 30, 60));
				b4.setColor(Color.GREEN);
				b5.setBox(new Rectangle2D.Double(0, 0, 40, 80));
				b5.setColor(Color.GREEN);
				
				list.add(b1);
				list.add(b2);
				list.add(b3);
				list.add(b4);
				list.add(b5);
				Graphic g = new Graphic("Lander");
				g.setList(list);
			}
		});

	}
}
