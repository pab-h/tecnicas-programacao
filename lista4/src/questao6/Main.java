package questao6;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Ingresso> ingressos = new ArrayList<Ingresso>();
		
		ingressos.add(new Ingresso(100));
		ingressos.add(new Ingresso(100));
		ingressos.add(new Ingresso(100));
		
		Evento evento = new Evento(ingressos);
		
		System.out.println(evento.comprarIngresso());
		System.out.println(evento.comprarIngresso());
		
		System.out.println(evento.getTotalVendidos());
		
		ArrayList<Ingresso> ingressosVip = new ArrayList<Ingresso>();
		
		ingressosVip.add(new Ingresso(100));
		ingressosVip.add(new Ingresso(100));
		ingressosVip.add(new Ingresso(100));
		
		Evento eventoVip = new Evento(ingressosVip);
		
		System.out.println(eventoVip.comprarIngresso());
		System.out.println(eventoVip.comprarIngresso());
		
		System.out.println(eventoVip.getTotalVendidos());
		
		
	}
	
}
