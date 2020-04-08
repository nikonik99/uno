/**
	
	@author Nicola Marigo, Manuel Barusco, Francesco Corso
	
	
*/

public class CartaSpeciale extends Carta{
	
	private String tipo;
	
	private CartaSpeciale(String t, String c){
		tipo = t;
		colore = c;
	}
	
	private CartaSpeciale(CartaSpeciale cS){
		tipo = cS.getT();
		colore = cS.getC();
	}
	
	private void setT(String t){
		tipo = t;
	}
	
	private String getT(){
		return t;
	}
	
}
