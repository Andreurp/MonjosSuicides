package monjo;

import java.util.Random;

public class Vaixell {
	
	private int preuBitllet;
	
	public Vaixell(int preuBitllet) {

		Random r = new Random();
		this.preuBitllet = 1+r.nextInt(preuBitllet);

	}

	public int getPreuBitllet() {
		return preuBitllet;
	}

	public void setPreuBitllet(int preuBitllet) {
		this.preuBitllet = preuBitllet;
	}

	public int totalBitllets(int numMonjos){
		int total = preuBitllet*numMonjos;
		return total;
	}

}
