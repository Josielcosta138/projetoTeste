package pacoteclasses;

import java.util.ArrayList;
import java.util.List;

import cursojava.constantes.statusAluno;
import pacoteteste.Diciplina;

// Classe - Objeto que representa o Aluno 
//Classe Filha de Pessoas
public class Aluno extends Pessoa {
	
	// Atributos da classe Aluno
	private String nomeEscola;
	private String seriaMatriculado;
	private String dataMatricula;
	private int qtdAlunos;
	private int qtddiciplina;
	List<Diciplina> diciplinas = new ArrayList<Diciplina>();// Instancia Objeto na memória - Tipo Lista 

		// Cria método Aluno - sendo padrão Java
		public Aluno () {
		}
		
			
	// Setters e Getters de diciplinas
	public void setDiciplinas(List<Diciplina> diciplinas) {
		this.diciplinas = diciplinas;
	}
	
	public List<Diciplina> getDiciplinas() {
		return diciplinas;
	}
	
	
	public int getQtdAlunos() {
		return qtdAlunos;
	}

	public void setQtdAlunos(int qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}

	
	public int getQtddiciplina() {
		return qtddiciplina;
	}

	public void setQtddiciplina(int qtddiciplina) {
		this.qtddiciplina = qtddiciplina;
	}

	
	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	
	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSeriaMatriculado() {
		return seriaMatriculado;
	}

	public void setSeriaMatriculado(String seriaMatriculado) {
		this.seriaMatriculado = seriaMatriculado;
	}
	
		
	// Método que Retorna a media do aluno
			public double getMediaNota () {
				
				// Inicialando variavel
				double somaNotas = 0.0;
				
				// fOR para percorrer a Lista de diciplinas 	
				for (Diciplina diciplina : diciplinas) {
					
					somaNotas += diciplina.getNota();//somando Notas					
				}				
				
				// Dividindo retorno das diciplinas for inseridas na Lista
				return somaNotas /diciplinas.size(); 
			}
	
		
	// Método verificação da Média
	public String getAlunoAprovado () {
		double media = this.getMediaNota();
		
	
		if (media >= 9) {			
		return statusAluno.APROVADOACIMAMEDIA;
		
		}else if (media >= 7) {			
			return statusAluno.APROVADO;	
					
				
		}else if (media < 7 && media > 5) {
				return statusAluno.RECUPERACAO;
			
		}else { 
				return statusAluno.REPROVADO;
		}	

	}
	
	
	@Override
	public String toString() {
		return "Aluno [nomeEscola=" + nomeEscola + ", seriaMatriculado=" + seriaMatriculado + ", dataMatricula="
				+ dataMatricula + ", qtdAlunos=" + qtdAlunos + ", qtddiciplina=" + qtddiciplina + ", diciplinas="
				+ diciplinas + ", nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", dataNascimento="
				+ dataNascimento + ", registroGeral=" + registroGeral + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	@Override // Indentifica o método Sobrescrito
	public boolean maiorIdade() {
		return idade >= 40;
	}
	
	public String msgMaiorIdade() {
		return this.maiorIdade() ? " Maior Idade " : " Menor Idade"; // Verificação Se?   Senao:
			
		}
	
	}
	

