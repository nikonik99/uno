/**

	@author Nicola Marigo, Manuel Barusco, Francesco Corso


*/

public class CartaNormale{

	private char colore; //g giallo, v verde, b blu, r rosso
	private int valore;

	/** costruttore completo
	* @param v valore della carta
	* @param c carattere col colore della carta
	*/
	public CartaNormale(int v, char c){
		valore = v;
		colore = c;
	} //CartaNormale

	/** costruttore di copia
	* @param c oggetto di classe CartaNormale
	*/
	public CartaNormale(CartaNormale c){
		valore = c.valore;
		colore = c.colore;
	}//CartaNormale

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

	public void setV(int v){
		valore = v;
	} //setV

	public int getV(){
		return valore;
	} //getV

} //CartaNormale
