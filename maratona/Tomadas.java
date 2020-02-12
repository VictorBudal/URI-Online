package maratona;

import java.util.Scanner;

public class Tomadas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t1,t2,t3,t4,x;
		t1=scan.nextInt();
		t2=scan.nextInt();
		t3=scan.nextInt();
		t4=scan.nextInt();
		
		x=(t1+t2+t3+t4)-3;
		
		System.out.println(x);
		
		scan.close();
	}

}
