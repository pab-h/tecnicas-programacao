package apresentacao.conteudos.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import apresentacao.conteudos.Cadastrar;

public class ActionClickCadastrar implements ActionListener {
	
	private Cadastrar cadastrar;
	
	public ActionClickCadastrar(Cadastrar cadastrar) {
		this.cadastrar = cadastrar;
	}
	
	public void actionPerformed(ActionEvent evento) {
		
		System.out.println(this.cadastrar.getNome().getValor());
		System.out.println(this.cadastrar.getCpf().getValor());
		System.out.println(this.cadastrar.getMatricula().getValor());
		System.out.println(this.cadastrar.getVertente().getValor());
		
		this.cadastrar.getNome().limpaValor();
		this.cadastrar.getCpf().limpaValor();
		this.cadastrar.getMatricula().limpaValor();
		this.cadastrar.getVertente().limpaValor();
		
	}
	
}