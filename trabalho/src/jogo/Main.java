package jogo;

import alunos.Aluno;
import plano.Plano;
import robos.Andador;
import robos.Peao;

public class Main {

	public static void main(String[] args) {

		Plano plano = new Plano(4, 4);
		
		Aluno aluno = new Aluno(plano.getCelula(0, 0));
		Peao robo = new Peao(plano, plano.getCelula(1, 0));
		
		System.out.println(plano);
		robo.avancar();
		
		System.out.println(plano);
		robo.retroceder();
		
		System.out.println(plano);
		System.out.println(robo.getPontuacao());

	}
	
}
