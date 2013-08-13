package lab01_PKG;

import javax.swing.*;

public class MainClass 
{

	public static void main(String[] args) 
	{
		//	Main Class Data
		
		String temp;
		int a, b, answer;
		
		//	Main Program

		temp = JOptionPane.showInputDialog(null, "Please enter the value of A");
		a = Integer.parseInt(temp);
		
		temp = JOptionPane.showInputDialog(null, "Please enter the value of B");
		b = Integer.parseInt(temp);
		
		Addition add = new Addition(a, b);
		answer = add.getAdditionAnswer();
		
		JOptionPane.showMessageDialog(null, "The answer is: " + answer);
	}
}
