package maratona;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int tamanho ;
		int x = scan.nextInt();
		int cont = 0;
		int[] tabela= {0,1,2,3,4,5,6,7,8,9};
		
		for(int i =0; i<x;i++) {
			
			 String text = scan.next();
			 tamanho = text.length();
			for(int j =0 ; j<tamanho ; j++) {
				
				cont=tabela[text.charAt(j)];
				
			}
			 
			 System.out.println(text);
			
			
			
			
			
		}
		
		
		
		
	}
}
