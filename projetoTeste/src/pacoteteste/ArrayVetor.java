package pacoteteste;

import javax.swing.JOptionPane;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

import pacoteclasses.Aluno;

public class ArrayVetor {
	
	public static void main(String[] args) {
		
		// CRIA��O DO ALUNO
		Aluno aluno = new Aluno();
		aluno.setNome(" Asdrubol ");
		aluno.setNomeEscola(" SATC ");
		
		// CRIA��O DA DICIPLINA
		Diciplina diciplina = new Diciplina();
		diciplina.setDiciplina(" Curso Java");
		
		double[] notas = {8,7.7,8,9};
		diciplina.setNota(notas);
		
		aluno.getDiciplinas().add(diciplina);
		
		System.out.println(" Aluno :"+aluno.getNome()+"\n"
				+ " Escola: "+aluno.getNomeEscola()+"\n"
						+ " Diciplina: "+diciplina.getDiciplina());
		
		for (int i = 0; i < notas.length; i++) {
			
			System.out.println(" Notas: "+diciplina.nota[i]);
		
		}
		System.out.println(" Notas m�dia: "+diciplina.getMediaNotas());
	}	
	

}
