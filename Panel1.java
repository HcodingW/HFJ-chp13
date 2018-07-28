package chapter13;

import java.awt.*;
import javax.swing.*;

public class Panel1 {
	public static void main(String[] args) {
		Panel1 gui = new Panel1();
		gui.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBackground(Color.darkGray);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); //change layout manager
		
		JButton button = new JButton("shock me");
		JButton buttonTwo = new JButton("bliss");
		
		panel.add(button);
		panel.add(buttonTwo);
		
		frame.getContentPane().add(BorderLayout.EAST, panel);
		
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

}