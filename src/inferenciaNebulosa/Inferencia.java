package inferenciaNebulosa;

import defuzzyfication.Defuzzyfication;
//import defuzzyfication2.Defuzzy;
import regrasNebulosas.RegrasNebu;
//import regrasNebulosas2.RegNebu;

public class Inferencia {
	
	float w1;
	float w2;
	float w3;
	float w4;
	float w5;
	float w6;
	float w7;
	float w8;
	float w9;
	
	
	RegrasNebu rn = new RegrasNebu();
	
	float passo;
	
	public Inferencia(float uPassoPeq, float uPassoMed, float uPassoGra, float uDistanciaPeq, float uDistanciaMed, float uDistanciaGra){
		
		w1 = rn.w1(uPassoGra, uDistanciaGra);
		w2 = rn.w2(uPassoMed, uDistanciaGra);
		w3 = rn.w3(uPassoPeq, uDistanciaGra);
		w4 = rn.w4(uPassoGra, uDistanciaMed);
		w5 = rn.w5(uPassoMed, uDistanciaMed);
		w6 = rn.w6(uPassoPeq, uDistanciaMed);
		w7 = rn.w7(uPassoGra, uDistanciaPeq);
		w8 = rn.w8(uPassoMed, uDistanciaPeq);
		w9 = rn.w9(uPassoPeq, uDistanciaPeq);
		
/*		System.out.println("Mínimo Zadeh w1 "+w1);
		System.out.println("Mínimo Zadeh w2 "+w2);
		System.out.println("Mínimo Zadeh w3 "+w3);
		System.out.println("Mínimo Zadeh w4 "+w4);
		System.out.println("Mínimo Zadeh w5 "+w5);
		System.out.println("Mínimo Zadeh w6 "+w6);
		System.out.println("Mínimo Zadeh w7 "+w7);
		System.out.println("Mínimo Zadeh w8 "+w8);
		System.out.println("Mínimo Zadeh w9 "+w9);*/
		
		//Defuzzyfication df = new Defuzzyfication( w1, w2, w3, w4, w5, w6, w7, w8, w9);
		
		//passo = df.getPasso();
		
	}
	public float getPasso() {
		return passo;
	}

	public void setPasso(float passo) {
		this.passo = passo;
	}
	public float getW1() {
		return w1;
	}
	public void setW1(float w1) {
		this.w1 = w1;
	}
	public float getW2() {
		return w2;
	}
	public void setW2(float w2) {
		this.w2 = w2;
	}
	public float getW3() {
		return w3;
	}
	public void setW3(float w3) {
		this.w3 = w3;
	}
	public float getW4() {
		return w4;
	}
	public void setW4(float w4) {
		this.w4 = w4;
	}
	public float getW5() {
		return w5;
	}
	public void setW5(float w5) {
		this.w5 = w5;
	}
	public float getW6() {
		return w6;
	}
	public void setW6(float w6) {
		this.w6 = w6;
	}
	public float getW7() {
		return w7;
	}
	public void setW7(float w7) {
		this.w7 = w7;
	}
	public float getW8() {
		return w8;
	}
	public void setW8(float w8) {
		this.w8 = w8;
	}
	public float getW9() {
		return w9;
	}
	public void setW9(float w9) {
		this.w9 = w9;
	}
}
