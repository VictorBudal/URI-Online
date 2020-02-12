package maratona;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		DecimalFormat formato = new DecimalFormat("0.00");
	
		String nome= scan.next();
		double salario = scan.nextDouble();
		double bonus = scan.nextDouble();
		double soma= 0;
		
		bonus*=0.15;
		
		soma= salario + bonus;
		System.out.println("TOTAL = R$ "+formato.format(soma));
		

	}

}
