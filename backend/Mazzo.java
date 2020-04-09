/**

	@author Nicola Marigo, Manuel Barusco, Francesco Corso


*/

public class Mazzo{

	private CartaNormale[] cN;
	private CartaSpeciale[] cS;

	public Mazzo(){
		//costruttore che genera un array mescolato di carte secondo
		//le regole del gioco
	}

	public Mazzo(Mazzo m){
		cN = m.getNormali();
		cS = m.getSpeciali();
	}

	public void addCartaNormale(CartaNormale c){
		//aggiunge carta e mescola il mazzo
	}

}
