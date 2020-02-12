package maratona;

import java.util.Scanner;


public class SomaImpares {

	public static void main(String[] args) {
			Scanner scan = new Scanner (System.in);
		
			int X = scan.nextInt();
			int Y= scan.nextInt();
			int soma = 0;
			Y +=1;
			
			
			
			for(int i = Y;i<X;i++) {
				
				if(i%2==1) {
					soma +=i;
					System.out.println(soma);
				}
			}
			
			if(X==Y) {
				soma = 0;
				
			}
			System.out.println(soma);
			
			
			
			
	}

}
