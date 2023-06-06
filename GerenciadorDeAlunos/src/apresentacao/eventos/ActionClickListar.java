package apresentacao.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import apresentacao.Conteudo;

public class ActionClickListar implements ActionListener {
	
	private Conteudo conteudo;
	
	public ActionClickListar(Conteudo conteudo) {
		this.conteudo = conteudo;
	}
	
	public void actionPerformed(ActionEvent evento) {
		conteudo.setConteudoListar();
	}
	
}
