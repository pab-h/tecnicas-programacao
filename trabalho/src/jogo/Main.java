package jogo;

import alunos.Aluno;
import plano.Plano;
import robos.Andador;

public class Main {

	public static void main(String[] args) {

		Plano plano = new Plano(4, 4);
		
		Aluno aluno = new Aluno(plano.getCelula(0, 0));

//		Andador andadorJoao = new Andador(plano, plano.getCelula(1, 1));
		Andador andadorJonas = new Andador(plano, plano.getCelula(2, 1));
		
		System.out.println(plano);
		
		andadorJonas.avancar();
		
		System.out.println(plano);

	}
	
}
