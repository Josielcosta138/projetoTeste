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

		Diciplina diciplina3 = new Diciplina();
		diciplina3.setDiciplina(" Calculo");

		double[] notas = { 8, 7.7, 8, 9 };
		diciplina.setNota(notas);

		double[] notas2 = { 6, 5, 1.99, 2 };
		diciplina2.setNota(notas2);

		double[] notas3 = { 6.5, 8.9, 6.4, 10 };
		diciplina3.setNota(notas3);

		aluno.getDiciplinas().add(diciplina);
		aluno.getDiciplinas().add(diciplina2);
		aluno.getDiciplinas().add(diciplina3);

		System.out.println(" Aluno: " + aluno.getNome());

		for (Diciplina disc : aluno.getDiciplinas()) {
			System.out.println(" DICIPLINAS ALUNO--------------");

			System.out.println(" Diciplina :" + disc.getDiciplina());

			System.out.println(" ");

			double maior = 0.0;
			double menor = 10.0;

			for (int i = 0; i < disc.getNota().length; i++) {
				System.out.println(" Notas " + (i + 1) + "°: " + disc.getNota()[i]);

				
				// MAIOR NOTA
				if (disc.getNota()[i] == 0) {

					maior = disc.getNota()[i];
					diciplina.setMaior(maior);

				} else {
					
					if (disc.getNota() [i] > maior) {

						maior = disc.getNota()[i];
						diciplina.setMaior(maior);

					}
				}
				
				// MENOR NOTA
				if (disc.getNota()[i] == 0) {

					menor = disc.getNota()[i];
					diciplina.setMenor(menor);

				} else {
					
					if (disc.getNota() [i] < menor) {

						menor = disc.getNota()[i];
						diciplina.setMenor(menor);

					}
				}
				
				

			}
			
			System.out.println(" ");
			System.out.println(" Maior nota da Diciplina: "+disc.getDiciplina()+" "+ diciplina.getMaior());
			System.out.println(" ");
			
			
			System.out.println(" Menor nota da Diciplina: "+disc.getDiciplina()+" "+ diciplina.getMenor());
			System.out.println(" ");
		}

		/*
		 * System.out.println(" Aluno :"+aluno.getNome()+"\n" +
		 * " Escola: "+aluno.getNomeEscola()+"\n" +
		 * " Diciplina: "+diciplina.getDiciplina());
		 * 
		 * for (int i = 0; i < notas.length; i++) {
		 * 
		 * System.out.println(" Notas: "+diciplina.nota[i]); }
		 * 
		 * System.out.println(" ");
		 * 
		 * System.out.println(" Aluno :"+aluno.getNome()+"\n" +
		 * " Escola: "+aluno.getNomeEscola()+"\n" +
		 * " Diciplina 2: "+diciplina2.getDiciplina());
		 * 
		 * 
		 * for (int j = 0; j < notas2.length; j++) {
		 * 
		 * System.out.println(" Notas 2: "+diciplina.notas2[j]);
		 * 
		 * }
		 */

		System.out.println(" Média de totas Diciplinas: " + diciplina2.getMediaNotas());
	}

}
