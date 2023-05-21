package questao5;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Contato> contatos;
	private String nome;
	private String descricao;
	
	public Agenda(String nome, String descricao, ArrayList<Contato> contatos) {
		this.nome = nome;
		this.descricao = descricao;
		this.contatos = contatos;
	}
	
	public Agenda(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
		this.contatos = new ArrayList<Contato>();
	}
	
	public void adicionaContato(Contato contato) {
		this.contatos.add(contato);
	}
	
	public String toString() {
		String info = "";
		
		info += "Agenda: " + this.nome + "\n";
		info += "Descricao:" + this.descricao + "\n";
		
		for (Contato contato : this.contatos) {
			info += contato.toString() + "\n";
		}
		
		return info;
	}
	
}
