package monjo;

import java.util.List;
import java.util.Random;

public class Joc {

	List<Monjo> monjos; 
	
	private int dau;
	private Random r = new Random();
	
	public Joc() {
		int totalDinersPot = sumaDiners();
		tirarDau();
	}

	private int tirarDau() {
		dau = 1+r.nextInt(6);
		return dau;
	}

	public int getDau() {
		return dau;
	}

	public void afegirMonjo(Monjo frara) {
		monjos.add(frara);
	}
	public int sumaDiners(){
		for(int i=0; i<monjos.size(); i++){
			
		}
	}
	
}
