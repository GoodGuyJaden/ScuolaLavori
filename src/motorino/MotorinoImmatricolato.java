package motorino;

import java.util.Random;

public class MotorinoImmatricolato {

	final String alfa = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String colore;
	private float velocità;
	private String tipo;
	private boolean antifurto = false;
	private float maxVelocità;
	private String targa;

	public MotorinoImmatricolato(String colore, String tipo, float maxVelocità) {
		this.colore = colore;
		this.tipo = tipo;
		this.maxVelocità = maxVelocità;
		targa = setTarga();
	}

	public float getVelocità() {
		return velocità;
	}

	public boolean getAntifurto()
	{
		return antifurto;
	}
	public void accelera(float velocità) {
		if (!antifurto && (this.velocità+velocità) <= maxVelocità) {
			this.velocità += velocità;
		}

	}

	public float getMaxVelocità() {
		return maxVelocità;
	}

	public void setAntifurto(boolean antifurto) {
		if (velocità == 0) {
			this.antifurto = antifurto;
		}

	}

	private String setTarga() {
		Random r = new Random();
		String targa = "";

		targa += alfa.charAt(r.nextInt(alfa.length()));
		targa += alfa.charAt(r.nextInt(alfa.length()));

		for (int i = 0; i < 5; i++) {
			targa += r.nextInt(9);
		}
		return targa;
	}

	@Override
	public String toString() {
		return "MotorinoImmatricolato [colore=" + colore + ", velocità=" + velocità + ", tipo=" + tipo + ", antifurto="
				+ antifurto + ", maxVelocità=" + maxVelocità + ", targa=" + targa + "]";
	}
	

}
