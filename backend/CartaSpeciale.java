/**

	@author Nicola Marigo, Manuel Barusco, Francesco Corso


*/

public class CartaSpeciale{

	private char effetto; //4 +4, c cambio colore

	/** costruttore completo
	* @param e effetto della carta
	*/
	private CartaSpeciale(char e){
		effetto = e;
	} //CartaSpeciale

	/** costruttore di copia
	* @param cS oggetto di classe CartaSpeciale
	*/
	private CartaSpeciale(CartaSpeciale cS){
		effetto = cS.effetto;
	} //CartaSpeciale

	/** setE
	 * @param e effetto della carta
	 */
	public void setE(char e){
		effetto = e;
	} //setE

	/** getE
	 * @return effetto della carta
	 */
	public char getE(){
		return effetto;
	} //getE

} //CartaSpecialeColore