package chapter13;

import java.awt.BorderLayout;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Text3 {
	public static void main(String args[]) {
		JFrame frame = new JFrame("Verifier Sample");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextField textField1 = new JTextField();
		JTextField textField2 = new JTextField();
		InputVerifier verifier = new InputVerifier() { //����һ����֤����֤����������Ƿ�Ϊ����
			public boolean verify(JComponent comp) {
				boolean returnValue;
				JTextField textField = (JTextField) comp; // ǿ��ת�������ؼ����͵�compת��
														  // ��JTextFiled���͵�
				try {
					Integer.parseInt(textField.getText());  // �����������ת����int���ͣ���
															// ��������ַ�������ʮ���ƵĻ���
															// �ᴥ��NumberFormateException����
					returnValue = true;
				} catch (NumberFormatException e) {
					returnValue = false;
				}
				return returnValue;  // �������false�Ļ�����ôָ��ͻ�һֱ�۽��ڴ��ı����У������ƶ��������������
			}
		};
		textField1.setInputVerifier(verifier);
		frame.add(textField1, BorderLayout.NORTH);
		frame.add(textField2, BorderLayout.CENTER);
		frame.setSize(300, 100);
		frame.setVisible(true);
	}
}

