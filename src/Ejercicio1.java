import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int[] numeros;
		numeros=new int[10];
		
		Scanner leer=new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
		
		System.out.println("Ingrese un valor");
		numeros[i]=leer.nextInt();
		}
       
		for(int i=0;i<10;i++) {
			
			System.out.println("["+i+"]"+"="+numeros[i]);
		}*/
		
		float[] n;
		
		n=new float[5];
		
		Scanner lScanner=new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			
			System.out.println("Ingrese un valor");
			n[i]=lScanner.nextFloat();
			}
         for(int i=0;i<5;i++) {
			
			System.out.println("["+i+"]"+"="+n[i]);
		}
		
	}

}
