package apresentacao;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import apresentacao.menutopo.MenuTopo;

import controle.Gerenciador;

public class Tela extends JFrame {

	public Tela(Gerenciador gerenciador) {
		this.setLayout(new BorderLayout());
		
		JogoContainer jogoContainer = new JogoContainer(gerenciador);
		this.add(jogoContainer, BorderLayout.CENTER);
		
		this.add(new MenuTopo(gerenciador, jogoContainer), BorderLayout.NORTH);
		
		this.setTitle("Aspiradores ao resgate!");
		this.setSize(800, 600);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}
