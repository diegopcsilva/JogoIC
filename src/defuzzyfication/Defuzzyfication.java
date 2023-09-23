package defuzzyfication;

import conjuntoNebuloso.ConNeb;

public class Defuzzyfication {

	float v1;
	float v2;
	float v3;
	float v4;
	float v5;
	float v6;
	float v7;
	float v8;
	float v9;
	
	float passo;
	
	ConNeb conNeb = new ConNeb(1,1);
	
	public Defuzzyfication(float w1,float w2,float w3,float w4, float w5,float w6,float w7,float w8,float w9){
		
		//v1 = (w1*10)+9;
		v1 = conNeb.passoLongo(w1);
		//v2 = -(w2*10)-10;
		v2 = conNeb.passoLongo(w2);
		//v3 = (w3*10)+9;
		v3 = -((w3*10)-10);
		//v3 = conNeb.passoCurto(w3);
		//v4 = -(w4*10)-10;
		v4 = conNeb.passoLongo(w4);
		//System.out.println(v4);
		//v4 = (float) Math.min(12, (Math.pow((1-w4)/w4, 2)*1.5+7));
		//System.out.println(v4);
		//v5 = -(w5*10-10);
		//v5 = 15-w5*5;
		v5 = conNeb.passoCurto(w5);
		//System.out.println(v5);
		//v5 = (float)  Math.min(12,(Math.pow((1-w5)/w5, 2)*1.5+7));
		//System.out.println(v5);
		//v5 = (w5*10)+9;
		//v6 = -(w6*10-10);
		//v6 =  w6*5+5;
		v6 = conNeb.passoCurto(w6);
		//v3 = (w3*10)+9;
		v7 = conNeb.passoCurto(w7);
		//v4 = (w4*10)+9;
		v8 = conNeb.passoCurto(w8);
		
		v9 = conNeb.passoCurto(w9);
		
/*		System.out.println("Defuzzy v1 "+v1);
		System.out.println("Defuzzy v2 "+v2);
		System.out.println("Defuzzy v3 "+v3);
		System.out.println("Defuzzy v4 "+v4);
		System.out.println("Defuzzy v5 "+v5);
		System.out.println("Defuzzy v6 "+v6);
		System.out.println("Defuzzy v7 "+v7);
		System.out.println("Defuzzy v8 "+v8);
		System.out.println("Defuzzy v9 "+v9);*/
		
		passo = (w1*v1 + w2*v2 + w3*v3 + w4*v4 + w5*v5 + w6*v6 + w7*v7 + w8*v8 + w9*v9) / (w1+w2+w3+w4+w5+w6+w7+w8+w9);
	}

	public float getPasso() {
		return passo;
	}

	public void setPasso(float passo) {
		this.passo = passo;
	}
	
}
