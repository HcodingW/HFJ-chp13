package chapter13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/*
 * source code from 《java核心技术 卷1 基础知识》 P326
 */
@SuppressWarnings("serial")

public class Checkbox1 extends JFrame{
  int DEFAULT_WIDTH = 600;
  int DEFAULT_HEIGHT = 400;
  private JLabel label;
  private JCheckBox boldCheckbox;
  private JCheckBox italicCheckbox;
  private static final int FONTSIZE = 25;  
  public Checkbox1(){
    setTitle("JCheckBoxDemo---trytrytry");
    setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

    label = new JLabel("Welcome to Rutgers University!");
    label.setFont(new Font("Serif",Font.PLAIN, FONTSIZE));
    add(label, BorderLayout.CENTER);
    //构造一个监听器，响应checkBox事件
    ActionListener actionListener = new ActionListener(){
      public void actionPerformed(ActionEvent e) {
        int mode = 0;
        if(boldCheckbox.isSelected()) mode += Font.BOLD;
        if(italicCheckbox.isSelected()) mode += Font.ITALIC;        
        label.setFont(new Font("Serif", mode, FONTSIZE));
      }
    };
    //添加buttonPanel,它包含2个checkBox
    JPanel buttonPanel = new JPanel();
    add(buttonPanel, BorderLayout.SOUTH);
    //为buttonPanel添加2个checkBox
    boldCheckbox = new JCheckBox("bold");
    buttonPanel.add(boldCheckbox);
    boldCheckbox.addActionListener(actionListener);
    italicCheckbox = new JCheckBox("italic");
    buttonPanel.add(italicCheckbox);
    italicCheckbox.addActionListener(actionListener);
  }  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    //创建窗体并指定标题
    Checkbox1 f = new Checkbox1();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //自动适配所有控件大小
    //f.pack();
    //设置窗体位置在屏幕中央
    f.setLocationRelativeTo(null);
    //显示窗体
    f.setVisible(true);
  }
}