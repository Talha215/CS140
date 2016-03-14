package assignment06;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Graphic {
	JFrame frame = new JFrame();
	JButton[][] buttons = new JButton[2][4];
	String[] names = {"Recolor", "Rotate", "Shuffle", "Sort"};
	BoxArea area = new BoxArea();
	
	public Graphic(String name) {
		frame.setSize(500, 500);
		frame.setTitle(name);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 4, 2, 2));
		
		makeRow1ButtonsWithListeners();
		makeRow2ButtonsWithListeners();
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 4; j++) {
				panel.add(buttons[i][j]);
			}
		}
		
		frame.add(panel, BorderLayout.PAGE_END);
		frame.add(area);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.addWindowListener(new MyWindowListener());
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public void setList(ArrayList<Box> list) {
		area.setList(list);
		frame.repaint();		
	}
	
	public ArrayList<Box> getList() {
		return area.getList();
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
	public void callRepaint() {
		frame.repaint();
	}
	
	private void exit() {
		int decision = JOptionPane.showConfirmDialog(
				frame, "Do you really wish to exit?",
				"Confirmation", JOptionPane.YES_NO_OPTION);
		if (decision == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}

	private class MyWindowListener extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent arg0) {
			exit();
		}
	}
	
	private void makeRow1ButtonsWithListeners() {
		for(int i = 0; i < 4; i++) {
			buttons[0][i] = new JButton(names[i]);
		}
		buttons[0][0].addActionListener(new ColorListener(this));
	}
	
	private void makeRow2ButtonsWithListeners() {
		for(int i = 0; i < 4; i++) {
			buttons[1][i] = new JButton(names[i]);
		}
	}
}
