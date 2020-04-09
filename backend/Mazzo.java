/**

	@author Nicola Marigo, Manuel Barusco, Francesco Corso


*/
import java.util.Vector;
import java.util.Collections;
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
			for(int j=0;j<8;j++){
				carte.add(new CartaSpecialeColore(0,i));//+2
				carte.add(new CartaSpecialeColore(1,i));//stop
				carte.add(new CartaSpecialeColore(2,i));//cambio giro
			}//for-speciali
		}//for-colori
		//costruisco le carte speciali
		for(int i=0;i<3;i++)
			carte.add(new CartaSpeciale(0));//+4
		for(int i=0;i<4;i++)
			carte.add(new CartaSpeciale(1));//jolly
	}//Mazzo - Cotruttore

	//Metodo che mischia le carte
	public void shuffle(){
		Collections.shuffle(carte);
	}//shuffle
}//Mazzo - Classe
