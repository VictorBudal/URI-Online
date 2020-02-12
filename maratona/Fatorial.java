package maratona;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int factorial=scan.nextInt();
		int soma=1;
		
		for(int i =2;i<=factorial;i++) {
			soma*=i;
		}
		System.out.println(soma);

	}

}
