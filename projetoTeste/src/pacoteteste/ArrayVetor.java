package pacoteteste;

import javax.swing.JOptionPane;

public class ArrayVetor {
	
	public static void main(String[] args) {
		
		
			String[] nomes = new String[3];
			String[] dadoFixo =  {"Joao@gmail.com ", "Bruna@gmail.com", "Asdrubol@gmail.com", "2022"};
			
			
				nomes[2] = " Joao ";
				nomes[1] = " Bruna ";
				nomes[0] = " Aspdrubol ";
		
				// EXIBIÇÃO ARRAY DE NOMES
				for (int pos = 0; pos < nomes.length; pos++) {
					
					System.out.println(" Posição do Array  "+(pos +1)+"° : Nome:"+nomes[pos]);
				}
				System.out.println(" ");
				
				// EXIBIÇÃO ARRAY DE DADOSFIXO
				for (int j = 0; j < dadoFixo.length; j++) {
				
					System.out.println(" Posição do Array  "+(j +1)+"° : Dados fixos: "+dadoFixo[j]);
				}
				
		/* Array pode ser de todos tipos de Objetos */
		/* Array sempre tem que ter posições Definindas [0], [1].... */
		
		// INFORMANDO A QNTD DE POSIÇÕES NO ARRAY
				/*
		String Qntdposicoes = JOptionPane.showInputDialog(" Informe a qntd de Posições? ");
		
			double notaSoma = 0;	
			double[] notas = new double[Integer.parseInt(Qntdposicoes)];
			
			
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
				String pos1 = JOptionPane.showInputDialog(" informe a Posição para somar Notas");
				int notaSomar1 =  Integer.parseInt(pos1);
				
				String pos2 = JOptionPane.showInputDialog(" informe a Posição para somar Notas");
				int notaSomar2 =  Integer.parseInt(pos2);
			
						notaSoma = (notas[notaSomar1] + notas[notaSomar2]);
				
								System.out.println(" ");
								System.out.println(" Nota somada: "+notaSoma);
			*/
	}	

}
