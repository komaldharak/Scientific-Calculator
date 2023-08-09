package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class test implements ActionListener {
	JLabel l1,l2,l3;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
	JTextField f1,f2,f3;
	test(){
		//frame
		JFrame f=new JFrame();
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
		f.setTitle("Sample");
		
		//contain
		l1=new JLabel("Enter first number");
		l1.setBounds(50, 50, 150, 20);
		
		f1=new JTextField();
		f1.setBounds(50, 80, 150,20);
		
		l2=new JLabel("Enter second number");
		l2.setBounds(50, 120, 150, 20);
		
		f2=new JTextField();
		f2.setBounds(50, 150, 150, 20);
		
		l3=new JLabel("Answer");
		l3.setBounds(50, 180, 150, 20);
		
		f3=new JTextField();
		f3.setBounds(50, 210, 150,20);
		f3.setEditable(false);
		
		b1=new JButton("+");
		b1.setBounds(50, 240, 60, 30);
		
		b2=new JButton("-");
		b2.setBounds(120, 240, 60, 30);
		
		b3=new JButton("*");
		b3.setBounds(190, 240, 60, 30);
		
		b4=new JButton("/");
		b4.setBounds(50, 290, 60, 30);
		
		b5=new JButton("%");
		b5.setBounds(120, 290, 60, 30);
		
		b6=new JButton("sin");
		b6.setBounds(190, 290, 60, 30);
		
		b7=new JButton("cos");
		b7.setBounds(50, 340, 60, 30);
		
		b8=new JButton("tan");
		b8.setBounds(120, 340, 60, 30);
		
		b9=new JButton("pow");
		b9.setBounds(190, 340, 60, 30);
		
		b10=new JButton("sqrt ");
		b10.setBounds(50, 390, 60, 30);
		
		b11=new JButton("clr");
		b11.setBounds(120, 390, 60, 30);
		
		b1.addActionListener( this);  
	    b2.addActionListener(this); 
	    b3.addActionListener( this);
	    b4.addActionListener( this);
	    b5.addActionListener( this);
	    b6.addActionListener( this);
	    b7.addActionListener( this);
	    b8.addActionListener( this);
	    b9.addActionListener( this);
	    b10.addActionListener( this);
	    b11.addActionListener( this);
		f.add(l1);f.add(l2);f.add(f1);f.add(f2);f.add(b1);f.add(b2);f.add(f3);f.add(l3);
		f.add(b3);f.add(b4);f.add(b5);f.add(b6);f.add(b7);f.add(b8);f.add(b9);f.add(b10);f.add(b11);
	}
	
	public void actionPerformed(ActionEvent e) {
		 String s1=f1.getText();  
	     String s2=f2.getText();  
	        double a=Integer.parseInt(s1);  
	        double b=Integer.parseInt(s2);  
	        double c=0;  
	        if(e.getSource()==b1){  
	            c=a+b;  
	        }else if(e.getSource()==b2){  
	            c=a-b;  
	        }else if(e.getSource()==b3) {
	        	c=a*b;
	        }else if(e.getSource()==b4) {
	        	c=a/b;
	        }else if(e.getSource()==b5) {
	        	c=a%b;
	        }else if(e.getSource()==b6) {
	        	c=Math.sin(a);
	        }else if(e.getSource()==b7) {
	        	c=Math.cos(a);
	        }else if(e.getSource()==b8) {
	        	c=Math.tan(a);
	        }else if(e.getSource()==b9) {
	        	c=Math.pow(a,b);
	        }else if(e.getSource()==b10) {
	        	c=Math.sqrt(a);
	        }else if(e.getSource()==b11) {
	        	f1.setText("");
	        	f2.setText("");
	        	c=0;
	        }
	        
	        String result=String.valueOf(c);  
	        f3.setText(result);  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new test();
	}

		
	

}
