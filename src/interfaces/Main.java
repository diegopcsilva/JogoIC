package interfaces;
//import java.util.*;
//import java.util.ArrayList;
//import java.util.Scanner;

import java.util.Scanner;

import conjuntoNebuloso.ConNeb;
import defuzzyfication.Defuzzyfication;
import fuzzyfication.Fuzzyfication;
import inferenciaNebulosa.Inferencia;

//import conjuntoNebuloso2.ConNeb;
//import inferenciaNebulosa2.Inferen;

public class Main {

	public static void main(String[] args) {
	 
		Fuzzyfication fuz0 = new Fuzzyfication(19, 2);
		Inferencia inf0 = new Inferencia(fuz0.getuPosLivrePeq(),fuz0.getuPosLivreMed(),fuz0.getuPosLivreGra(),fuz0.getuDistanciaPeq(),fuz0.getuDistanciaMed(),fuz0.getuDistanciaGra());
		Defuzzyfication df = new Defuzzyfication( inf0.getW1(),inf0.getW2(), inf0.getW3(), inf0.getW4(),inf0.getW5(), inf0.getW6(), inf0.getW7(), inf0.getW8(), inf0.getW9());	
		System.out.println("Fuzzy test "+df.getPasso());

		Scanner sc = new Scanner(System.in);
		Board board = new Board();
		board.move(1, 1);
		System.out.println("Escolha onde será a saída.  1-20");
		int destY= sc.nextInt();
		board.destino(20, destY);
		System.out.println("Obstaculo. X=2-19 Y=1-14");
		int posObstaX = sc.nextInt();
		int posObstaY = sc.nextInt();
		board.setObstaculo(posObstaX, posObstaY);
		board.saida();
		board.playerView();
		
		
	/*	
		int x3 =board.retornaX3();
		int x2 =board.retornaX2();
		int y3 =board.retornaY3();
		int y2 =board.retornaY2();
		//int x1 =board.retornaX1(board.retornaY2());
		int y1 =board.retornaY1(board.retornaX2());
		int y1e=board.retornaY1esq(board.retornaX2());
		*/
		for(;;){
			System.out.println("digite qualquer numero para continuar");
			@SuppressWarnings("unused")
			int a =sc.nextInt();
			float xDistancia = (float) Math.sqrt(Math.pow(board.retornaX3()-board.retornaX2(), 2)+Math.pow(board.retornaY3()-board.retornaY2(), 2));
			

			//baixo
			Fuzzyfication fuz = new Fuzzyfication(board.lookDownFor1(board.retornaX2(), board.retornaY2()), xDistancia);
			Inferencia inf= new Inferencia(fuz.getuPosLivrePeq(),fuz.getuPosLivreMed(),fuz.getuPosLivreGra(),fuz.getuDistanciaPeq(),fuz.getuDistanciaMed(),fuz.getuDistanciaGra());
			Defuzzyfication dfDown = new Defuzzyfication( inf.getW1(),inf.getW2(), inf.getW3(), inf.getW4(),inf.getW5(), inf.getW6(), inf.getW7(), inf.getW8(), inf.getW9());	
			

			//esquerda
			Fuzzyfication fuz2 = new Fuzzyfication(board.lookLeftFor1(board.retornaX2(), board.retornaY2()), xDistancia);
			Inferencia inf2 = new Inferencia(fuz2.getuPosLivrePeq(),fuz2.getuPosLivreMed(),fuz2.getuPosLivreGra(),fuz2.getuDistanciaPeq(),fuz2.getuDistanciaMed(),fuz2.getuDistanciaGra());
			Defuzzyfication dfLeft = new Defuzzyfication( inf2.getW1(),inf2.getW2(), inf2.getW3(), inf2.getW4(),inf2.getW5(), inf2.getW6(), inf2.getW7(), inf2.getW8(), inf2.getW9());
			
		
			//direita board.retornaY1(board.retornaX2())
			
			Fuzzyfication fuz3 = new Fuzzyfication(board.lookRightFor1(board.retornaX2(), board.retornaY2()), xDistancia);
			Inferencia inf3 = new Inferencia(fuz3.getuPosLivrePeq(),fuz3.getuPosLivreMed(),fuz3.getuPosLivreGra(),fuz3.getuDistanciaPeq(),fuz3.getuDistanciaMed(),fuz3.getuDistanciaGra());
			Defuzzyfication dfRight = new Defuzzyfication( inf3.getW1(),inf3.getW2(), inf3.getW3(), inf3.getW4(),inf3.getW5(), inf3.getW6(), inf3.getW7(), inf3.getW8(), inf3.getW9());
			
			int test=board.lookDownFor1(board.retornaX2(), board.retornaY2());
			System.out.println("dist pra baixo "+test);
			int test2=board.lookLeftFor1(board.retornaX2(), board.retornaY2());
			//esquerda board.retornaY1esq(board.retornaX2())
			System.out.println("dist pra esrk "+test2);
			int test3=board.lookRightFor1(board.retornaX2(), board.retornaY2());
			System.out.println("dist para dir " +test3);
			/*ArrayList<Float> passo = new ArrayList<Float> ();
			passo.add(inferBaixo.getPasso());
			passo.add(inferEsquerda.getPasso());
			passo.add(inferDireita.getPasso());*/
			if(board.destinoReached(board.retornaX2(), board.retornaY2()+1)) dfRight.setPasso(dfRight.getPasso()+1);
			if(board.destinoReached(board.retornaX2(), board.retornaY2()-1)) dfLeft.setPasso(dfLeft.getPasso()+1);
			
			System.out.println("distancia " +xDistancia);
			System.out.println("baixo " + dfDown.getPasso());
			System.out.println("esquerda " +dfLeft.getPasso());
			System.out.println("direita " +dfRight.getPasso());
			for(;;){
				if (dfRight.getPasso() > dfDown.getPasso() && dfRight.getPasso() >= dfLeft.getPasso() ){
						//exec inferDireita
					int guardarX = board.retornaX2();
					int guardarY = board.retornaY2();
					
					//board.move(guardarX, guardarY+((int)inferDireita.getPasso())); //andando pela fuzzy
					board.move(guardarX, guardarY+board.lookRightFor1(board.retornaX2(), board.retornaY2() ) ); //andando pelos espaços vazios
					
					board.clean(guardarX, guardarY);
					break;
				}
				
				if (dfDown.getPasso() >= dfRight.getPasso() && dfDown.getPasso() >= dfLeft.getPasso()){
					//exec infer1
					int guardarX = board.retornaX2();
					int guardarY = board.retornaY2();
					
					//board.move(guardarX+((int)inferBaixo.getPasso()), guardarY); //andando usando fuzzy
					board.move(guardarX+(board.lookDownFor1(board.retornaX2(), board.retornaY2())), guardarY); //andando pelos espaços vazios
					
					board.clean(guardarX, guardarY);
					break;
				}
		
				if (dfLeft.getPasso() >= dfDown.getPasso() && dfLeft.getPasso() >= dfRight.getPasso()){
					//exec inferEsquerda
					int guardarX = board.retornaX2();
					int guardarY = board.retornaY2();
				/*	System.out.println("passo esq " +(guardarY-((int)inferEsquerda.getPasso())));
					System.out.println("gaurdaY " +(guardarY-((int)inferDireita.getPasso())));
					System.out.println("andando esquerda " +(guardarY-((int)inferEsquerda.getPasso())));
					*/
					//board.move(guardarX, guardarY-((int)inferEsquerda.getPasso())); //andando pela saida  fuzzy
					board.move(guardarX, guardarY-(board.lookLeftFor1(board.retornaX2(), board.retornaY2() ) ) ); //andando pelo espaço vazio
					
					board.clean(guardarX, guardarY);
					break;
				}	
			}
			System.out.println("distancia " +xDistancia);
			System.out.println("baixo " + dfDown.getPasso());
			System.out.println("esquerda " +dfLeft.getPasso());
			System.out.println("direita " +dfRight.getPasso());
			board.playerView();
			if(!board.destinoReached(20, destY)) break;
		}
		System.out.println("digite qualquer numero para continuar");
		@SuppressWarnings("unused")
		int a =sc.nextInt();
		int guardarX = board.retornaX2();
		int guardarY = board.retornaY2();
		board.move(board.retornaX2()+1, board.retornaY2());
		board.clean(guardarX, guardarY);
		board.playerView();
		System.out.println("Fim");
		//
	}
	
}
