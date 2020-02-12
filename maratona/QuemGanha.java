package maratona;

import java.util.Scanner;

public class QuemGanha {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String par = "PAR";
		String impar = "IMPAR";
		int soma = 0;
		int x= scan.nextInt();
		
		for(int i =0;i<x;i++) {
		
			String nome1 = scan.next(), escolha1 = scan.next(), nome2 = scan.next(), escolha2 = scan.next();
			int numb1 = scan.nextInt(), numb2 = scan.nextInt();
			soma = 0;
			soma = numb1 + numb2;
			if (soma % 2 == 0) {
				if (par.equals(escolha1)) {
					System.out.println(nome1);
				} else {
					System.out.println(nome2);
				}
			} else {
				if (impar.equals(escolha1)) {
					System.out.println(nome1);
				} else {
					System.out.println(nome2);
				}
	
			}
		}
	}
}
