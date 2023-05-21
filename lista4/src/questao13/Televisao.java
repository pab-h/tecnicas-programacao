package questao13;

public class Televisao implements Dispositivo {
	
	private int volume;
	private int canal;
	
	public Televisao() {
		this.volume = 0;
		this.canal = 0;
	}

	public int getVolume() {
		return this.volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getCanal() {
		return this.canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	
	
}
