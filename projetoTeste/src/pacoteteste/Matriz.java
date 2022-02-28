package pacoteteste;

public class Matriz {

	public static void main(String[] args) {

		// Criando uma Matriz multidimensional

		int notas[][] = new int[2][3];

		notas[0][0] = 30;
		notas[0][1] = 53;
		notas[0][2] = 45;

		notas[1][0] = 453;
		notas[1][1] = 43;
		notas[1][2] = 333;

		for (int posilinha = 0; posilinha < notas.length; posilinha++) { // For p/ Linha
			System.out.println("---------------------------------------");

			for (int poscoluna = 0; poscoluna < notas[posilinha].length; poscoluna++) { // For p/ Coluna

				System.out.println(" Valor" + notas[posilinha][poscoluna]);
			}

		}

	}
}
