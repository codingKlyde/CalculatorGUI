import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.JLabel;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.border.EtchedBorder;




public class CalculatorGUI {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI window = new CalculatorGUI();
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
	public CalculatorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Calculator GUI");
		frame.setResizable(false);
		frame.setBounds(10, 10, 340, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, null));
		textField.setToolTipText("Result show here");
		textField.setFont(new Font("Century Gothic", Font.BOLD, 30));
		textField.setBounds(30, 30, 261, 65);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.setForeground(Color.WHITE);
		btnBackspace.setToolTipText("Backs[ace");
		btnBackspace.setBackground(Color.DARK_GRAY);
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String backSpace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
				
			}
		});
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 18));
		btnBackspace.setBounds(30, 91, 65, 54);
		frame.getContentPane().add(btnBackspace);
		
		JButton btn7 = new JButton("7");
		btn7.setForeground(Color.WHITE);
		btn7.setBackground(Color.DARK_GRAY);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btn7.setBounds(30, 144, 65, 54);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setForeground(Color.WHITE);
		btn4.setBackground(Color.DARK_GRAY);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btn4.setBounds(30, 195, 65, 54);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setForeground(Color.WHITE);
		btn1.setBackground(Color.DARK_GRAY);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
				
			}
		});
		btn1.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btn1.setBounds(30, 248, 65, 54);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.setForeground(Color.WHITE);
		btn0.setBackground(Color.DARK_GRAY);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btn0.setBounds(95, 300, 65, 54);
		frame.getContentPane().add(btn0);
		
		JButton btnClear = new JButton("Clr");
		btnClear.setForeground(Color.WHITE);
		btnClear.setToolTipText("Clear");
		btnClear.setBackground(Color.DARK_GRAY);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btnClear.setBounds(95, 91, 65, 54);
		frame.getContentPane().add(btnClear);
		
		JButton btn8 = new JButton("8");
		btn8.setForeground(Color.WHITE);
		btn8.setBackground(Color.DARK_GRAY);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btn8.setBounds(95, 144, 65, 54);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.setForeground(Color.WHITE);
		btn5.setBackground(Color.DARK_GRAY);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btn5.setBounds(95, 195, 65, 54);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setForeground(Color.WHITE);
		btn2.setBackground(Color.DARK_GRAY);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btn2.setBounds(95, 248, 65, 54);
		frame.getContentPane().add(btn2);
		
		JButton btnDot = new JButton(".");
		btnDot.setToolTipText("Decimal");
		btnDot.setForeground(Color.WHITE);
		btnDot.setBackground(Color.DARK_GRAY);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btnDot.setBounds(30, 300, 65, 54);
		frame.getContentPane().add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setToolTipText("Equal");
		btnEqual.setForeground(Color.WHITE);
		btnEqual.setBackground(Color.DARK_GRAY);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		btnEqual.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btnEqual.setBounds(161, 300, 65, 54);
		frame.getContentPane().add(btnEqual);
		
		JButton btnPercent = new JButton("%");
		btnPercent.setToolTipText("Precent");
		btnPercent.setForeground(Color.WHITE);
		btnPercent.setBackground(Color.DARK_GRAY);
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPercent.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btnPercent.setBounds(226, 300, 65, 54);
		frame.getContentPane().add(btnPercent);
		
		JButton btn3 = new JButton("3");
		btn3.setForeground(Color.WHITE);
		btn3.setBackground(Color.DARK_GRAY);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btn3.setBounds(161, 248, 65, 54);
		frame.getContentPane().add(btn3);
		
		JButton btn6 = new JButton("6");
		btn6.setForeground(Color.WHITE);
		btn6.setBackground(Color.DARK_GRAY);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btn6.setBounds(161, 195, 65, 54);
		frame.getContentPane().add(btn6);
		
		JButton btn9 = new JButton("9");
		btn9.setForeground(Color.WHITE);
		btn9.setBackground(Color.DARK_GRAY);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btn9.setBounds(161, 144, 65, 54);
		frame.getContentPane().add(btn9);
		
		JButton btn00 = new JButton("00");
		btn00.setToolTipText("Hundred");
		btn00.setForeground(Color.WHITE);
		btn00.setBackground(Color.DARK_GRAY);
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btn00.setBounds(161, 91, 65, 54);
		frame.getContentPane().add(btn00);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setForeground(Color.WHITE);
		btnPlus.setToolTipText("Plus");
		btnPlus.setBackground(Color.DARK_GRAY);
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnPlus.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btnPlus.setBounds(226, 91, 65, 54);
		frame.getContentPane().add(btnPlus);
		
		JButton btnSub = new JButton("-");
		btnSub.setForeground(Color.WHITE);
		btnSub.setToolTipText("Subtract");
		btnSub.setBackground(Color.DARK_GRAY);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSub.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btnSub.setBounds(226, 144, 65, 54);
		frame.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("*");
		btnMul.setToolTipText("Timess");
		btnMul.setForeground(Color.WHITE);
		btnMul.setBackground(Color.DARK_GRAY);
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMul.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btnMul.setBounds(226, 195, 65, 54);
		frame.getContentPane().add(btnMul);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setToolTipText("Divide");
		btnDivide.setForeground(Color.WHITE);
		btnDivide.setBackground(Color.DARK_GRAY);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btnDivide.setBounds(226, 248, 65, 54);
		frame.getContentPane().add(btnDivide);

		
		JLabel bgImage = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/bg.jpg")).getImage();
		bgImage.setIcon(new ImageIcon(img));
		bgImage.setBounds(10, 0, 544, 734);
		frame.getContentPane().add(bgImage);
	}
}
