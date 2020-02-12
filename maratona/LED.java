package maratona;

import java.util.Scanner;

public class LED {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s;
		
		int[] tabela = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
		
		int x, tamanho;
		
		int resultado= 0;
		
		x = scan.nextInt();
		
		for(int i = 0 ; i<x;i++) {
			
			entrada=scan.next();
			
			tamanho=entrada.length();
			
			for(int j= 0 ; j<tamanho;j++) {
				
				resultado+= tabela[entrada.charAt(j) - '0'];
				
			
			}
			System.out.println(resultado+" leds");
			resultado=0;
			
			
		}
		
					
		

	}

}
