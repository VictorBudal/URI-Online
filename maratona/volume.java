package maratona;

import java.text.DecimalFormat;
import java.util.Scanner;

public class volume {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat Formato = new DecimalFormat("0000000000000000.000");
		
		int R = scan.nextInt();
		double pi = 3.14159;
		double volume =0;
		int soma= 0;
		
		soma = R*R*R;
		
		
		
		System.out.println(soma);
		volume = (((1.333333333333333)*pi)*soma);
		System.out.println("VOLUME = "+Formato.format(volume));
	}

}
