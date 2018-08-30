package chapter13;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Text4 extends JFrame {
  public Text4() throws HeadlessException {
    setSize(200, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout(FlowLayout.LEFT));

    JLabel usernameLabel = new JLabel("Username: ");
    JTextField usernameTextField = new JTextField();
    usernameTextField.setPreferredSize(new Dimension(100, 20));
    add(usernameLabel);
    add(usernameTextField);

    usernameTextField.addKeyListener(new KeyAdapter() {   //��������
      public void keyReleased(KeyEvent e) {        //���غ������ͷŰ�������
        JTextField textField = (JTextField) e.getSource();  //�õ��������event���������,�����ı������
        String text = textField.getText();
        textField.setText(text.toUpperCase());      //�����е�Сд��ĸת���ɴ�д��ĸ
      }
       public void keyTyped(KeyEvent e) {           //����ʱ����
      }

      public void keyPressed(KeyEvent e) {       //�ͷŰ���ʱ�����ĺ���
      }   
    });
  }

  public static void main(String[] args) {
    new Text4().setVisible(true);
  }
}

