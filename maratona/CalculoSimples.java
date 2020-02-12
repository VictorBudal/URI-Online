package maratona;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoSimples {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		DecimalFormat formato = new DecimalFormat("0.00");
		
		int numb1,numb2,qtd1,qtd2;
		double preco1,preco2,soma1=0,soma2=0, soma= 0;
		
		numb1= scan.nextInt();
		qtd1= scan.nextInt();
		preco1= scan.nextDouble();
		
		numb2= scan.nextInt();
		qtd2= scan.nextInt();
		preco2= scan.nextDouble();
		
		for(int i =0 ; i<qtd1;i++) {
			soma1+=preco1;
			
		}
		for(int i =0 ; i<qtd2;i++) {
			
			soma2+=preco2;
			
			
		}
		soma=soma1+soma2;
		
		System.out.println("VALOR A PAGAR: R$ "+formato.format(soma));

	}

}
