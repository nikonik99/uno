/**

	@author Nicola Marigo, Manuel Barusco, Francesco Corso


*/

public class CartaSpecialeColore extends Carta{

	private char colore; //g giallo, v verde, b blu, r rosso
	private char effetto; //2 +2, s stop, g cambio giro

	/** costruttore completo
	* @param e effetto della carta
	* @param c colore della carta
	*/
	public CartaSpecialeColore(char e, char c){
		effetto = e;
		colore = c;
	} //CartaSpeciale

	/** costruttore di copia
	* @param cS oggetto di classe CartaSpeciale
	*/
	public CartaSpecialeColore(CartaSpecialeColore cS){
		effetto = cS.effetto;
		colore = cS.colore;
	} //CartaSpeciale

	/** setC
	 * @param c colore da assegnare alla carta
	 */
	public void setC(char c){
		colore = c;
	} //setC

	/** getC
	 * @return colore della carta
	 */
	public char getC(){
		return colore;
	} //setC

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
