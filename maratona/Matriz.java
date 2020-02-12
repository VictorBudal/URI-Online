package maratona;

public class Matriz {

	public static void main(String[] args) {
		
		int[][] a = {{3,2,6},{4,1,7},{5,9,8}};
		
		int[][] b = {{6,4,1},{2,9,7},{3,6,8}};
		
		int[][] d= new int[3][3];
		
		int resultado=0;
		
		// imprimi A Matrizes;
		
		for(int i =0 ; i<3;i++) {
			
			for(int j =0 ; j<3; j++) {
				
				System.out.print(a[i][j]+" ");
			
			}
			System.out.println();
		}
		
		System.out.println();
		
		// imprimi B Matrizes;
		
		for(int i =0 ; i<3;i++) {
			
			for(int j =0 ; j<3; j++) {
				
				System.out.print(b[i][j]+" ");
				
				
			}
			System.out.println();
		}
		
		for(int i =0 ; i<3;i++) {
			
			for(int j =0 ; j<3; j++) {
				
				for(int k = 0;k<3; k++) {
		
					resultado+=(a[i][k]*b[k][j]);
			
				}
				d[i][j]=resultado;
				
				resultado=0;
			}
		}
		
		
		
		System.out.println();
		// imprimi a Matriz Multiplicada 
		
		for(int i =0 ; i<3;i++) {
			for(int j =0 ; j<3; j++) {
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
		
	}//main
}//class
