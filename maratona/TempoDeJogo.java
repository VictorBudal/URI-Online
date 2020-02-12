package maratona;

import java.util.Scanner;

public class TempoDeJogo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int h1,min1,h2,min2,MinI,MinF,h,m;
		
		h1=scan.nextInt();
		min1=scan.nextInt();
		h2=scan.nextInt();
		min2=scan.nextInt();
		
		int somahrs=0,somamin=0;
		
		MinI= h1*60+min1;
		MinF= h2*60+min2;
		
		
		if(MinI>=MinF) {
			h2+=24;
			MinI= h1*60+min1;
			MinF= h2*60+min2;
			MinF-=MinI;
			h=MinF/60;
			m=MinF%60;
			
			System.out.println("O JOGO DUROU "+h+" HORA(S) E "+m+" MINUTO(S)");
		}else {
			MinF-=MinI;
			h=MinF/60;
			m=MinF%60;
			System.out.println("O JOGO DUROU "+h+" HORA(S) E "+m+" MINUTO(S)");
		}
		
		
		
	}

}
