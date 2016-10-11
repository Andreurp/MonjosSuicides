package monjo;

import java.util.Random;

public class Monjo {
	
	private int diners;
	private int pedres;
	
	private Random r = new Random();
	
	public Monjo(int diners) {

		this.diners = 1+r.nextInt(diners);
		agafarPedres();
	}

	public int getDiners() {
		return diners;
	}
	
	public int agafarPedres(){
		pedres = 1+r.nextInt(5);
		return pedres;
	}
	
	public int getPedres(){
		return pedres;
	}
	
}
