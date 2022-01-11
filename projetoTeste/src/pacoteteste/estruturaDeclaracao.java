package pacoteteste;

import java.nio.file.attribute.PosixFileAttributes;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.text.Position;

import cursojava.constantes.statusAluno;
import pacoteclasses.Aluno;
import pacoteclasses.Diciplina;

public class estruturaDeclaracao {

	public static void main(String[] args) {

		// New Aluno() � uma instancia ( Cria��o de Objeto ) cria na mem�ria do Java
		// aluno1 � uma referencia ao objeto Aluno6
		
		
		
		// Lista dos Alunos
		List<Aluno> alunos = new ArrayList<Aluno>();
		List<Aluno> alunosAprovado = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovado = new ArrayList<Aluno>();
		List<Aluno> alunosAcimaDaMedia = new ArrayList<Aluno>();
		
		 
		 //String qtdAlunos = JOptionPane.showInputDialog(" Quantos alunos na sala? ");
		// aluno1.setQtdAlunos(Integer.valueOf(qtdAlunos));
		 
		 	for (int posAlunos = 1; posAlunos <= 3; posAlunos++) {
			
		 	// Inicializando Objeto 		
			Aluno aluno1 = new Aluno();
					
		// Entradas de Dados para os Atributos Aluno	
     	String nome = JOptionPane.showInputDialog(" Informe nome? "+posAlunos+"�");
     	String qtddiciplina = JOptionPane.showInputDialog(" Informe qntd diciplinas? ");
     	/*String idade = JOptionPane.showInputDialog(" Informe idade? ");
		String cpf = JOptionPane.showInputDialog(" Informe cpf? ");
		String telefone = JOptionPane.showInputDialog(" Informe telefone? ");
		String matricula = JOptionPane.showInputDialog(" Informe matricula? ");
		String dataNascimento = JOptionPane.showInputDialog(" Informe dataNascimento? ");
		String rg = JOptionPane.showInputDialog(" Informe rg? ");
		String nomeMae = JOptionPane.showInputDialog(" Informe nomeMae? ");
		String nomePai = JOptionPane.showInputDialog(" Informe nomePai? ");
		String escola = JOptionPane.showInputDialog(" Informe escola? ");
		String anoMatricula = JOptionPane.showInputDialog(" Informe anoMatricula? ");*/
		
		
		aluno1.setNome(nome);
		aluno1.setQtddiciplina(Integer.valueOf(qtddiciplina)); // Convertendo String para Inteiro
		/*aluno1.setIdade(Integer.valueOf(idade)); // Convertendo String para Inteiro
		aluno1.setCpf(cpf);
		aluno1.setTelefone(telefone);
		aluno1.setDataMatricula(matricula);
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setNomeEscola(escola);
		aluno1.setSeriaMatriculado(anoMatricula);*/
		
		  
		
		//  For para criar Lista de Notas e Diciplinas
		for (int pos = 1; pos <= aluno1.getQtddiciplina(); pos++) {
			
			String nomeDiciplina =JOptionPane.showInputDialog(" Informe a diciplina "+pos+"�?");
			String notaDiciplina =JOptionPane.showInputDialog(" Informe a nota "+pos+"�?");
			
				//Instacia o Objeto
				Diciplina diciplina = new Diciplina();
				diciplina.setDiciplina(nomeDiciplina);
				diciplina.setNota(Double.valueOf(notaDiciplina)); //transformou String em Double
			
			aluno1.getDiciplinas().add(diciplina); // adicionou a Lista de diciplinas
		
		}
				
		/* Removendo Diciplina 
		int escolha = JOptionPane.showConfirmDialog(null, " Deseja excluir alguma Diciplina? ");
						
			if (escolha == 0) {	// Op��o Sim = 0 
					
				int continuarRemover = 0;
				int posicao = 1;
				
				while (continuarRemover == 0) {				
					
					JOptionPane.showMessageDialog(null, " Listas de Diciplinas: "+aluno1.getDiciplinas());
					
				String diciplinaRemover = JOptionPane.showInputDialog(" Informe qual diciplina ir� excluir"
						+ " 1 ,2 ,3 ou 4? ");	
				//Chamando na lista da Diciplina					// Posi���o na Lista [0], [1], [2], [3]  por isso (  - 1  )
				aluno1.getDiciplinas().remove(Integer.valueOf(diciplinaRemover).intValue() - posicao );
				posicao ++;
				continuarRemover = JOptionPane.showConfirmDialog(null, " Continuar a Remover? ");	
				
				}// while		
			}*/
		 
			
			alunos.add(aluno1); // Adicionando a o aluno1 a Lista de (alunos) 				
		} 
		 	
		 	for (Aluno aluno : alunos) {  // Processando a lista ( Aprovados ,Acima M�dia, Recuper��o )
		 		
		 		if (aluno.getAlunoAprovado().equalsIgnoreCase(statusAluno.APROVADO) ) {
					alunosAprovado.add(aluno);
				}else {
					if (aluno.getAlunoAprovado().equalsIgnoreCase(statusAluno.APROVADOACIMAMEDIA)) {
						alunosAcimaDaMedia.add(aluno);
					}else {
						if (aluno.getAlunoAprovado().equalsIgnoreCase(statusAluno.RECUPERACAO)) {
							alunosRecuperacao.add(aluno);
						}else {
							if (aluno.getAlunoAprovado().equalsIgnoreCase(statusAluno.REPROVADO)) {
								alunosReprovado.add(aluno);
								
							}	// if reprovado
						} // if recupera�ao
					} // if acima media
				} // if aprovado
				
			} // if For aluno
		 	
		 	
		 	System.out.println("------------------- Lista Aprovados ----------------");
		 	for (Aluno aluno : alunosAprovado) {
		 		System.out.println(" ");
				System.out.println( " Aluno "+aluno.getNome() );
				System.out.println(" M�dia: "+aluno.getMediaNota());
				System.out.println(" Resultado: "+aluno.getAlunoAprovado());
				
				for (int posList = 0; posList < aluno.getDiciplinas().size(); posList++) {
					   Diciplina disc = aluno.getDiciplinas().get(posList);
						System.out.println(" Diciplinas: "+disc.getDiciplina()+" nota: "+disc.getNota());
				}
		 	}
		 	System.out.println("--------------------------------------");
		 	
		 	System.out.println("----------------- Lista Acima da M�dia -----------------");
		 	for (Aluno aluno : alunosAcimaDaMedia) {
		 		System.out.println(" ");
				System.out.println(" Aluno "+aluno.getNome());
				System.out.println(" M�dia: "+aluno.getMediaNota());
				System.out.println(" Resultado: "+aluno.getAlunoAprovado());
				
				for (int posList = 0; posList < aluno.getDiciplinas().size(); posList++) {
					   Diciplina disc = aluno.getDiciplinas().get(posList);
						System.out.println(" Diciplinas: "+disc.getDiciplina()+" nota: "+disc.getNota());
				}
			}
		 	System.out.println("--------------------------------------");
		 	
		 	System.out.println("-------------------- Lista Recupera��o --------------------------");
		 	for (Aluno aluno : alunosRecuperacao) {
		 		System.out.println(" ");
		 		System.out.println(" Aluno "+aluno.getNome());
		 		System.out.println(" M�dia: "+aluno.getMediaNota());
				System.out.println(" Resultado: "+aluno.getAlunoAprovado());
		 		
		 		for (int posList = 0; posList < aluno.getDiciplinas().size(); posList++) {
					   Diciplina disc = aluno.getDiciplinas().get(posList);
						System.out.println(" Diciplinas: "+disc.getDiciplina()+" nota: "+disc.getNota());
				}
			}
		 	System.out.println("--------------------------------------");
		 	
		 	System.out.println("----------------- Lista Reprovado ---------------------------");
		 	for (Aluno aluno : alunosReprovado) {
		 		System.out.println(" ");
		 		System.out.println(" Aluno "+aluno.getNome());
		 		System.out.println(" M�dia: "+aluno.getMediaNota());
				System.out.println(" Resultado: "+aluno.getAlunoAprovado());
		 		
		 		for (int posList = 0; posList < aluno.getDiciplinas().size(); posList++) {
					   Diciplina disc = aluno.getDiciplinas().get(posList);
						System.out.println(" Diciplinas: "+disc.getDiciplina()+" nota: "+disc.getNota());
				}
			}
	}
}
		 	
     
	

