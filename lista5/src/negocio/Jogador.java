package negocio;

import java.util.ArrayList;

public class Jogador {

	private String nome;
	private int ultimoNumeroApostado;
	private ArrayList<Integer> numerosApostados;

	public Jogador() {
	    this.numerosApostados = new ArrayList<Integer>();
	    
	}
	
	public void setNome(String nome) {
		this.nome = nome;
		
	}

	public String getNome() {
		return this.nome;
	}

	public int getNumeroTentativa() {
		return this.numerosApostados.size();
	}

	public ArrayList<Integer> getListaNumeros(){
		return this.numerosApostados;
	}
	
	private void addNumeroApostado(int numeroApostado) {
		this.numerosApostados.add(numeroApostado);
	}

	public int getUltimoNumeroApostado() {
		return this.ultimoNumeroApostado;
	}

	public void setUltimoNumeroApostado(int ultimoNumeroApostado) {
		this.addNumeroApostado(ultimoNumeroApostado);
		this.ultimoNumeroApostado = ultimoNumeroApostado;
		
	}
	
}
