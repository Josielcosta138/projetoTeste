package pacoteteste;

public class ArrayVetor {
	
	public static void main(String[] args) {
		
		/* Array pode ser de todos tipos de Objetos */
		/* Array sempre tem que ter posições Definindas [0], [1].... */
		double[] notas = new double[4];
		
		notas[2] = 7.7;
		notas[1] = 3.9;
		notas[3] = 9.8;
		notas[0] = 5;
		
		
			for (double pos : notas) {
				
			System.out.println(" Array:  "+pos);
			
		}
	}

}
