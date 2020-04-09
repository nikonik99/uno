/**

	@author Nicola Marigo, Manuel Barusco, Francesco Corso


*/

public class Mazzo{

	private Vector<Carta> carte;

	/** costruttore senza parametri
	* costruisce un mazzo di carte regolamentare
	*/
	public Mazzo(){
		//for per le carte blu
		for(int i=0;i<3;i++){//for esterno, scandisce i colori
			for(int j=0;j<9;j++){
				if(j==0)
					carte.add(new CartaNormale(j,i));//inizilizzo solo uno 0
				carte.add(new CartaNormale(j,i));//così inizializzo 2 carte dello stesso numero
				carte.add(new CartaNormale(j,i));
			}//for-numeri
			carte.add(new CartaSpeciale())
		}//for-colori

	} //Mazzo

	public Mazzo(Mazzo m){
		cN = m.getNormali();
		cS = m.getSpeciali();
	}

	public void addCartaNormale(CartaNormale c){
		//aggiunge carta e mescola il mazzo
	}

}
