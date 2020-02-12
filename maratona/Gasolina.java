package maratona;

import java.util.Scanner;

public class Gasolina {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int gasolina=0;
		int alcool=0;
		int diesel=0;
		
		for(int i =1 ; i==1;) {
			int cont= scan.nextInt();
			if(cont == 4) {
				i++;
			}
			if(cont==1) {
				alcool+=1;		
			}
			if(cont==2) {	
				gasolina+=1;
			}
			if(cont==3) {
				diesel+=1;
			}

		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+alcool);
		System.out.println("Gasolina: "+gasolina);
		System.out.println("Diesel: "+diesel);
		
		
		

	}

}
