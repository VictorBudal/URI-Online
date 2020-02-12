package maratona;

import java.util.Scanner;


public class TimeGame {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int hr1=scan.nextInt(),min1=scan.nextInt(),hr2=scan.nextInt(),min2=scan.nextInt();
		double soma1 = 0, soma2= 0;
		
		soma1 = hr1*60;
		soma2 = hr2*60;
		
		soma1-=soma2;
		
		
		soma1-=soma2;
		soma1/=60;
	
		System.out.println("deu certo"+soma1);
		
	}

}
