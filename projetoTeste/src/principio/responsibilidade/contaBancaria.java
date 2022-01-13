package principio.responsibilidade;

public class contaBancaria {
	
	private String descricao;
	
	private double saldo = 1800;
	
		public void soma100Reais() {
		saldo += 100;
	}
		public void subtrair100Reais() {
		saldo -= 100;	
	}
		// Sacar
		public void sacarDinheiro(double saque) {
		saldo -= saque;
	}
		// Depositar
		public void depositarDinheiro(double depositar) {
			saldo += depositar;
		}
		
		
		public double getSaldo() {
			return saldo;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		@Override
		public String toString() {
			return " ContaBancaria [descricao= " + descricao + ", saldo= " + saldo + "]";
		}
		
		

}
