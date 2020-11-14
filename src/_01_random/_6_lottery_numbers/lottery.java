package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lottery {
public static void main(String[] args) {
	
	Random ran = new Random();
	int a = ran.nextInt(100);
	int b = ran.nextInt(100);
	int c = ran.nextInt(100);
	int d = ran.nextInt(100);
	int e = ran.nextInt(100);
	int f = ran.nextInt(100);
	
	JOptionPane.showMessageDialog(null, a+" "+b+" "+c+" "+d+" "+e+" "+f);
}
}
