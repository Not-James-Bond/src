/*
 *Name       :Chaitanya Singh
 *RollNo     :01050402017
 *Topic      :GUI using AWT and Swings
 *Question 31:Write a java program create a login window using awt controls.
      b) Using IDE
 */

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class A31_GuiLoginIDE extends JApplet{
  TextField name,pass;
  Button b1,b2;
  A31_GuiLoginIDE()
  {
	  setLayout(new FlowLayout());
	  Label n=new Label("Name:",Label.CENTER);
	  name=new TextField(20);
	  Label p=new Label("Password:",Label.CENTER);
	  pass=new TextField(20);
	  pass.setEchoChar('#');
	  b1=new Button("submit");
	  b2=new Button("cancel");
	  this.add(n);
	  this.add(p);
	  this.add(name);
	  this.add(pass);
	  this.add(b1);
	  this.add(b2);
  }


	public static void main(String[] args)
	{
		A31_GuiLoginIDE m1=new A31_GuiLoginIDE();
		m1.setVisible(true);
		m1.setSize(400,400);


	}
}
