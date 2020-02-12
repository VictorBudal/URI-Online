package maratona;



public class OrdenacaoDireta {
	public static void main(String[] args) {
		
		
int[] numeros = { 6, 2, 8, 9, 4, 5, 1, 3, 7, 0,11 , 13, 14, 18, 19, 17, 16, 12, 10, 15};
		
		int tam = numeros.length;
		boolean troca = false;
	
		while(!troca) {
		
		
			troca= true;
			for(int i = 1; i<tam ;i++) {
				if(numeros[i]< numeros[i-1]) {
					int aux =numeros[i];
					numeros[i]= numeros[i-1];
					numeros[i-1]= aux ;
				
					troca = false;
					
				}
				
				
			}
			
		}
		for(int i =  0 ; i<tam ; i++) {
		
			System.out.print(numeros[i]+" ");
		
			if(i==1) {
				
			
			}
		}
	}
}
