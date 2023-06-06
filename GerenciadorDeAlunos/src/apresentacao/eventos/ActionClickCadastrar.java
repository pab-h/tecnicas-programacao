package apresentacao.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import apresentacao.Conteudo;

public class ActionClickCadastrar implements ActionListener {
	
	private Conteudo conteudo;
	
	public ActionClickCadastrar(Conteudo conteudo) {
		this.conteudo = conteudo;
	}
	
	public void actionPerformed(ActionEvent evento) {
		this.conteudo.setConteudoCadastrar();
	}
	
}