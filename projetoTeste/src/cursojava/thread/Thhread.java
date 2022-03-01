package cursojava.thread;

import javax.swing.JOptionPane;

public class Thhread {

	public static void main(String[] args) throws InterruptedException {

		
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		
		Thread threadNota = new Thread(thread2);
		threadNota.start();

			System.out.println(" Chegou ao fim o teste da Thread! ");
			
				// Fluxo do Sistem, Cadastro de venda etc...
				JOptionPane.showMessageDialog(null, " Aguarde...\n"
				+ " Dados sendo processado ! ");

		
	}

	// Thread processando em paralelo
	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {
		
			// Código da rotina para executar Paralelo
			for (int i = 0; i < 15; i++) {

					System.out.println(" Executando rotina: E-mail . " + i);

				try {
					
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} // 1seg * 1000
				
				
			}
			// Fim do código paralelo

		}
	};

	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {
			
			// Código da rotina para executar Paralelo
			for (int i = 0; i < 15; i++) {

				// Executar esse envio com tempo determinado
				System.out.println(" Enviando Nota Fiscal ... " + i);

				try {
					
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} // 1seg * 1000
				
			}
			
			JOptionPane.showMessageDialog(null, " Fim.\n"
					+ " Venda Encerrada !");
			// Fim do código paralelo

		}
	};

}
