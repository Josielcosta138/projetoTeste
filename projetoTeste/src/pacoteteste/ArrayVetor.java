package pacoteteste;

import javax.swing.JOptionPane;

public class ArrayVetor {
	
	public static void main(String[] args) {
		
		/* Array pode ser de todos tipos de Objetos */
		/* Array sempre tem que ter posições Definindas [0], [1].... */
		
		// INFORMANDO A QNTD DE POSIÇÕES NO ARRAY
		String posicoes = JOptionPane.showInputDialog(" Informe a qntd de Posições? ");
		
			double notaSoma = 0;	
			double[] notas = new double[Integer.parseInt(posicoes)];
			
			
		  // INFORMANDO AS NOTAS NAS POSIÇÕES
		  for (int pos = 0; pos < notas.length; pos++) {
			
			  String valor = JOptionPane.showInputDialog(" Informe a nota "+ ( pos +1));
			  
			  	notas[pos] =  Double.parseDouble(valor); 
		}
		
		
		  	// EXIBI NA TELA NOTAS E POSIÇÕES
			for (int pos = 0; pos < notas.length; pos++) {
				
				System.out.println(" Posição Array "+ pos +". "+" Nota "+ (pos +1)+"° = " +notas[pos]);
			
		}
		
			// SOMA NOTAS E EXIBI 
				String poS = JOptionPane.showInputDialog(" informe a Posição para somar Notas");
				int notaSomar1 =  Integer.parseInt(poS);
				
				String poSs = JOptionPane.showInputDialog(" informe a Posição para somar Notas");
				int notaSomar2 =  Integer.parseInt(poSs);
			
						notaSoma = (notas[notaSomar1] + notas[notaSomar2]);
				
								System.out.println(" ");
								System.out.println(" Nota somada: "+notaSoma);
			
	}

}
