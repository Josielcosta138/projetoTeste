package pacoteteste;

import javax.swing.JOptionPane;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

import pacoteclasses.Aluno;

public class ArrayVetor {
	
	public static void main(String[] args) {
		
		// CRIAÇÃO DO ALUNO
		Aluno aluno = new Aluno();
		aluno.setNome(" Asdrubol ");
		aluno.setNomeEscola(" SATC ");
		
		// CRIAÇÃO DA DICIPLINA
		Diciplina diciplina = new Diciplina();
		diciplina.setDiciplina(" Curso Java");
		
		Diciplina diciplina2 = new Diciplina();
		diciplina2.setDiciplina(" Curso Banco Dados");
		
		double[] notas = {8,7.7,8,9};
		diciplina.setNota(notas);
		
		double[] notas2 = {6,9,4,1};
		diciplina2.setNota(notas2);
		
		aluno.getDiciplinas().add(diciplina);
		aluno.getDiciplinas().add(diciplina2);
			
			System.out.println(" Aluno: "+aluno.getNome());
			
			
			for (Diciplina disc : aluno.getDiciplinas()) {
				System.out.println(" DICIPLINAS ALUNO--------------");
				
				System.out.println(" Diciplina :"+disc.getDiciplina());
				
					System.out.println(" ");
					System.out.println(" NOTAS ALUNO--------------");
						for (int i = 0; i < disc.getNota().length; i++) {
						System.out.println(" Notas "+(i +1 )+"°: "+disc.getNota()[i]);
					
				}
			}
			
			
		
			/*
		System.out.println(" Aluno :"+aluno.getNome()+"\n"
				+ " Escola: "+aluno.getNomeEscola()+"\n"
						+ " Diciplina: "+diciplina.getDiciplina());
		
		for (int i = 0; i < notas.length; i++) {
			
			System.out.println(" Notas: "+diciplina.nota[i]);
		}
		
		System.out.println(" ");
		
		System.out.println(" Aluno :"+aluno.getNome()+"\n"
				+ " Escola: "+aluno.getNomeEscola()+"\n"
						+ " Diciplina 2: "+diciplina2.getDiciplina());
		
		
		for (int j = 0; j < notas2.length; j++) {
			
			System.out.println(" Notas 2: "+diciplina.notas2[j]);
			
		}*/
		
		System.out.println(" Notas média: "+diciplina2.getMediaNotas());
	}	
	

}
