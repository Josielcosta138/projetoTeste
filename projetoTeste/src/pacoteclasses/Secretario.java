package pacoteclasses;

import cursojava.interfaces.PermitirAcesso;


// Classe Filha de Pessoas
public class Secretario extends Pessoa implements PermitirAcesso  {
	
	private String registro;
	private String nivelCargo;
	private String experiencia;
	private String login;
	private String senha;
	
	
	public Secretario(String login, String senha) {
		this.login = login;		// senha e login da classe Secret�rio
		this.senha = senha;
	}
	
	public Secretario() {
		// TODO Auto-generated constructor stub CONSTRUTOR PAD�RO
	}

	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
	
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}
	
	public String msgMaiorIdade() {
		return this.maiorIdade() ? " Maior Idade " : " Menor Idade"; // Verifica��o Se?   Senao:
			
		}
		
	@Override
	public boolean maiorIdade() {
		
		return idade >= 34;
		
	}
	@Override
	public double salario() {
		
		return 1500.00;
	}
	
	
	// M�todo do contrato de Autentifica��o
	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;  // login ir� Receber o login do Parametro dentro do m�todo
		this.senha = senha;
		return autenticar();
	}
		public boolean autenticar() {
		return login.equalsIgnoreCase("janice27")&&senha.equalsIgnoreCase("janice");
	}
	
	
}
