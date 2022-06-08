import java.util.Random;


public class Ejercicio5 {

	/*Dada una lista de numeros enteros, separarla en dos listas ordenadas de menor a mayor. 
	 La primera con los numeros pares y la segunda con los numeros impares 
	 */ 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numeros;
		numeros=new int[20];
		int num, cantPar=0, cantImpar=0;		
		
		for(int i=0;i<20;i++) {
			
			num=new Random().nextInt(100);
		
		    numeros[i]=num;
		}

		for (int i=1; i <20 ; i++) {
		    int aux = numeros[i];
		    int j;
		    for (j=i-1; j>=0 && numeros[j] > aux; j--){
		        numeros[j+1] = numeros[j];
		        }
		    numeros[j+1] = aux;
		}
		
		for (int i=0; i <20 ; i++) {
			
			if (numeros[i]%2==0){
				
				cantPar++;
				
			}else {
				cantImpar++;
			}
		}
		
		int par[] =new int[cantPar];
		int impar[]=new int[cantImpar];
		
		cantPar=0;
		cantImpar=0;
		
		for (int i=0; i <20 ; i++) {
			
		 if (numeros[i]%2==0) {
				 
				 par[cantPar]=numeros[i];
				 cantPar++;
			 
	      }else {
	    	  
	    	  impar[cantImpar]=numeros[i];
				 cantImpar++;
	      }
		 
		}
				 
		System.out.println("Esta esla lista de numeros pares: ");
				
		    for(int i=0;i<cantPar;i++) {
			 System.out.println(par[i]+" - ");
			}
		    System.out.println("");
		    
	   System.out.println("Esta esla lista de numeros impares: ");    
			for(int j=0;j<cantImpar;j++) {
			 System.out.println(impar[j]);	
			}
			
	}

}
