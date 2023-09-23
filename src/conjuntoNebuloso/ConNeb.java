package conjuntoNebuloso;



public class ConNeb {
	
	private float uPosLivrePeq;
	private float uPosLivreMed;
	private float uPosLivreGra;
	
	private float uDistanciaPeq;
	private float uDistanciaMed;
	private float uDistanciaGra;
	
	public ConNeb(float xPosLivre, float xDistancia){
		
		if (xPosLivre <= 5) 			     uPosLivrePeq = 1f;
		if (xPosLivre > 5 && xPosLivre < 11)  uPosLivrePeq = (11f-xPosLivre)/6f;
		if (xPosLivre >= 11)			  		 uPosLivrePeq = 0f;
	
/*		if (xPosLivre <= 4) 				   setuPosLivreMed(0f);
		if (xPosLivre > 4 && xPosLivre <= 8)   setuPosLivreMed((xPosLivre-4f)/4f);
		if (xPosLivre > 8 && xPosLivre <= 10)  setuPosLivreMed(1f);
		if (xPosLivre > 10 && xPosLivre <= 14) setuPosLivreMed((14f-xPosLivre)/4f);
		if (xPosLivre > 14)					   setuPosLivreMed(0f);*/
		//xPosLivre <= 4
		if (xPosLivre <= 0) 				   setuPosLivreMed(0f);
		if (xPosLivre > 0 && xPosLivre <= 8)   setuPosLivreMed((xPosLivre)/8f);
		if (xPosLivre > 8 && xPosLivre <= 13)  setuPosLivreMed(1f);
		if (xPosLivre > 13 && xPosLivre <= 20) setuPosLivreMed((20f-xPosLivre)/7f);
		if (xPosLivre > 20)					   setuPosLivreMed(0f);
		
/*		if (xPosLivre <= 12) 				   uPosLivreGra = 0f;
		if (xPosLivre > 12 && xPosLivre <= 18) uPosLivreGra = (xPosLivre-12f)/6f;
		if (xPosLivre > 18)					   uPosLivreGra = 1f;*/
		
		if (xPosLivre <= 10) 				   uPosLivreGra = 0f;
		if (xPosLivre > 10 && xPosLivre <= 15) uPosLivreGra = (xPosLivre-10f)/5f;
		if (xPosLivre > 15)					   uPosLivreGra = 1f;
		
		
		
/*		if (xDistancia <= 3)				  uDistanciaPeq = 1f;
		if (xDistancia > 3 && xDistancia < 5) uDistanciaPeq = (3f-xDistancia)/2f;
		if (xDistancia >= 5)				  uDistanciaPeq = 0f;
		*/
		//modificação, ampliação das margens
		if (xDistancia <= 4)				  uDistanciaPeq = 1f;
		if (xDistancia > 4 && xDistancia < 16) uDistanciaPeq = (16f-xDistancia)/12f;
		if (xDistancia >= 16)				  uDistanciaPeq = 0f;
		
/*		if (xDistancia <= 4)				    setuDistanciaMed(0f);
		if (xDistancia >  4 && xDistancia <= 19) setuDistanciaMed((xDistancia-4f)/15f);
		if (xDistancia > 19 && xDistancia <= 22) setuDistanciaMed(1f);
		if (xDistancia > 22 && xDistancia < 24) setuDistanciaMed((24f-xDistancia)/2f);
		if (xDistancia >= 24)				    setuDistanciaMed(0f);*/
		//modificação, ampliação das margens
		if (xDistancia <= 1)				    setuDistanciaMed(0f);
		if (xDistancia >  1 && xDistancia <= 14) setuDistanciaMed((xDistancia-1f)/13f);
		if (xDistancia > 14 && xDistancia <= 22) setuDistanciaMed(1f);
		if (xDistancia > 22 && xDistancia < 24) setuDistanciaMed((24f-xDistancia)/2f);
		if (xDistancia >= 24)				    setuDistanciaMed(0f);
		
/*		if (xDistancia <= 21) 				    uDistanciaGra = 0f;
		if (xDistancia > 21 && xDistancia < 26) uDistanciaGra = (xDistancia-21f)/5f;
		if (xDistancia >= 26)				    uDistanciaGra = 1f;*/
		//modificação, ampliação das margens
		if (xDistancia <= 16) 				    uDistanciaGra = 0f;
		if (xDistancia > 16 && xDistancia < 26) uDistanciaGra = (xDistancia-16f)/10f;
		if (xDistancia >= 26)				    uDistanciaGra = 1f;
		
/*		System.out.println("Pertinência Pos Peq "+uPosLivrePeq);
		System.out.println("Pertinência Pos Med "+uPosLivreMed);
		System.out.println("Pertinência Pos Gra "+uPosLivreGra);
		System.out.println("Pertinência Dist Peq "+uDistanciaPeq);
		System.out.println("Pertinência Dist Med "+uDistanciaMed);
		System.out.println("Pertinência Dist Gra "+uDistanciaGra);*/

	}
	
	public  float passoLongo(float u){
		return (u*10)+9;
	}
	
	public  float passoCurto(float u){
		return -1*(u*10-10);
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
