package pacoteclasses;

import cursojava.interfaces.PermitirAcesso;

// Classe Filha de Pessoas
public class Secretario extends Pessoa implements PermitirAcesso {
	
	private String registro;
	private String nivelCargo;
	private String experiencia;
	
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
		return this.maiorIdade() ? " Maior Idade " : " Menor Idade"; // Verificação Se?   Senao:
			
		}
		
	@Override
	public boolean maiorIdade() {
		
		return idade >= 34;
		
	}
	@Override
	public double salario() {
		
		return 1500.00;
	}
	
	
	// Método do contrato de Autentificação
	
	@Override
	public boolean autenticar(String login, String senha) {
		return login.equalsIgnoreCase("janice27") && senha.equalsIgnoreCase("janice37");
	}
	
	
	@Override
	public boolean autenticar() {
		return false;
	}
	
	
	

}
