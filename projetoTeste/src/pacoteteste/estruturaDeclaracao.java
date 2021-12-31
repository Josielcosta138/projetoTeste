package pacoteteste;

import java.nio.file.attribute.PosixFileAttributes;

import javax.swing.JOptionPane;
import javax.swing.text.Position;

import pacoteclasses.Aluno;
import pacoteclasses.Diciplina;

public class estruturaDeclaracao {

	public static void main(String[] args) {

		// New Aluno() é uma instancia ( Criação de Objeto ) cria na memória do Java
		// aluno1 é uma referencia ao objeto Aluno
		
		// Setando dados nos atributos
		// Inicializando Objeto 
		
		Aluno aluno1 = new Aluno();
		// Entradas de Dados para os Atributos Aluno
			
 	
     	String nome = JOptionPane.showInputDialog(" Informe nome? ");
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
		
		
		//  For para criar Lista de Nota e Diciplina
		for (int pos = 1; pos <= 4; pos++) {
			String nomeDiciplina =JOptionPane.showInputDialog(" Informe a diciplina "+pos+"°?");
			String notaDiciplina =JOptionPane.showInputDialog(" Informe a nota "+pos+"°?");
			
			Diciplina diciplina = new Diciplina();
			diciplina.setDiciplina(nomeDiciplina);
			diciplina.setNota(Double.valueOf(notaDiciplina)); //transformou String em Double
			
			aluno1.getDiciplinas().add(diciplina); // adicionou a Lista de diciplinas
		
		}
				
		// Exibindo com Resultados na Tela com ToString
		System.out.println(" Aluno : " +aluno1+ "\n"
				+ " Media aluno: "+aluno1.getMediaNota()+"\n"
				+ " Resultado: "+aluno1.getAlunoAprovado() );
		
		
		
		
		// Removendo Diciplina 
		int escolha = JOptionPane.showConfirmDialog(null, " Deseja excluir alguma Diciplina? ");
						
			if (escolha == 0) {	// Opção Sim = 0 
					
				int continuarRemover = 0;
				
				while (continuarRemover == 0) {				
					
					JOptionPane.showMessageDialog(null, " Listas de Diciplinas: "+aluno1.getDiciplinas());
					
				String diciplinaRemover = JOptionPane.showInputDialog(" Informe qual diciplina irá excluir"
						+ " 1 ,2 ,3 ou 4? ");	
				
				
				//Chamando na lista da Diciplina								// Posiçção na Lista [0], [1], [2], [3]  por isso (  - 1  )
				aluno1.getDiciplinas().remove(Integer.valueOf(diciplinaRemover).intValue() -1 );
				
				continuarRemover = JOptionPane.showConfirmDialog(null, " Continuar a Remover? ");
				
				
				}// while		
			} else {

				JOptionPane.showMessageDialog(null, " Não exluiu diciplina!");

				
			} 
			
			// Exibindo com Resultados na Tela com ToString4
			System.out.println(" ");
			System.out.println("\n Lista Atualizada: "
					+ " Aluno : " +aluno1+ "\n"
					+ " Media aluno: "+aluno1.getMediaNota()+"\n"
					+ " Resultado: "+aluno1.getAlunoAprovado() );
			
			
			
		
	}
}
