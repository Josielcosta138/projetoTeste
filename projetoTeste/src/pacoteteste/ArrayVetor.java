package pacoteteste;

public class ArrayVetor {
	
	public static void main(String[] args) {
		
		/* Array pode ser de todos tipos de Objetos */
		/* Array sempre tem que ter posições Definindas [0], [1].... */
		double[] notas = new double[6];
		  
		notas[2] = 7.7;
		notas[1] = 3.9;
		notas[3] = 9.8;
		notas[0] = 5;
		 
		double notaSoma = 0;
		
		
			for (int pos = 0; pos <= 5; pos++) {
				
			System.out.println(" Posição Array "+ pos +". "+"  Notas "+ (pos +1)+"° = " +notas[pos]);
			
		}
			
			notaSoma = (notas[0] + notas[2]);
			
			System.out.println(" ");
			System.out.println(" Nota somada: "+notaSoma);
			
			
	}

}
