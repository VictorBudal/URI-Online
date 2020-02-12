package maratona;

import java.util.Scanner;

public class Impares {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		int x= scan.nextInt();
		
		for(int i =1 ; i<=x;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
			
			
		}
		
		
	}
}
