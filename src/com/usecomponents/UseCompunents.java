package com.usecomponents;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class UseCompunents {

	public static void main(String[] args) {
		JFrame frm = new JFrame("ʹ�ó������");	//�������壺frame�ṹ��
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(null); //����Ϊ��ʹ�ò��ֹ�����
		//�������������ӵ�������
		
		//1.��ǩ�����ʹ��
		JLabel label = new JLabel("��ǩ�����");
		label.setBounds(5, 5, 160, 80);		//����label��λ�����С
		label.setFont(new Font("", Font.BOLD, 22));	//bold�������֡����Ե�
		label.setIcon(new ImageIcon("label.png"));
		label.setHorizontalAlignment(JLabel.CENTER);
		
		//���ñ�� ��� ͼƬ��λ�ã���JDK�߰汾���������µľ�̬����
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.BOTTOM);
		frm.getContentPane().add(label);
		
		//2.��ť�����ʹ��
		JButton button = new JButton();
		button.setText("����һ����ť");
		button.setBounds(170, 5, 120, 30);
		frm.getContentPane().add(button);
		
		//3.�ı��������ʹ��
		JTextField text = new JTextField();
		text.setText("�������ı�");
		text.setHorizontalAlignment(JTextField.CENTER);
		text.setBounds(170, 45, 120, 30);
		frm.getContentPane().add(text);
		
		//4.����������ʹ��
		JPasswordField pwdText = new JPasswordField();
		pwdText.setText("mypassword");
		pwdText.setEchoChar('$'); //ָ�������ַ����м��õ����ţ�
		pwdText.setBounds(170, 80, 120, 30);
		frm.getContentPane().add(pwdText);
		
		//5.�ı��������ʹ��
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true); //�����ı��Ƿ��Զ����У�Ĭ��false��
		textArea.setColumns(10);
		textArea.setRows(3);
		textArea.append("����һ�������ı���"); //��ָ���ı�׷�ӵ��ĵ�ĩβ
		textArea.insert("�����Զ��س���",11);  //���뵽ָ��λ��
		textArea.setBounds(300, 5, 120, 60);
		frm.getContentPane().add(textArea);
		
		//8.�б�������ʹ��
		String[] likes = {"��ѧ", "����", "��Ϸ", "����Ӱ", "����", "����", "���"};
		JList list = new JList(likes); //����  ������ = new �����������б���������������
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); //�б��ѡ��ģʽ:��ѡ
		list.setFixedCellHeight(20); //����ѡ�񴰿���ÿ��ѡ��ĸ߶�
		list.setVisibleRowCount(5); //������ѡ�񴰿������ɼ�ѡ����
		JScrollPane scrollPane = new JScrollPane();	//�����������
		scrollPane.setViewportView(list); //�����ڹ����������ʾ���������
		scrollPane.setBounds(30, 130, 120, 120);
		frm.getContentPane().add(scrollPane);
		
		//9.ѡ��������ʹ�ã�ѡ�������Ϊһ���ı����һ���б�����ϣ�
		JComboBox comboBox = new JComboBox(likes);
		comboBox.setEditable(true);
		comboBox.setMaximumRowCount(10); //����ѡ��������ʾ����
		comboBox.insertItemAt("��ѧ", 3);
		
		comboBox.setBounds(230, 130, 120, 25);
		frm.getContentPane().add(comboBox);
		
		frm.setBounds(400, 200, 450, 320);
		frm.setVisible(true);
	}

}
