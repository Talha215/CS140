package assignment06;

import java.util.ArrayList;

public class Driver1 {
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				// make an ArrayList<Box> list with 5 Box elements
				ArrayList<Box> list = new ArrayList<Box>();
				list.add(new Box());
				list.add(new Box());
				list.add(new Box());
				list.add(new Box());
				list.add(new Box());
				Graphic g = new Graphic("Lander");
				g.setList(list);
			}
		});

	}
}
