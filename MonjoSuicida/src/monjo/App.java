package monjo;

import java.util.Random;

public class App {

	private static final int MAX_PREU_BITLLET = 60;
	private static final int DINERS_DE_CADA_MONJO = 25;
	private static final int MAX_MONJOS = 5;

	public static void main(String[] args) {
		
		Random r = new Random(); 
		Joc joc = new Joc();
		
		int preuBitllet = 1+r.nextInt(MAX_PREU_BITLLET);
				
		
		for(int i=0; i<r.nextInt(MAX_MONJOS); i++){
			Monjo frara = new Monjo(DINERS_DE_CADA_MONJO);
			joc.afegirMonjo(frara, frara.getDiners());
		}
		
		//joc.monjoEnvarca(preuBitllet);
		//joc.jugar();
	}
}
