package maratona;

import java.util.Scanner;

public class gols {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int soma = 0;
		int inter=0;
		int gremio=0;
		int empate=0;
		String vencedor="";
			
		for(int i = 1; i==1;){
			
				int x =scan.nextInt();
				int y=scan.nextInt();
				if(x>y) {
					inter+=1;
				}
				if(x<y) {
					gremio+=1;
				}
				if(x==y) {
					empate+=1;
				}
				
				int cont= scan.nextInt();
	
				if(cont==2) {
					i++;
				}
				soma+=1;		
		
		}
		for(int t = 0;t<soma;t++) {
			System.out.println("Novo grenal (1-sim 2-nao)");
		}
		if(inter<gremio) {
			vencedor="Gremio";
		}
		if(inter>gremio) {
			vencedor="Inter";
		}
		System.out.println(soma+" grenais");
		System.out.println("Inter:"+inter);
		System.out.println("Gremio:"+gremio);
		System.out.println("Empates:"+empate);
		System.out.println(vencedor+" venceu mais");
		
		
		
		
		
		
		
		
		
	}	

}
