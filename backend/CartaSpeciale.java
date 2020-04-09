/**

	@author Nicola Marigo, Manuel Barusco, Francesco Corso


*/

public class CartaSpeciale extends Carta{

	private int effetto; //0 +4, 1 cambio colore

	/** costruttore completo
	* @param e effetto della carta
	*/
	public CartaSpeciale(int e){
		effetto = e;
	} //CartaSpeciale

	/** costruttore di copia
	* @param cS oggetto di classe CartaSpeciale
	*/
	public CartaSpeciale(CartaSpeciale cS){
		effetto = cS.effetto;
	} //CartaSpeciale

	/** setE
	 * @param e effetto della carta
	 */
	public void setE(int e){
		effetto = e;
	} //setE

	/** getE
	 * @return effetto della carta
	 */
	public int getE(){
		return effetto;
	} //getE

} //CartaSpecialeColore
