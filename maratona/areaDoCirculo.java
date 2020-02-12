package maratona;

import java.text.DecimalFormat;
import java.util.Scanner;


public class areaDoCirculo {

	public static void main(String[] args) {
		DecimalFormat formato = new DecimalFormat("0.0000");

		Scanner scan = new Scanner(System.in);

		double area, n, raio;

		n = 3.14159;
		raio = scan.nextDouble();

		
		area = n*Math.pow(raio, 2);
		
		
		System.out.println("A="+formato.format(area));
	}

}
