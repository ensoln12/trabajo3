import java.util.Scanner;

public class Ejercicio10 {
	
	/*Crear dos matrices de mxn y sumar sus valores, los resultados 
	 se deben almacenar en otra matriz. los valores y la longitud, 
	 seran insertados por el usuario. Mostrar las matrices originales 
	 y el resultado*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int cantF=0, cantC=0;
		  
		  System.out.println("Ingresa la cantidad de filas");	
		  cantF=s.nextInt();
		  
		  System.out.println("Ingresa la cantidad de columnas");	
		  cantC=s.nextInt();
		  
		  System.out.println("Ingresa la matrizA");
		  
		  int[][] matrizA, matrizB, matrizResultado;
		  matrizA=new int[cantF][cantC];
		  matrizB=new int[cantF][cantC];
		  matrizResultado=new int[cantF][cantC];
		  
		  for(int i=0;i<cantF;i++) {
			  
			  for(int j=0;j<cantC;j++) {
				  
			       System.out.println("Ingresa un numero");			 
			        matrizA[i][j]=s.nextInt();
			      
			  }
			  
		  }

		  System.out.println("Ingresa la matrizB");
		  
		  for(int i=0;i<cantF;i++) {
			  
			  for(int j=0;j<cantC;j++) {
				  
			       System.out.println("Ingresa un numero");			 
			        matrizB[i][j]=s.nextInt();
			      
			  }
			  
		  }
		    
		    for(int i=0;i<cantF;i++) {
				  
				  for(int j=0;j<cantC;j++) {
					  			 
				       matrizResultado[i][j]=matrizA[i][j]+matrizB[i][j];
				      
				  }				  
		  }
		    
		    for (int i = 0; i < cantF; i++) {
		         for (int j = 0; j < cantC; j++) {
		            System.out.print(matrizA[i][j]);
		        }
		        System.out.println();
		    }
		    
		    for (int i = 0; i < cantF; i++) {
		         for (int j = 0; j < cantC; j++) {
		            System.out.print(matrizB[i][j]);
		        }
		        System.out.println();
		    }
			 for (int i = 0; i < cantF; i++) {
		         for (int j = 0; j < cantC; j++) {
		            System.out.print(matrizResultado[i][j]);
		        }
		        System.out.println();
		    }
	  }
}
