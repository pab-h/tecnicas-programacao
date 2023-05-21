package questao18;

public final class Robo extends Entidade {
	private Plano plano;
	
	private int passosDados;
	
	private int passosNorte; 
	private int passosSul;
	private int passosLeste; 
	private int passosOeste;
	private int passosNordeste; 
	private int passosSudeste;
	private int passosSudoeste; 
	private int passosNoroeste;
	
	public Robo(Plano plano, Celula celulaAtual) {
		super("R", celulaAtual);
		
		this.plano = plano;
		this.getCelulaAtual().setRobo(this);
		
		this.passosDados = 0;
		this.passosNorte = 0;
		this.passosSul = 0;
		this.passosLeste = 0;
		this.passosOeste = 0;
		this.passosNordeste = 0;
		this.passosSudeste = 0;
		this.passosSudoeste = 0; 
		this.passosNoroeste = 0;
		
	}

	public boolean mover(int x, int y) {
		try {
			Celula destino = this.plano.getCelula(x, y);
			
			this.getCelulaAtual().setRobo(null);
			destino.setRobo(this);
			this.setCelulaAtual(destino);
	
			return true;
		} catch (Exception e) {
			return false;
		}		
	}
	
	public boolean moverNorte() {
		boolean resultado = this.mover(this.getCelulaAtual().getX() - 1, this.getCelulaAtual().getY());
		
		if (resultado) {
			this.passosDados++;
			this.passosNorte++;
		}
		
		return resultado;
	}
	
	public boolean moverSul() {
		boolean resultado = this.mover(this.getCelulaAtual().getX() + 1, this.getCelulaAtual().getY());
		
		if (resultado) {
			this.passosDados++;
			this.passosSul++;
		}
		
		return resultado;
	}
	
	public boolean moverLeste() {
		boolean resultado = this.mover(this.getCelulaAtual().getX(), this.getCelulaAtual().getY() + 1);
		
		if (resultado) {
			this.passosDados++;
			this.passosLeste++;
		}
		
		return resultado;
	}
	
	public boolean moverOeste() {
		boolean resultado = this.mover(this.getCelulaAtual().getX(), this.getCelulaAtual().getY() - 1);
		
		if (resultado) {
			this.passosDados++;
			this.passosOeste++;
		}
		
		return resultado;
	}
	
	public boolean moverNordeste() {
		boolean resultado = this.mover(this.getCelulaAtual().getX() - 1, this.getCelulaAtual().getY() + 1);
		
		if (resultado) {
			this.passosDados++;
			this.passosNordeste++;
		}
		
		return resultado;
	}
	
	public boolean moverSudeste() {
		boolean resultado = this.mover(this.getCelulaAtual().getX() + 1, this.getCelulaAtual().getY() + 1);
		
		if (resultado) {
			this.passosDados++;
			this.passosSudeste++;
		}
		
		return resultado;
	}
	
	public boolean moverSudoeste() {
		boolean resultado = this.mover(this.getCelulaAtual().getX() + 1, this.getCelulaAtual().getY() - 1);
		
		if (resultado) {
			this.passosDados++;
			this.passosSudoeste++;
		}
		
		return resultado;
	}
	
	public boolean moverNoroeste() {
		boolean resultado = this.mover(this.getCelulaAtual().getX() - 1, this.getCelulaAtual().getY() - 1);
		
		if (resultado) {
			this.passosDados++;
			this.passosSudoeste++;
		}
		
		return resultado;
	}
		
}
