package monjo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Joc {

	List<Monjo> monjos = new ArrayList<Monjo>();
	private int totalDinersPot = 0;
	private int dau;
	private Random r = new Random();
	
	public void afegirMonjo(Monjo frara){
		totalDinersPot = totalDinersPot + frara.getDiners();
		monjos.add(frara);
	}
	
	public void jugar(){
		int numPedres = 0;
		for(int i=0; i<monjos.size(); i++){
			monjos.get(i).agafarPedres();
		}
		tirarDau();
		for(int i=monjos.size()-1; i>=0; i--){
			numPedres = monjos.get(i).getPedres();
			System.out.println("El monjo "+i+" ha agafat " +numPedres+" pedres i al dau hi ha un "+dau);
			if(numPedres == dau){
				monjos.remove(i);
				System.out.println("El monjo "+i+" es suicida, queden "+monjos.size()+" monjos");
			}
		}
	}
	public int monjosVius(){
		return monjos.size();
	}
	
	private int tirarDau() {
		dau = 1+r.nextInt(6);
		return dau;
	}
	
	public int totalDinersPot(){
		return totalDinersPot;
	}
}
