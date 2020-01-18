package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;

public class Calculator {

	private JFrame frame;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 250, 400 );
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(12, 12, 216, 43);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Dialog", Font.BOLD, 20));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn7.setBounds(12, 83, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Dialog", Font.BOLD, 20));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn8.setBounds(68, 83, 50, 50);
		frame.getContentPane().add(btn8);
		

		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Dialog", Font.BOLD, 20));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn9.setBounds(124, 83, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnX = new JButton("X");
		btnX.setForeground(SystemColor.desktop);
		btnX.setFont(new Font("Dialog", Font.BOLD, 18));
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnX.setBounds(180, 83, 50, 50);
		frame.getContentPane().add(btnX);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Dialog", Font.BOLD, 20));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn7.setBounds(12, 83, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Dialog", Font.BOLD, 20));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn8.setBounds(68, 83, 50, 50);
		frame.getContentPane().add(btn8);
		

		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Dialog", Font.BOLD, 20));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn9.setBounds(124, 83, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnX = new JButton("X");
		btnX.setForeground(SystemColor.desktop);
		btnX.setFont(new Font("Dialog", Font.BOLD, 18));
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnX.setBounds(180, 83, 50, 50);
		frame.getContentPane().add(btnX);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Dialog", Font.BOLD, 20));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn4.setBounds(12, 139, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Dialog", Font.BOLD, 20));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn5.setBounds(68, 139, 50, 50);
		frame.getContentPane().add(btn5);
		

		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Dialog", Font.BOLD, 20));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn6.setBounds(124, 139, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setForeground(SystemColor.desktop);
		btnMinus.setFont(new Font("Dialog", Font.BOLD, 18));
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMinus.setBounds(180, 139, 50, 50);
		frame.getContentPane().add(btnMinus);
		
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Dialog", Font.BOLD, 20));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn1.setBounds(12, 195, 50, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Dialog", Font.BOLD, 20));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn2.setBounds(68, 195, 50, 50);
		frame.getContentPane().add(btn2);
		

		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Dialog", Font.BOLD, 20));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn3.setBounds(124, 195, 52, 50);
		frame.getContentPane().add(btn3);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setForeground(SystemColor.desktop);
		btnPlus.setFont(new Font("Dialog", Font.BOLD, 18));
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPlus.setBounds(180, 195, 52, 50);
		frame.getContentPane().add(btnPlus);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Dialog", Font.BOLD, 20));
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDot.setBounds(12, 251, 52, 50);
		frame.getContentPane().add(btnDot);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Dialog", Font.BOLD, 20));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn0.setBounds(68, 251, 52, 50);
		frame.getContentPane().add(btn0);
		

		JButton btnEq = new JButton("\u003D");
		btnEq.setForeground(SystemColor.desktop);
		btnEq.setFont(new Font("Dialog", Font.BOLD, 20));
		btnEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEq.setBounds(124, 251, 52, 50);
		frame.getContentPane().add(btnEq);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setForeground(SystemColor.desktop);
		btnDiv.setFont(new Font("Dialog", Font.BOLD, 18));
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDiv.setBounds(180, 251, 50, 50);
		frame.getContentPane().add(btnDiv);
		
		
	}
	
}
