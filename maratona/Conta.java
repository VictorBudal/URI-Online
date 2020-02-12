package maratona;

import java.util.Scanner;

public class Conta {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int soma = 0;

		for (int i = 0; i < x; i++) {
			int s = scan.nextInt();
			if (s % 2 == 0) {
				System.out.println("0");

			} else {
				System.out.println("1");
			}

		}

	}

}
