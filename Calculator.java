import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ex6_calculator extends JFrame {
	ex6_calculator(){
		JFrame j=new JFrame("Calculator");
		JLabel j1=new JLabel("click here ");
		JLabel j2=new JLabel(" ");
		JTextField t1=new JTextField("first number",16);
		t1.setBounds(50,50,450,150);
		t1.setBackground(Color.GREEN);
		JTextField t2=new JTextField("second number",16);
		t2.setBounds(50,100,450,150);
		t2.setBackground(Color.GREEN);
		JButton b1=new JButton("add");
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String s1=t1.getText();
				int n=Integer.parseInt(s1);
				String s2=t2.getText();
				int m=Integer.parseInt(s2);
				System.out.println("entered text "+s1+" "+s2);
				int res=n+m;
				System.out.println("summation is :"+res);
				System.out.println("Thank You");
				setVisible(false);
				dispose();
				System.exit(0);
			}
			});
		JButton b2=new JButton("sub");
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String s1=t1.getText();
				int n=Integer.parseInt(s1);
				String s2=t2.getText();
				int m=Integer.parseInt(s2);
				System.out.println("entered text "+s1+" "+s2);
				int res=n-m;
				System.out.println("subtraction is :"+res);
				System.out.println("Thank You");
				setVisible(false);
				dispose();
				System.exit(0);
			}
			});
		j.add(j1);
		j.add(j2);
		j.add(t1);
		j.add(t2);
		j.add(b1);
		j.add(b2);
		j.setSize(500,500);
		j.setVisible(true);
		j.setLayout(new FlowLayout(FlowLayout.CENTER));
		j.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex6_calculator ob=new ex6_calculator();
		
			
	}

}
