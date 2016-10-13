package monjo;

import java.util.Random;

public class App {

	private static final int MAX_PREU_BITLLET = 60;
	private static final int DINERS_DE_CADA_MONJO = 25;
	private static final int MAX_MONJOS = 5;

	public static void main(String[] args) {
		
		Random r = new Random(); 
		Joc joc = new Joc();
		int nMonjos = r.nextInt(MAX_MONJOS);
		int preuBitllet = 1+r.nextInt(MAX_PREU_BITLLET);
				
		
		for(int i=0; i<nMonjos; i++){
			Monjo frara = new Monjo(DINERS_DE_CADA_MONJO);
			joc.afegirMonjo(frara);
		}
		
		System.out.println("El preu del bitllet es de "+preuBitllet+" € i en el pot hi tenim "+joc.totalDinersPot()+" €");
		System.out.println("-------------------------");
		
		while(preuBitllet*joc.monjosVius()>joc.totalDinersPot()){
			joc.jugar();
			System.out.println("Queden "+joc.monjosVius()+" monjos");
			System.out.println("");
		}
		System.out.println("marxem!");
	}
}
