import java.util.Scanner;

public class Ejercicio3 {
    
	/*
	 Crea un vector de 10 numeros reales, con valores solicitados al usuario
	 Por otro lado solicitar un posision entre 0 y 9. Eliminar el elemento 
	 situado en esa posicion sin dejar hueco. Visualizar el vecto resultante  
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 float[] numeros;
		 int posicion;
			
		    numeros=new float[10];
			
			Scanner lScanner=new Scanner(System.in);
			
			System.out.println("Ingrese la posicion entre 0 y 9");
		    posicion=lScanner.nextInt();
		    
		    Scanner reales=new Scanner(System.in);
		    
			for(int i=0;i<10;i++) {
				
				System.out.println("Ingrese un numero real");
				numeros[i]=reales.nextFloat();
				}
			if (posicion<=9) {
				
				for(int i=posicion; i<9;i++) {
					 
					numeros[i]=numeros[i+1];
					}
				for(int j=0;j<9;j++) {
					
					System.out.println("["+j+"]"+"="+numeros[j]);
			      }
				
				}else {
					System.out.println("La posicion esa fuera del rango del vector");
			}
			System.out.println("Se elimino el numero: "+numeros[posicion]);
			
	}

}







