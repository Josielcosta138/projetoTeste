package pacoteteste;

import javax.swing.JOptionPane;

public class ArrayVetor {
	
	public static void main(String[] args) {
		
		/* Array pode ser de todos tipos de Objetos */
		/* Array sempre tem que ter posi��es Definindas [0], [1].... */
		
		// INFORMANDO A QNTD DE POSI��ES NO ARRAY
		String posicoes = JOptionPane.showInputDialog(" Informe a qntd de Posi��es? ");
		
			double notaSoma = 0;	
			double[] notas = new double[Integer.parseInt(posicoes)];
			
			
		  // INFORMANDO AS NOTAS NAS POSI��ES
		  for (int pos = 0; pos < notas.length; pos++) {
			
			  String valor = JOptionPane.showInputDialog(" Informe a nota "+ ( pos +1));
			  
			  	notas[pos] =  Double.parseDouble(valor); 
		}
		
		
		  	// EXIBI NA TELA NOTAS E POSI��ES
			for (int pos = 0; pos < notas.length; pos++) {
				
				System.out.println(" Posi��o Array "+ pos +". "+" Nota "+ (pos +1)+"� = " +notas[pos]);
			
		}
		
			// SOMA NOTAS E EXIBI 
				String poS = JOptionPane.showInputDialog(" informe a Posi��o para somar Notas");
				int notaSomar1 =  Integer.parseInt(poS);
				
				String poSs = JOptionPane.showInputDialog(" informe a Posi��o para somar Notas");
				int notaSomar2 =  Integer.parseInt(poSs);
			
						notaSoma = (notas[notaSomar1] + notas[notaSomar2]);
				
								System.out.println(" ");
								System.out.println(" Nota somada: "+notaSoma);
			
	}

}
