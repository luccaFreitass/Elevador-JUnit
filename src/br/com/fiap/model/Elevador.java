package br.com.fiap.model;

public class Elevador {

	private int id;
	private double cargaMax;
	private double cargaAtual;
	private boolean sinalAlerta;
	private Calculadora calculadora = new Calculadora();
	
	

	public Elevador(double cargaMax, double cargaAtual, boolean sinalAlerta) {
		
		this.cargaMax = cargaMax;
		this.cargaAtual = cargaAtual;
		this.sinalAlerta = sinalAlerta;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCargaMax() {
		return cargaMax;
	}

	public void setCargaMax(double cargaMax) {
		this.cargaMax = cargaMax;
	}

	public double getCargaAtual() {
		return cargaAtual;
	}

	public void setCargaAtual(double cargaAtual) {
		this.cargaAtual = cargaAtual;
	}

	public boolean isSinalAlerta() {
		return sinalAlerta;
	}

	public void setSinalAlerta(boolean sinalAlerta) {
		this.sinalAlerta = sinalAlerta;
	}

	public boolean avaliarpeso() {

		boolean alerta;
		if (cargaAtual > cargaMax) {
			alerta = true;
		} else {
			alerta = false;
		}
		return alerta;
	}
	
	public double entrarNoElevador(double peso) {
		return calculadora.somar(cargaAtual, peso);
	}
	
	public double sairDoElevador(double peso) {
		return calculadora.subtrair(cargaAtual, peso);
	}
	
	

}
