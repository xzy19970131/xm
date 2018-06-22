package com.siwuxie095.filechooser;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class LoginFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setTitle("网店工商信息图片文字提取系统");
		setIconImage(Toolkit.getDefaultToolkit().createImage("images/logo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 160, 587, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("进入");
		btnNewButton.setBounds(426, 345, 93, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon(Toolkit.getDefaultToolkit().createImage("images/image.jpg")));
		lblNewLabel.setBounds(0, 0, 571, 227);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("指导老师：");
		lblNewLabel_1.setFont(new Font("华文宋体", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(36, 231, 91, 35);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("康长青");
		lblNewLabel_2.setFont(new Font("华文楷体", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(128, 240, 67, 21);
		contentPane.add(lblNewLabel_2);
		
		JLabel label = new JLabel("团队成员：");
		label.setFont(new Font("华文宋体", Font.PLAIN, 18));
		label.setBounds(35, 269, 91, 35);
		contentPane.add(label);
		
		JLabel label_2 = new JLabel("周俊峰");
		label_2.setFont(new Font("华文楷体", Font.PLAIN, 18));
		label_2.setBounds(123, 313, 67, 21);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("肖振宇");
		label_3.setFont(new Font("华文楷体", Font.PLAIN, 18));
		label_3.setBounds(124, 346, 67, 21);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("王   恒");
		label_4.setFont(new Font("华文楷体", Font.PLAIN, 18));
		label_4.setBounds(126, 377, 67, 21);
		contentPane.add(label_4);
		
		JLabel label_1 = new JLabel("王汝印");
		label_1.setFont(new Font("华文楷体", Font.PLAIN, 18));
		label_1.setBounds(122, 277, 67, 21);
		contentPane.add(label_1);
		
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				TestOpen m=new TestOpen();
				m.setVisible(true);
				LoginFrame.this.setVisible(false);				
			}
		});
	}
}
