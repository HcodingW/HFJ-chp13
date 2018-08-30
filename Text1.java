package chapter13;

import javax.swing.*;
import java.awt.*;

public class Text1 extends JFrame {
    private JTextField textField1;
    private JTextField textField2;

    public static void main(String args[]) {
        Text1 my = new Text1();
        my.setVisible(true);

    }

    public Text1() {
        //this.setBounds(100,100,300,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new GridLayout(2, 1));
        textField1 = new JTextField(10);
        textField2 = new JTextField();
        panel.add(textField1);
        panel.add(textField2);
        this.getContentPane().add(panel, BorderLayout.CENTER);
        this.pack();
        InputVerifier verifier = new InputVerifier() {    //������֤��ʽ
            @Override
            public boolean verify(JComponent input) {     //���غ���
                boolean value;
                textField1 = (JTextField) input;    //��input���ǿ��ת��ΪJTextField���͵ĵ����ı���
                return textField1.getText().equals("pass");  //�ж��Ƿ������ʱpass,������Ǿͻ���֤����

            }
        };
        textField1.setInputVerifier(verifier);   //������֤��ʽ
        textField1.setHorizontalAlignment(JTextField.CENTER);   //����ˮƽ���뷽ʽ
        Font font = new Font("����", Font.BOLD + Font.ITALIC, 20);
        textField1.setFont(font);   //��������
        textField1.setDragEnabled(true);  //�����ڵ����ı������ܹ��Ϸ��ı������Ϊfalse���ܹ��Ϸ��ı�

    }
    
}
