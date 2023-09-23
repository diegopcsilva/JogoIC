package fuzzyfication;

import conjuntoNebuloso.ConNeb;

public class Fuzzyfication {
	
	private float uPosLivrePeq;
	private float uPosLivreMed;
	private float uPosLivreGra;
	
	private float uDistanciaPeq;
	private float uDistanciaMed;
	private float uDistanciaGra;
	
	public Fuzzyfication(float xPosLivre, float xDistancia) {
		
		ConNeb conNeb = new ConNeb(xPosLivre,xDistancia);
		
		uPosLivrePeq = conNeb.getuPosLivrePeq();
		uPosLivreMed = conNeb.getuPosLivreMed();
		uPosLivreGra = conNeb.getuPosLivreGra();
		
		uDistanciaPeq = conNeb.getuDistanciaPeq();
		uDistanciaMed = conNeb.getuDistanciaMed();
		uDistanciaGra = conNeb.getuDistanciaGra();
	}

	public float getuPosLivrePeq() {
		return uPosLivrePeq;
	}

	public void setuPosLivrePeq(float uPosLivrePeq) {
		this.uPosLivrePeq = uPosLivrePeq;
	}

	public float getuPosLivreMed() {
		return uPosLivreMed;
	}

	public void setuPosLivreMed(float uPosLivreMed) {
		this.uPosLivreMed = uPosLivreMed;
	}

	public float getuPosLivreGra() {
		return uPosLivreGra;
	}

	public void setuPosLivreGra(float uPosLivreGra) {
		this.uPosLivreGra = uPosLivreGra;
	}

	public float getuDistanciaPeq() {
		return uDistanciaPeq;
	}

	public void setuDistanciaPeq(float uDistanciaPeq) {
		this.uDistanciaPeq = uDistanciaPeq;
	}

	public float getuDistanciaMed() {
		return uDistanciaMed;
	}

	public void setuDistanciaMed(float uDistanciaMed) {
		this.uDistanciaMed = uDistanciaMed;
	}

	public float getuDistanciaGra() {
		return uDistanciaGra;
	}

	public void setuDistanciaGra(float uDistanciaGra) {
		this.uDistanciaGra = uDistanciaGra;
	}

}
