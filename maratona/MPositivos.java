package maratona;

import java.util.Scanner;

public class MPositivos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int soma = 0;
		double divis�o = 0;

		for (int i = 0; i < 6; i++) {
			
			float numb = scan.nextFloat();
			
			if (numb > 0) {
			
				soma += 1;
				
				divis�o += numb;

			}

		}
		
		System.out.printf("%d valores positivos\n", soma);
		System.out.printf("%.1f\n",divis�o/soma);
		
	}

}
