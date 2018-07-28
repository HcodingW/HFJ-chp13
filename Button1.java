package chapter13;

import java.awt.*;
import javax.swing.*;

public class Button1 {
	public static void main(String[] args) {
		Button1 gui = new Button1();
		gui.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		
		JButton east = new JButton("East__east");
		JButton west = new JButton("West__west");
		JButton north = new JButton("North");
		JButton south = new JButton("South");
		JButton center = new JButton("Center");
		
		//Font bigFont = new Font("serif", Font.BOLD, 28);
		//button.setFont(bigFont);
		
		frame.getContentPane().add(BorderLayout.EAST, east);
		frame.getContentPane().add(BorderLayout.WEST, west);
		frame.getContentPane().add(BorderLayout.NORTH, north);
		frame.getContentPane().add(BorderLayout.SOUTH, south);
		frame.getContentPane().add(BorderLayout.CENTER, center);
		
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
