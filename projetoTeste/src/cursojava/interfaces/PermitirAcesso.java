package cursojava.interfaces;

//Essa interface ser� o contrato de autentica��o
public interface PermitirAcesso {
	
		// Apenas declara��o do M�todo
	public boolean autenticar ();

	boolean autenticar(String login, String senha);
	
	

}
