package maratona;

import java.text.DecimalFormat;
import java.util.Scanner;

public class number {
	public static void main(String[] args) {
		
		Scanner scan =  new Scanner (System.in);
		DecimalFormat formato = new DecimalFormat("000.00");
		
		int i = scan.nextInt();
		int c = scan.nextInt();
		double porce= scan.nextDouble();
		double soma= 0;
		
		soma=c * porce ;
		
		
		
		
		System.out.println("NUMBER = "+i);
		System.out.println("SALARY = U$ "+formato.format(soma));
		
		
	}
}
