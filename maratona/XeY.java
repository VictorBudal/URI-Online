package maratona;

import java.text.DecimalFormat;
import java.util.Scanner;

public class XeY {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		DecimalFormat decimal = new DecimalFormat("0.0");
		
		
		int numb = scan.nextInt();
		double soma=0;
		
		for(int c = 0 ; c< numb; c++ ) {
			double x = scan.nextDouble();
			double y = scan.nextDouble();
			
			if(y==0) {
				System.out.println("divisao impossivel");
			}else {
				soma= x/y;
				System.out.println(decimal.format(soma));
			}
			
			
			
			
			
		}
		
		
		
		
	}

}
