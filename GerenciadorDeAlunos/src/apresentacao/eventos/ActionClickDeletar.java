package apresentacao.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import apresentacao.Conteudo;

public class ActionClickDeletar implements ActionListener {
	
	private Conteudo conteudo;
	
	public ActionClickDeletar(Conteudo conteudo) {
		this.conteudo = conteudo;
	}
	
	public void actionPerformed(ActionEvent evento) {
		this.conteudo.setConteudoDeletar();
	}
	
}