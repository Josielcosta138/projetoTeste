package pacoteteste;

import pacoteclasses.Aluno;
import pacoteclasses.Diretor;
import pacoteclasses.Pessoa;
import pacoteclasses.Secretario;

public class TestandoClassesFilhas {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome(" Alu Josiel");
		aluno.setIdade(16);
		
		
		Diretor diretor = new Diretor();
		diretor.setNome(" Dir Joao ");
		diretor.setIdade(58);
		
		
		Secretario secretario = new Secretario();
		secretario.setNome(" Sec Bruna ");
		secretario.setIdade(19);
		
		
		/*aluno.maiorIdade();
		diretor.maiorIdade();
		secretario.maiorIdade();
		
		System.out.println(aluno.getNome());
		System.out.println(aluno.msgMaiorIdade());
		System.out.println(" "+aluno.salario());
		
		System.out.println(diretor.getNome());
		System.out.println(diretor.msgMaiorIdade());
		System.out.println(" "+diretor.salario());
		
		System.out.println(secretario.getNome());
		System.out.println(secretario.msgMaiorIdade());	
		System.out.println(" "+secretario.salario());*/
		
		teste(aluno);
		teste(secretario);
		teste(diretor);
		
	}
	
	public static void teste (Pessoa pessoa) {
		System.out.println("Metodo Pessoa Teste "+pessoa.getNome()+""
				+ " Sal�rio: "+pessoa.salario());
		
		
	}

}
