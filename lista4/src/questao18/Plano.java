package questao18;

public final class Plano {
	private Celula[][] grid;
	private int tamanho;
	
	public Plano(int tamanho){
		this.tamanho = tamanho;
		
		this.grid = new Celula[this.tamanho][this.tamanho];
		
		for (int i = 0; i < this.tamanho; i ++) {
			for (int j = 0; j < this.tamanho; j++) {
				this.grid[i][j] = new Celula(i, j);
			}
		}
		
	}
	
	public int getTamanho() {
		return this.tamanho;
	}
	
	public Celula getCelula(int x, int y) {
		return this.grid[x][y];
	}
	
	public String toString() {
		String out = "";
		
		for (int i = 0; i < this.tamanho; i++) {
			for (int j = 0; j < this.tamanho; j++) {
				out += "\t" + this.grid[i][j];
			}
			out += "\n";
		}

		
		return out;
	}
	
}
