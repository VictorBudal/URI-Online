package maratona;

import java.util.Scanner;

public class TesteDeSelecao {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int a,b,c,d;
		a= scan.nextInt();
		b= scan.nextInt();
		c= scan.nextInt();
		d= scan.nextInt();
		
		boolean verificar=true;
		
		
		if(b>c) {
			if(d>a) {
				if(c+d>a+b) {
					if(c>0 &d>0) {
						if(a%2==0) {
							System.out.println("Valores aceitos");
						}
						
					}else {
						verificar=false;
					}
					
				}else {
					verificar=false;
				}
				
			}else {
				verificar=false;
			}
			
		}else {
			verificar=false;
		}
		
		
		if(verificar == false) {
			System.out.println("Valores nao aceitos");
		}
		
	}//main
}//class
