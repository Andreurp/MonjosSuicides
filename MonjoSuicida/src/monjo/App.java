package monjo;

import java.util.Random;

public class App {

	private static final int MAX_PREU_BITLLET = 60;
	private static final int DINERS_DE_CADA_MONJO = 25;
	private static final int MAX_MONJOS = 6;

	public static void main(String[] args) {
		
		Random r = new Random(); 
		
		
		Vaixell v = new Vaixell(MAX_PREU_BITLLET);
		v.totalBitllets(MAX_MONJOS);
		
		Joc joc = new Joc();
		
		for(int i=0; i<r.nextInt(MAX_MONJOS); i++){
			Monjo frara = new Monjo(DINERS_DE_CADA_MONJO);
			joc.afegirMonjo(frara);
		}
	}
}
