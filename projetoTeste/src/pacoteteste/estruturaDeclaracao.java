package pacoteteste;

import java.nio.file.attribute.PosixFileAttributes;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.text.Position;

import pacoteclasses.Aluno;
import pacoteclasses.Diciplina;

public class estruturaDeclaracao {

	public static void main(String[] args) {

		// New Aluno() é uma instancia ( Criação de Objeto ) cria na memória do Java
		// aluno1 é uma referencia ao objeto Aluno
		
		
		
		// Lista dos Alunos
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		 
		 //String qtdAlunos = JOptionPane.showInputDialog(" Quantos alunos na sala? ");
		// aluno1.setQtdAlunos(Integer.valueOf(qtdAlunos));
		 
		 	for (int posAlunos = 1; posAlunos <= 2; posAlunos++) {
			
		 	// Inicializando Objeto 		
			Aluno aluno1 = new Aluno();
					
		// Entradas de Dados para os Atributos Aluno	
     	String nome = JOptionPane.showInputDialog(" Informe nome? "+posAlunos+"°");
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
			
			String nomeDiciplina =JOptionPane.showInputDialog(" Informe a diciplina "+pos+"°?");
			String notaDiciplina =JOptionPane.showInputDialog(" Informe a nota "+pos+"°?");
			
				//Instacia o Objeto
				Diciplina diciplina = new Diciplina();
				diciplina.setDiciplina(nomeDiciplina);
				diciplina.setNota(Double.valueOf(notaDiciplina)); //transformou String em Double
			
			aluno1.getDiciplinas().add(diciplina); // adicionou a Lista de diciplinas
		
		}
				
		/* Removendo Diciplina 
		int escolha = JOptionPane.showConfirmDialog(null, " Deseja excluir alguma Diciplina? ");
						
			if (escolha == 0) {	// Opção Sim = 0 
					
				int continuarRemover = 0;
				int posicao = 1;
				
				while (continuarRemover == 0) {				
					
					JOptionPane.showMessageDialog(null, " Listas de Diciplinas: "+aluno1.getDiciplinas());
					
				String diciplinaRemover = JOptionPane.showInputDialog(" Informe qual diciplina irá excluir"
						+ " 1 ,2 ,3 ou 4? ");	
				//Chamando na lista da Diciplina					// Posiçção na Lista [0], [1], [2], [3]  por isso (  - 1  )
				aluno1.getDiciplinas().remove(Integer.valueOf(diciplinaRemover).intValue() - posicao );
				posicao ++;
				continuarRemover = JOptionPane.showConfirmDialog(null, " Continuar a Remover? ");	
				
				}// while		
			}*/
		 
			
			alunos.add(aluno1); // Adicionando a o aluno1 a Lista de (alunos) 	
			
		   } // Percorrendo Lista pelas Posições
		 	
		   for (int pos = 0; pos < alunos.size(); pos++) {
			   
			   System.out.println(" ");
			   
			   	Aluno aluno = alunos.get(pos);   
			   	
			   	// Substituindo um Aluno na Lista
			   	if (aluno.getNome().equalsIgnoreCase("Jose")) {
			   		
			   		Aluno alunoTrocar = new Aluno();   // Novo Objeto alunoTrocar 
			   		alunoTrocar.setNome(" Bruna Troca");
			   		
			   		Diciplina disciplina = new Diciplina();	// Novo Objeto disciplina
			   		disciplina.setDiciplina(" Arquitetura Software");
			   		disciplina.setNota(9);
			   		
			   		alunoTrocar.getDiciplinas().add(disciplina);
			   		alunos.set(pos, alunoTrocar);	// Adiciona o alunoTrocar na pos da Lista de alunos
			   		
			   		aluno = alunos.get(pos); // aluno = recebendo alunoTrocra
			   		
				}
			   
			   		System.out.println(" Aluno: "+aluno.getNome());
			   
			   for (int posList = 0; posList < aluno.getDiciplinas().size(); posList++) {
				   Diciplina disc = aluno.getDiciplinas().get(posList);
					System.out.println(" Diciplinas: "+disc.getDiciplina()+" nota: "+disc.getNota());
			}
			   
			   System.out.println(" Média: "+aluno.getMediaNota());
			   System.out.println(" Resultado: "+aluno.getAlunoAprovado());
			   
				
		  }
		}
     }
	

