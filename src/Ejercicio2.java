import java.util.Scanner;

public class Ejercicio2 {
/*
 Crear un vector de 20 numeros reales correspondientes a los 20 personas.
 Obtener el peso mayor, el peso menor, el peso medio y visualizar un mensaje 
 si hay alguna persona con un peso mayor de 100kg. 
  */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float pesoM=0, bandera=0;
        float[] pesos;
		
	    pesos=new float[20];
		Scanner lScanner=new Scanner(System.in);
		float kilos=0;
		float promedio;
		for(int i=0;i<20;i++) {
			
			System.out.println("Ingrese un peso");
			pesos[i]=lScanner.nextFloat();
			kilos=kilos+pesos[i];
			}
		
		for (int i=1; i <20 ; i++) {
		    float aux = pesos[i];
		    int j;
		    for (j=i-1; j>=0 && pesos[j] > aux; j--){
		        pesos[j+1] = pesos[j];
		        }
		    pesos[j+1] = aux;
		    }
		promedio=kilos/20;
		System.out.println("El peso menor es: "+"="+pesos[0]);
   	    System.out.println("El peso promedio es: "+"="+promedio);
   	    System.out.println("El peso mayor es: "+"="+pesos[19]);
		   
         for (int i=0; i<20; i++) {
        	 if (pesos[i]>100) {
        	 bandera=1;
            System.out.println("Estas personas tienen un peso mayor a 100kg ["+i+"]"+"="+pesos[i]); 
			
		}
		
	  }
         if (bandera==0) {
 			System.out.println("No hay pesos mayores a 100Kg");
         }
	}

}
