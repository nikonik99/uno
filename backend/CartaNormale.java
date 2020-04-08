/**
	
	@author Nicola Marigo, Manuel Barusco, Francesco Corso
	
	
*/

public class CartaNormale extends Carta{
	
	private int valore;
	
	public Carta(int v, String c){
		valore = v;
		colore = c;
	}
	
	public Carta (Carta c){
		valore = c.getV();
		colore = c.getC();
	}
	
	public void setV(int v){
		valore = v;
	}
	
	public int getV(){
		return valore;
	}
	
}
