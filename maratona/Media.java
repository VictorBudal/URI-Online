package maratona;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.00");
		int i =0;
		double soma= 0;
		
		while(i<2){
			
			double valor = scan.nextDouble();
			if(valor<=10.0 && valor>=0.10) {
				
				soma+= valor;
				
				i++;
				
			}else {
				
				System.out.println("nota invalida");
				}
				
		}
		soma/=2;
		
		System.out.println("media = "+ decimal.format(soma));
		
		

	}

}
