/*
 *Name       :Chaitanya Singh
 *RollNo     :01050402017
 *Topic      :GUI using AWT and Swings
 *Question 32:Apply event handling in Q31 (Part :B), On click of Ok button check
   text fields are empty or not. If empty generate a message.
 */

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class A32_EventHandling extends JFrame implements  ActionListener {
      JPanel panel;
      TextField name,pass;
	  Button b1,b2;
      Label n,p;
	  A32_EventHandling()
	  {
		  panel=new JPanel();
		  setLayout(new FlowLayout());
		  n=new Label("Name:",Label.CENTER);
		  name=new TextField(20);
		  p=new Label("Password:",Label.CENTER);
		  pass=new TextField(20);
		  pass.setEchoChar('#');
		  b1=new Button("submit");
		  b1.addActionListener(this);
		  b2=new Button("cancel");
		  getContentPane().add(panel);
		  panel.add(n);
		  panel.add(name);
		  panel.add(b1);
		  panel.add(p);
		  panel.add(pass);
		  panel.add(b2);

	  }


	public static void main(String[] args) {

		A32_EventHandling m1=new A32_EventHandling();
		m1.setVisible(true);
		m1.setSize(400,400);


	}

	public void actionPerformed(ActionEvent e) {
		Object evt=e.getSource();
		String val1=name.getText();
		String val2=pass.getText();
		if(evt==b1)
		{
			if(val1!=null || val2!=null)
		{
				JOptionPane.showConfirmDialog(this,"welcome");
		}
		else
		{
			JOptionPane.showConfirmDialog(this,"Name or password must not be empty");
		}
	}

}

}
