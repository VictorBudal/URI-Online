package maratona;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cont=scan.nextInt();
		int soma=0,soma2=0;
		
		for(int i = 0 ; i<cont ; i++) {
			soma=0;
			int x = scan.nextInt();
			for(int c =2; i<x;c++) {
				if(x%c==0) {
					soma+=1;
				}else {
					soma2=+1;
				}
			}	
			if(soma<1) {
				System.out.println(x+" eh  primo");
			}
			
			
			
			
			
		}
		
		
		

	}

}
