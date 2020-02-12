package maratona;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Media2 {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.0");
		
		double nota1, nota2, nota3;
		
		nota1=scan.nextDouble();
		nota2=scan.nextDouble();
		nota3=scan.nextDouble();
		double calculo=0;
		
		calculo=(((nota1*2)+(nota2*3)+(nota3*5))/10);
		
		
		System.out.println("MEDIA = "+decimal.format(calculo));
		
	}

}
