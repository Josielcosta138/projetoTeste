package curso.java.exececao;

public class ExcecaoProcessarNota extends Exception {
	
	public ExcecaoProcessarNota(String erro) {
		super(" Erro ao ler Arquivo! "+erro);
	}
	

}
