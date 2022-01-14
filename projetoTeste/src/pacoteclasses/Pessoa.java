package pacoteclasses;

// ClassePai SuperClasse ClasseMaster (Atributos comun a Todos Objetos
public class Pessoa {
	
	// Atributos da classe Aluno
		protected String nome;
		protected int idade;
		protected String cpf;
		protected String dataNascimento;
		protected String registroGeral;
		protected String nomeMae;
		protected String nomePai;
		
		
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
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
		
		@Override
		public String toString() {
			return "Pessoa [nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento
					+ ", registroGeral=" + registroGeral + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
		}
		
		

		
}
