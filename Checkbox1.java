package chapter13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/*
 * source code from ��java���ļ��� ��1 ����֪ʶ�� P326
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
    //����һ������������ӦcheckBox�¼�
    ActionListener actionListener = new ActionListener(){
      public void actionPerformed(ActionEvent e) {
        int mode = 0;
        if(boldCheckbox.isSelected()) mode += Font.BOLD;
        if(italicCheckbox.isSelected()) mode += Font.ITALIC;        
        label.setFont(new Font("Serif", mode, FONTSIZE));
      }
    };
    //���buttonPanel,������2��checkBox
    JPanel buttonPanel = new JPanel();
    add(buttonPanel, BorderLayout.SOUTH);
    //ΪbuttonPanel���2��checkBox
    boldCheckbox = new JCheckBox("bold");
    buttonPanel.add(boldCheckbox);
    boldCheckbox.addActionListener(actionListener);
    italicCheckbox = new JCheckBox("italic");
    buttonPanel.add(italicCheckbox);
    italicCheckbox.addActionListener(actionListener);
  }  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    //�������岢ָ������
    Checkbox1 f = new Checkbox1();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //�Զ��������пؼ���С
    //f.pack();
    //���ô���λ������Ļ����
    f.setLocationRelativeTo(null);
    //��ʾ����
    f.setVisible(true);
  }
}