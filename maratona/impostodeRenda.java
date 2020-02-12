package maratona;

import java.text.DecimalFormat;
import java.util.Scanner;

public class impostodeRenda {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("0.00");

		double valor = scan.nextDouble();

		double calculo, resultado, calculo2;

		if (valor <= 2000) {

			System.out.println("Inseto");

		} else {
			if (valor > 4500) {

				calculo = 1000 * 0.08;

				calculo2 = 1500 * 0.18;

				resultado = (valor - 4500) * 0.28;

				resultado += calculo + calculo2;

				System.out.println("R$ " + formato.format(resultado));
			} else {
				if (valor > 3000){

					calculo = 1000 * 0.08;

					calculo2 = (valor - 3000);

					calculo2 *= 0.18;

					resultado = calculo + calculo2;

					System.out.println("R$ " + formato.format(resultado));

				}else {
		
		

				if (valor > 2000) {

					calculo = valor - 2000;

					calculo *= 0.08;

					System.out.println("R$ " + formato.format(calculo));

				}
				}
			}
		}
	}
}
