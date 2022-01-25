package pacoteteste;

import java.awt.Container;
import java.nio.file.attribute.PosixFileAttributes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.text.Position;

import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.statusAluno;
import cursojava.interfaces.PermitirAcesso;
import pacoteclasses.Aluno;
import pacoteclasses.Secretario;

public class estruturaDeclaracao {

	
	public static void main(String[] args) {

		// New Aluno() é uma instancia ( Criação de Objeto ) cria na memória do Java
		// aluno1 é uma referencia ao objeto Aluno6
		
		String login = JOptionPane.showInputDialog(" Informe seu Login? ");
		String senha = JOptionPane.showInputDialog(" Informe sua Senha? ");
		
		PermitirAcesso permitirAcesso = new Secretario(login, senha);
		
		//new FuncaoAutenticacao(permitirAcesso).autenticar()
			
			if (new Secretario().autenticar(login, senha)) {
				
					
		List<Aluno> alunos = new ArrayList<Aluno>();
		
			// Uma Lista com uma chave de Identificação
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		 
		 
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
		
		  
		
		  //For para criar Lista de Notas e Diciplinas
		for (int pos = 1; pos <= aluno1.getQtddiciplina(); pos++) {
			
			String nomeDiciplina =JOptionPane.showInputDialog(" Informe a diciplina "+pos+"°?");
			String notaDiciplina =JOptionPane.showInputDialog(" Informe a nota "+pos+"°?");
			
				//Instacia o Objeto
				Diciplina diciplina = new Diciplina();
				diciplina.setDiciplina(nomeDiciplina);
				diciplina.setNota(Double.valueOf(notaDiciplina)); //transformou String em Double
			
			aluno1.getDiciplinas().add(diciplina); // adicionou a Lista de diciplinas
		}
		
		// Cria um objeto HashMap chamado Status dos Alunos
			maps.put(statusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(statusAluno.APROVADOACIMAMEDIA, new ArrayList<Aluno>());
			maps.put(statusAluno.RECUPERACAO, new ArrayList<Aluno>());
			maps.put(statusAluno.REPROVADO, new ArrayList<Aluno>());
		
			alunos.add(aluno1); // Adicionando a o aluno1 a Lista de (alunos) 				
		} 
		 	
			for (Aluno aluno : alunos) {  // Processando e adicionando aluno na lista ( Aprovados ,Acima Média, Recuperção )
		 		
		 		if (aluno.getAlunoAprovado().equalsIgnoreCase(statusAluno.APROVADO) ) {
					maps.get(statusAluno.APROVADO).add(aluno);
					
				}else {
					if (aluno.getAlunoAprovado().equalsIgnoreCase(statusAluno.APROVADOACIMAMEDIA)) {
						maps.get(statusAluno.APROVADOACIMAMEDIA).add(aluno);
						
					}else {
						if (aluno.getAlunoAprovado().equalsIgnoreCase(statusAluno.RECUPERACAO)) {
							maps.get(statusAluno.RECUPERACAO).add(aluno);
							
						}else {
							if (aluno.getAlunoAprovado().equalsIgnoreCase(statusAluno.REPROVADO)) {
								maps.get(statusAluno.REPROVADO).add(aluno);
								
								
							}	// if reprovado
						} // if recuperaçao
					} // if acima media
				} // if aprovado
				
			} // if For aluno
		 	
		 	
			// Mostrando Listas de Alunos
		 	System.out.println("------------------- Lista Aprovados ----------------");
		 	for (Aluno aluno : maps.get(statusAluno.APROVADO)) {
		 		System.out.println(" ");
				System.out.println( " Aluno "+aluno.getNome() );
				System.out.println(" Média: "+aluno.getMediaNota());
				System.out.println(" Resultado: "+aluno.getAlunoAprovado());
				
				for (int posList = 0; posList < aluno.getDiciplinas().size(); posList++) {
					   Diciplina disc = aluno.getDiciplinas().get(posList);
						System.out.println(" Diciplinas: "+disc.getDiciplina()+" nota: "+disc.getNota());
				}
		 	}
		 	System.out.println("--------------------------------------");
		 	
		 	System.out.println("----------------- Lista Acima da Média -----------------");
		 	for (Aluno aluno : maps.get(statusAluno.APROVADOACIMAMEDIA)) {
		 		System.out.println(" ");
				System.out.println(" Aluno "+aluno.getNome());
				System.out.println(" Média: "+aluno.getMediaNota());
				System.out.println(" Resultado: "+aluno.getAlunoAprovado());
				
				for (int posList = 0; posList < aluno.getDiciplinas().size(); posList++) {
					   Diciplina disc = aluno.getDiciplinas().get(posList);
						System.out.println(" Diciplinas: "+disc.getDiciplina()+" nota: "+disc.getNota());
				}
			}
		 	System.out.println("--------------------------------------");
		 	
		 	System.out.println("-------------------- Lista Recuperação --------------------------");
		 	for (Aluno aluno : maps.get(statusAluno.RECUPERACAO)) {
		 		System.out.println(" ");
		 		System.out.println(" Aluno "+aluno.getNome());
		 		System.out.println(" Média: "+aluno.getMediaNota());
				System.out.println(" Resultado: "+aluno.getAlunoAprovado());
		 		
		 		for (int posList = 0; posList < aluno.getDiciplinas().size(); posList++) {
					   Diciplina disc = aluno.getDiciplinas().get(posList);
						System.out.println(" Diciplinas: "+disc.getDiciplina()+" nota: "+disc.getNota());
				}
			}
		 	System.out.println("--------------------------------------");
		 	
		 	System.out.println("----------------- Lista Reprovado ---------------------------");
		 	for (Aluno aluno : maps.get(statusAluno.REPROVADO)) {
		 		System.out.println(" ");
		 		System.out.println(" Aluno "+aluno.getNome());
		 		System.out.println(" Média: "+aluno.getMediaNota());
				System.out.println(" Resultado: "+aluno.getAlunoAprovado());
		 		
		 		for (int posList = 0; posList < aluno.getDiciplinas().size(); posList++) {
					   Diciplina disc = aluno.getDiciplinas().get(posList);
						System.out.println(" Diciplinas: "+disc.getDiciplina()+" nota: "+disc.getNota());
				}
		 		
		 		
		 		}
		 	
				
		 	// if login
		
			} else {
				
						JOptionPane.showMessageDialog(null, " Senha ou Login Invalido! ");
					
					}
			}
		}
	
		 	
     
	

