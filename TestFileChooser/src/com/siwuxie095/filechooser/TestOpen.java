package com.siwuxie095.filechooser;

import java.awt.EventQueue;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JFileChooser;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.UIManager;

import javax.swing.UnsupportedLookAndFeelException;

import javax.swing.border.EmptyBorder;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;

/**
 * 
 * JFileChooser 是 Java Swing 框架中的文件选择器，
 * 
 * 在应用程序中经常会遇到打开文件和保存文件等操作，
 * 
 * 文件选择器 JFileChooser 是专门应对这种情况而出现的
 *
 * 
 * 
 * @author siwux
 *
 * 
 * 
 */

public class TestOpen extends JFrame {

	private JPanel contentPane;

	// 声明一个 JFileChooser 对象

	private JFileChooser chooser;

	/**
	 * 
	 * Launch the application.
	 * 
	 */

	public static void main(String[] args) {

		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					TestOpen frame = new TestOpen();

					frame.setVisible(true);

				} catch (Exception e) {

					e.printStackTrace();

				}

			}

		});

	}

	/**
	 * 
	 * Create the frame.
	 * 
	 */

	public TestOpen() {

		try {

			UIManager.setLookAndFeel(new WindowsLookAndFeel());

		} catch (UnsupportedLookAndFeelException e1) {

			e1.printStackTrace();

		}

		// 将 chooser 实例化

		chooser = new JFileChooser();

		setTitle("网店工商信息图片文字提取系统");
		setIconImage(Toolkit.getDefaultToolkit().createImage("images/logo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 160, 587, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel(new ImageIcon(Toolkit.getDefaultToolkit().createImage("images/image.jpg")));
		lblNewLabel.setBounds(0, 0, 587, 200);
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

		JLabel label_1 = new JLabel("王汝印");
		label_1.setFont(new Font("华文楷体", Font.PLAIN, 18));
		label_1.setBounds(122, 277, 67, 21);
		contentPane.add(label_1);

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

		JButton btnOpenFile = new JButton("选择单个图片进行识别");

		btnOpenFile.setFocusable(false);

		btnOpenFile.setBounds(250, 250, 200, 30);

		btnOpenFile.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseClicked(MouseEvent e) {

				/**
				 * 
				 * 弹出一个打开文件的对话框 showOpenDialog()
				 * 
				 * 需要指定一个父级窗体，或指定为 null
				 * 
				 * 返回值是 int 类型，创建以接收返回值
				 * 
				 */

				int value = chooser.showOpenDialog(TestOpen.this);

				chooser.setMultiSelectionEnabled(true);

				// 如果返回 APPROVE_OPTION，说明有文件被成功返回，即成功打开文件

				// 也可以使用类调用，即 JFileChooser.APPROVE_OPTION

				if (value == chooser.APPROVE_OPTION) {

					// //创建一个文件对象，接收返回值

					// //getSelectedFile()只能返回选中文件中的第一个文件

					// File file=chooser.getSelectedFile();

					// System.out.println(file.getAbsolutePath());

					// getSelectedFiles() 返回所有选中的文件

					File filex[] = chooser.getSelectedFiles();

					for (int i = 0; i < filex.length; i++) {

						System.out.println(filex[i].getAbsolutePath());
						 xm xm= new xm();
						 xm.photoRecognize(filex[i].getAbsolutePath(),(String) filex[i].getAbsolutePath().subSequence(0,  filex[i].getAbsolutePath().length()-4));
					   

					}

				}

			}

		});

		contentPane.add(btnOpenFile);

		JButton btnOpenDir = new JButton("选择多个图片进行识别");

		btnOpenDir.setFocusable(false);

		btnOpenDir.setBounds(250, 300, 200, 30);

		btnOpenDir.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseClicked(MouseEvent e) {

				// 设定当前可选择的文件类型，设定为 DIRECTORIES_ONLY，即只能选择文件夹

				// 如果没有设定，默认为 FILES_ONLY，即只能选择文件

				chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

				// 将chooser 设定为可多选

				// 如果没有设定，默认为 false，即只能单选

				chooser.setMultiSelectionEnabled(true);

				int value = chooser.showOpenDialog(TestOpen.this);

				if (value == chooser.APPROVE_OPTION) {

					// //创建一个文件对象，接收返回值

					// //getSelectedFile()只能返回选中文件夹中的第一个文件夹

					// File dir=chooser.getSelectedFile();

					// System.out.println(dir.getAbsolutePath());

					// getSelectedFiles() 返回所有选中的文件夹

					File dirx[] = chooser.getSelectedFiles();

					for (int i = 0; i < dirx.length; i++) {

						System.out.println(dirx[i].getAbsolutePath());
						Runtime rt = Runtime.getRuntime();
					       // String cmddir = "cmd /k mkdir f:\\66666666";    //这行会在F盘建立一个66666的目录文件夹
							String cmddir = "cmd /k OpenCV.exe"+" "+dirx[i].getAbsolutePath();
							
					        System.out.println(cmddir);
					        try {
					            rt.exec(cmddir);
					            System.out.println("成功执行！");
					        } catch (IOException e1) {
					            e1.printStackTrace();
					        }
					        xm xm= new xm();
					        xm.zong(dirx[i].getAbsolutePath(),"C:\\Users\\lenovo\\Desktop\\肖振宇.xls");
					        
						

					}

				}

			}

		});

		contentPane.add(btnOpenDir);

	}

}