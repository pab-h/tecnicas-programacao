package plano;

import robos.RoboAbstrato;

import alunos.Aluno;

import bugs.Bug;

import java.util.ArrayList;

public class Celula {

	public int id;
	public int x;
	public int y;
	
	public ArrayList<RoboAbstrato> robos;	
	public Aluno aluno;
	public Bug bug;
	
	public Celula(int id, int x , int y) {
		this.id = id;

		this.x = x;
		this.y = y;
		
		this.robos = new ArrayList<RoboAbstrato>();
	}
	
	public String toString() {
		String out = "";
		
		for (RoboAbstrato roboAbstrato : this.robos) {
			out += roboAbstrato;
		}
		
		if (this.aluno != null) {
			out += "A";
		}
		
		if (this.bug != null) {
			out += "B";
		}
		
		if (out == "") {
			out += "0";
		}
		
		return out;
	}
	
	
}
