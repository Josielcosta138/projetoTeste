package pacoteclasses;

import java.util.ArrayList;
import java.util.List;

// Classe - Objeto que representa o Aluno 
public class Aluno {
	
	// Atributos da classe Aluno
	private String nome;
	private int idade;
	private String cpf;
	private String telefone;
	private String dataMatricula;
	private String dataNascimento;
	private String registroGeral;
	private String nomeMae;
	private String nomePai;
	private String nomeEscola;
	private String seriaMatriculado;
	
	
	// Cria método Aluno - sendo padrão Java
		public Aluno () {
		}
		
			
	// Instancia Objeto na memória - Tipo Lista 
	private List<Diciplina> diciplinas = new ArrayList<Diciplina>();

	// Setters e Getters de diciplinas
	public void setDiciplinas(List<Diciplina> diciplinas) {
		this.diciplinas = diciplinas;
	}
	
	public List<Diciplina> getDiciplinas() {
		return diciplinas;
	}
	
	
	
	// Métodos GETTERS and SETTERS
	// SET para receber ou adicionar dados no Atributos
	// GET para resgatar ou obter valor do Atributo
	// Receber dados
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
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
		return " Parabens Acima da Média";
		
		}else if (media >= 7) {			
			return " Aprovado";	
					
				
		}else if (media < 7 && media > 5) {
				return " Aluno em Recuperação ";
			
		}else { 
				return" Reprovado";
		}	

	}
	
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", telefone=" + telefone
				+ ", dataMatricula=" + dataMatricula + ",\n"
				+ " dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", nomeMae=" + nomeMae + ", \n"
				+ "nomePai=" + nomePai + ", nomeEscola=" + nomeEscola
				+ ", seriaMatriculado=" + seriaMatriculado + ", diciplinas=" + diciplinas + "]";
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


	

	
	
	
	
	
	
	
	
	// Método verificação da Média Com String
		/*public String getAlunoAprovado2 () {
			double media = this.getMediaNota();
			
			
			if (media >= 7) {			
				return " Aluno Aprovado! ";
				
		 
			} else {			
				return " Aluno Reprovado! ";
			
			}
			
		}*/
	
	
}
