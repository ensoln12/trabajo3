import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
	
	/*
	 * Generar 20 numeros enteros entre 1 y 100 de forma aleatoria 
	 * y contar cuantos de esos numeros enteros son divisibles por 5
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros;
		numeros=new int[20];
		int num, contador=0;
		Scanner leer=new Scanner(System.in);
		
		for(int i=0;i<20;i++) {
			
			num=new Random().nextInt(100);
		
		    numeros[i]=num;
		}
		
        for(int i=0;i<20;i++) {
			
        	if (numeros[i]%5==0) {
        		contador++;
        		System.out.println("los numeros multiplos de 5 son: "+numeros[i]);
        	}

        }
        
        System.out.println("La lista tiene "+contador+" numeros multiplos de 5");
       
	}

}
