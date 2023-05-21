package questao18;

public final class Celula {
	private Moeda moeda;
	private Robo robo;
	private int x;
	private int y;
	private boolean roboPassou;
	
	public Celula(int x, int y) {
		this.x = x;
		this.y = y;
		
		this.moeda = null;
		this.robo = null;
		this.roboPassou = false;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setRobo(Robo robo) {
		this.robo = robo;
		this.roboPassou = true;
	}
	
	public void setMoeda(Moeda moeda) {
		this.moeda = moeda;
	}
	
	public String toString() {
		String out = " ";
		
		if (this.robo != null) {
			out += this.robo.getSimbolo();
		}
		
		if (this.moeda != null) {
			out += this.moeda.getSimbolo();
		}
		
		if (this.roboPassou) {
			out += "+"; 
		}
		
		if (out.equals(" ")) {
			out = ".";
		}
		
		
		return out;
	}
	
}
