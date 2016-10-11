package monjo;

import java.util.List;
import java.util.Random;

public class Joc {

	List<Monjo> monjos; 
	
	private int dau;
	private Random r = new Random();
	private int totalDinersPot = 0;
	private int monjosAbort = 0;
	
	public Joc() {
		tirarDau();
	}

	private int tirarDau() {
		dau = 1+r.nextInt(6);
		return dau;
	}

	public void afegirMonjo(Monjo frara, int i) {
		totalDinersPot = totalDinersPot + i;
		monjos.add(frara);
	}

	public int monjoEnvarca(int preuBitllet) {
		int totalPreu;
		
		totalPreu = preuBitllet * monjos.size();
		monjosAbort = totalPreu / monjos.size();
		return monjosAbort;
		
	}
	
	public void jugar(){
		System.out.println(dau);
		System.out.println(monjos.size());
	}
}
