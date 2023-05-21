package questao17;

public class Tabuleiro {
	private char[][] grid;
	private int linhas;
	private int colunas;
	
	public Tabuleiro(int linhas, int colunas) {
		this.grid = new char[linhas][colunas];
		this.linhas = linhas;
		this.colunas = colunas;
		
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				this.grid[i][j] = ' ';
			}
		}
		
	}
	
	public char getSimbolo(int linha, int coluna) {
		return this.grid[linha][coluna];
	}
	
	public int getLinhas() {
		return this.linhas;
	}

	public int getColunas() {
		return this.colunas;
	}

	public void setSimboloEm(int linha, int coluna, char simbolo) throws ArrayIndexOutOfBoundsException {
		this.grid[linha][coluna] = simbolo;
	}
	
	public char[][] getGrid() {
		return this.grid.clone();
	}
	
	public boolean linhaComSimbolosIguais(int linha) {
		boolean iguais = true;
		
		char primeiroSimbolo = this.grid[linha][0];
		
		for (int j = 1; j < this.colunas; j++) {
			if (this.grid[linha][j] != primeiroSimbolo) {
				return false;
			}
		}
		
		return iguais;
	}
	
	public boolean colunaComSimbolosIguais(int coluna) {
		boolean iguais = true;
		
		char primeiroSimbolo = this.grid[0][coluna];
		
		for (int i = 1; i < this.linhas; i++) {
			if (this.grid[i][coluna] != primeiroSimbolo) {
				return false;
			}
		}
		
		return iguais;
	}
	
	public boolean diagonalPrincipalComSimbolosIguais() {
		boolean iguais = true;
		
		char primeiroSimbolo = this.grid[0][0];
		
		for (int i = 1; i < this.linhas; i++) {
			if (this.grid[i][i] != primeiroSimbolo) {
				return false;
			}
		}
		
		return iguais;
	}
	
	public boolean diagonalSecundariaComSimbolosIguais() {
		boolean iguais = true;
		
		char primeiroSimbolo = this.grid[0][this.colunas - 1];
		
		for (int i = 1; i < this.linhas; i++) {
			if (this.grid[i][this.colunas - i - 1] != primeiroSimbolo) {
				return false;
			}
		}
		
		return iguais;
	}
	
	public boolean tabuleiroCheio() {
		for (int i = 0; i < this.linhas; i++) {
			for (int j = 0; j< this.colunas; j ++) {
				if (this.grid[i][j] == ' ') {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public String toString() {
		String out = "";
		
		for (int i = 0; i < this.linhas; i++) {
			for (int j = 0; j < this.colunas; j++) {
				out += this.grid[i][j] + "\t";
			}
			
			out += (i + 1) + "\n";
		}
		
		out += "\n1\t 2\t 3\t#";
		
		return out;
	}
	
}
