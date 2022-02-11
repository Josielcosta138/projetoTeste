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
		diciplina.setDiciplina(" Curso Banco Dados");
		
		double[] notas = {8,7.7,8,9};
		diciplina.setNota(notas);
		
		double[] notas2 = {6,9,4,1};
		
		aluno.getDiciplinas().add(diciplina2);
		aluno.getDiciplinas().add(diciplina);
		
		
		System.out.println(" Aluno :"+aluno.getNome()+"\n"
				+ " Escola: "+aluno.getNomeEscola()+"\n"
						+ " Diciplina: "+diciplina.getDiciplina());
		
		for (int i = 0; i < notas.length; i++) {
			
			System.out.println(" Notas: "+diciplina.nota[i]);
		}
		
		System.out.println(" ");
		
		System.out.println(" Aluno :"+aluno.getNome()+"\n"
				+ " Escola: "+aluno.getNomeEscola()+"\n"
						+ " Diciplina: "+diciplina2.getDiciplina());
		
		for (int j = 0; j < notas2.length; j++) {
			
			System.out.println(" Notas 2: "+diciplina2.nota[j]);
			
		}
		System.out.println(" Notas média: "+diciplina2.getMediaNotas());
	}	
	

}
