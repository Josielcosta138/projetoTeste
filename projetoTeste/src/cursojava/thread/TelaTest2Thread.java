package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import sun.net.www.content.image.jpeg;

public class TelaTest2Thread extends JDialog {
	
	private JPanel jPanel = new JPanel(new GridBagLayout()); // painel de componentes
	
	private JLabel HoraEntrada = new JLabel( " Time Entrada ");
	private JTextField mostraHora = new JTextField();
	
	private JLabel HoraSaida = new JLabel(" Time Saida ");
	private JTextField mostraHora2 = new JTextField();
	
	//private JButton jButton = new JButton("Start Ent");
	//private JButton jButton2 = new JButton("Stop Sai");
	
	public TelaTest2Thread() {
		
		setTitle(" Hora Entrada ");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		System.out.println(" Mostrando Tela ");
		

		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;	//(top, left, bottom, righ)	
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = gridBagConstraints.WEST;
		
		
		// ==== HORA ENTRADA =====
		HoraEntrada.setPreferredSize(new Dimension(200, 25));
		jPanel.add(HoraEntrada, gridBagConstraints);
		
		mostraHora.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		mostraHora.setEditable(false);
		jPanel.add(mostraHora, gridBagConstraints);
		
		
		// ==== HORA SAIDA =====
		HoraSaida.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(HoraSaida, gridBagConstraints);
		
		mostraHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		mostraHora2.setEditable(false);
		jPanel.add(mostraHora2, gridBagConstraints);
		
		
		// Retornando espaço do gerenciador para 1 = Start e Stop
		 gridBagConstraints.gridwidth = 1;
		
		
		// =========== MOSTRA A TELA PARA O USUÁRIO =========
		add(jPanel, BorderLayout.WEST);
		setVisible(true);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
