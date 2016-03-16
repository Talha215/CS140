package assignment06;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import java.util.ArrayList;

import javax.swing.JComponent;

public class BoxArea extends JComponent{
	private static final long serialVersionUID = -2356054430147906086L;
	private ArrayList<Box> list;
	
	public ArrayList<Box> getList() {
		return list;
	}

	public void setList(ArrayList<Box> list) {
		this.list = list;
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;		
		g2.setStroke(new BasicStroke(3));
		
		int curXOff = 10, curYOff = 10;
		
		for(Box box : list) {
			g2.setColor(box.getColor());
			Rectangle2D.Double r = box.getBox();
			r.setRect(curXOff, curYOff, r.getWidth(), r.getHeight());
			g2.fill(r);
			g2.setColor(Color.BLACK);
			g2.draw(r);
			curXOff += r.getWidth() + 5;
			curYOff += r.getHeight() + 5;
		}
	}
	
}
