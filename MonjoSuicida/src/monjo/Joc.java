package monjo;

import java.util.List;
import java.util.Random;

public class Joc {

	List<Monjo> monjos;
	private int totalDinersPot = 0;
	private int dau;
	private Random r = new Random();
	
	public void afegirMonjo(Monjo frara, int i) {
		totalDinersPot = totalDinersPot + i;
		monjos.add(frara);
	}
	
	public void jugar(){
		int numPedres = 0;
		for(int i=0; i<monjos.size(); i++){
			monjos.get(i).agafarPedres();
		}
		tirarDau();
		for(int i=monjos.size(); i==0; i--){
			numPedres = monjos.get(i).getPedres();
			if(numPedres == dau){
				monjos.remove(i);
			}
		}
	}
	
	private int tirarDau() {
		dau = 1+r.nextInt(6);
		return dau;
	}
	
//	private int dau;
//	private Random r = new Random();
//	private int totalDinersPot = 0;
//	private int monjosAbort = 0;
//	
//	public Joc() {
//		tirarDau();
//	}
//
//	private int tirarDau() {
//		dau = 1+r.nextInt(6);
//		return dau;
//	}
//
//	public void afegirMonjo(Monjo frara, int i) {
//		totalDinersPot = totalDinersPot + i;
//		monjos.add(frara);
//	}
//
//	public int monjoEnvarca(int preuBitllet) {
//		int totalPreu;
//		
//		totalPreu = preuBitllet * monjos.size();
//		monjosAbort = totalPreu / monjos.size();
//		return monjosAbort;
//		
//	}
//	
//	public void jugar(){
//		System.out.println(dau);
//		System.out.println(monjos.size());
//	}
}
