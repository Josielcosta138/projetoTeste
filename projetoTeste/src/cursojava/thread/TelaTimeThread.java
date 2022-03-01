package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaTimeThread extends JDialog  { 
	
	private JPanel jPanel = new JPanel(new GridBagLayout()); // Painel de componentes
	
	private JLabel descricaoHora = new JLabel(" Time Thread 1");
	
	public TelaTimeThread() { // Executa o que estiver dentro no momento da execução
		
		setTitle("Time com Thread !");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		
		GridBagConstraints  gridBagConstraints = new GridBagConstraints(); // Controlodar de poscicao de componentes
		
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		
		descricaoHora.setPreferredSize(new Dimension( 200, 25));
		jPanel.add(descricaoHora, gridBagConstraints);
		 
		 
		add(jPanel, BorderLayout.WEST);
		// Sempre sera o ultimo comando
		setVisible(true); // Torna a tela visivel para o usuario
	}

}
