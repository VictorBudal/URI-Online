package maratona;

public class Sudoku {

	public static void main(String[] args) {
		int[][] Matriz = new int [9][9];
		int tam =9;
		
		for(int i = 0 ; i<tam ; i++){
			for(int j = 0 ; j<tam;i++) {
				Matriz[i][j]= i;
				System.out.println(Matriz[i][j]);
				
			}
			
			
		}
		

	}

}
