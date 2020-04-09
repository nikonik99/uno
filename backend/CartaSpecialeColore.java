/**

	@author Nicola Marigo, Manuel Barusco, Francesco Corso


*/

public class CartaSpecialeColore extends Carta{

	private int colore; //0 giallo, 1 verde, 2 blu, 3 rosso
	private int effetto; //0 +2, 1 stop, 2 cambio giro

	/** costruttore completo
	* @param e effetto della carta
	* @param c colore della carta
	*/
	public CartaSpecialeColore(int e, int c){
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
	public void setC(int c){
		colore = c;
	} //setC

	/** getC
	 * @return colore della carta
	 */
	public int getC(){
		return colore;
	} //setC

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
