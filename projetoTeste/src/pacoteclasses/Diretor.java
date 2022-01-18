package pacoteclasses;

//Classe Filha de Pessoas
public class Diretor extends Pessoa {
	
	
	// private: proíbe qualquer acesso externo à própria classe, inclusive das classes filhas.

	private String registroEducacao;
	private int tempoDirecao;
	private String titulacao;
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + ", nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", dataNascimento="
				+ dataNascimento + ", registroGeral=" + registroGeral + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ "]";
	}

	
	public String msgMaiorIdade() {
		return this.maiorIdade() ? " Maior Idade " : " Menor Idade"; // Verificação Se?   Senao:
			
		}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 4560.00;
	}
	
	
}
