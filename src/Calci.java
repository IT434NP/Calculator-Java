import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calci extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calci frame = new Calci();
					frame.setVisible(true);
					frame.setAlwaysOnTop(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	double d1=0.0,d2=0.0;
	String op="";
	int cnt=0;
	private JTextField textField_1;
	
	public Calci() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton bn0 = new JButton("0");
		bn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"0");
				textField_1.setText(textField_1.getText()+"0");
			}
		});
		bn0.setBounds(10, 208, 68, 43);
		contentPane.add(bn0);
		
		JButton bn1 = new JButton("1");
		bn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"1");
				textField_1.setText(textField_1.getText()+"1");
			}
		});
		bn1.setBounds(10, 162, 68, 43);
		contentPane.add(bn1);
		
		JButton bn2 = new JButton("2");
		bn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
				textField_1.setText(textField_1.getText()+"2");
			}
		});
		bn2.setBounds(88, 162, 68, 43);
		contentPane.add(bn2);
		
		JButton bdifference = new JButton("-");
		bdifference.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cnt==0) {
					d1=Integer.parseInt(textField.getText());
				}else {
					d2=Integer.parseInt(textField.getText());
					if(op.equals("+")) {
						d1+=d2;
						textField.setText(Double.toString(d1));
					}else if(op.equals("-")) {
						d1-=d2;
						textField.setText(Double.toString(d1));
					}else if(op.equals("*")) {
						d1*=d2;
						textField.setText(Double.toString(d1));
					}else{
						d1/=d2;
						textField.setText(Double.toString(d1));
					}
				}
				cnt+=1;
				d2=0.0;
				op="-";
				textField_1.setText(textField_1.getText()+op);
				textField.setText("");
			}
		});
		bdifference.setBounds(88, 208, 68, 43);
		contentPane.add(bdifference);
		
		JButton bequal = new JButton("=");
		bequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				d2=Integer.parseInt(textField.getText());
				if(op.equals("+")) {
					d1+=d2;
					textField.setText(Double.toString(d1));
				}else if(op.equals("-")) {
					d1-=d2;
					textField.setText(Double.toString(d1));
				}else if(op.equals("*")) {
					d1*=d2;
					textField.setText(Double.toString(d1));
				}else{
					d1/=d2;
					textField.setText(Double.toString(d1));
				}
				cnt=0;
				d2=0.0;
				textField_1.setText(textField_1.getText());
			}
		});
		bequal.setBounds(244, 162, 68, 89);
		contentPane.add(bequal);
		
		JButton bn3 = new JButton("3");
		bn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"3");
				textField_1.setText(textField_1.getText()+"3");
			}
		});
		bn3.setBounds(166, 162, 68, 43);
		contentPane.add(bn3);
		
		JButton bsum = new JButton("+");
		bsum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cnt==0) {
					d1=Integer.parseInt(textField.getText());
				}else {
					d2=Integer.parseInt(textField.getText());
					if(op.equals("+")) {
						d1+=d2;
						textField.setText(Double.toString(d1));
					}else if(op.equals("-")) {
						d1-=d2;
						textField.setText(Double.toString(d1));
					}else if(op.equals("*")) {
						d1*=d2;
						textField.setText(Double.toString(d1));
					}else{
						d1/=d2;
						textField.setText(Double.toString(d1));
					}
				}
				cnt+=1;
				d2=0.0;
				op="+";
				textField_1.setText(textField_1.getText()+op);
				textField.setText("");
			}
		});
		bsum.setBounds(166, 208, 68, 43);
		contentPane.add(bsum);
		
		JButton bn7 = new JButton("7");
		bn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"7");
				textField_1.setText(textField_1.getText()+"7");
			}
		});
		bn7.setBounds(10, 63, 68, 43);
		contentPane.add(bn7);
		
		JButton bn8 = new JButton("8");
		bn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"8");
				textField_1.setText(textField_1.getText()+"8");
			}
		});
		bn8.setBounds(88, 63, 68, 43);
		contentPane.add(bn8);
		
		JButton bn9 = new JButton("9");
		bn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"9");
				textField_1.setText(textField_1.getText()+"9");
			}
		});
		bn9.setBounds(166, 63, 68, 43);
		contentPane.add(bn9);
		
		JButton bdivide = new JButton("/");
		bdivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cnt==0) {
					d1=Integer.parseInt(textField.getText());
				}else {
					d2=Integer.parseInt(textField.getText());
					if(op.equals("+")) {
						d1+=d2;
						textField.setText(Double.toString(d1));
					}else if(op.equals("-")) {
						d1-=d2;
						textField.setText(Double.toString(d1));
					}else if(op.equals("*")) {
						d1*=d2;
						textField.setText(Double.toString(d1));
					}else{
						d1/=d2;
						textField.setText(Double.toString(d1));
					}
				}
				cnt+=1;
				d2=0.0;
				op="/";
				textField_1.setText(textField_1.getText()+op);
				textField.setText("");
			}
		});
		bdivide.setBounds(244, 63, 68, 43);
		contentPane.add(bdivide);
		
		JButton bmultiply = new JButton("*");
		bmultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cnt==0) {
					d1=Integer.parseInt(textField.getText());
				}else {
					d2=Integer.parseInt(textField.getText());
					if(op.equals("+")) {
						d1+=d2;
						textField.setText(Double.toString(d1));
					}else if(op.equals("-")) {
						d1-=d2;
						textField.setText(Double.toString(d1));
					}else if(op.equals("*")) {
						d1*=d2;
						textField.setText(Double.toString(d1));
					}else{
						d1/=d2;
						textField.setText(Double.toString(d1));
					}
				}
				cnt+=1;
				d2=0.0;
				op="*";
				textField_1.setText(textField_1.getText()+op);
				textField.setText("");
			}
		});
		bmultiply.setBounds(244, 109, 68, 43);
		contentPane.add(bmultiply);
		
		JButton bn6 = new JButton("6");
		bn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"6");
				textField_1.setText(textField_1.getText()+"6");
			}
		});
		bn6.setBounds(166, 109, 68, 43);
		contentPane.add(bn6);
		
		JButton bn5 = new JButton("5");
		bn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"5");
				textField_1.setText(textField_1.getText()+"5");
			}
		});
		bn5.setBounds(88, 109, 68, 43);
		contentPane.add(bn5);
		
		JButton bn4 = new JButton("4");
		bn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"4");
				textField_1.setText(textField_1.getText()+"4");
			}
		});
		bn4.setBounds(10, 109, 68, 43);
		contentPane.add(bn4);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.TRAILING);
		textField.setBounds(10, 27, 224, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				d1=d2=0.0;
				textField.setText("");
				textField_1.setText("");
			}
		});
		btnC.setBounds(244, 10, 68, 43);
		contentPane.add(btnC);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.TRAILING);
		textField_1.setBounds(10, 10, 224, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
