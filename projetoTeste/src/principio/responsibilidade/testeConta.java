package principio.responsibilidade;

import javax.swing.JOptionPane;


public class testeConta {

	public static void main(String[] args) {
		
		contaBancaria bancaria = new contaBancaria();
		bancaria.setDescricao(" Conta Josiel ");
		
		JOptionPane.showMessageDialog(null, " Banco Santander \n"
				+ " "+bancaria);
		
		//bancaria.subtrair100Reais(); 
		//bancaria.soma100Reais();
		
			// Depósito
			String depositoString = JOptionPane.showInputDialog(null, " Informe valor de Depósito? ");
			double depositoDouble = Double.parseDouble(depositoString);
			
					bancaria.depositarDinheiro(depositoDouble);	
					JOptionPane.showMessageDialog(null, " Saldo atual: "+bancaria); 
			
			// Saque 	
			String saqueString = JOptionPane.showInputDialog(null, " Informe valor de Saque? ");
			double saqueDouble = Double.parseDouble(saqueString);
			
					bancaria.sacarDinheiro(saqueDouble);	
					JOptionPane.showMessageDialog(null, " Saldo atual: "+bancaria);
	}

}



