package questao6;

import java.util.ArrayList;

public class Evento {
	private ArrayList<Ingresso> ingressosDisponiveis;
	private ArrayList<Ingresso> ingressosVendidos;
	
	public Evento(ArrayList<Ingresso> ingressos) {
		this.ingressosDisponiveis = ingressos;
		this.ingressosVendidos = new ArrayList<Ingresso>();
	}
	
	public Ingresso comprarIngresso() throws Error {
		if (this.ingressosDisponiveis.isEmpty()) {
			throw new Error("Os ingressos acabaram");
		}
		
		Ingresso ingresso = this.ingressosDisponiveis.remove(0);
		
		this.ingressosVendidos.add(ingresso);
		
		return ingresso;
	}
	
	public float getTotalVendidos() {
		float total = 0;
		
		for (Ingresso ingresso : this.ingressosVendidos) {
			total += ingresso.getValor();
		}
		
		return total;
	}
	
	public Ingresso[] getIngressosAtuais() {
		return (Ingresso[]) this.ingressosDisponiveis.clone();
	}
	
}
