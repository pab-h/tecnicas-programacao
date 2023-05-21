package questao13;

public class ControleRemoto {
	
	private Dispositivo dispositivo;
	
	public ControleRemoto(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}
	
	public void aumentarVolume() {
		this.dispositivo.setVolume(this.dispositivo.getVolume() + 1);
	}
	
	public void diminurVolume() {
		this.dispositivo.setVolume(this.dispositivo.getVolume() - 1);
	}
	
	public void aumentarCanal() {
		this.dispositivo.setCanal(this.dispositivo.getCanal() + 1);
	}
	
	public void diminuirCanal() {
		this.dispositivo.setCanal(this.dispositivo.getCanal() - 1);
	}
	
	public int getVolume() {
		return this.dispositivo.getVolume();
	}
	
	public int getCanal() {
		return this.dispositivo.getCanal();
	}
	
	public void setCanal(int canal) {
		this.dispositivo.setCanal(canal);
	}
	
	public void mutar() {
		this.dispositivo.setVolume(0);
	}
	
}
