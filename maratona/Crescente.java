package maratona;

import java.util.Scanner;

public class Crescente {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i=1;
		
		while(i>0) {
			int X = scan.nextInt();
			if(X==0) {
				i-=1;
			}
			for(int c=1; c<=X; c++) {
				System.out.print(c);
				if(c==X) {
					
				}else 
					System.out.print(" ");
				
				
			}
			System.out.println();
			scan.close();
		}
		

	}

}
