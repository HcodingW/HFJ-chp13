package chapter13;

import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Text2 {
	
	public static void main(String[] a) {
		Text2 tx = new Text2();
		tx.go();
	}
	public void go() {
	    JFrame frame = new JFrame();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    JTextField jTextField1 = new JTextField();

	    jTextField1.setText("jTextField1");
	    
	    /*
	    //Ìí¼Ó¼àÌý»úÖÆ
	    jTextField1.addActionListener(new java.awt.event.ActionListener() {
	      public void actionPerformed(ActionEvent e) {
	        System.out.println("action");
	      }
	    });
	    */
	    
	    jTextField1.addActionListener(new MyListener());
	    
	    frame.add(jTextField1);
	    frame.setSize(300, 200);
	    frame.setVisible(true);
	  }
	public class MyListener implements ActionListener {
    	public void actionPerformed(ActionEvent e) {
    		System.out.println("action2");
    	}
    }
	
}
