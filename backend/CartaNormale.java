/**

	@author Nicola Marigo, Manuel Barusco, Francesco Corso


*/

public class CartaNormale extends Carta{

	private int colore; //0 giallo, 1 verde, 2 blu, 3 rosso
	private int valore;

	/** costruttore completo
	* @param v valore della carta
	* @param c intero che rappresenta il colore della carta
	*/
	public CartaNormale(int v, int c){
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
	public void setC(int c){
		colore = c;
	} //setC

	/** getC
	 * @return colore della carta
	 */
	public int getC(){
		return colore;
	} //setC

	public void setV(int v){
		valore = v;
	} //setV

	public int getV(){
		return valore;
	} //getV

} //CartaNormale
