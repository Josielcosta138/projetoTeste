package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

// S�mente receber o contrato da interface de permiss�o de Acesso e chamar o autenticar
public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;
	
		public boolean autenticar() {
			return permitirAcesso.autenticar();
		}
		
		public FuncaoAutenticacao( PermitirAcesso acesso) {
			this.permitirAcesso = acesso;
			
		}

}
