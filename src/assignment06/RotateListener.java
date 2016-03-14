package assignment06;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;


public class RotateListener implements ActionListener {
	private Graphic graphic;
	
	public RotateListener(Graphic g) {
		graphic = g;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for(Box box: graphic.getList()) {
			Rectangle2D.Double r = box.getBox();
			r.setRect(0, 0, r.getHeight(), r.getWidth());
		}
		graphic.callRepaint();
	}
}
