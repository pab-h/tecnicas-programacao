package apresentacao.tabuleiro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import apresentacao.Icone;

import controle.Gerenciador;
import controle.aspiradorvirtual.AspiradorVirtual;

public class CliqueNaCelula implements ActionListener {

	private Gerenciador gerenciador;
	private Celula celula;
	
	public CliqueNaCelula(Gerenciador gerenciador, Celula celula) {
		this.gerenciador = gerenciador;
		this.celula = celula;
	}
	
	public void actionPerformed(ActionEvent e) {
		AspiradorVirtual aspiradorVirtual = gerenciador.getAspiradorVirtualSelecionado();
		
		if (aspiradorVirtual == null) {
			JOptionPane.showMessageDialog(
				null, 
				"Selecione um aspirador para posicionar", 
				"Erro!", 
				JOptionPane.ERROR_MESSAGE
			);
			
			return;
		}
		
		aspiradorVirtual.setCelulaVirtualAtual(this.celula.getCelulaVirtual());
		this.celula.getCelulaVirtual().setAspiradorVirtual(aspiradorVirtual);
		
		Icone iconeAspiradorVirtual = new Icone(aspiradorVirtual.getImagem());
		this.celula.setIcon(iconeAspiradorVirtual.getIcon(50, 50));
		
		this.gerenciador.setAspiradorVirtualSelecionado(null);
	}

	
	
}
