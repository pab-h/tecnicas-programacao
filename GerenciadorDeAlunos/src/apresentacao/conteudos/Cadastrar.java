package apresentacao.conteudos;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import apresentacao.conteudos.eventos.ActionClickCadastrar;

public class Cadastrar extends JPanel {

	private Campo nome;
	private Campo cpf;
	private Campo matricula;
	private Campo vertente;
	
	public Cadastrar() {
		this.setLayout(new GridLayout(5, 1, 0, 10));
		
		this.nome = new Campo("Nome:"); 
		this.add(this.nome);
		
		this.cpf = new Campo("CPF:");
		this.add(this.cpf);
		
		this.matricula = new Campo("Matrícula:");
		this.add(this.matricula);
		
		this.vertente = new Campo("Vertente:");
		this.add(this.vertente);
		
		JButton cadastrarButton = new JButton("Cadastrar");
		
		cadastrarButton.addActionListener(new ActionClickCadastrar(this));
		
		this.add(cadastrarButton);
		
	}

	public Campo getNome() {
		return this.nome;
	}

	public Campo getCpf() {
		return this.cpf;
	}

	public Campo getMatricula() {
		return this.matricula;
	}

	public Campo getVertente() {
		return this.vertente;
	}
	
}
