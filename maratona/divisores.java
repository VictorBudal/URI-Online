package maratona;

import java.util.Scanner;

public class divisores {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numb= scan.nextInt();
		
		for(int i =1;i<=numb;i++) {
			if(numb%i ==0) {
				System.out.println(i);
				
			}
			
		}

	}

}
