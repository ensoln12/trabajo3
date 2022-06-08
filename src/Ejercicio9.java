
public class Ejercicio9 {
	
	/*Crea una matriz de 3*3 con losnumeros del 1 al 9. Mostrar por
	 pantalla tal como aparece en la matriz*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriz[][] = new int[3][3];
		int aux=1;
		for (int i=0; i < 3; i++) {
			  for (int j=0; j < 3; j++) {
				  matriz[i][j]=aux;
				  aux++;
				  
			  }
			}
		
		 for (int i = 0; i < 3; i++) {
	         for (int j = 0; j < 3; j++) {
	            System.out.print(matriz[i][j]);
	        }
	        System.out.println();
	    }
	}

}
