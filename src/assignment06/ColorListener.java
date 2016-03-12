package assignment06;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;

public class ColorListener implements ActionListener {
	private Graphic graphic;
	
	public ColorListener(Graphic g) {
		graphic = g;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Color newColor = JColorChooser.showDialog(graphic.getFrame(), "Select New Color", Color.GREEN);
		
		for(Box box: graphic.getList()) {
			box.setColor(newColor);
			graphic.callRepaint();
		}
		
	}
}
