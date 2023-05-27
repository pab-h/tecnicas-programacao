package jogo;

import alunos.Aluno;
import plano.Plano;
import robos.Andador;
import robos.Bispo;
import robos.Cavalo;
import robos.Peao;
import robos.Rainha;

public class Main {

	public static void main(String[] args) {

		Plano plano = new Plano(4, 4);
		
		Aluno aluno = new Aluno(plano.getCelula(0, 0));
		Cavalo robo = new Cavalo(plano, plano.getCelula(1, 1));
		
		System.out.println(plano);
		robo.avancar();
		
		System.out.println(plano);
		robo.retroceder();
		
		System.out.println(plano);
		System.out.println(robo.getPontuacao());

	}
	
}
