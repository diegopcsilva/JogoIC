package regrasNebulosas;

public class RegrasNebu {

	public float w1(float uPassoGra, float uDistanciaGra){
		
		return Math.min(uPassoGra, uDistanciaGra);
	}	
	public float w2(float uPassoMed, float uDistanciaGra){
		
		return Math.min(uPassoMed, uDistanciaGra);
	}
	public float w3(float uPassoPeq, float uDistanciaGra){
		
		return Math.min(uPassoPeq, uDistanciaGra);
	}
	
	
	
	public float w4(float uPassoGra, float uDistanciaMed){
		
		return Math.min(uPassoGra, uDistanciaMed);
	}
	
	public float w5(float uPassoMed, float uDistanciaMed){
		
		return Math.min(uPassoMed, uDistanciaMed);
	}
	public float w6(float uPassoPeq, float uDistanciaMed){
		
		return Math.min(uPassoPeq, uDistanciaMed);
	}
	
	
	
	public float w7(float uPassoGra, float uDistanciaPeq){
		
		return Math.min(uPassoGra, uDistanciaPeq);
	}
	
	public float w8(float uPassoMed, float uDistanciaPeq){
		
		return Math.min(uPassoMed, uDistanciaPeq);
	}
	public float w9(float uPassoPeq, float uDistanciaPeq){
		
		return Math.min(uPassoPeq, uDistanciaPeq);
	}
	
}
