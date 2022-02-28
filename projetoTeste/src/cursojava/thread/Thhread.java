package cursojava.thread;

public class Thhread {
	
	public static void main(String[] args) throws InterruptedException {
		
		for (int i = 0; i < 10; i++) {
			
			
			// Executar esse envio com tempo determinado
			System.out.println(" Executando rotina: E-mail. "+i);
			Thread.sleep(1000); // 1seg * 1000
		}
		
			System.out.println(" Chegou ao fim o teste da Thread! ");
	}
	
}
