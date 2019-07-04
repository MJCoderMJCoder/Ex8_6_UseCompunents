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
		JFrame frm = new JFrame("使用常用组件");	//创建窗体：frame结构类
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(null); //设置为不使用布局管理器
		//创建各组件并添加到容器中
		
		//1.标签组件的使用
		JLabel label = new JLabel("标签组件：");
		label.setBounds(5, 5, 160, 80);		//设置label的位置与大小
		label.setFont(new Font("", Font.BOLD, 22));	//bold：粗体字、明显的
		label.setIcon(new ImageIcon("label.png"));
		label.setHorizontalAlignment(JLabel.CENTER);
		
		//设置标记 相对 图片的位置，在JDK高版本中增加了新的静态变量
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.BOTTOM);
		frm.getContentPane().add(label);
		
		//2.按钮组件的使用
		JButton button = new JButton();
		button.setText("这是一个按钮");
		button.setBounds(170, 5, 120, 30);
		frm.getContentPane().add(button);
		
		//3.文本框组件的使用
		JTextField text = new JTextField();
		text.setText("请输入文本");
		text.setHorizontalAlignment(JTextField.CENTER);
		text.setBounds(170, 45, 120, 30);
		frm.getContentPane().add(text);
		
		//4.密码框组件的使用
		JPasswordField pwdText = new JPasswordField();
		pwdText.setText("mypassword");
		pwdText.setEchoChar('$'); //指定回显字符（切记用单引号）
		pwdText.setBounds(170, 80, 120, 30);
		frm.getContentPane().add(pwdText);
		
		//5.文本域组件的使用
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true); //设置文本是否自动换行（默认false）
		textArea.setColumns(10);
		textArea.setRows(3);
		textArea.append("这是一个多行文本域。"); //将指定文本追加到文档末尾
		textArea.insert("将会自动回车。",11);  //插入到指定位置
		textArea.setBounds(300, 5, 120, 60);
		frm.getContentPane().add(textArea);
		
		//8.列表框组件的使用
		String[] likes = {"数学", "网购", "游戏", "看电影", "上网", "聊天", "编程"};
		JList list = new JList(likes); //类名  对象名 = new 类名（）；列表框组件声明并创建
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); //列表框选择模式:任选
		list.setFixedCellHeight(20); //设置选择窗口中每个选项的高度
		list.setVisibleRowCount(5); //设置在选择窗口中最多可见选项数
		JScrollPane scrollPane = new JScrollPane();	//创建滚动面板
		scrollPane.setViewportView(list); //设置在滚动面板中显示的组件对象
		scrollPane.setBounds(30, 130, 120, 120);
		frm.getContentPane().add(scrollPane);
		
		//9.选择框组件的使用（选择框可理解为一个文本框和一个列表框的组合）
		JComboBox comboBox = new JComboBox(likes);
		comboBox.setEditable(true);
		comboBox.setMaximumRowCount(10); //设置选项最大的显示行数
		comboBox.insertItemAt("哲学", 3);
		
		comboBox.setBounds(230, 130, 120, 25);
		frm.getContentPane().add(comboBox);
		
		frm.setBounds(400, 200, 450, 320);
		frm.setVisible(true);
	}

}
